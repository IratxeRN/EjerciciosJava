package com.ipartek.ejercicios.Excepciones;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Persona;

/**
 * Crea una clase Persona con los atributos nombre y edad. En el método setEdad
 * <br>
 * lanzar una excepción si la edad introducida es menor que 0 o mayor que
 * 120.<br>
 * Realiza un programa que al comienzo cree una lista de personas haciendo
 * uso<br>
 * del constructor vacío, y lea los datos por teclado y los asigne a los
 * objetos<br>
 * creados. Solo introducirá las personas en la lista si están en el rango
 * de<br>
 * edad indicado, comprobándolo mediante el uso de excepciones<br>
 * 
 * Clase PERSONA
 * 
 * @author Leshou
 *
 */

public class Ejercicio4ArrayList {

	public static void main(String[] args) throws Exception {

		String nombre = "";
		int edad = 0;
		boolean isError = true;
		Scanner sc = new Scanner(System.in);
		String sn = "";

		// Se introduce dato a dato
		ArrayList<Persona> personas = new ArrayList<Persona>();

		do {

			try {

				do {
					System.out.println("Introduce el nombre de la persona: ");
					nombre = sc.nextLine();
					System.out.println("Introduce la edad de la persona: ");
					edad = Integer.parseInt(sc.nextLine());

					Persona p = new Persona();

					p.setNombre(nombre);
					p.setEdad(edad);
					personas.add(p);

					System.out.println("Otra persona?: ");
					sn = sc.nextLine();
					isError = false;
				} while (!"SI".equals(sn));

				for (int i = 0; i < personas.size(); i++) {

					Persona p2 = personas.get(i);
					System.out.println("*- " + p2.getNombre() + " " + p2.getEdad() + " años.\n");
				}

			} catch (Exception e) {
				isError = true;
				System.out.println("Excepcion: " + e.getMessage());
			}

		} while (isError);
		sc.close();
	}

}
