package com.openwebinars.annotation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CatalogoPeliculasActuales implements CatalogoPeliculas {

	public List<Pelicula> peliculas = new ArrayList<>();
	
	public Collection<Pelicula> getPeliculas() {
		return peliculas;
	}
	
	public void init() {
		peliculas.add(new Pelicula("Vengadores: Infinity War", "2018","Ciencia ficción"));
		peliculas.add(new Pelicula("Black Panther","2018","Ciencia ficción"));
		peliculas.add(new Pelicula("Han Solo", "2018", "Acción"));
		peliculas.add(new Pelicula("Ocean's 8", "2018", "Acción"));
		peliculas.add(new Pelicula("Tom Raider", "2018", "Aventuras"));
		peliculas.add(new Pelicula("Campeones","2018","Comedia"));
	}

}
