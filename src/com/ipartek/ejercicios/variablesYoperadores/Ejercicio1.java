package com.ipartek.ejercicios.variablesYoperadores;

/**
 * 
 * Realizar un programa que cree una variable de cada uno de los tipos de datos simples que podemos encontrar en el lenguaje de programaci�n Java, asign�ndoles un valor
Una vez creadas, se mostrar�n por pantalla los valores de cada una de ellas
De manera adicional, se buscar� por internet o otras fuentes, los valores m�ximos y m�nimos que pueden albergar 

 * @author Iratxe Reguera
 *
 */
//datos de tipos primitivos
public class Ejercicio1 { 

	public static void main(String[] args) {
		String nombre = "Iratxe";
		//tipos de enteros
		int numEntero = 3;
		byte numByte = 1;
		short numCorto = 3;
		long numeroDoble = 6;
		
		//wrappers => son clases que envuelven a las variables primitivas con ciertas utilidades
		  // int     => Integer
		  // float   => Float
		  // char    => Character
		  // boolean => Boolean
				
		float decimal= (float)10.1;
		char car= 'a';
		boolean isTrue = true; 
		
		System.out.println("String " + nombre + ". ");
		
		System.out.println("(Int)numEntero " + numEntero);
		System.out.println("Valor max de un int " + Integer.MAX_VALUE);
		System.out.println("Valor min de un int " + Integer.MIN_VALUE);
		System.out.println("1 int sin " + Integer.SIZE + "bits");
		
		
		System.out.println("(Byte)numByte " + numByte);
		System.out.println("Valor max de un byte " + Byte.MAX_VALUE);
		System.out.println("Valor min de un byte " + Integer.MIN_VALUE);
		System.out.println("1 int sin " + Integer.SIZE + "bits");
		
		
		
		System.out.println("Float " + decimal);
		System.out.println("Char " + car);
		System.out.println("Boolean " + isTrue);
	}

}
