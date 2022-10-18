
package com.portfolio.betinasp.interfaces;

import com.portfolio.betinasp.entity.Personas;
import java.util.List;


public interface IPersonaService {
	
	public List<Personas> getPersona();
	
	public void savePersonas (Personas persona);
	
	public void deletePersona (Long id);
	
	public Personas findPersona (Long id);
}
	
