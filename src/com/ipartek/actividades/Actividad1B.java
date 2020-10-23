package com.ipartek.actividades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * B) Crear un proyecto en modo consola que nos muestre un menú de 3 opciones
 * 
 * <ul>
 * 
 * <li>Calcular la letra del dni</li> 
 * <li>Calcular medida de cm a pulgadas</li> 
 * <li>Salir</li>
 * </ul>
 * Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, * <br>
 * y si el usuario escoge cada una de las funciones, que permita introducir los
 * datos correspondientes por teclado para poder dar el resultado
 * 
 * @author Iratxe Reguera Nieto
 * @version 1.0
 *
 */

public class Actividad1B {

	static final String OPC_DNI = "1";
	static final String OPC_CM_INCH = "2";
	static final String OPC_SALIR = "S";
	static String opcion = "";
	static Scanner sc = null;

	static final char LETRAS_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
			'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	public static void main(String[] args) throws Exception {

		////// MENU/////
		boolean noSalida = true;
		sc = new Scanner(System.in);
		do {
			sacarmenu();

			switch (opcion) {
			case OPC_DNI: {
				letraDni();
				noSalida = true;
				break;
			}

			case OPC_CM_INCH: {
				calcularCmInch();
				noSalida = true;
				break;
			}
			case OPC_SALIR: {
				noSalida = false;
				break;
			}

			default:
				noSalida = true;
				break;
			}
		} while (noSalida);

		System.out.println("\n ADIOS:");

		sc.close();
	}

	private static void letraDni() throws Exception {
		String dni = "";
		char letra;
		boolean isError = true;
		do {

			try {
				System.out.println("Introducir DNI sin letra. :");
				dni = sc.nextLine();

				if (dni == null) {
					throw new Exception("No puede ser null");
				}

				if (dni.length() != 8) {
					throw new Exception("Los numeros de un dni son 8");
				}

				int posicion = Integer.parseInt(dni) % 23;
				letra = LETRAS_DNI[posicion];

				System.out.printf("La letra para el DNI:%s es %s.", dni, letra);
				isError = false;

			} catch (Exception e) {
				System.out.println("\n ERROR!");
			}
		} while (isError);
	}

	private static void calcularCmInch() {

		float cm = 0;
		double inch = 0;

		boolean isError = true;
		do {
			System.out.println("Introducir el num en CM. :");
			cm = sc.nextFloat();
			try {
				inch = cm * 0.40;
				System.out.printf("%s CM son %s PULGADAS", cm, inch);
				isError = false;

			} catch (InputMismatchException e) {
				System.out.println("\n ERROR!");

			} catch (Exception e) {
				System.out.println("\n Error. Introduzca un numero!");
			}
		} while (isError);
	}

	private static void sacarmenu() {

		System.out.println("\n************MENU************");
		System.out.println(OPC_DNI + ".- Calcular la letra del DNI");
		System.out.println(OPC_CM_INCH + ".- Calcular de CM a PULGADAS");
		System.out.println(OPC_SALIR + ".- Salir");
		System.out.println("-----------------------------------");

		System.out.println("\n Selecciona una opcion del menu:");

		opcion = sc.nextLine();

	}

}
