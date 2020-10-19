package com.ipartek.ejercicios.variablesYoperadores;

/**
 * Realizar una pequeña calculadora. Para ello se crearan 10 variables de
 * distintos tipos numéricos. Una vez creadas dichas variables y asignadas desde
 * código valores (se recomienda valores entre -10 y 10) realizar las siguientes
 * operaciones:
 * <ul>
 * <li>La suma de todos los números</li>
 * <li>La resta de todos los números</li>
 * <li>La media de todos los números</li>
 * </ul>
 * 
 * @author Ira Reguera
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		/*
		 * int num0 = 0; int num1 = 1; int num2 = -2; int num3 = 3; int num4 = 4; int
		 * num5 = -5; int num6 = 6; int num7 = 7; int num8 = -8; int num9 = 9;
		 * 
		 * float resultSuma = 0; float resultResta = 0; float resultMedia = 0;
		 * 
		 * resultSuma = num0 + num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 +
		 * num9; resultResta = num0 - num1 - num2 - num3 - num4 - num5 - num6 - num7 -
		 * num8 - num9; resultMedia = resultSuma / 10;
		 * 
		 * System.out.println("La Suma es= " + resultSuma);
		 * System.out.println("La Suma es= " + resultResta);
		 * System.out.println("La Suma es= " + resultMedia);
		 */

		int num[] = { 3, 8, -1, 5, -2, 6, -7, 7, 10, -1 };
		float resultSuma = 0;
		float resultResta = 0;
		float resultMedia = 0;

		for (int i = 0; i < num.length; i++) {

			resultSuma += num[i];
			resultResta -= num[i];
		} // for

		resultMedia = resultSuma / num.length;

		System.out.println("La suma de los numeros es = " + resultSuma);
		System.out.println("La resta de los numeros es = " + resultResta);
		System.out.println("Media de los numeros es = " + resultMedia);

		// OTRO ARRAY DE EJEMPLO -> Temperatura y dias de la semana.

		int temperaturaSemana[] = { 14, 16, 20, 23, 21, 20, 15 };
		String diasSemana[] = { "L", "M", "X", "J", "V", "S", "D" };
		float sumatorioSemana = 0;

		// con escribir el for ya me monta la estructura con la variable del array
		for (int i = 0; i < temperaturaSemana.length; i++) {

			System.out.println(diasSemana[i] + " hace " + temperaturaSemana[i] + " grados");
			sumatorioSemana += temperaturaSemana[i];

		} // for

		double mediaSemana = sumatorioSemana / temperaturaSemana.length;
		// para que me formatee a 2 decimales
		System.out.printf("Media de la semana= %.2f", mediaSemana);
	}

}
