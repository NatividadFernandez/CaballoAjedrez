package org.iesalandalus.programacion.caballoajedrez;

import static org.junit.Assert.assertEquals;

import javax.naming.OperationNotSupportedException;

public class Caballo {

	// Variables
	private Color color;
	private Posicion posicion;

	// Constructores

	public Caballo() {

		this.posicion = new Posicion(8, 'b');
		this.color = Color.NEGRO;
	}

	public Caballo(Color color) {

		if (color == null) {
			throw new IllegalArgumentException("ERROR: No se puede asignar un color nulo.");
		}

		if (color.equals(Color.BLANCO)) {
			this.posicion = new Posicion(1, 'b');
			this.color = Color.BLANCO;
		}
		if (color.equals(Color.NEGRO)) {
			this.posicion = new Posicion(8, 'b');
			this.color = Color.NEGRO;
		}

	}

	public Caballo(Color color, char columna) {

		if (color == null) {
			throw new IllegalArgumentException("ERROR: No se puede asignar un color nulo.");
		}

		if (columna == 'b' || columna == 'g') {
			if (color.equals(Color.BLANCO)) {
				this.posicion = new Posicion(1, columna);
				this.color = Color.BLANCO;
			}
			if (color.equals(Color.NEGRO)) {
				this.posicion = new Posicion(8, columna);
				this.color = Color.NEGRO;
			}

		} else {
			throw new IllegalArgumentException("ERROR: Columna inicial no válida.");
		}

	}

	/*
	 * public Caballo(Caballo caballo) {
	 * 
	 * if (caballo == null) { throw new
	 * IllegalArgumentException("No se puede copiar un caballo nulo."); } this.color
	 * = caballo.getColor(); this.posicion = new Posicion(caballo.getPosicion());
	 * 
	 * }
	 */

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

	// Método mover

	public void mover(Direccion direccion) throws OperationNotSupportedException {
		if (direccion == null) {
			throw new IllegalArgumentException("La dirección no puede ser nula.");
		}
		
		switch (direccion) {
		case ARRIBA_DERECHA:
			try {
				posicion = new Posicion(posicion.getFila() + 2, (char)(posicion.getColumna() + 1));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
			}
			break;

		case ABAJO_DERECHA:
			try {
				posicion = new Posicion(posicion.getFila() - 2, (char)(posicion.getColumna() + 1));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
			}
			break;

		case ARRIBA_IZQUIERDA:
			try {
				posicion = new Posicion(posicion.getFila() + 2, (char)(posicion.getColumna() - 1));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
			}
			break;

		case ABAJO_IZQUIERDA:
			try {
				posicion = new Posicion(posicion.getFila() - 2, (char)(posicion.getColumna() - 1));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
			}
			break;

		case DERECHA_ARRIBA:
			try {
				posicion = new Posicion(posicion.getFila() + 1, (char)(posicion.getColumna() + 2));
				
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
			}
			break;

		case DERECHA_ABAJO:
			try {
				posicion = new Posicion(posicion.getFila() - 1 , (char)(posicion.getColumna() + 2));
				
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
			}
			break;

		case IZQUIERDA_ARRIBA:
			try {
				posicion = new Posicion(posicion.getFila() + 1, (char)(posicion.getColumna() -2 ));
							
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
			}
			break;

		case IZQUIERDA_ABAJO:
			try {
				posicion = new Posicion(posicion.getFila() - 1, (char)(posicion.getColumna() - 2));
				
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
			}
			break;

		default:
			System.out.println("Error de dirección");
			break;
		}
	}

	// Metodo equals y hasCode

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
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
		Caballo other = (Caballo) obj;
		if (color != other.color)
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}
	
	// Metodo toString

	@Override
	public String toString() {
		return "Caballo [posición=[fila=" +posicion.getFila() + ", columna=" + posicion.getColumna() + "], color=" + color + "]";
		
		
	}
	
	

}
