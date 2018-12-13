package com.openwebinars.annotation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class PeliculaDaoImplMemory implements PeliculaDao {

	private List<Pelicula> peliculas = new ArrayList<>();
	
	//@Autowired(required=false)
	//private Set<CatalogoPeliculas> catalogosPeliculas;
	
	
//	private Set<CatalogoPeliculas> catalogosPeliculas;
//	
//	@Autowired
//	public PeliculaDaoImplMemory(@Nullable Set<CatalogoPeliculas> catalogosPeliculas) {
//		this.catalogosPeliculas = catalogosPeliculas;
//	}
	
	private Set<CatalogoPeliculas> catalogosPeliculas;
	@Autowired
	public void setCatalogosPeliculas(Optional<Set<CatalogoPeliculas>> catalogosPeliculas) {
		this.catalogosPeliculas = catalogosPeliculas.orElse(null);
	}
	
	public void init() {
		if (catalogosPeliculas != null)
			for (CatalogoPeliculas c : catalogosPeliculas) {
				peliculas.addAll(c.getPeliculas());
			}
	}

	public PeliculaDaoImplMemory() { }
	
	public Pelicula findById(int id) {
		return peliculas.get(id);
	}

	public Collection<Pelicula> findAll() {
		return peliculas;
	}

	public void insert(Pelicula pelicula) {
		peliculas.add(pelicula);
	}

	public void edit(Pelicula antigua, Pelicula nueva) {		
		peliculas.remove(antigua);
		peliculas.add(nueva);		
	}

	public void delete(Pelicula pelicula) {
		peliculas.remove(pelicula);
	}
	
	

}
