package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;

import com.ipartek.pojo.Electrodomestico;
import com.ipartek.pojo.TelevisionPlana;
import com.ipartek.pojo.Televisor;

public class EjercicioElectrodomesticosAnder {

	public static void main(String[] args) {

		ArrayList<Electrodomestico> lista = new ArrayList<>();

		Electrodomestico elec1 = new Electrodomestico();
		elec1.setNombre("Lavadora BALAY");
		elec1.setPrecio(300);
		lista.add(elec1);

		Televisor tele = new Televisor();
		tele.setNombre("Telefunken");
		tele.setPrecio(400);
		tele.setPulgadas(30);
		lista.add(tele);

		TelevisionPlana tele2 = new TelevisionPlana();
		tele2.setNombre("LG enorme");
		tele2.setPrecio(600);
		tele2.setPulgadas(100);
		tele2.setPantalla("XL");
		lista.add(tele2);

		// ArrayList<TelevisionPlana> listaTVPlanas = new ArrayList<>();
		// listaTVPlanas.add(elec1);

		for (Electrodomestico elec : lista) {

			// hay que perguntar siempre con instnaceof.
			// no ncesitamos poner un instanceof de Electrodomesticos porque es la clase
			// padre
			System.out.println(elec.getNombre());
			System.out.println(elec.getPrecio());

			// para seleccionar los objetos de cada clase (normalmente hijas)
			if (elec instanceof Televisor) {

				// podemos castear usando (Television) y asi nos permite acceder a los metodos
				// de esa clase

				System.out.println(((Televisor) elec).getPulgadas());

			}

			if (elec instanceof TelevisionPlana) {

				// tambien podemos castear y asignarlo a una variable nueva
				TelevisionPlana tvp = (TelevisionPlana) elec;
				tvp.getPantalla();

				System.out.println(tvp.getPantalla());
			}

		} // for
		System.out.println("Salimos");

	}

}