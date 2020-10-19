package com.ipartek;

public class Ejercicio3Excepciones {

	static public char letraPosicion(String frase, int posicion) throws Exception {

		if (frase == null) {
			throw new Exception("No has escrito una frase");
		}
		if (posicion > frase.length()) {
			throw new Exception("Escribe un numero menor");
		}

		char texto[] = frase.toCharArray(); // pasar una cadena de texto a un array de caracteres.

		return texto[posicion];
	}
}