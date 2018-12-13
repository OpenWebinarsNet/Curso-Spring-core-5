package com.openwebinars.movieadvisor.dao;

import java.util.Collection;

import com.openwebinars.movieadvisor.model.Film;

/**
 * Interfaz que nos indica las posibles acciones que podemos
 * realizar con un repositorio de Film.
 * 
 * 
 * @author OpenWebinars
 *
 */
public interface FilmDao {
	
	public Film findById(long id);
	public Collection<Film> findAll();
	public void insert(Film film);
	public void edit(Film film);
	public void delete(long id);

}
