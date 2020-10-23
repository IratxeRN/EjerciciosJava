package com.ipartek.ejercicios.lista;

import java.util.Scanner;

/**
 * Realizar un programa que solicite por teclado una temperatura. Una vez le�da,
 * se a�adir� a una lista de temperaturas.<br>
 * Introducir 8 temperaturas diferentes, valid�ndolas seg�n estos criterios. �
 * <ul>
 * <li>Deber�n estar comprendidas entre -90 y 75 grados</li>
 * <ul>
 * 
 * Una vez introducidas las 8 temperaturas, se recorrer� la lista y se mostrara
 * la siguiente informaci�n:
 * <ul>
 * <li>El valor de la temperatura m�s baja</li>
 * <li>El valor de la temperatura m�s alta</li>
 * <li>La temperatura media</li>
 * <li>Cuantos grados por encima de la media est� la temperatura m�s c�lida</li>
 * <li>Cuantos grados por debajo de la media est� la temperatura m�s baja</li>
 * <li>La diferencia entre la temperatura m�xima y m�nima.</li>
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
