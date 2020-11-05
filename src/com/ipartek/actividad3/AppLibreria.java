package com.ipartek.actividad3;

import java.util.ArrayList;
import java.util.Scanner;

public class AppLibreria extends AppGestion {

	private static LibroDao dao = ImpLibroDAO.getInstance();
	private static ArrayList<Libro> libros = new ArrayList<>();
	private static Scanner sc = null;
	private static String opcion = "";
	private static AppLibreria app = new AppLibreria();

	public static void main(String[] args) {

		System.out.println("Empezamos App");

		try (Scanner sc = new Scanner(System.in)) {

			do {
				System.out.println("------ LIBRERIA ------");
				// menu del libro y gestion
				pintarMenu("Libro");

				System.out.println("Introduce una opcion:");

				opcion = sc.nextLine();

				switch (opcion) {
				case OP_LISTAR: {
					listar();
					break;
				}
				case OP_CREAR: {
					crear();
					break;
				}
				case OP_ELIMINAR: {
					eliminar();
					break;
				}
//No hace falta la opcion de salir porque ya la ponesmos en la comparacion del while.

				/**
				 * case OP_SALIR: { break; }
				 **/

				default:
					System.out.println("OPCION NO VALIDA!!! \n");

				}
			} while (!OP_SALIR.equalsIgnoreCase(opcion));

		} catch (Exception e) { // como Scanner sc implementa AutoClosable se cierra en este punto

			System.out.println("ERROR.");
			e.printStackTrace();
		}

		System.out.println("FIN");

	}

	/////////////////////////// MODIFICAR ////////////////
	protected static void modificar() {
		System.out.println("Modificar no desarrollado.");

	}

	/////////////////////////// ELIMINAR ////////////////
	protected static void eliminar() {
		// controlamos que no haya error o que no se introduzca un string en lugar de un
		// num

		boolean isError = true;
		do {
			try {
				System.out.println("Introduce el id eliminar");
				int id = Integer.parseInt(sc.nextLine());

				dao.delete(id);
				/**
				 * if (dao.delete(id)) { System.out.println("Hemos dado de baja al libro");
				 * isError = false; } else { System.out.println("El libro no existe"); }
				 **/

			} catch (NumberFormatException e) {
				System.out.println("Debe introducir un dato numerico");
			} catch (Exception e) {
				System.out.println("Error. Introduce un valor valido");
			}
		} while (isError);

	}

	/////////////////////////// LISTAR ////////////////
	protected static void listar() {
		/**
		 * ArrayList<Libro> libros = (ArrayList<Libro>) dao.getAll();
		 * System.out.println(libros); }
		 **/

	}

	/////////////////////////// CREAR ////////////////
	protected static void crear() {
		boolean isError = true;
		do {

			try {
//controlamos que no haya error o que no se introduzca un string en lugar de un num
				System.out.println("Introduce id");
				int id = Integer.parseInt(sc.nextLine());
				System.out.println("Introduce titulo");
				String nombre = sc.nextLine();
				System.out.println("Introduce num de paginas");
				int pags = Integer.parseInt(sc.nextLine());

				Libro libro = new Libro(id, nombre, pags);
				dao.insert(libro);
				isError = false;

			} catch (NumberFormatException e) {
				System.out.println("Debe introducir un dato numerico");
			} catch (Exception e) {
				System.out.println("Error!");
			}
		} while (isError);

	}
}