package com.ipartek.apps;

/**
 * Aplicacion para gestionar videojuegos: listados, entradas, moddificaciones, busquedas...
 * 
 * @author Iratxe RN
 * 
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Game;

public class AppGames {
//TODO ponerlas privadas
	static final String OPC_LISTADO = "1";
	static final String OPC_NUEVO = "2";
	static final String OPC_BAJA = "3";
	static final String OPC_BUSCAR = "4";
	static final String OPC_MODIFICAR = "5";
	static final String OPC_SALIR = "S";

	static final String OPC_TITULO = "1";
	static final String OPC_YEAR = "2";
	static final String OPC_DESARROLLADOR = "3";
	static final String OPC_PLATAFORMA = "4";

	// variables globales para esta Clase
	// static significa que solo hay en memoria una variable para eso. Solo esta una
	// vez en memoria. Tambien porque el metodo main es estatico, por lo que obliga
	// a que todo lo qu esta dentro sea estatico.
	// Tambien si creo un metodo y lo pongo estatico, lo pongo estatico para poder
	// usarlo directamente dese el main

	static Scanner sc = null;
	static ArrayList<Game> lista = new ArrayList<Game>();
	static String opcion = ""; // opcion seleccionada en el menu por el usuario
	static String opcion2 = ""; // opcion seleccionada en el menu por el usuario

	public static void main(String[] args) {

		boolean esSalida = false;
		sc = new Scanner(System.in);

		System.out.println("***********  APP  GAMES   **************");

		inicializarDatos();

		do {
			pintarMenu();

			switch (opcion) {
			case OPC_LISTADO:
				listar();
				break;
			case OPC_NUEVO:
				nuevo();
				break;
			case OPC_BAJA:
				borrar();
				break;
			case OPC_BUSCAR:
				buscar();
				break;
			case OPC_MODIFICAR:
				modificar();
				break;
			case OPC_SALIR:
				esSalida = true;
				break;
			default:
				System.out.println("OPCION NO VALIDA!!! \n");
				break;
			}
		} while (!esSalida); // esta forma de equals esta protegido contral los NULL

		System.out.println("***********  ADIOS, nos vemos pronto   **************");
		sc.close();

	}// main

// ****************MODIFICAR **********************	

	private static void modificar() {

		boolean noExiste = true;
		String dato = "";
		int y = 0;
		boolean isError = true;

		// Buscamos el juego a modificar
		System.out.println("Titulo del juego a buscar:");
		String juego = sc.nextLine();

		for (int i = 0; i < lista.size(); i++) {
			Game g = lista.get(i);
			if (g.getTitulo().equalsIgnoreCase(juego)) {
				System.out.println(String.format("Titulo: %s - Año: %s - Desarrollador: %s - Plataforma: %s \n\n",
						g.getTitulo(), g.getYear(), g.getDesarrollador(), g.getPlataforma()));

				// Menu para elegir que quiere modificar.
				pintarMenuModificar();

				switch (opcion2) {
				case OPC_TITULO:
					do {
						System.out.println("Introducir nuevo titulo:");
						dato = sc.nextLine();
						try {
							g.setTitulo(dato); // no hace falta poner lista.set porque esta
							System.out.println("Titulo modificado correctamente");
							isError = false;
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					} while (isError);

					break;

				case OPC_YEAR:
					do {
						System.out.println("Introducir nuevo año:");
						y = Integer.parseInt(sc.nextLine());
						try {
							g.setYear(y);
							System.out.println("Año modificado correctamente");
							isError = false;
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					} while (isError);

					break;

				case OPC_DESARROLLADOR:
					do {
						System.out.println("Introducir nuevo desarrollador:");
						dato = sc.nextLine();
						try {
							g.setDesarrollador(dato); // no hace falta poner lista.set porque esta
							System.out.println("Desarrollador modificado correctamente");
							isError = false;
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					} while (isError);

					break;

				case OPC_PLATAFORMA:
					do {
						System.out.println("Introducir nueva plataforma:");
						dato = sc.nextLine();
						try {
							g.setPlataforma(dato); // no hace falta poner lista.set porque esta
							System.out.println("Plataforma modificada correctamente");
							isError = false;
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					} while (isError);

					break;

				default:
					System.out.println("OPCION NO VALIDA!!! \n");
					break;
				}
				noExiste = false;
				break;
			} else {
				noExiste = true;
			}
		}
		if (noExiste)

		{
			System.out.println("Ese juego no existe");
		}

	}// modificar

// ****************BUSCAR **********************	
	private static void buscar() {

		boolean noExiste = true;

		System.out.println("Titulo del juego a buscar:");
		String juego = sc.nextLine();

		for (int i = 0; i < lista.size(); i++) {
			Game g = lista.get(i);
			if (g.getTitulo().equalsIgnoreCase(juego)) {
				System.out.println(String.format("Titulo: %s - Año: %s - Desarrollador: %s - Plataforma: %s ",
						g.getTitulo(), g.getYear(), g.getDesarrollador(), g.getPlataforma()));
				noExiste = false;
				break;
			} else {
				noExiste = true;
			}
		}
		if (noExiste) {
			System.out.println("Ese juego no existe");
		}
	}// buscar

	private static void borrar() {

		String sn = "N";
		boolean noExiste = true;

		System.out.println("Titulo del juego a buscar:");
		String juego = sc.nextLine();

		for (int i = 0; i < lista.size(); i++) {
			Game g = lista.get(i);
			if (g.getTitulo().equalsIgnoreCase(juego)) {

				System.out.println("Confirmar eliminacion del juego: S/N");
				sn = sc.nextLine();
				if ("S".equalsIgnoreCase(sn)) {
					lista.remove(i);
					System.out.println("Juego eliminado");
				}
				noExiste = false;
				break;
			} else {
				noExiste = true;
			}
		}
		if (noExiste) {
			System.out.println("Ese juego no existe");
		}
	}// baja

// ****************NUEVO JUEGO **********************	

	private static void nuevo() {

		String titulo = "";
		int year = 0;
		String desarrollador = "";
		String plataforma = "";
		boolean esError = true;

		Game g = new Game();

		do {

			System.out.println("Introduce el titulo:");
			titulo = sc.nextLine();
			try {
				g.setTitulo(titulo);
				esError = false;
			} catch (Exception e) {
				esError = true;
				System.out.println(e.getMessage());
			}
		} while (esError);

		do {
			try {
				System.out.println("Introduce el año:");
				year = Integer.parseInt(sc.nextLine());

				g.setYear(year);
				esError = false;

			} catch (NumberFormatException e) {
				esError = true;
				System.out.println("Error");

			} catch (Exception e) {
				esError = true;
				System.out.println(e.getMessage());
			}
		} while (esError);

		do {
			System.out.println("Introduce el desarrollador:");
			desarrollador = sc.nextLine();
			try {
				g.setDesarrollador(desarrollador);
				esError = false;
			} catch (Exception e) {
				esError = true;
				System.out.println(e.getMessage());
			}
		} while (esError);

		do {
			System.out.println("Introduce la plataforma:");
			plataforma = sc.nextLine();
			try {
				g.setPlataforma(plataforma);
				esError = false;
			} catch (Exception e) {
				esError = true;
				System.out.println(e.getMessage());
			}
		} while (esError);
		lista.add(new Game(titulo, year, desarrollador, plataforma));

		/*
		 * Game g = new Game(); g.setTitulo(titulo); g.setYear(year);
		 * g.setDesarrollador(desarrollador); g.setPlataforma(plataforma);
		 */

	}// nuevo

// ****************LISTADO **********************	
	private static void listar() {

		System.out.printf("\n***********  LISTADO DE JUEGOS   **************\n");
		for (Game g : lista) {
			// System.out.println(g);

			System.out.printf("* Juego: %s - * Desarrollador: %s  \n\n", g.getTitulo(), g.getDesarrollador());
		}
		System.out.println("*************FIN LISTADO*****************");
	}

	/**
	 * Inicializar el ArrayList para simular que existen perros.<br>
	 * En un futuro nos conectaremos a una bbdd
	 */
	private static void inicializarDatos() {

		lista.add(new Game("Fornite", 2017, "Epic Games", "Multiplataforma"));
		lista.add(new Game("FIFA 21", 2020, "EA Sports", "Multiplataforma"));
		lista.add(new Game("Minecraft", 2009, "Mojang Studios,", "Multiplataforma"));
		lista.add(new Game("Among Us", 2018, "InnerSloth", "Android"));
		lista.add(new Game("PUBG", 2016, "PUBG Corporation", "Multiplataforma"));
		lista.add(new Game("WOW", 2004, "Blizzard", "PC"));

		/*
		 * Game g = new Game(); g.setTitulo("Fornite"); g.setYear(2017);
		 * g.setDesarrollador("Epic Games"); g.setPlataforma("Multiplataforma");
		 * lista.add(g);
		 * 
		 * Game g2 = new Game(); g2.setTitulo("FIFA 21"); g2.setYear(2020);
		 * g2.setDesarrollador("EA Sports"); g2.setPlataforma("Multiplataforma");
		 * lista.add(g2);
		 * 
		 * Game g3 = new Game(); g3.setTitulo("Minecraft"); g3.setYear(2009);
		 * g3.setDesarrollador("Mojang Studios"); g3.setPlataforma("Multiplataforma");
		 * lista.add(g3);
		 * 
		 * Game g4 = new Game(); g4.setTitulo("Among Us"); g4.setYear(2018);
		 * g4.setDesarrollador("InnerSloth"); g4.setPlataforma("Android");
		 * lista.add(g4);
		 */
	}// incializar

	/**
	 * Se encraga de pintar las pociones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
	private static void pintarMenu() {

		System.out.println("\n************************************");
		System.out.println(OPC_LISTADO + ".- Listar todos los videojuegos");
		System.out.println(OPC_NUEVO + ".- Nuevo videojuego");
		System.out.println(OPC_BAJA + ".- Dar de baja videojuego");
		System.out.println(OPC_BUSCAR + ".- Buscar videojuego");
		System.out.println(OPC_MODIFICAR + ".- Modificar videojuego\n");
		System.out.println(OPC_SALIR + ". - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");

		opcion = sc.nextLine();

	}

	private static void pintarMenuModificar() {

		System.out.println("*** Que deseas modificar: ***\n");
		System.out.println("1. Titulo");
		System.out.println("2. Año");
		System.out.println("3. Desarrollador");
		System.out.println("4. Plataforma\n");
		System.out.println("Elija una opcion:");

		opcion2 = sc.nextLine();

	}

}// AppGames
