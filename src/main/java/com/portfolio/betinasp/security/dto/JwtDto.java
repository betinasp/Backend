
package com.portfolio.betinasp.security.dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

public class JwtDto {
	private String token;
	private String bearer = "Bearer";
	private String nombreUsuario;
	private Collection<? extends GrantedAuthority> autoritories;
	
	//Constructor

	public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> autoritories) {
		this.token = token;
		this.nombreUsuario = nombreUsuario;
		this.autoritories = autoritories;
	}
	
	//Getter y Setter

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getBearer() {
		return bearer;
	}

	public void setBearer(String bearer) {
		this.bearer = bearer;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Collection<? extends GrantedAuthority> getAutoritories() {
		return autoritories;
	}

	public void setAutoritories(Collection<? extends GrantedAuthority> autoritories) {
		this.autoritories = autoritories;
	}
	
	
	
	
	
}
