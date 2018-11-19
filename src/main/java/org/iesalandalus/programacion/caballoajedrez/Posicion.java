package org.iesalandalus.programacion.caballoajedrez;

public class Posicion {
	
	// Variables
	
	private int fila;
	private char columna;
	private Color color;
	
	private final Color colorb = Color.BLANCO;
	private final Color colorn = Color.NEGRO;
	
	// Constructores
	
	public Posicion(Color color) {
	
		if(this.color == colorb) {
			this.fila = 1;
			this.columna = 'b';
			this.color = color;
		} 
		if (this.color == colorn) {
			this.fila = 8;
			this.columna = 'd';
			this.color = color;
		}
		
	}
	
	public Posicion(Color color,char columna) throws IllegalArgumentException {
		
		if(columna == 'b' || columna == 'g') {
			if(this.color == colorb) {
				this.columna = columna;
				this.fila = 1;
				this.color = color;
			}
			if (this.color == colorn) {
				this.columna = columna;
				this.fila = 8;
				this.color = color;
			}
			
		} else {
			 throw new IllegalArgumentException("Letra no válida");
		}
		
	}
	
	
	
	
	
	
	
	// Getters y Setters
	
	public int getFila() {
		return fila;
	}	
	public void setFila(int fila) throws IllegalArgumentException {
		if(fila >= 1 && fila <= 8 ) {
			this.fila = fila;
		} else {
			 throw new IllegalArgumentException("Número fuera del tablero");
		}
		
	}
	public char getColumna() {
		return columna;
	}
	public void setColumna(char columna) throws IllegalArgumentException {
		if(columna >= 'a' && columna <= 'h') {
			this.columna = columna;	
		} else {
			 throw new IllegalArgumentException("Letras fuera del tablero");
		}
		
	}
	
	

}
