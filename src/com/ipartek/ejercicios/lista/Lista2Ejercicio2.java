package com.ipartek.ejercicios.lista;

import java.util.ArrayList;
import java.util.Random;

/**
 * Genera un programa que seleccione números aleatorios para el sorteo de los
 * euro millones. <br>
 * Para dicho sorteo se creara una lista de enteros que se rellenara con los
 * números del 1 al 50, así como una lista con los números del 1 al 12 para
 * representar las estrellas. <br>
 * Ambas listas se desordenaran y se sacaran los cinco primeros números de la
 * lista de los 50 números y 2 de la lista de 12. <br>
 * Se mostraran los números en pantalla <br>
 * 
 * <b>Bonus</b>: realizar este programa haciendo que ambas listas se creen
 * haciendo uso de POO, mediante una clase llamada BoletoEuro y que al hacer uso
 * de un constructor vacio, ya nos muestre el resultado generado en pantalla<br>
 * 
 * @author Leshou
 *
 */

public class Lista2Ejercicio2 {

	public static void main(String[] args) {

		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
		ArrayList<Integer> listaEstrellas = new ArrayList<Integer>();
		Random random = new Random();

		try {

			for (int i = 0; i < 50; i++) {
				listaEnteros.add(i + 1);
				// System.out.println(listaEnteros.get(i));
			}
			for (int i = 0; i < 12; i++) {
				listaEstrellas.add(i + 1);
				// System.out.println(listaEstrellas.get(i));
			}
			System.out.println("*** EURO MILLONES ***");
			for (int i = 0; i < 5; i++) {
				int azar = random.nextInt(listaEnteros.size());
				System.out.println(listaEnteros.get(azar));
			}
			System.out.println("*** ESTRELLAS ***");
			for (int i = 0; i < 2; i++) {
				int azar = random.nextInt(listaEstrellas.size());
				System.out.println(listaEstrellas.get(azar));
			}

		} catch (IndexOutOfBoundsException e) {
			e.getMessage();

		} catch (Exception e) {
			e.getMessage();
		}

	}

}
