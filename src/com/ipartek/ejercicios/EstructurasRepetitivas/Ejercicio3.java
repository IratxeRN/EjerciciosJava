package com.ipartek.ejercicios.EstructurasRepetitivas;

import java.util.Scanner;

/**
 * EJERCICIO 3<br>
 * Realizar el siguiente menú:<br>
 * Introduzca una opción:<br>
 * <ul>
 * <li>A. Calcular el área de un cuadrado</li>
 * <li>B. Calcular el área de un triángulo equilátero</li>
 * <li>C. Calcular el perímetro de un circulo</li>
 * <li>D. Calcular el área de un circulo</li>
 * </ul>
 * Hacer que se repita este menú de manera indefinida.
 * 
 * EJERCICIO 4<br>
 * Realizar la modificación pertinente al ejercicio 4 para que una vez que
 * el<br>
 * usuario haya escogido una de las opciones <br>
 * y muestre la operación, desea continuar? Si escoje la opción si volverá a<br>
 * mostrar el menú, si escoge no, saldrá de la ejecución del programa.
 * 
 * 
 * @author Iratxe Reguera
 * @version 1.0
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {

		String result;
		String ok;
		boolean isOk = false;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.printf("Introduzca una opción: \n " + "A. Calcular el área de un cuadrado \n "
					+ "B. Calcular el área de un triángulo equilátero \n "
					+ "C. Calcular el perímetro de un circulo \n " + "D. Calcular el área de un circulo \n ");

			result = sc.nextLine();

			switch (result) {
			case "A": {
				System.out.printf("Ha introducido A. Quiere continuar?\n ");
				ok = sc.nextLine();

				if ("si".equals(ok)) {
					isOk = false;
					break;
				} else {
					if ("no".equals(ok)) {
						isOk = true;
						System.out.printf("Has elegido NO.Terminamos ejecucion");
						break;
					} else {
						isOk = false;
						break;
					}
				}

			}
			case "B": {
				System.out.printf("Ha introducido B. Quiere continuar?\n");
				ok = sc.nextLine();

				if ("si".equals(ok)) {
					isOk = false;
					break;
				} else {
					if ("no".equals(ok)) {
						isOk = true;
						System.out.printf("Has elegido NO.Terminamos ejecucion");
						break;
					} else {
						isOk = false;
						break;
					}
				}
			}
			case "C": {
				System.out.printf("Ha introducido C. Quiere continuar?\n");
				ok = sc.nextLine();

				if ("si".equals(ok)) {
					isOk = false;
					break;
				} else {
					if ("no".equals(ok)) {
						isOk = true;
						System.out.printf("Has elegido NO.Terminamos ejecucion");
						break;
					} else {
						isOk = false;
						break;
					}
				}
			}
			case "D": {
				System.out.printf("Ha introducido D. Quiere continuar?\n");
				ok = sc.nextLine();

				if ("si".equals(ok)) {
					isOk = false;
					break;
				} else {
					if ("no".equals(ok)) {
						isOk = true;
						System.out.printf("Has elegido NO.Terminamos ejecucion");
						break;
					} else {
						isOk = false;
						break;
					}
				}
			}
			default: {
				isOk = false;
			}
			}
		} while (isOk == false);
		sc.close();
	}// main

}// class
