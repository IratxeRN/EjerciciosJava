package com.ipartek.actividades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A) Realizar un programa en java que realice la siguiente función: <br>
 * Crear un * array de 5 notas que almacenara en formato double. <br>
 * Una vez creado dicho array se rellenaran dichos elementos leyéndolo desde el
 * teclado.<br>
 * Una vez creado el contenido, se calculara la media de las notas así como se
 * mostraran las notas.<br>
 * más altas y más bajas de dicho array.
 * 
 * @author Iratxe Reguera Nieto
 * @version 1.0
 *
 */

public class Actividad1A {

	public static void main(String[] args) {

		double nota[] = { 0, 0, 0, 0, 0 };
		double suma = 0;
		double media = 0;
		double max = 0;
		double min = 0;

		Scanner sc = new Scanner(System.in);

		try {

			for (int i = 0; i < nota.length; i++) {
				System.out.printf("Introduce la nota %s ", i + 1);

				nota[i] = Double.parseDouble(sc.nextLine());
				suma += nota[i];

				if (max < nota[i]) {
					max = nota[i];
				}

			}

			min = nota[0];
			for (int i = 0; i < nota.length; i++) {
				if (min > nota[i]) {
					min = nota[i];
				}
			}

			for (int i = 0; i < nota.length; i++) {

				System.out.printf("La nota %s es %s \n", i + 1, nota[i]);
			}
			media = suma / 5;

			System.out.printf("La media es  %s: \n", media);
			System.out.printf("La nota maxima es  %s \n", max);
			System.out.printf("La nota minima es  %s \n", min);

		}

		catch (InputMismatchException e) {
			System.out.println("Debe introducir un numero");

		} catch (Exception e) {
			System.out.println("Error");
		}

		sc.close();
	}// main

}
// class
