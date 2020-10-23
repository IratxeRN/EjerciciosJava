package com.ipartek.Colecciones;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class perrosArrayListClase {

	public static void main(String[] args) {

		ArrayList<Perro> perros = new ArrayList<Perro>();

		// construyo el objeto perro y a la vez añado el primero. Esto con constructor
		// sobrecargado
		perros.add(new Perro("Lasie"));
		perros.add(new Perro("Laika"));
		perros.add(new Perro("Rufus"));
		perros.add(new Perro("Goffy"));
		perros.add(new Perro("Rintintin"));
		perros.add(new Perro("Lasie"));

		// otra forma de añadir
		Perro can = new Perro();
		can.setNombre("Chucho");
		can.setPeso(48);
		perros.add(can);

		// borrar
		perros.remove(2);

		// sacar un pantalla un index determinado
		System.out.println(perros.get(3));

		for (int i = 0; i < perros.size(); i++) {
			Perro p = perros.get(i);
			System.out.println(p.toString());
		} // for

		// vamos a recorrer el array para buscar a "Goffy"
		for (int i = 0; i < perros.size(); i++) {

			Perro pIteracion = perros.get(i);

			if ("Goffy".equals(pIteracion.getNombre())) {
				Perro p = perros.get(i);
				System.out.println(p.toString());
				break; // salir del for
			}
		} // for

		// vamos a recorrer el array para borrar a "Rintintin"
		for (int i = 0; i < perros.size(); i++) {

			Perro pIteracion = perros.get(i);

			if ("Rintintin".equals(pIteracion.getNombre())) {
				perros.remove(i);
				break; // salir del for
			}

		} // for

	}

}
