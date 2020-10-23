package com.ipartek;

import java.util.Scanner;

import com.ipartek.pojo.Serie;

public class Utilidades implements IFunciones {

	static final char LETRAS_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
			'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	/**
	 * Calcula la letra del DNI
	 * 
	 * @param numeros String son los 8 numeros del DNI
	 * @return dni completo con los numeros + letra
	 * @throws Exception si no pasamos como parametros 8 numeros
	 */
	static public String calcularLetraDni(String numeros) throws Exception {

		char letra;

		if (numeros == null) {
			throw new Exception("No puede ser null");
		}

		if (numeros.length() != 8) {
			throw new Exception("Los numeros de un dni son 8");
		}

		try {
			int posicion = Integer.parseInt(numeros) % 23;
			letra = LETRAS_DNI[posicion];

		} catch (Exception e) {
			throw new Exception("No es un numero correcto " + numeros);
		}

		return numeros + letra;
	}

	/**
	 * PEDIR NOMBRE. Implementado de IFunciones
	 */
	@Override
	public String pedirNombre() throws Exception {

		Scanner sc = new Scanner(System.in);
		String nombre = "";

		System.out.println("Introduce tu nombre: ");
		nombre = sc.nextLine();
		sc.close();

		if (nombre.length() <= 1) {
			// throw new Exception("El nombre debe tener mas de una letra");
			System.out.println("El nombre debe tener mas de una letra");
		}
		// recorremos el String para ver si es letra o numero
		for (int i = 0; i < nombre.length(); i++) {
			char letra = nombre.charAt(i);
			boolean isNumber = Character.isDigit(letra);
			if (isNumber) {
				throw new Exception("No puede ser numero");
			}
		}

		return nombre;
	}

///////////////////////////////////////////////////////////////////////////
	@Override
	public void imprimirNumeroLoteria(int loto) throws Exception {

		switch (loto) {
		case LOTERIA_EUROMILLON: {
			System.out.println("El numero del Euromillon es 111111111");
			break;
		}
		case LOTERIA_QUINIELA: {
			System.out.println("El numero del Quiniela es 111111111");
			break;
		}
		case LOTERIA_BONOLOTO: {
			System.out.println("El numero del Bonoloto es 111111111");
			break;
		}
		default:
			throw new IllegalArgumentException("No ha elegido la opcion correcta");
		}

	}

////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception {

		float vueltas = dineroEntregado - precioProducto;

		if (precioProducto < precioProducto) {
			throw new Exception("Falta dinero");
		}

		return vueltas;
	}

//////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Serie pedirDatosPorConsola() {

		return null;
	}

}
