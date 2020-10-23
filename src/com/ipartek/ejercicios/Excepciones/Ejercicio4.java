package com.ipartek.ejercicios.Excepciones;

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

public class Ejercicio4 {

	public static int NUM_PERSONAS = 1;

	public static void main(String[] args) throws Exception {

		String nombre = "";
		int edad = 0;
		boolean isError = true;
		Scanner sc = new Scanner(System.in);
		Persona p[] = new Persona[NUM_PERSONAS];
		// ArrayList<Persona> personas = new ArrayList<Persona>();

		do {

			try {

				for (int i = 0; i < NUM_PERSONAS; i++) {

					System.out.println("Introduce el nombre de la persona: ");
					nombre = sc.nextLine();
					System.out.println("Introduce la edad de la persona: ");
					edad = Integer.parseInt(sc.nextLine());
					p[i] = new Persona();
					p[i].setNombre(nombre);
					p[i].setEdad(edad);
					isError = false;
				}

				for (int i = 0; i < p.length; i++) {

					System.out.println(p);// son iguales. Va junto con al .toString de la clase Persona
					System.out.println(p.toString());// son iguales. Va junto con al .toString de la clase Persona

					System.out.println("*- " + p[i].getNombre() + " " + p[i].getEdad() + " años.\n");
				}

			} catch (Exception e) {
				isError = true;
				System.out.println("Excepcion: " + e.getMessage());

			}

		} while (isError);
		sc.close();
	}

}
