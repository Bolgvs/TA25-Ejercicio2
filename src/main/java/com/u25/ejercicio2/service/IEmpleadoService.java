package com.u25.ejercicio2.service;

import java.util.List;

import com.u25.ejercicio2.dto.Empleado;


public interface IEmpleadoService {

	public List<Empleado> listarEmpleado(); 
	
	public Empleado guardarEmpleado(Empleado empleado);	
	
	public Empleado empleadoXID(String dni); 
	
	public Empleado actualizarEmpleado(Empleado empleado); 
	
	public void eliminarEmpleado(String dni);
}
