package org.iesalandalus.programacion.caballoajedrez;

import static org.junit.Assert.assertEquals;

public class Caballo {
	
	// Variables
	private Color color;
	private Posicion posicion;
	
	/*private final Color colorb = Color.BLANCO;
	private final Color colorn = Color.NEGRO;*/
	
	// Constructores
	
	public Caballo() {
		
		this.posicion = new Posicion(8,'b');
		this.color = Color.NEGRO;
	}
	
	public Caballo(Color color) {
		
		if(color.equals(Color.BLANCO)) {
			this.posicion = new Posicion(1,'b');
			this.color = color;
		} 
		if (color.equals(Color.NEGRO)) {
			this.posicion = new Posicion(8,'b');
			this.color = color;
		}
		
	}
	
	// Getters y Setters
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

}
