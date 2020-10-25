package com.ipartek.ejercicios.Excepciones;

import java.util.ArrayList;

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

public class Ejercicio4ArrayListAnder {

	public static void main(String[] args) {

		// Lo que aparece entre <> se llama CASTEAR y sirve para indicar el tipo de
		// Objetos que tenemos dentro del Array
		ArrayList<Persona> personas = new ArrayList<Persona>();

		try {

			Persona p1 = new Persona();
			p1.setNombre("pepe");
			p1.setEdad(56);

			personas.add(p1);

			Persona p2 = new Persona();
			p2.setNombre("MAtusalem");
			p2.setEdad(300); // CUIDADO lanza una Exception y va directo al Catch, no ejecuta las lineas de
								// abajo

			personas.add(p2);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {

			// foreach para iterar sobre el ArrayList<Perona>
			for (Persona p : personas) {
				System.out.println(p);
			}

			// for de toda la vida
			/*
			 * for (int i = 0; i < personas.size(); i++) { System.out.println(
			 * personas.get(i)); }
			 */

		}

		// System.out.println(p); // llamamos al metodo .toString()
		// System.out.println(p.toString());

		//
	}

}