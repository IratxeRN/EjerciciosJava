package com.ipartek.ejercicios.Excepciones;

import com.ipartek.pojo.Persona;

/**
 * Crea una clase Persona con los atributos nombre y edad. En el m�todo setEdad
 * <br>
 * lanzar una excepci�n si la edad introducida es menor que 0 o mayor que
 * 120.<br>
 * Realiza un programa que al comienzo cree una lista de personas haciendo
 * uso<br>
 * del constructor vac�o, y lea los datos por teclado y los asigne a los
 * objetos<br>
 * creados. Solo introducir� las personas en la lista si est�n en el rango
 * de<br>
 * edad indicado, comprob�ndolo mediante el uso de excepciones<br>
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
			System.out.println(p1.getNombre() + " " + p1.getEdad() + " a�os.");

			Persona p2 = new Persona();
			p2.setNombre("Kk");
			p2.setEdad(200);
			System.out.println(p2.getNombre() + " " + p2.getEdad() + " a�os.");

		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}

	}

}
