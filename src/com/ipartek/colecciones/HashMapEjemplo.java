package com.ipartek.colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.ipartek.pojo.Perro;

public class HashMapEjemplo {

	public static void main(String[] args) {
		// Definir un HashMap
		HashMap<String, String> global = new HashMap<String, String>();

		// Insertar valores "key"-"value" al HashMap
		global.put("Laura", "667895789");
		global.put("Pepe", "645895756");
		global.put("Abelardo", "55895711");
		global.put("Daniel", "667111788");
		global.put("Arturo", "667598623");

		// probar a meter un duplicado
		global.put("Arturo", "666555444");

		// recuperar el value por la Key
		String telefonoPepe = global.get("Pepe");

		// obtener todas las Keys
		Set<String> keys = global.keySet();

		// obtener todos los values
		Collection<String> values = global.values();

		// Definir Iterator para extraer o imprimir valores
		for (Iterator<String> it = global.keySet().iterator(); it.hasNext();) {
			String key = (String) it.next();
			String value = (String) global.get(key);
			System.out.println("Alumno: " + key + " - " + "Telefono: " + value);
		}

		System.out.println("------------------- DEFINIMOS HASMAP CON CLASE PERRO -------------------------");

		// definir una hashamp con perros la key será su id(int) y el value(Perro)
		// meter 2 perros

		// recorrer con un Iterator

		HashMap<Integer, Perro> hmPerros = new HashMap<Integer, Perro>();

		Perro p1 = new Perro("Lasie", "Collie", 30);
		p1.setId(20);
		Perro p2 = new Perro("Pluto", "Setter", 25);
		p2.setId(5);
		Perro p3 = new Perro("Laika", "P.Aleman", 35);
		p3.setId(9);
		Perro p4 = new Perro("Sammy", "Gatoperro", 5);
		p4.setId(10);

		hmPerros.put(20, p1);
		hmPerros.put(5, p2);
		hmPerros.put(9, p3);
		hmPerros.put(10, p4);

		for (Iterator<Integer> iterator = hmPerros.keySet().iterator(); iterator.hasNext();) {

			int key = (Integer) iterator.next();
			Perro value = hmPerros.get(key);

			System.out.println("Perro: " + key + " - " + "Datos " + value);

		}

		Collection<Perro> perros = hmPerros.values();
//TODO como ordenar un hasMap
	}

}
