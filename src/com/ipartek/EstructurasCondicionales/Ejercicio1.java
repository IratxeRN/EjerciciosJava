package com.ipartek.EstructurasCondicionales;

/**
 * Realizar un programa que realice la siguiente funcionalidad Se crearan 5
 * variables enteras con los nombres a, b, c, d y e con los valores 6, 8, 0, 8 y
 * 9 <u>
 * <li>Comparar las variables a y c, indicar por consola cual es mayor</li>
 * <li>Indicar cual de las variables es la que tiene menor valor y la de mayor
 * valor</li>
 * <li>Compara las variables b y d y comprueba si son iguales</li>
 * <li>Comprobar si se puede realizar la división de a/c si no se puede realizar
 * indicarlo, en caso contrario realizar la división</li>
 * </ul>
 * 
 * @author Leshou
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		int a = 6;
		int b = 8;
		int c = 1;
		int d = 8;
		int e = 9;
		int max = 0;
		int min = 0;
		int result1 = 0;

		// comparar a y c
		if (a > c) {

			System.out.println(a + " es mayor que " + c);

		} else {

			System.out.println(c + " es menor que " + a);

		}

		// MAX Y MIN

		int num[] = { 6, 8, 1, 8, 9 };

		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			} // if
		} // for

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			} // if
		} // for

		System.out.println("Maximo = " + max);
		System.out.println("Minimo = " + min);

		// COMPRAR b y d
		if (b == d) {

			System.out.println(b + " es igual que " + d);

		} else {

			System.out.println(b + " es diferente " + d);

		}

		// DIVISION a/c
		/*
		 * result1 = a / c;
		 * 
		 * 
		 * if (result1) {
		 * 
		 * System.out.println(" a/c es  " + result1);
		 * 
		 * } else {
		 * 
		 * System.out.println("No se puede realizar la division");
		 * 
		 * }
		 */

	}

}
