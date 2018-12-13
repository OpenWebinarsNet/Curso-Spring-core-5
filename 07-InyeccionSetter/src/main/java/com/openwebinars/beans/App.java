package com.openwebinars.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Saludator saludador = null;
		
		saludador = appContext.getBean(Saludator.class);
				
		System.out.println(saludador.saludo());
		
		((ClassPathXmlApplicationContext) appContext).close();

	}

}
