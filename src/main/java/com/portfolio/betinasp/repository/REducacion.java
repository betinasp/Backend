/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.betinasp.repository;

import com.portfolio.betinasp.entity.Educacion;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion {
	public Optional<Educacion> findByNombreE(String nombreE);
	public boolean existsByNombreE(String nombreE);

	public List<Educacion> findAll();

	public Optional<Educacion> findById(int id);

	public void save(Educacion educacion);

	public void deleteById(int id);

	public boolean existsById(int id);
	
}
