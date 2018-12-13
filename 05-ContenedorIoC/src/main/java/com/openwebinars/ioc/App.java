package com.openwebinars.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		// Iniciamos el contexto
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans01.xml");		
		
		// TODO
		// Utilizamos los beans
		
		// Cerramos el contexto
		((ClassPathXmlApplicationContext) appContext).close();

	}

}
