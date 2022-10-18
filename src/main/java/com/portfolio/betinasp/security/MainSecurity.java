package com.portfolio.betinasp.security;

import com.portfolio.betinasp.security.jwt.JwtEntryPoint;
import com.portfolio.betinasp.security.jwt.JwtTokenFilter;
import com.portfolio.betinasp.security.service.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)

public class MainSecurity implements WebSecurityConfigurer {

	@Autowired
	UserDetailsImpl userDetailsServiceImpl;
	@Autowired
	JwtEntryPoint jwtEntryPoint;

	@Bean
	public JwtTokenFilter jwtTokenFilter() {
		return new JwtTokenFilter();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationManager authManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder, UserDetailsImpl userDetailService)
		throws Exception {
		return http.getSharedObject(AuthenticationManagerBuilder.class)
			.userDetailsService(userDetailsServiceImpl)
			.passwordEncoder(bCryptPasswordEncoder)
			.and()
			.build();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.cors().and().csrf()
			.disable()
			.authorizeRequests()
			.antMatchers(HttpMethod.DELETE)
			.hasRole("admin")
			.antMatchers("/admin/**")
			.hasAnyRole("ADMIN")
			.antMatchers("/user/**")
			.hasAnyRole("USER", "ADMIN")
			.antMatchers("/login/**")
			.anonymous()
			.anyRequest()
			.authenticated()
			.and()
			.httpBasic()
			.and()
			.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.STATELESS);

		return http.build();
		
	}
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		boolean securityDebug = false;
		return (web) -> web.debug(securityDebug)
		  .ignoring()
		  .antMatchers("/css/**", "/js/**", "/img/**", "/lib/**", "/favicon.ico");
}

	@Override
	public void init(SecurityBuilder builder) throws Exception {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public void configure(SecurityBuilder builder) throws Exception {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

}
