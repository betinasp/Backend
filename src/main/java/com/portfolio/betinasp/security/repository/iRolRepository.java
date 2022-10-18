
package com.portfolio.betinasp.security.repository;

import com.portfolio.betinasp.security.entity.Rol;
import com.portfolio.betinasp.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
	Optional<Rol> findByRolNombre(RolNombre rolnombre);
}
