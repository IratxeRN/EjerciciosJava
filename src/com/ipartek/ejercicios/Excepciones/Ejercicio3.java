package com.ipartek.ejercicios.Excepciones;

import java.util.Scanner;

import com.ipartek.Ejercicio3Excepciones;

/**
 * Realice un m�todo que reciba como argumento un String y un n�mero y muestre
 * la letra de la posici�n indicada. <br>
 * Ll�melo pasando como par�metro un String sin inicializar. <br>
 * Dicha llamada se encontrara dentro de un bloque try catch, que en caso de
 * producirse una excepci�n por un paso de par�metros a null, no acabe con la
 * ejecuci�n del programa. <br>
 * As� mismo, se controlara tambi�n que si el numero pasado es mayor que el
 * tama�o del string, capturara el error y nos solicitara meter un numero
 * valido, indic�ndonos los valores en los que puede estar comprendido <br>
 * (para este apartado se le pasa como string la cadena de texto �La lluvia en
 * Sevilla no es una maravilla�)
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
