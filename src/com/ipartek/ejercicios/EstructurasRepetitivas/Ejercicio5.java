package com.ipartek.ejercicios.EstructurasRepetitivas;

import java.util.Scanner;

/**
 * Realizar un programa que pida por teclado las notas de un alumno. Dichas <br>
 * notas se guardarán en formato entero, en un array de 8 posiciones,
 * totales.<br>
 * Se solicitará la nota del alumno, y se guardará en el array. Una vez<br>
 * introducida se preguntará si se desean introducir más notas. Si la
 * respuesta<br>
 * es si, se continuara metiendo notas en el array Tener cuidado, solo se
 * podrán<br>
 * meter 8 notas. No se deberá dejar méter una novena.
 * 
 * @author Leshou
 * @version 1.0
 */

public class Ejercicio5 {
//TODO
	static final int MAX_NOTAS = 3;

	public static void main(String[] args) {

		int notas[] = { 0, 0, 0, 0, 0, 0, 0, 0 };
		String sn = "";
		Scanner sc = new Scanner(System.in);
		int cont = 0;

		for (int i = 0; i < MAX_NOTAS; i++) {
			// INTRODUCCION DE LAS NOTAS
			System.out.printf("Por favor, introduce la nota del alumno:\n");
			notas[i] = Integer.parseInt(sc.nextLine());
			System.out.printf("La nota num%s es %s. Quieres seguir introduciendo mas notas? S/N:\n", i + 1, notas[i]);

			cont++;

			sn = sc.nextLine();
			// miro si me responde si o no

			if ("N".equals(sn) || "n".equals(sn)) {

				break;
			} else if ("S".equals(sn) || "s".equals(sn)) {

				// compruebo si ha llegado al maximo de notas posibles de introducir
				if (i == MAX_NOTAS - 1) {
					System.out.printf("NO PUEDES METER MAS NOTAS:\n");
				} // if
			} else {

				System.out.printf("Introduce S o N \n");
			} // if

		} // for

		// Listado de las notas introducidas hasta terminar el array o hasta decir No
		for (int i = 0; i < cont; i++) {
			System.out.printf("La nota num%s es %s.\n", i + 1, notas[i]);
		} // for CONTEO FINAL

		sc.close();

	}// main

}// class
