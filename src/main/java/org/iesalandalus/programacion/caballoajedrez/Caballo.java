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
	
	public Caballo(Color color) {
		
		if(this.color == colorb) {
			this.posicion = new Posicion(1,'b');
			this.color = color;
		} 
		if (this.color == colorn) {
			this.posicion = new Posicion(8,'d');
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
