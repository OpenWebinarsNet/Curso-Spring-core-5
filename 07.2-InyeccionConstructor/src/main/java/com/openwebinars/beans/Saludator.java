package com.openwebinars.beans;

public class Saludator {
	
	private String mensaje;
	
	public Saludator(String string) {
		this.mensaje = string;
	}
	
	public String saludo() {
		return (mensaje == null) ? "Hola Mundo!!!" : mensaje;
	}

}
