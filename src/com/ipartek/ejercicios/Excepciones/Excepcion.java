package com.ipartek.ejercicios.Excepciones;

import java.util.Scanner;

public class Excepcion {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Dime un num");
			num = Integer.parseInt(sc.nextLine());

		} catch (Exception e) {
			e.printStackTrace(); // es solo para controlar el erro. No suele ir aqui.
			System.out.println("Error. No es un numero: " + num);

		} finally { // no es obligatorio
			sc.close();
			System.out.println("Cerramos escaner.");
		}
	}
}