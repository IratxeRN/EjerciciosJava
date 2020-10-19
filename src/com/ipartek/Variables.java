package com.ipartek;

/**
 * Ejercicio para declarar variables en Java
 * @author Iratxe Reguera Nieto
 * @version 1.0
 *
 */

public class Variables {
	  
	
	/**
	 *  esto es un comentario de Javadoc y sirve para documentar. Acepta etiquetas de html
	 *  Usamos el metodo main para poder ejecutar nuestro codigo Java.
	 *  @param args array de String con los argumentos para ejecutar este metodo.
	 *  Este comentario se saca con /** + ctrol + enter
	 */
	
	public static void main(String[] args) {
		
			//comentario linea
		
		/*  
		 * 
		 * comentario bloque 
		 * */
		
		// las variables en java se declaran: TIPO nombre = valor ;
		
		String nombre = "Iratxe";
		int edad= 44;
		float sueldo= 6521.99f;
		float sueldo2= (float)6521.99;
		char sexo= 'm';
		boolean isCovidAffected = true; //la variables boolean siempre empiezan por is
				
		System.out.println("Hola " + nombre);
		System.out.println("Mi edad es " + edad);
		System.out.println("Mi sueldo es " + sueldo2);
		
		if(isCovidAffected) { 
			System.out.println("Tienes que hacer PCR"); //primero ejecuta el true
		}else{
			System.out.println("Estas sano");
		}// if
	
		
		switch (sexo) {
		case 'v': {
			System.out.println("Eres hombre");
			break; //es importante usa break
		}
		case 'm': {
			System.out.println("Eres mujer");
			break;
		}
		default:
			System.out.println("NS/NC");
			break;
		}//switch
		
		
	}//main

}// clase
