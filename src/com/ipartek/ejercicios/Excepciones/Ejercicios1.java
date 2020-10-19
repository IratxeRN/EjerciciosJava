package com.ipartek.ejercicios.Excepciones;

import java.util.Scanner;

/**
 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego
 * calcule “a/b”. <br>
 * Pruebe a introducir b=0 y ver que hace el programa con la división por
 * cero.<br>
 * Pruebe a introducir b=”Carlos” para ver cómo se comporta el programa. <br>
 * Añada excepciones para recoger estas excepciones y avisar del problema al
 * usuario<br>
 * 
 * @author Leshou
 *
 */

public class Ejercicios1 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int result = 0;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Introduce un numero a");
			a = Integer.parseInt(sc.nextLine());
			System.out.println("Introduce un numero b");
			b = Integer.parseInt(sc.nextLine());
			result = a / b;
			System.out.println(a + " / " + b + " = " + result);

		} catch (ArithmeticException e) {
			System.out.println("Error al dividir entre 0.");
			e.printStackTrace();

		} catch (NumberFormatException e) {
			System.out.println("Error. Debe introducir un numero.");
			e.printStackTrace();

		} catch (Exception e) {// la generica siempre la ultima
			System.out.println("ERROR!!!!.");
			e.printStackTrace();
		}
		sc.close();
	}// main

} // class
