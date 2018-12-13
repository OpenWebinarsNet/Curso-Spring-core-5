package com.openwebinars.lifecycle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;

public class PersonaDAOImplMemory implements PersonaDAO, InitializingBean {
	
	List<Persona> personas = new ArrayList<Persona>();

	public Persona findByIndex(int index) {
		return personas.get(index);
	}

	public List<Persona> findAll() {
		return personas;
	}

	public void insert(Persona persona) {
		personas.add(persona);
	}

	public void edit(int index, Persona persona) {
		personas.remove(index);
		personas.add(index, persona);
	}

	public void delete(int index) {
		personas.remove(index);
	}

	public void delete(Persona persona) {
		personas.remove(persona);
	}
	

	@Override
	public void afterPropertiesSet() throws Exception {
		insert(new Persona("Luismi", 35));
		insert(new Persona("Ana", 32));
		insert(new Persona("Pepe", 34));
		insert(new Persona("Julia", 39));		
	}

}
