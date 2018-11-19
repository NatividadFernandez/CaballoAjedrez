package org.iesalandalus.programacion.caballoajedrez;

public class Posicion {
	
	private int fila;
	private char columna;
	
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
