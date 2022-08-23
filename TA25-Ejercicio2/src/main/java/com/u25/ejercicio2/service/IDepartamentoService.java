package com.u25.ejercicio2.service;

import java.util.List;

import com.u25.ejercicio2.dto.Departamento;

public interface IDepartamentoService {
	
	//Metodos del CRUD
		public List<Departamento> listarDepartamentos(); 
		
		public Departamento guardarDepartamento(Departamento departamento);	
		
		public Departamento departamentoXID(int codigo); 
		
		public Departamento actualizarDepartamento(Departamento departamento); 
		
		public void eliminarDepartamento(int codigo);

}
