
package com.portfolio.betinasp.security.service;

import com.portfolio.betinasp.security.entity.Usuario;
import com.portfolio.betinasp.security.repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
	@Autowired
	iUsuarioRepository iusUsuarioRepository;

public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
	return iusUsuarioRepository.findByNombreUsuario(nombreUsuario);
}	

public boolean existsByNombreUsuario(String nombreUsuario){
	return iusUsuarioRepository.existsByNombreUsuario(nombreUsuario);
}
public boolean existsByEmail(String email){
	return iusUsuarioRepository.existsByEmail(email);
}

public void save(Usuario usuario){
	iusUsuarioRepository.save(usuario);
}
}
