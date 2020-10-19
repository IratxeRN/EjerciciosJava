package com.ipartek.EstructurasCondicionales;

/**
 * Pedir por teclado al usuario que introduzca una distancia en cm
*Una vez introducida, se solicitará que escoja a que unidad se van a convertir, introduciendo la opción por teclado
*<ul>
*<li>A convertir a metros</li>
*<li>B: convertir a pulgadas</li>
*<li>C: convertir a pies</li>
*<li>D:convertir a yardas</li>
*</ul>
 * 
 * @author Iratxe Reguera
 *
 */
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner pedirCm = new Scanner(System.in);
		System.out.println("Introduce los cm a calcular");
		float distancia = pedirCm.nextInt();

		Scanner pedirUnidad = new Scanner(System.in);
		System.out.println("Indroducir a que unidad se desea convertir\r\n" + "*A convertir a metros\r\n"
				+ "*B: convertir a pulgadas\r\n" + "*C: convertir a pies\r\n" + "*D:convertir a yardas\r\n");
		// char unidad='A' ;
		char unidad = pedirUnidad.next().charAt(0);

		switch (unidad) {
		case 'A': {
			System.out.println(distancia + " son " + distancia * 0.01 + " metros");
			break;
		}
		case 'B': {
			System.out.println(distancia + " son " + distancia * 0.40 + " pulgadas");
			break;
		}
		case 'C': {
			System.out.println(distancia + " son " + distancia * 0.033 + " pies");
			break;
		}
		case 'D': {
			System.out.println(distancia + " son " + distancia * 0.011 + " yardas");
			break;
		}

		default:
			System.out.println("Indroduce el valor correcto");
			break;
		}// switch
		pedirCm.close();
		pedirUnidad.close();
	}// main

}// class
