package com.ipartek.ejercicios.Excepciones;

import java.util.Scanner;

import com.ipartek.Ejercicio3Excepciones;

/**
 * Realice un método que reciba como argumento un String y un número y muestre
 * la letra de la posición indicada. <br>
 * Llámelo pasando como parámetro un String sin inicializar. <br>
 * Dicha llamada se encontrara dentro de un bloque try catch, que en caso de
 * producirse una excepción por un paso de parámetros a null, no acabe con la
 * ejecución del programa. <br>
 * Así mismo, se controlara también que si el numero pasado es mayor que el
 * tamaño del string, capturara el error y nos solicitara meter un numero
 * valido, indicándonos los valores en los que puede estar comprendido <br>
 * (para este apartado se le pasa como string la cadena de texto “La lluvia en
 * Sevilla no es una maravilla”)
 * 
 * @author Leshou
 * @version 1.0
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {

		String texto;
		int num = 0;
		String letra;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un texto");
		texto = sc.nextLine();

		System.out.println("Introduce un numero");
		num = Integer.parseInt(sc.nextLine());
		try {
			letra = Ejercicio3Excepciones.letraPosicion(texto, num);
			System.out.println("La letra es: " + letra);

		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}

		sc.close();
	}

}
