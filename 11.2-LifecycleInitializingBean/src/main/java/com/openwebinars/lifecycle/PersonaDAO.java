package com.openwebinars.lifecycle;

import java.util.List;

public interface PersonaDAO {
	
	public Persona findByIndex(int index);
	public List<Persona> findAll();
	public void insert(Persona persona);
	public void edit(int index, Persona persona);
	public void delete(int index);
	public void delete(Persona persona);

}
