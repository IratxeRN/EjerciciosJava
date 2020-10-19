package com.ipartek.ejercicios.EstructurasRepetitivas;

/**
 * Mostrar con bucles for anidados las tablas de multiplicar del 0 al 10 <br>
 * 
 * @author Leshou
 * @version 1.0
 *
 */

public class Ejercicio2 {
	static final int TABLA_MIN = 0;
	static final int TABLA_MAX = 10;

	public static void main(String[] args) {
		int i;
		int j;
		int result = 0;

		for (i = TABLA_MIN; i <= TABLA_MAX; i++) {
			System.out.printf("---Tabla del %s--- \n", i);
			for (j = 1; j <= 10; j++) {

				result = i * j;

				System.out.printf("%s x %S = %s \n", i, j, result);
			} // for

		} // for

	}// main

}// class
