package com.ipartek.ejercicios.poo;

import java.util.Scanner;

/**
 * Diseñar una clase llamada Alumno con los atributos privados: nombre alumno, y
 * un array con las 5 notas enteras de ese alumno y los siguientes métodos
 * públicos:
 * <ul>
 * <li>Un constructor que mete los datos del array e inicialice también el
 * nombre con los valores introducidos por teclado.</li>
 * <li>Un método llamado mejorNota que devuelve la mejor nota ,</li>
 * <li>Otro llamado menor que devuelve la menor de las notas</li>
 * <li>Otro llamado mostrar que muestre el nombre del alumno seguido de su nota
 * media.</li>
 * </ul>
 * Realizar un programa que haga uso de dicha clase. Para ello se creara un menú
 * que nos solicite si deseamos introducir un alumno. <br>
 * Si la respuesta es ‘s’ o ‘S’ se creara un alumno, pidiendo todos sus datos
 * por teclado y se mostrara la siguiente información:
 * <li>El nombre del alumno</li>
 * <li>Su mejor nota</li>
 * <li>Su peor nota</li>
 * <li>Su nota media</li>
 * </ul>
 * 
 * @author Iratxe Reguera
 *
 */

public class Poo2 {

	public static void main(String[] args) {

		String nombre = "";
		int notas[] = { 0, 0, 0, 0, 0 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir un alumno?: S/N");

		if ("S".equalsIgnoreCase(sc.nextLine())) {

			System.out.println("Nombrel del alumno");
			nombre = sc.nextLine();

			for (int i = 0; i < notas.length; i++) {

				System.out.printf("Introduce nota %s", i + 1);
				notas[i] = Integer.parseInt(sc.nextLine());
			}

			Alumno a = new Alumno(nombre, notas);

			System.out.println("Nombre del alumno: " + a.getNombre());
			System.out.println("Mejor nota: " + a.mejorNota(notas));
			System.out.println("Peor nota: " + a.menor(notas));
			a.mostrar(nombre, notas);

		}
		sc.close();
	}

}
