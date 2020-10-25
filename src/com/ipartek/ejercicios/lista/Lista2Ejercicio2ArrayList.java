package com.ipartek.ejercicios.lista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realizar un programa que solicite por teclado una temperatura. Una vez leída,
 * se añadirá a una lista de temperaturas.<br>
 * Introducir 8 temperaturas diferentes, validándolas según estos criterios. •
 * <ul>
 * <li>Deberán estar comprendidas entre -90 y 75 grados</li>
 * <ul>
 * 
 * Una vez introducidas las 8 temperaturas, se recorrerá la lista y se mostrara
 * la siguiente información:
 * <ul>
 * <li>El valor de la temperatura más baja</li>
 * <li>El valor de la temperatura más alta</li>
 * <li>La temperatura media</li>
 * <li>Cuantos grados por encima de la media está la temperatura más cálida</li>
 * <li>Cuantos grados por debajo de la media está la temperatura más baja</li>
 * <li>La diferencia entre la temperatura máxima y mínima.</li>
 * <ul>
 * 
 * @author Leshou
 *
 */
public class Lista2Ejercicio2ArrayList {

	private static int CANTIDAD = 8;
	private static int TEMP_MAX = 75;
	private static int TEMP_MIN = -90;

	public static void main(String[] args) {

		ArrayList<Integer> listasTemp = new ArrayList<Integer>();

		int suma = 0;
		int max = 0;
		int min = 0;
		float media = 0;
		int result = 0;
		boolean isError = true;
		Scanner sc = new Scanner(System.in);

		try {

			for (int i = 0; i < CANTIDAD; i++) {

				do {
					System.out.printf("Introducir temperatura %s: ", i + 1);
					result = Integer.parseInt(sc.nextLine());

					if (result >= -90 && result <= 75) {
						listasTemp.add(result);
						suma += result;
						isError = false;

					} else {
						System.out.printf("Introducir temperatura entre %s y %s: ", TEMP_MIN, TEMP_MAX);
					}

				} while (isError);

				if (max < listasTemp.get(i)) {
					max = listasTemp.get(i);
				} // iff
			} // for

			min = listasTemp.get(0);
			for (int i = 0; i < CANTIDAD; i++) {
				if (min > listasTemp.get(i)) {
					min = listasTemp.get(i);
				} // iff
			} // for

			media = suma / CANTIDAD;

			System.out.printf("La temperatura mas alta es %s \n", max);
			System.out.printf("La temperatura mas baja es %s: \n", min);
			System.out.printf("La temperatura media es %s: \n", media);
			System.out.printf("Grados por encima de la media de la temp mas calida %s: \n", max - media);
			System.out.printf("Grados por encima de la media de la temp mas calida %s: \n", media - min);
			System.out.printf("Diferencia entre temperatura max y min %s: \n", max - min);

		} catch (NumberFormatException e) {
			System.out.printf("Debe introducir una cifra \n");

		} catch (Exception e) {
			System.out.printf("Error \n");
		} // catch

		sc.close();

	}// main

}// class
