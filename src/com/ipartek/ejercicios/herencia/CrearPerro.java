package com.ipartek.ejercicios.herencia;

public class CrearPerro {

	public static void main(String[] args) {
		Perro2 perrito = new Perro2("Pantaleon");
		perrito.imprimirPatas();

		Gato gato = new Gato("Sammy");

		GatoDomestico gMitxi = new GatoDomestico("Mitxi");
		System.out.println(gMitxi);

	}

}
