package com.ipartek;

import java.util.Scanner;

/**
 * MEtodos o funciones son muy usadas en java. Podemos tener metodos de clase,
 * metodos de objetos o instancia, incluso metodos propios de una clase.
 *
 * 
 * los metodos se ceclara de la sieguiente manera:
 * 
 * <code><pre>
 *calificadores de acceso - retorno(q devuelve) - nombre de funcion ( parametros) excepciones {
 *
 *codigo fuente
 *returns es lo que retorna y es obligatorio a menos que la funcion no devuelva nada - void
 *
 *}
 * </code>
 * </pre>
 * 
 * * @author Leshou
 */

/**
 * publico se peude ejecutar fuera de la clase, estatico solo va a estar una vez
 * en memoria, void porque no devuelve nada, y como argumentos se le puede pasar
 * un parametro de string
 */

public class MetodosYcalificadores {

	// SOBRECARGA: es cuando un metodo se llama igual, pero tiene diferentes
	// parametros, muy usado en los Construcotres

	static void saludar() {
		System.out.println("Hola");
	}

	static void saludar(String nombre) {
		System.out.println("Hola " + nombre);
	}

	/**
	 * Imprimir por pantalla el nombre tantas veces como numRepeticiones
	 * 
	 * @param nombre          String nombre a imprimir
	 * @param numRepeticiones int
	 * @throws Exception si numRepeticiones >= 3
	 */
	static void saludar(String nombre, int numRepeticiones) throws Exception {

		if (numRepeticiones >= 3) {
			throw new Exception("** No seas pesado");
		}

		for (int i = 0; i < numRepeticiones; i++) {
			System.out.println("Hola " + nombre);
		}

	}

	static String dimeTuNombre() {
		String resultado = ""; // 1º definir el resultado a retornar en una variable
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre:");
		resultado = sc.nextLine();
		sc.close();
		return resultado; // solo puede haber uno y al final
	}

	/**
	 * tipico metodo main para ejecutar codigo en java
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		saludar();
		saludar("Ander");
		saludar(null);

		String nombre = dimeTuNombre();
		saludar(nombre);

		try {
			saludar(nombre, 4);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
