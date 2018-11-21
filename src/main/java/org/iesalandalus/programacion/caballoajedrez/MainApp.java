package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.*;

public class MainApp {

	public static void main(String[] args) {
		// System.out.println("Programa para aprender a colocar y mover un caballo en el
		// tablero de ajedrez");

		ejecutarOpcion(elegirOpcion());

		// elegirOpcion();
		// ejecutarOpcion(opcion);
	}

	public static void mostrarMenu() {

		System.out.println("Men�");
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
			System.out.println("Elige una opci�n");
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
			System.out.println("Has pulsado Mostrar");
			break;
		case 4:
			System.out.println(" ");
			break;
		case 5:
			System.out.println("Salir");
			System.exit(0);
			break;
		default:
			System.out.println("N�mero incorrecto");
			System.out.println(" ");

		}

	}

	public static void crearCaballoDefecto() {

		Caballo caballo = new Caballo();

		System.out.println(caballo.toString());
	}

	public static void crearCaballoDefectoColor() {

		Caballo caballo = new Caballo(elegirColor());
		System.out.println(caballo.toString());
	}
	
	public static Color elegirColor() {
		
		Color color = null;
		
		System.out.println("Menú colores");
		System.out.println("1.Blanco");
		System.out.println("2.-Negro");
		System.out.println(" ");
			
		System.out.println("Elige un color");
		 int opcion = Entrada.entero();
		
		switch(opcion) {
		
		case 1:			
			color = Color.BLANCO;
			break;
			
		case 2:
			color = Color.NEGRO;
		}		
		
		return color;
	}

}