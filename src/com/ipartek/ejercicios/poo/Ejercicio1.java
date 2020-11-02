package com.ipartek.ejercicios.poo;

/**
 * 1. Confeccionar una clase que permita cargar el nombre y la edad de una
 * persona. Y luego, haciendo uso de esa clase, solicitar la introducción de
 * dichos datos para una única persona. Sobre esos datos realizar las siguientes
 * operaciones mediante funciones:
 * <ul>
 * <li>a. Mostrar los datos cargados de la persona</li>
 * <li>b. Imprimir un mensaje que nos diga si es mayor de edad o no.</li>
 * </ul>
 * 
 * @author Leshou
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		PersonaEj1 p = new PersonaEj1();

		p.mayorDeEdad("Ana", 25);
	}

}
