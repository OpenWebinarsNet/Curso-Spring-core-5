package com.openwebinars.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	
	@Bean
	@Primary
	public CatalogoPeliculas catalogoActuales() {
		return new CatalogoPeliculasActuales();
	}
	
	@Bean
	public CatalogoPeliculas catalogoClasicas() {
		return new CatalogoPeliculasClasicas();
		
	}
	
	@Bean
	public PeliculaDao peliculaDaoImplMemory() {
		return new PeliculaDaoImplMemory();
	}
	
	@Bean
	public PeliculaService peliculaService() {
		return new PeliculaService();
	}

}
