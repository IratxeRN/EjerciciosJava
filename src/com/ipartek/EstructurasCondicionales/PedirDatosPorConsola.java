package com.ipartek.EstructurasCondicionales;

import java.util.Scanner;

/**
 * Ejercicio clasico para leer por consola con java.util.scanner Pediremos la
 * edad hasta que lo meta bien, que debe estar comprendida entre 0 y 150 años.
 *
 * @author Leshou
 * @version 1.0
 *
 */

public class PedirDatosPorConsola {
	// es una constante. Siempre van en mayusculas
	static final int EDAD_MINIMA = 0;
	static final int EDAD_MAXIMA = 150;
	static final int MAXIMO_ERRORES = 3;

	public static void main(String[] args) {

		System.out.println("Ongi etorri");
		Scanner sc = new Scanner(System.in);
		int edad = -1;
		int contador = 0;

		do {
			// gestionar contador
			if (contador >= MAXIMO_ERRORES) {
				System.out.println("Lee bien");
			} else {
				System.out.printf("Escribe tu edad de %s a %s maxi:", EDAD_MINIMA, EDAD_MAXIMA);
			}

			// pedir edad
			edad = Integer.parseInt(sc.nextLine());
			contador++;
		} while (!(edad >= EDAD_MINIMA && edad <= EDAD_MAXIMA));

		System.out.println("Gracias, tu edada es :" + edad);
		sc.close();
	}

}
