package com.u25.ejercicio2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.u25.ejercicio2.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, String>{

}
