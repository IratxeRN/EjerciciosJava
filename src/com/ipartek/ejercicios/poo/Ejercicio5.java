package com.ipartek.ejercicios.poo;

/**
 * 5. Crear la case operaciones que recibir� dos n�meros enteros y calcule la
 * suma, resta, multiplicaci�n y divisi�n, cada una en un m�todo, imprimir los
 * resultados.
 * 
 * @author Iratxe Reguera
 *
 */

public class Ejercicio5 {

	public static void main(String[] args) {

		int i = 250;
		int j = 63;
		PooEj5 op = new PooEj5();

		System.out.println("Suma " + op.suma(i, j));
		System.out.println("Resta " + op.resta(i, j));
		System.out.println("Multiplicacion " + op.multi(i, j));
		System.out.println("Division " + op.divi(i, j));
	}

}
