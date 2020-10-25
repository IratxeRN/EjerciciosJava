package com.ipartek.ejercicios.lista;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Fotocopiadora;

/**
 * Crear una clase para la siguiente abstracción: una fotocopiadora.<br>
 * En esta clase se registraran las siguientes elementos:
 * <ul>
 * <li>número de hojas en la bandeja,</li>
 * <li>nivel de tinta,</li>
 * <li>y si la impresora es laser o no.</li>
 * </ul>
 * Crear una lista de impresoras y rellenarla con 3 impresoras, de las que
 * pediremos todos los datos necesarios para crearlas.
 * 
 * @author Leshou
 *
 */

public class Lista1Ejercicio3 {

	private static int NUM_IMPRESORAS = 3;

	public static void main(String[] args) {

		String modelo = "";
		int hojas = 0;
		String nivel = "";
		boolean laser = true;

		ArrayList<Fotocopiadora> fotolista = new ArrayList<Fotocopiadora>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < NUM_IMPRESORAS; i++) {
			System.out.println("Modelo:");
			modelo = sc.nextLine();
			System.out.println("Numero de hojas:");
			hojas = Integer.parseInt(sc.nextLine());
			System.out.println("Nivel de tinta:");
			nivel = sc.nextLine();
			System.out.println("Laser:");
			if ("SI".equalsIgnoreCase(sc.nextLine())) {
				laser = true;
			} else {
				laser = false;
			}

			fotolista.add(new Fotocopiadora(modelo, hojas, nivel, laser));

		} // for

		for (Fotocopiadora fotocopiadora : fotolista) {
			System.out.println(fotocopiadora.toString());
		} // forreich
		sc.close();
	}// main

}// class
