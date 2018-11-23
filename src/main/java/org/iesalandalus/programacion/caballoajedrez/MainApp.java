package org.iesalandalus.programacion.caballoajedrez;

import static org.junit.Assert.assertEquals;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.*;

public class MainApp {

	static Caballo caballo = null;

	public static void main(String[] args) {
		// System.out.println("Programa para aprender a colocar y mover un caballo en el
		// tablero de ajedrez");

		ejecutarOpcion(elegirOpcion());

	}

	public static void mostrarMenu() {

		System.out.println("Menú");
		System.out.println("1.-Crear caballo por defecto");
		System.out.println("2.-Crear caballo de un color");
		System.out.println("3.-Crear caballo de un color y una columna inicial");
		System.out.println("4.-Mover el Caballo");
		System.out.println("5.-Salir");

	}

	public static int elegirOpcion() {

		int opcion = 0;

		do {

			mostrarMenu();
			System.out.println(" ");
			System.out.println("Elige una opción");
			opcion = Entrada.entero();

			ejecutarOpcion(opcion);

		} while (opcion > 1 || opcion < 5);

		return opcion;
	}

	public static void ejecutarOpcion(int opcion) {

		switch (opcion) {

		case 1:
			System.out.println("Has pulsado - Crear caballo por defecto");
			crearCaballoDefecto();
			System.out.println(" ");
			break;
		case 2:
			System.out.println("Has pulsado - Crear caballo de un color");
			crearCaballoDefectoColor();
			break;
		case 3:
			System.out.println("Has pulsado - Crear caballo de un color y una columna inicial");
			crearCaballoColorPosicion();
			break;
		case 4:
			System.out.println("Has pulsado - Mover el Caballo");
			mover();
			break;
		case 5:
			System.out.println("Salir");
			System.exit(0);
			break;
		default:
			System.out.println("Número incorrecto");
			System.out.println(" ");

		}

	}

	public static void crearCaballoDefecto() {

		try {
			caballo = new Caballo();
			System.out.println(caballo.toString());
			System.out.println(" ");
		} catch (IllegalArgumentException i) {
			System.out.println("Caballo mal creado");
		}
	}

	public static void crearCaballoDefectoColor() {

		try {
			caballo = new Caballo(elegirColor());
			System.out.println(caballo.toString());
			System.out.println(" ");
			
		} catch (IllegalArgumentException i) {
			System.out.println("Caballo mal creado");
		}
	}

	public static Color elegirColor() {

		Color color = null;
		boolean comprobarColor = false;

		while (!comprobarColor) {
			System.out.println("Menú colores");
			System.out.println("1.-Blanco");
			System.out.println("2.-Negro");
			System.out.println(" ");

			System.out.println("Elige un color");
			int opcion = Entrada.entero();

			switch (opcion) {

			case 1:
				color = Color.BLANCO;
				comprobarColor = true;
				break;
			case 2:
				color = Color.NEGRO;
				comprobarColor = true;
				break;
			default:
				System.out.println("Opción no válida");
				System.out.println(" ");
				break;
			}
		}

		return color;
	}

	public static void crearCaballoColorPosicion() {

		try {
			caballo = new Caballo(elegirColor(), elegirColumnaInicial());
			System.out.println(caballo.toString());
			System.out.println(" ");
		} catch (IllegalArgumentException i) {
			System.out.println("Caballo mal creado");
		}

	}

	public static char elegirColumnaInicial() {

		char opcion = ' ';
		boolean comprobarChar = false;

		while (!comprobarChar) {
			System.out.println("Menú letras");
			System.out.println("b");
			System.out.println("g");
			System.out.println();
			System.out.println("Elige una letra");
			opcion = Entrada.caracter();

			switch (opcion) {

			case 'b':
				opcion = 'b';
				comprobarChar = true;
				break;
			case 'g':
				opcion = 'g';
				comprobarChar = true;
				break;
			default:
				System.out.println("Opción no válida");
				System.out.println(" ");
				break;
			}
		}

		return opcion;

	}

	public static void mover() {
		boolean mover = false;

		if (caballo == null) {
			System.out.println("El caballo no creado");
		} else {
			while (mover == false) {
				mostrarMenuDirecciones();

				try {
					caballo.mover(elegirDireccion());
					//caballo.getPosicion();
					System.out.println(caballo.toString());
					System.out.println(" ");
					mover = true;

				} catch (OperationNotSupportedException e) {
					System.out.println("Error: Introducir posición");
				} catch (IllegalArgumentException i) {
					System.out.println("Mala posicion");
				}

			} 
		}

	}

	public static void mostrarMenuDirecciones() {

		System.out.println("Menú direcciones");
		System.out.println("1.-ARRIBA_DERECHA");
		System.out.println("2.-ABAJO_DERECHA");
		System.out.println("3.-ARRIBA_IZQUIERDA");
		System.out.println("4.-ABAJO_IZQUIERDA");
		System.out.println("5.-DERECHA_ARRIBA");
		System.out.println("6.-DERECHA_ABAJO");
		System.out.println("7.-IZQUIERDA_ARRIBA");
		System.out.println("8.-IZQUIERDA_ABAJO");
		System.out.println(" ");

	}

	public static Direccion elegirDireccion() {

		Direccion direccion = null;

		System.out.println("Elige una opción");
		int opcion = Entrada.entero();

		switch (opcion) {
		
		case 1:
			direccion = Direccion.ARRIBA_DERECHA;
			break;

		case 2:
			direccion = Direccion.ABAJO_DERECHA;
			break;

		case 3:
			direccion = Direccion.ARRIBA_IZQUIERDA;
			break;

		case 4:
			direccion = Direccion.ABAJO_IZQUIERDA;
			break;

		case 5:
			direccion = Direccion.DERECHA_ARRIBA;
			break;

		case 6:
			direccion = Direccion.DERECHA_ABAJO;
			break;

		case 7:
			direccion = Direccion.IZQUIERDA_ARRIBA;
			break;

		case 8:
			direccion = Direccion.IZQUIERDA_ABAJO;
			break;

		default:
			System.out.println("No se encuentra en el menú");
			
		}

		return direccion;
	}

}