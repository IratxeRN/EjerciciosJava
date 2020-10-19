package com.ipartek.EstructurasCondicionales;

/**
 * Realiza un programa que pida un numero por consola. <br>
 * En caso de que el numero sea mayor que 50, o menor que 0, indicar que el numero introducido no es valido
 * @author Iratxe Reguera
 * @version 1.0
 *
 */

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// es una clase, creamos un nuevo metodo.
		System.out.println("Introduce un numero");
		// nextline devuelve una string, por lo que pasamos a int al necesitar un num.
		int num = Integer.parseInt(sc.nextLine());

		// int num = 15;

		if ((num < 0) || (num > 50)) {

			System.out.println("Numero introducido no es valido");

		} else {

			System.out.println(num + " = Numero correcto");

		} // if
		sc.close();
	}

}
