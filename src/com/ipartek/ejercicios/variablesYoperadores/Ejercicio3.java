package com.ipartek.ejercicios.variablesYoperadores;

/**
 * Realizar un programa que tenga 2 variables enteras, dividendo y divisor.
 * Meterle valores enteros y positivos. <br>
 * Realizar la operación división y mostrar el resultado en pantalla<br>
 * Repetir el mismo código con estas variaciones: entero y real, real y entero,
 * real y real<br>
 * Por ultimo, intentar dividir en los cuatro casos anteriores entre 0 y mostrar
 * el resultado en pantalla<br>
 * 
 * @author Iratxe Reguera
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {

		System.out.println("---- DIVISION ENTERO POSITIVO / ENTERO POSITIVO ----");
		int dividendo = 20;
		int divisor = 3;
		int resultInt = dividendo / divisor;

		System.out.println("El resultado de la division de enteros positivos es: " + resultInt);

		System.out.println("---- DIVISION ENTERO / REAL ----");
		int dividendo2 = 20;
		float divisor2 = (float) 5.85;
		float resultInt2 = dividendo2 / divisor2;

		System.out.println("El resultado de la division de entero y real es: " + resultInt2);

		System.out.println("---- DIVISION REAL / ENTERO ----");
		float dividendo3 = (float) 30.85;
		int divisor3 = 8;
		float resultInt3 = dividendo3 / divisor3;

		System.out.println("El resultado de la division de real entre entero es: " + resultInt3);

		System.out.println("---- DIVISION REAL / REAL ----");
		float dividendo4 = (float) 5.85;
		float divisor4 = (float) (-20.52);
		float resultInt4 = dividendo4 / divisor4;

		System.out.println("El resultado de la division de real entre real es: " + resultInt4);

		System.out.println("---- DIVISIONES ENTRE 0 ----");
		System.out.println(dividendo + " / 0 = " + dividendo / 0);
		System.out.println(dividendo2 + " / 0 = " + dividendo2 / 0);
		System.out.println(dividendo3 + " / 0 = " + dividendo3 / 0);
		System.out.println(dividendo4 + " / 0 = " + dividendo4 / 0);

	}

}
