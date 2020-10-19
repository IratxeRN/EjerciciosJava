package com.ipartek.ejercicios.variablesYoperadores;

/**
 * Realizar un programa que realice la siguiente operación: crear tres variables
 * de tipo Byte, llamadas num1, num2, resultado. Asignar los valores 255 y 223.
 * Sumarlas y guardarlo en resultado. Comprueba si el resultado da 478. Si no lo
 * da, buscar una solución al problema para solucionarlo
 * 
 * @author Iratxe Reguera
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		byte num1 = (byte) 255;
		byte num2 = (byte) 223;
		byte result = (byte) (num1 + num2);

		if (result == 478) {

			System.out.println("El resultado es 478. Esta OK" + result);

		} else {

			System.out.println("ERROR. El resultado no es 478 es " + result);
		} // if

	}

}
