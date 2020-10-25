package com.ipartek.ejercicios.lista;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Jugador;

/**
 * Crear una lista de jugadores de futbol. En dicha lista se guardaran objetos
 * de la clase Jugador, que tendrá los atributos nombre, de tipo Sting y dorsal
 * de tipo int. Solicitar los datos de los jugadores por teclado, y una vez
 * introducido el primero, se insertara en la lista y se preguntara si se desea
 * introducir otro más, para lo cual el usuario escribirá S o N. En caso
 * afirmativo se volverá a pedir otro más, hasta que el usuario escriba N
 * 
 * @author Leshou
 *
 */

public class Lista1Ejercicio2 {

	public static void main(String[] args) throws Exception {

		String nombre = "";
		int dorsal = 0;
		ArrayList<Jugador> jlista = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		boolean esMas = true;
		boolean esSN = true;
		boolean esError = true;
		String sn = "";

		do {

			try {

				do {

					Jugador j = new Jugador();
					System.out.println("Nombre del jugador:");
					nombre = sc.nextLine();
					j.setNombre(nombre);

					System.out.println("Dorsal del jugador:");
					dorsal = Integer.parseInt(sc.nextLine());
					j.setDorsal(dorsal);

					jlista.add(j);

					do {
						System.out.println("Introducir nuevo jugador? S/N:");
						sn = sc.nextLine();
						if ("S".equalsIgnoreCase(sn)) {
							esSN = true;
							esMas = true;
						} else if ("N".equalsIgnoreCase(sn)) {
							esSN = true;
							esMas = false;

						} else {
							esSN = false;
							esMas = true;
							System.out.println("Debe introducir S o N:");
						}

					} while (!esSN);

				} while (esMas);

				for (Jugador j2 : jlista) {
					System.out.println(j2.toString());
				}

				esError = false;

			} catch (NumberFormatException e) {
				System.out.println("Debe introducir un numero");

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (esError);
		sc.close();
	}

}
