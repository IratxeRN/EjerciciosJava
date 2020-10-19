package com.ipartek;

public class Ejercicio3Excepciones {

	static public String letraPosicion(String frase, int posicion) throws Exception {

		String texto[] = (String) frase;

		if (frase == null) {
			throw new Exception("No has escrito una frase");
		}
		if (posicion > texto.length) {
			throw new Exception("Escribe un numero menor");
		}

		return frase[posicion];

	}
}