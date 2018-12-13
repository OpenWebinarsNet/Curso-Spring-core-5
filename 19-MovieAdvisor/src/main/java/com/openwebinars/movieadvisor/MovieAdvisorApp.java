package com.openwebinars.movieadvisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.openwebinars.movieadvisor.config.AppConfig;

/**
 * 
 * Clase principal del programa.
 * 
 * Tan solo carga el contexto a partir de la clase de configuración. 
 * Tras esto, lanza el componente que ejecuta realmente el ciclo 
 * del programa.
 * 
 * @author Openwebinars
 *
 */
public class MovieAdvisorApp {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MovieAdvisorRunApp runApp = appContext.getBean(MovieAdvisorRunApp.class);
		
		runApp.run(args);
		
		((AnnotationConfigApplicationContext) appContext).close();

	}

}
