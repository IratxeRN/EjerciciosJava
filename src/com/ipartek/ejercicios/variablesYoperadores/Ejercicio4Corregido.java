package com.ipartek.ejercicios.variablesYoperadores;

public class Ejercicio4Corregido {

	public static void main(String[] args) {
		byte num1 = -1;
		int num1entero = (num1 & 0xFF); // 255
		// System.out.println(num1entero);

		byte num2 = -33;
		int num2entero = (num2 & 0xFF); // 223
		// System.out.println(num2entero);

		int resultado = num1entero + num2entero;

		System.out.println("El resultado es " + resultado);

	}

}
