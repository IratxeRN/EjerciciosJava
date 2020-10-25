package com.ipartek.ejercicios.Excepciones;

import java.util.Scanner;

/**
 * Realice un programa que nos solicite por teclado dos números, y leerlos
 * usando la clase Scanner mediante la función nextLine(). <br>
 * Transformar ambos strings a números enteros usando la siguiente sentencia
 * Integer.parseInt(numeroLeido). <br>
 * Agrupar el código entre un bloque try catch y procesar para que no se
 * produzca una interrupción y finalización <br>
 * del programa si alguno de los números leídos no puede convertirse, <br>
 * retomando el control en el punto del fallo, hasta que se solucione.<br>
 * <br>
 * 
 * @author Leshou
 * @version 1.0
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		boolean isError = true;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Introducir num 1");
			try {
				num1 = Integer.parseInt(sc.nextLine());
				isError = false;

			} catch (NumberFormatException e) {
				System.out.println("ERROR, ha introducido un texto. Repita otra vez:");
				// e.printStackTrace();

			} catch (Exception e) {
				System.out.println("ERROR. Debe introducir un numero entero. Repita otra vez:");
				// e.printStackTrace();

			} // catch Exception
		} while (isError);

		// 2º numero, Bucle para repetir hasta que no haya error
		isError = true;

		do {

			System.out.println("Introducir num 2");
			try {
				num2 = Integer.parseInt(sc.nextLine());
				isError = false;

			} catch (NumberFormatException e) {
				System.out.println("ERROR, ha introducido un texto. Repita otra vez:");
				// e.printStackTrace();

			} catch (Exception e) {
				System.out.println("ERROR. Debe introducir un numero entero. Repita otra vez:");
				// e.printStackTrace();

			} // catch Exception
		} while (isError);

		System.out.printf("Tus numeros son %s y %s", num1, num2);

		sc.close();
	}// main

}// class
