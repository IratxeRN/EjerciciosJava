package com.ipartek.ejercicios.Excepciones;

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
 * @author Leshou
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) throws Exception {

		try {
			Persona p1 = new Persona();
			p1.setNombre("Pepe");
			p1.setEdad(10);
			System.out.println(p1.getNombre() + " " + p1.getEdad() + " años.");

			Persona p2 = new Persona();
			p2.setNombre("Kk");
			p2.setEdad(200);
			System.out.println(p2.getNombre() + " " + p2.getEdad() + " años.");

		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}

	}

}
