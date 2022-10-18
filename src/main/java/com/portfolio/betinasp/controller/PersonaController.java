package com.portfolio.betinasp.controller;

import com.portfolio.betinasp.entity.Personas;
import com.portfolio.betinasp.interfaces.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
	
	@Autowired IPersonaService ipersonaService;
	
	@GetMapping("/personas/traer")
	public List<Personas> getPersona() {
		return ipersonaService.getPersona();
	}	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/personas/crear")
	public String createPersona(@RequestBody Personas persona){
		ipersonaService.savePersonas(persona);
		return "La persona fue creada correctamente";
	}
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/personas/borrar/{id}")
	public String deletePersona(@PathVariable Long id){
		 ipersonaService.deletePersona(id);
		 return "La persona fue eliminada correctamente";
	}
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/personas/editar/{id}")
	public Personas editPersona(@PathVariable Long id,
		@RequestParam("nombre") String nuevoNombre,
		@RequestParam("apellido") String nuevoApellido,
		@RequestParam("img") String nuevoImg){
	    Personas persona = ipersonaService.findPersona(id);
	    
	    persona.setNombre(nuevoNombre);
	    persona.setApellido(nuevoApellido);
	    persona.setImg(nuevoImg);
	    
	    ipersonaService.savePersonas(persona);
	    return persona;
	    
	}
	@GetMapping("/personas/traer/perfil")
	public Personas findPersona(){
		return ipersonaService.findPersona((long)1);
	}
}
