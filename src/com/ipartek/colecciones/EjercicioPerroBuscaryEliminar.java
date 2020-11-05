package com.ipartek.colecciones;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

/**
 * Ejercicio para aprender los metodos básicos de java.util.ArrayList
 * 
 * @author ur00
 *
 */
public class EjercicioPerroBuscaryEliminar {

	public static void main(String[] args) {

		ArrayList<Perro> lista = new ArrayList<Perro>();
		// construyo el objeto perro y a la vez añado el primero. Esto con constructor
		// sobrecargado
		lista.add(new Perro("Bubba"));
		lista.add(new Perro("Laika"));
		lista.add(new Perro("Rintintin"));
		lista.add(new Perro("goffy"));

		// vamos a recorrer el array para buscar a "Rintintin"
		for (int i = 0; i < lista.size(); i++) {

			Perro pIteracion = lista.get(i);

			if ("Rintintin".equals(pIteracion.getNombre())) {
				lista.remove(i);
				break; // salir del for
			}

		} // for

		System.out.println("Agur Venur");

	}

}
