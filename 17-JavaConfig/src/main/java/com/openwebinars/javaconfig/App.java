package com.openwebinars.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Saludator saludator = appContext.getBean(Saludator.class);
		
		System.out.println(saludator.saludo());
		
		((AnnotationConfigApplicationContext) appContext).close();

	}

}
