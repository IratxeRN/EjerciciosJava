package com.ipartek;

import java.util.Scanner;

public class ProbarInterfaz {

	public static void main(String[] args) throws Exception {
		// TODO hacer las exceptions
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el dinero entregado");
		float entregado = Float.parseFloat(sc.nextLine());
		System.out.println("Introduce el precio del producto");
		float precio = Float.parseFloat(sc.nextLine());
		//////////////////////////////
		Utilidades util3 = new Utilidades();

		System.out.println(util3.calcularVueltas(precio, entregado));
		sc.close();
///////////////////////////////////////////		
		Utilidades util = new Utilidades();
		try {
			String nombre = util.pedirNombre();
			System.out.println(nombre);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("FIn programa nombre");

/////////
		Utilidades util2 = new Utilidades();

		try {
			System.out.println("Elegir loteria:\n 1- BONOLOTO\n 2- QUINIELA\n 3- EUROMILLON");
			int loto = Integer.parseInt(sc.nextLine());
			util2.imprimirNumeroLoteria(loto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

////////////////////////////		
//TODO mirar por que falla. Posiblemente por tema scanner
		Serie s= util.pedirDatosPorConsola());
		System.out.println("Tu serie es " + s);

	}
}
