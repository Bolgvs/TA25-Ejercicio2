package com.u25.ejercicio2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "empleado")
public class Empleado {

	//Atributos de entidad cliente
	@Id
	private String dni;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "apellidos")//no hace falta si se llama igual
	private String apellidos;
	
	@ManyToOne
    @JoinColumn(name="id_departamento")
    private Departamento departamento;
	
	public Empleado() {
		
	}

	public Empleado(String dni, String nombre, String apellidos, Departamento departamento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamento = departamento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", departamento="
				+ departamento + "]";
	}
	
	
}
