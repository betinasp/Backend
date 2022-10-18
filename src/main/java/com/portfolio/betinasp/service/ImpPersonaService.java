
package com.portfolio.betinasp.service;

import com.portfolio.betinasp.entity.Personas;
import com.portfolio.betinasp.interfaces.IPersonaService;
import com.portfolio.betinasp.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
	
	@Autowired IPersonaRepository ipersonaRepository;
		
	@Override
	public List<Personas> getPersona() {
		List<Personas> persona = ipersonaRepository.findAll();
		return persona;
	
	}

	@Override
	public void savePersonas(Personas persona) {
		ipersonaRepository.save(persona);
	}

	@Override
	public void deletePersona(Long id) {
		ipersonaRepository.deleteById(id);
	}

	@Override
	public Personas findPersona(Long id) {
		Personas persona = ipersonaRepository.findById(id).orElse(null);
		return persona;
	}
	
}
