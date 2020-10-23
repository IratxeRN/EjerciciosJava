package com.ipartek.ejercicios.lista;

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
public class Lista2Ejercicio1 {

	public static void main(String[] args) {

		// int temperatura[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int temperatura[] = { 0, 0, 0, 0 };
		int suma = 0;
		int max = 0;
		int min = 0;
		float media = 0;

		Scanner sc = new Scanner(System.in);
		// TODO el bucle.
		try {

			for (int i = 0; i < temperatura.length; i++) {
				System.out.printf("Introducir temperatura %s: ", i + 1);
				temperatura[i] = Integer.parseInt(sc.nextLine());
				suma += temperatura[i];

				if (max < temperatura[i]) {
					max = temperatura[i];
				}
			}

			min = max;
			for (int i = 0; i < temperatura.length; i++) {
				if (min >= temperatura[i]) {
					min = temperatura[i];
				}
			}
			media = suma / 8;

			System.out.printf("La temperatura mas alta es %s \n", max);
			System.out.printf("La temperatura mas baja es %s: \n", min);
			System.out.printf("La temperatura media es %s: \n", media);
			System.out.printf("Grados por encima de la media de la temp mas calida %s: \n", max - media);
			System.out.printf("Grados por encima de la media de la temp mas calida %s: \n", media - min);
			System.out.printf("Diferencia entre temperatura max y min %s: \n", max - min);

		} catch (NumberFormatException e) {
			System.out.printf("Debe introducir una cifra \n", max);

		} catch (Exception e) {
			System.out.printf("Error \n", max);
		}

		sc.close();

	}

}
