package com.openwebinars.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Saludator saludador = null;
		
		saludador = appContext.getBean(Saludator.class);
				
		System.out.println(saludador.saludo() + "\n\n");
		
		IEmailService emailService = null;
		
		emailService = appContext.getBean(IEmailService.class);
		
		emailService.enviarEmailSaludo("luismi@openwebinars.net");
		
		((ClassPathXmlApplicationContext) appContext).close();

	}

}
