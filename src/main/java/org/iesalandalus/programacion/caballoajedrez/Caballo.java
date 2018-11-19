package org.iesalandalus.programacion.caballoajedrez;

public class Caballo {
	
	// Variables
	private Color color;
	private Posicion posicion;
	
	private final Color colorb = Color.BLANCO;
	private final Color colorn = Color.NEGRO;
	
	// Constructores
	
	public Caballo(Color color, Posicion posicion) {
		
		this.posicion = new Posicion(8,'b');
		this.color = colorn;
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
