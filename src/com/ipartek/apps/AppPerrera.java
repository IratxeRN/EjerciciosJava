package com.ipartek.apps;

import java.sql.SQLException;

/**
 * Aplicacion para gestionar videojuegos: listados, entradas, moddificaciones, busquedas...
 * 
 * @author Iratxe RN
 * 
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.modelo.PerroDAOSqlite;
import com.ipartek.modelo.PerroDao;
import com.ipartek.pojo.Perro;

public class AppPerrera {
//TODO ponerlas privadas
	static final String OPC_LISTADO = "1";
	static final String OPC_NUEVO = "2";
	static final String OPC_BAJA = "3";
	static final String OPC_BUSCAR = "4";
	static final String OPC_MODIFICAR = "5";
	static final String OPC_SALIR = "S";

	static final String OPC_NOMBRE = "1";
	static final String OPC_RAZA = "2";
	static final String OPC_PESO = "3";
	static final String OPC_VACUNADO = "4";
	static final String OPC_HISTORIA = "5";

	// variables globales para esta Clase
	// static significa que solo hay en memoria una variable para eso. Solo esta una
	// vez en memoria. Tambien porque el metodo main es estatico, por lo que obliga
	// a que todo lo qu esta dentro sea estatico.
	// Tambien si creo un metodo y lo pongo estatico, lo pongo estatico para poder
	// usarlo directamente dese el main

	static Scanner sc = null;
	static private PerroDao dao = new PerroDAOSqlite();
	static ArrayList<Perro> perros;
	static String opcion = ""; // opcion seleccionada en el menu por el usuario
	static String opcion2 = ""; // opcion seleccionada en el menu por el usuario

	static int result = 0;
	static String dato = "";

	public static void main(String[] args) throws SQLException {

		perros = new ArrayList<Perro>();
		boolean esSalida = false;
		sc = new Scanner(System.in);

		System.out.println("***********  APP  PERRERA   **************");
		System.out.println("------------------------------------------");

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

		// boolean noExiste = true;

		float peso = 0;
		String vacunado = "";
		boolean isError = true;
		Perro p = new Perro();

		System.out.println("--- MODIFICAR ---");

		try {

			System.out.println("indroduce el id del perro que quieres buscar:");
			result = Integer.parseInt(sc.nextLine());
			if (dao.recuperar(result) == null) {
				System.out.println("No existe ese ID");
			} else {
				System.out.println(dao.recuperar(result));
				p = dao.recuperar(result);
				// Menu para elegir que quiere modificar.

				pintarMenuModificar();

				switch (opcion2) {
				case OPC_NOMBRE:

					System.out.println("Nuevo nombre");
					dato = sc.nextLine();
					try {
						p.setNombre(dato);
						System.out.println(p.getNombre());
						dao.modificar(p);
						System.out.println("Nombre modificado correctamente");

					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

					break;

				case OPC_RAZA:
					do {
						System.out.println("Nueva raza:");
						dato = sc.nextLine();
						try {
							p.setRaza(dato);
							dao.modificar(p);
							System.out.println("Raza modificada correctamente");
							isError = false;
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					} while (isError);

					break;

				case OPC_PESO:
					do {
						System.out.println("Nuevo peso:");
						peso = Float.parseFloat(sc.nextLine());
						try {
							p.setPeso(peso);
							dao.modificar(p);
							System.out.println("Peso modificado correctamente");
							isError = false;
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					} while (isError);

					break;

				case OPC_VACUNADO:
					do {
						System.out.println("Vacunado:");
						vacunado = sc.nextLine();
						try {
							if ("si".equalsIgnoreCase(vacunado)) {
								p.setVacunado(true);
								dao.modificar(p);
								System.out.println("Vacunado modificado correctamente");
								isError = false;
							} else if ("no".equalsIgnoreCase(vacunado)) {
								p.setVacunado(false);
								dao.modificar(p);
								System.out.println("Vacunado modificado correctamente");
								isError = false;
							} else {
								System.out.println("Error. Debe escribir si o no");

							}

						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					} while (isError);

					break;
				case OPC_HISTORIA:
					do {
						System.out.println("Nueva historia:");
						dato = sc.nextLine();
						try {
							p.setHistoria(dato);
							dao.modificar(p);
							System.out.println("Historia modificada correctamente");
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

			} // if

		} catch (NumberFormatException e) {
			System.out.println("Debe introducir un dato numerico");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}// modificar

// ****************BUSCAR **********************	
	private static void buscar() {

		System.out.println("--- BUSCAR ---");
		boolean esError = true;
		do {
			try {

				System.out.println("indroduce el id del perro que quieres buscar:");
				result = Integer.parseInt(sc.nextLine());
				if (dao.recuperar(result) == null) {
					System.out.println("No existe ese ID");
				} else {
					System.out.println(dao.recuperar(result));
					esError = false;
				}

			} catch (NumberFormatException e) {
				System.out.println("Debe introducir un dato numerico");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (esError);
	}// buscar
/////////////////////////////////////// BORRAR //////////////////////////////////

	private static void borrar() {

		boolean flag = true;
		int id = 0;
		Perro pEliminar = null;

		// buscar perro por id
		do {
			System.out.println("Dime el ID del perro para eliminar:");
			id = Integer.parseInt(sc.nextLine());

			pEliminar = dao.recuperar(id);
			if (pEliminar == null) {
				System.out.println("*Lo sentimos pero no existe ese perro Quieres continuar S/N");
			} else {
				flag = false;
			}

		} while (flag);

		// pedir confirmacion de nombre para eliminar
		flag = true;

		// pedir confirmacion de nombre para eliminar
		do {
			System.out.printf("Por favor escribe [%s] para eliminar o \"s\" para [S]alir\n", pEliminar.getNombre());
			String nombre = sc.nextLine();

			if (OPC_SALIR.equalsIgnoreCase(nombre)) {
				break; // salimos del bucle

			} else { // comprobar nombre

				if (pEliminar.getNombre().equalsIgnoreCase(nombre)) {

					try {
						dao.eliminar(id);
						flag = false;
						System.out.println("Hemos dado de baja al perro");

					} catch (Exception e) {
						e.printStackTrace();
					}

				} else {
					System.out.println("**No coincide el nombre**");
				}
			}

		} while (flag);

	}
////////////////////////////////// NUEVO ///////////////////////////////////	

	private static void nuevo() {
		boolean isFallo = true;

		String nombre = "";
		String raza = "";
		float peso = 0;
		boolean isVacunado = false;
		String historia = "";

		// pedido datos por consola

		System.out.println("Dime el nombre:");
		do {
			nombre = sc.nextLine();
			if (nombre.isEmpty()) {
				System.out.println("Debes introducir un nombre.");
			} else {
				isFallo = false;
			}
		} while (isFallo);

		// LO hemos gestionado en el SETTER DE RAZA
		System.out.println("raza (si no la sabes es 'cruce'):");// La raza la gestionamos en el setter de la clase
		raza = sc.nextLine();
		/**
		 * if (raza.isEmpty()) { raza = "Cruce"; }
		 **/

		do {

			try {
				System.out.println("Peso en Kg:");
				peso = Float.parseFloat(sc.nextLine());
				isFallo = false;
			} catch (NumberFormatException e) {
				System.out.println("Debe introducir un numero");
				isFallo = true;
			} catch (Exception e) {
				System.out.println("Error");
				isFallo = true;
			}
		} while (isFallo);

		do {
			System.out.println("¿ Esta vacunado ?  [Si/No]");
			String sn = sc.nextLine();
			if (("si".equalsIgnoreCase(sn)) || ("no".equalsIgnoreCase(sn))) {
				isVacunado = ("si".equalsIgnoreCase(sn)) ? true : false;
				isFallo = false;
			} else {
				System.out.println("Error. Introducir [Si/No]");
				isFallo = true;
			}
		} while (isFallo);

		System.out.println("Cuentame su historia (no es obligatorio):");
		historia = sc.nextLine();

		// crear un Perro y setear valores
		Perro pNuevo = new Perro(nombre, raza, peso);
		pNuevo.setVacunado(isVacunado);
		pNuevo.setHistoria(historia);

		// llamar al modelo para guardar en la bbdd

		do {

			try {
				dao.crear(pNuevo);
				System.out.println("Perro guardado");
				System.out.println(pNuevo);
				isFallo = false;

			} catch (Exception e) {
				System.out.println("** No se ha podido guardar el perro, el nombre ya existe, por favor dime otro");
				nombre = sc.nextLine();
				pNuevo.setNombre(nombre);
				isFallo = true;
				// e.printStackTrace();
			}
		} while (isFallo);

	}// nuevo

////////////////////////////////// LISTAR ///////////////////////////////////	

	private static void listar() {

		System.out.printf("\n***********  LISTADO DE PERROS   **************\n");

		// dar una fixed lenght al String para nombre
		ArrayList<Perro> perros = dao.listar();
		for (Perro perro : perros) {
			System.out.println(String.format("%s - %15s [%10s]  %4s Kg  %13s %s", perro.getId(), perro.getNombre(),
					perro.getRaza(), perro.getPeso(), (perro.isVacunado()) ? "vacunado" : "*Sin Vacunar*",
					perro.getHistoria()));
		}

		System.out.println("*************FIN LISTADO*****************");
	}

	/**
	 * Se encraga de pintar las pociones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
////////////////////////////////// MENU PRINCIPAL ///////////////////////////////////

	private static void pintarMenu() {

		System.out.println("\n************************************");
		System.out.println(OPC_LISTADO + ".- Listar todos los perros");
		System.out.println(OPC_NUEVO + ".- Nuevo perro");
		System.out.println(OPC_BAJA + ".- Dar de baja un perro por id");
		System.out.println(OPC_BUSCAR + ".- Buscar un perro");
		System.out.println(OPC_MODIFICAR + ".- Modificar datos de un perro\n");
		System.out.println(OPC_SALIR + ". - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");

		opcion = sc.nextLine();

	}

////////////////////////////////// MENU MODIFICAR ///////////////////////////////////

	private static void pintarMenuModificar() {

		System.out.println("*** Que deseas modificar: ***");
		System.out.println("1. Nombre");
		System.out.println("2. Raza");
		System.out.println("3. Peso");
		System.out.println("4. Vacunado");
		System.out.println("5. Historia\n");
		System.out.println("Elija una opcion:");

		opcion2 = sc.nextLine();

	}

}// AppGames
