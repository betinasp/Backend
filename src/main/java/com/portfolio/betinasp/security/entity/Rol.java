
package com.portfolio.betinasp.security.entity;

import com.portfolio.betinasp.security.enums.RolNombre;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	@Enumerated(EnumType.STRING)
	private RolNombre rolnombre;
	
	//Constructor

	public Rol() {
	}

	public Rol(RolNombre rolnombre) {
		this.rolnombre = rolnombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RolNombre getRolnombre() {
		return rolnombre;
	}

	public void setRolnombre(RolNombre rolnombre) {
		this.rolnombre = rolnombre;
	}
	
	
	
}
