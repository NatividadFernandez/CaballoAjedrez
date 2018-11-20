package org.iesalandalus.programacion.caballoajedrez;

public class Posicion {

	// Variables

	private int fila;
	private char columna;

	// Constructores

	public Posicion(int fila, char columna) {

		setFila(fila);
		setColumna(columna);
	}

	public Posicion(Posicion posicion) {

		if (posicion == null) {
			throw new IllegalArgumentException("ERROR: No es posible copiar una posición nula.");
		} else {
			this.fila = posicion.getFila();
			this.columna = posicion.getColumna();
		}

	}

	// Getters y Setters

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {

		if (fila >= 1 && fila <= 8) {
			this.fila = fila;
		} else {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}

	}

	public char getColumna() {
		return columna;
	}

	public void setColumna(char columna) {

		if (columna >= 'a' && columna <= 'h') {
			this.columna = columna;
		} else {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}

	}

	// Metodos equals y hascode

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columna;
		result = prime * result + fila;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		if (columna != other.columna)
			return false;
		if (fila != other.fila)
			return false;
		return true;
	}

	// Metodo toString

	@Override
	public String toString() {
		return "[fila=" + fila + ", columna=" + columna + "]";
	}

}
