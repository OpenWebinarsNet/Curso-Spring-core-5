package com.openwebinars.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App02 {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("beans02.xml");
		
		
		((FileSystemXmlApplicationContext) appContext).close();

	}

}
