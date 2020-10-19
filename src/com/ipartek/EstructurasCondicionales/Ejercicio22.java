package com.ipartek.EstructurasCondicionales;

import java.util.Scanner;

/**
 * Realiza un programa que pida un numero por consola repetidamente. <br>
 * En caso de que el numero sea mayor que 50, o menor que 0, indicar que el
 * numero introducido no es valido y seguir pidiendolo.
 * 
 * @author Iratxe Reguera
 * @version 1.0
 *
 */

public class Ejercicio22 {

	public static void main(String[] args) {

		int num = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);// es una clase, creamos un nuevo metodo.

		do {
			System.out.println("Introduce un numero entre el 0 y 50");
			num = Integer.parseInt(sc.nextLine());
			if (i == 3) {
				System.out.println("Quieres meter el numero bien?");
				i = 0;
			} else {
				i++;
			} // if

		} while ((num <= 0) || (num >= 50) || (i == 3));

		System.out.println("Numero correcto " + num);
		sc.close();
	}

}
