package com.openwebinars.javaconfig;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PeliculaDaoImplMemory implements PeliculaDao {

	private List<Pelicula> peliculas = new ArrayList<>();
	
	@Autowired
	private Set<CatalogoPeliculas> catalogosPeliculas;
	
	@PostConstruct
	public void init() {
			peliculas = catalogosPeliculas
							.stream()
							.map(catalogo -> catalogo.getPeliculas())
							.flatMap(lista -> lista.stream())
							.collect(Collectors.toCollection(ArrayList::new));
		
	}
	
	@PreDestroy
	public void destroy() {
		peliculas.clear();
	}
	
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
