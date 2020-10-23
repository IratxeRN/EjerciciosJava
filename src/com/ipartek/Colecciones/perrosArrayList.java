package com.ipartek.Colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class perrosArrayList {

	public static void main(String[] args) {

		ArrayList<String> perros = new ArrayList<String>();

		perros.add("Laika");
		perros.add("Lasie");
		perros.add("Hachico");
		perros.add("Laika");
		perros.add("Laika");
		perros.add("Baldo");

		perros.set(3, "Luna");

		perros.add(5, "Rufus");

		perros.remove(4);

		String can = perros.get(3);
		System.out.println(perros.size());

		int pos = perros.indexOf("Baldo");
		System.out.println(pos);

		for (String canes : perros) {
			System.out.println(canes);
		}

		for (Iterator iterator = perros.iterator(); iterator.hasNext();) {

			String canes = (String) iterator.next();
			System.out.println(canes);

		}
	}

}
