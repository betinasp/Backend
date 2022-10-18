
package com.portfolio.betinasp.repository;


import com.portfolio.betinasp.entity.Personas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Personas, Long>{
	
}
