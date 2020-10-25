package com.ipartek.ejercicios.lista;

import java.util.ArrayList;
import java.util.Random;

import com.ipartek.pojo.Carta;

/**
 * Crear una lista que contenga las cuarenta cartas de una baraja. <br>
 * Para crear dicha lista se creara una clase de tipo carta, que tendrá un
 * número entero para el valor de la carta, así como un string con el palo de la
 * baraja (copas, espadas, oros, bastos). <br>
 * Crear la baraja con las cartas ordenadas por palos, y luego por números. <br>
 * Barajar dicha baraja y mostrar las cartas.
 * 
 * @author Leshou
 *
 */

public class Lista1Ejercicio4 {

	private static int NUM_CARTAS = 12;

	public static void main(String[] args) {

		String palo[] = { "Oros", "Copas", "Bastos", "Espadas" };
		String palo2 = "";
		String c2 = "";

		ArrayList<Carta> listaCartas = new ArrayList<Carta>();
		Random rnd = new Random();

		for (int i = 0; i < palo.length; i++) {

			palo2 = palo[i];

			for (int j = 0; j < NUM_CARTAS; j++) {

				Carta c = new Carta(j + 1, palo2);
				listaCartas.add(c);
			} // for valor

		} // for palos

		for (Carta carta : listaCartas) {

			switch (carta.getValor()) {
			case 10: {
				c2 = "Sota";
				break;
			}
			case 11: {
				c2 = "Caballo";
				break;
			}
			case 12: {
				c2 = "Rey";
				break;
			}
			default:
				c2 = String.valueOf(carta.getValor());
			}

			System.out.printf("%s de %s\n", c2, carta.getPalo());

		} // for listado

		System.out.printf("********************************\n");

		for (Carta carta : listaCartas) {
			int azar = rnd.nextInt(listaCartas.size());
			System.out.println(listaCartas.get(azar));
		}

	}

}
