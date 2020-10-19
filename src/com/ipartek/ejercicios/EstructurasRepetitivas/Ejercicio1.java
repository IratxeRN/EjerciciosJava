package com.ipartek.ejercicios.EstructurasRepetitivas;

/**
 * Realizar un ejercicio que nos muestre la tabla de multiplicar del 6.
 * 
 * @author Ira Reguera
 * @version 1.0
 *
 */

public class Ejercicio1 {

	static final int TABLA_MULTIPLICAR = 6;

	public static void main(String[] args) {

		int i = 0;
		int result = 0;

		for (i = 1; i <= 10; i++) {

			result = TABLA_MULTIPLICAR * i;
			System.out.printf("%s x %S = %s \n", TABLA_MULTIPLICAR, i, result);
		}
	}
}