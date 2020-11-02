package com.ipartek.sqlite3;

import java.util.Scanner;

import com.ipartek.modelo.PerroDAOSqlite;
import com.ipartek.pojo.Perro;

public class Ejercicio2 {

	private static final String OPC_LISTAR = "1";
	private static final String OPC_BUSCAR = "2";
	private static final String OPC_NUEVO = "3";
	private static final String OPC_MODIFICAR = "4";
	private static final String OPC_BORRAR = "5";
	private static final String OPC_SALIR = "S";

	static Scanner sc = null;
	static String key = "";
	static int result = 0;
	static PerroDAOSqlite dao = null;

	public static void main(String[] args) throws Exception {

///////////////////////////////// DAO /////////////////////////////////////////////////////
		// Este DAO se encarga de realizara la operaciones de CRUD contra la bbdd
		dao = new PerroDAOSqlite();

		sc = new Scanner(System.in);

		System.out.println("-----  PERRERA  ----");
		menu();

		switch (key) {
		case OPC_LISTAR: {
			listar();
			break;
		}
		case OPC_BUSCAR: {
			buscar();
			break;
		}
		case OPC_NUEVO: {
			crear();
			break;
		}
		case OPC_MODIFICAR: {
			modificar();
			break;

		}
		case OPC_BORRAR: {
			borrar();
			break;
		}
		case OPC_SALIR: {
			break;

		}
		default:
			throw new IllegalArgumentException("Valor inexperado: " + key);
		}

///////////////////////////////////// ELIMINA PERRO  //////////////////////////////////////	

		dao.eliminar(4);

		System.out.println("terminamos");
	}// main

///// PINTAMOS EL MENU ////	
	public static void menu() {

		System.out.println("1. Listar perros");
		System.out.println("2. Buscar perro por identificador");
		System.out.println("3. Nuevo perro");
		System.out.println("4. Modificar perro");
		System.out.println("5. Borrar perro");
		System.out.println("---------------------");
		System.out.println("S. Salir del menu");
		System.out.println("---------------------");
		System.out.println("*** Elija una opcion:");

		key = sc.nextLine();

	}// menu

///////////////////////////////////// RECUPERAR //////////////////////////////////////	
	private static void buscar() {

		System.out.println("--- BUSCAR ---");

		try {

			System.out.println("indroduce el id del perro que quieres buscar:");
			result = Integer.parseInt(sc.nextLine());
			if (dao.recuperar(result) == null) {
				System.out.println("No existe ese ID");
			} else {
				System.out.println(dao.recuperar(result));
			}

		} catch (NumberFormatException e) {
			System.out.println("Debe introducir un dato numerico");
		} catch (Exception e) {
			System.out.println("ERROR!");
		}

	}

///////////////////////////////////// CREA NUEVO PERRO //////////////////////////////////////
	private static void crear() {

		boolean esError = true;
		Perro pNuevo = new Perro();

		System.out.println("--- NUEVO PERRO ---");
		do {
			try {
				System.out.println("Nombre:");
				pNuevo.setNombre(sc.nextLine());
				System.out.println("Raza:");
				pNuevo.setRaza(sc.nextLine());
				System.out.println("Peso:");
				pNuevo.setPeso(Float.parseFloat(sc.nextLine()));

				System.out.println("Esta vacunado:");
				if ("Si".equalsIgnoreCase(sc.nextLine())) {
					pNuevo.setVacunado(true);
				} else if ("No".equalsIgnoreCase(sc.nextLine())) {
					pNuevo.setVacunado(false);
				}

				System.out.println("Historia:");
				pNuevo.setHistoria(sc.nextLine());

				dao.crear(pNuevo); // insert
				esError = false;
			} catch (NumberFormatException e) {

				System.out.println("Error");

			} catch (Exception e) {
				System.out.printf("** el nombre del perro %s ya existe \n", pNuevo.getNombre());
			}
		} while (esError);
	}

	private static void borrar() {
		// TODO Auto-generated method stub

	}

	private static void modificar() {
		// TODO Auto-generated method stub

	}

////////////////////// LISTAMOS TODOS LOS PERROS ///////////////////////	
	private static void listar() {

		System.out.println("--- LISTAR ---");
		for (Perro p : dao.listar()) {
			System.out.println(p);
		}

	}

}// class
