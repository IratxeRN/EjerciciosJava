package mf0227.uf2404.actividad2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <b> EXTRAS<b><br>
 * <ul>
 * <li>Definir una interfaz IConducible con los métodos arrancar y parar</li>
 * <li>Crear clase Vehiculo ( color, matricula ) para el Coche ( marca, modelo,
 * potencia, cilindrada)extienda de ella e implemente la interfaz</li>
 * <li>Realizar un Diagrama de Clases</li>
 * </ul>
 * 
 * Realizar un programa que nos cree una lista de coches, para ello deberá
 * almacenarse dentro de esta lista los objetos de tipo coche que crearemos<br>
 * 
 * La clase coche tendrá los siguientes atributos: matricula, marca, modelo,
 * color, potencia, cilindrada<br>
 * 
 * Para rellenar la lista se creara un menú que nos solicitara introducir los
 * datos por teclado, y una vez leídos todos, se guardaran en un objeto que se
 * añadirá a la lista y nos pedirá que indiquemos si queremos introducir un
 * vehículo más o no.<br>
 * 
 * Una vez que no queramos introducir más coches, nos mostrara todo el contenido
 * en pantalla Realizar el ejercicio en base a las reglas de programación
 * orientada a objetos<br>
 *
 * @author Iratxe Reguera
 *
 */
public class UF2404Actividad2 {

	static String matricula = "";
	static String marca = "";
	static String modelo = "";
	static String color = "";
	static int potencia = 0;
	static int cilindrada = 0;
	static String sn = "";
	static boolean isSi = true;
	static boolean isError = true;
	static Scanner sc = null;

	static ArrayList<Coche> listaCoche = new ArrayList<Coche>();

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("************* COCHES ************** ");

		do {// pedimos datos por pantalla

			pedirDatos();

			listaCoche.add(new Coche(marca, modelo, color, matricula, potencia, cilindrada));// metemos el coche en la
																								// lista

			masDatos();

		} while (isSi);

		// mostrar listado de coches
		mostrarCoches();

		sc.close();
	}// main

	private static void pedirDatos() {// metodo para pedir los datos por pantalla

		System.out.println("Introducir Marca:");
		marca = sc.nextLine();
		System.out.println("Introducir Modelo:");
		modelo = sc.nextLine();
		System.out.println("Introducir Color:");
		color = sc.nextLine();
		System.out.println("Introducir Matricula:");
		matricula = sc.nextLine();

		do { // comprueba que no se introduzcan letras

			try {
				System.out.println("Introducir Potencia:");
				potencia = Integer.parseInt(sc.nextLine());
				isError = false;
			} catch (NumberFormatException e) {
				System.out.println("Debe introducir un numero");

			} catch (Exception e) {
				System.out.println("ERROR!!!!!");
			}
		} while (isError);

		do {// comprueba que no se introduzcan letras

			try {
				System.out.println("Introducir Cilindrada:");
				cilindrada = Integer.parseInt(sc.nextLine());
				isError = false;
			} catch (NumberFormatException e) {
				System.out.println("Debe introducir un numero");

			} catch (Exception e) {
				System.out.println("ERROR!!!!!");
			}
		} while (isError);

	}// pedirDatos

	private static void masDatos() {// comprobar si queremos meter mas datos por pantalla

		System.out.println("Introducir más coches? S/N:");
		sn = sc.nextLine();
		System.out.println("-----------------------------");

		if ("S".equalsIgnoreCase(sn)) {
			isSi = true;
		} else if ("N".equalsIgnoreCase(sn)) {
			isSi = false;
		} else {
			System.out.println("Error, debe introducir S o N:");
			isSi = true;
		}

	}// masDatos

	private static void mostrarCoches() {// listamos los coches
		System.out.println("************* LISTAR COCHES  ************** ");

		for (Coche coche : listaCoche) {

			System.out.println(coche.toString());
		}

	}// mostrasCoches

}// class
