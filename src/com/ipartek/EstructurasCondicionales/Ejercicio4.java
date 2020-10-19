package com.ipartek.EstructurasCondicionales;

/**
 * Mostrar al usuario el siguiente menú:
Por favor escoja una opción:
•	A: calcular área de un triangulo
•	B: calcular el área de un cuadrado
•	C: calcular el área de un circulo
•	D: calcular el área de un pentágono
Realizad las operaciones adecuadas indicadas en cada categoría. En caso de que no se escoja una opción adecuada, se mostrara un mensaje de error. 
No deberá realizarse este menú en bucle

 * @author Iratxe Reguera
 *
 */
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner pedirOpcion = new Scanner(System.in);
		System.out.println("Por favor escoja una opción:\r\n" + "•	A: calcular área de un triangulo\r\n"
				+ "•	B: calcular el área de un cuadrado\r\n" + "•	C: calcular el área de un circulo\r\n"
				+ "•	D: calcular el área de un pentágono");
		char opcion = pedirOpcion.next().charAt(0);

		switch (opcion) {
		case ('A'): {
			Scanner pedirBase = new Scanner(System.in);
			System.out.println("Introduzca la base en cm:\r\n");
			float a = pedirBase.nextInt();

			Scanner pedirAltura = new Scanner(System.in);
			System.out.println("Introduzca la altura en cm:\r\n");
			float h = pedirAltura.nextInt();

			float result = (a * h) / 2;
			System.out.println("El area de un triangulo de base " + a + " y altura " + h + " es " + result);
			break;
		} // A
		case 'B': {
			Scanner pedirLado = new Scanner(System.in);
			System.out.println("Introduzca el lado del cuadrado en cm:\r\n");
			float a = pedirLado.nextInt();
			float result = (a * a) / 2;
			System.out.println("El area de un cuadrado de base " + a + " es " + result);
			break;
		} // B
		case 'C': {
			Scanner pedirRadio = new Scanner(System.in);
			System.out.println("Introduzca el radio de la circunferencia en cm:\r\n");
			float a = pedirRadio.nextInt();
			double result = (a * a) * 3.14159;
			System.out.println("El area de una circunferencia de radio " + a + " es " + result);
			break;
		} // C
		case 'D': {
			Scanner pedirLado = new Scanner(System.in);
			System.out.println("Introduzca el lado en cm:\r\n");
			float a = pedirLado.nextInt();

			Scanner pedirApotema = new Scanner(System.in);
			System.out.println("Introduzca la apotema en cm:\r\n");
			float h = pedirApotema.nextInt();

			float result = (5 * a * h) / 2;
			System.out.println("El area de un pentagono de lado " + a + " y apotema " + h + " es " + result);
			break;
		} // D
		default:
			System.out.println("No ha introducido una opcion correcta");
			break;
		}// switch
		pedirOpcion.close();
	}// main

}// class
