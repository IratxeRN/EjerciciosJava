package reguera.iratxe.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoGameMain {

	static final String OP_LISTAR = "1";
	static final String OP_CREAR = "2";
	static final String OP_BORRAR = "3";
	static final String OP_BUSCAR = "4";

	static final String OP_SALIR = "S";

	static String opcion = "";

	static Scanner sc = null;

	static private IGamesDao dao = VideoGamesDao.getInstance();

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		menuprincipal();

		switch (opcion) {

		case OP_LISTAR:
			listar();
			break;
		case OP_CREAR:
			crear();
			break;
		case OP_BORRAR:
			borrar();
			break;
		case OP_BUSCAR:
			buscar();
			break;
		case OP_SALIR:

			break;
		default:
			System.out.println("OPCION NO VALIDA!!! \n");
			break;
		}

	}// main

	private static void buscar() {
		// TODO Auto-generated method stub

	}

	private static void borrar() {
		// TODO Auto-generated method stub

	}

	private static void crear() {
		// TODO Auto-generated method stub

	}

	private static void listar() {

		ArrayList<VideoGame> lista = dao.listar();

		for (VideoGame vg : lista) {
			System.out.println(vg.toString());
		}
	}

	private static void menuprincipal() {

		System.out.println("\n************VIDEOJUEGOS**************");
		System.out.println(OP_LISTAR + ".- Listar todos juegos");
		System.out.println(OP_CREAR + ".- Nuevo juego");
		System.out.println(OP_BORRAR + ".- Dar de baja un juego por id");
		System.out.println(OP_BUSCAR + ".- Buscar un uego por id");

		System.out.println(OP_SALIR + ". - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");

		opcion = sc.nextLine();
	}

}// class
