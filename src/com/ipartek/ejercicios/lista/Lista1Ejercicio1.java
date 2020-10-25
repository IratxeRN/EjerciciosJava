package com.ipartek.ejercicios.lista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear una lista de nombres de alumnos, donde se guardaran con strings.<br>
 * Insertar diez nombres de alumnos en la lista <br>
 * Mostrar los diez nombres recorriendo la lista con un foreach<br>
 * 
 * @author Leshou
 *
 */

public class Lista1Ejercicio1 {

	static final int NUM_ALUMNOS = 10;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> alumnos = new ArrayList<String>();

		for (int i = 0; i < NUM_ALUMNOS; i++) {

			System.out.println("Intorudcir nombre de alumno:");
			alumnos.add(i, sc.nextLine());
		} // for

		for (String nomb : alumnos) {

			System.out.println(nomb + "\n");
		} // foreich

		sc.close();
	}// main

}// class
