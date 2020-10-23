package com.ipartek;

import java.util.Scanner;

public class ProbarInterfaz {

	public static void main(String[] args) throws Exception {

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
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Elegir loteria:\n 1- BONOLOTO\n 2- QUINIELA\n 3- EUROMILLON");
			int loto = Integer.parseInt(sc.nextLine());
			util2.imprimirNumeroLoteria(loto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

////////////////////////////		

		sc.close();
	}
}
