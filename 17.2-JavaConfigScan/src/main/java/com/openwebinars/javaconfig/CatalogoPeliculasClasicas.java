package com.openwebinars.javaconfig;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

@Repository("clasicas")
public class CatalogoPeliculasClasicas implements CatalogoPeliculas {

	public List<Pelicula> peliculas = new ArrayList<>();
	
	public Collection<Pelicula> getPeliculas() {
		return peliculas;
	}
	
	@PostConstruct
	public void init() {
		peliculas.add(new Pelicula("La guerra de las galaxias", "1977","Ciencia ficción"));
		peliculas.add(new Pelicula("La lista de Schindler","1993","Drama"));
		peliculas.add(new Pelicula("El Padrino", "1972", "Drama"));
		peliculas.add(new Pelicula("Apocalypse Now", "1979", "Bélico"));
		peliculas.add(new Pelicula("Gladiator", "2000", "Acción"));
		peliculas.add(new Pelicula("El Gran Dictador","1940","Comedia"));
	}

}
