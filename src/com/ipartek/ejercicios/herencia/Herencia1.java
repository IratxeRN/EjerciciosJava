package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Electrodomestico;
import com.ipartek.pojo.TelevisionPlana;

/**
 * Realizar las siguientes jerarqu�as de herencia: <br>
 * tendremos una clase padre que se llamara Electrodom�stico. <br>
 * Dicha clase contara con los atributos nombre y precio. Se realizaran todos
 * los constructores, m�todos get y set necesarios<br>
 * Una vez creada dicha clase, se creara una serie de clases hijas. <br>
 * La primera ser� la clase televisor. Dicha clase contara con el atributo
 * pulgadas, as� como con todos los constructores y m�todos necesarios para
 * rellenar sus atributos, incluidos los del padre <br>
 * Tambi�n se creara una clase televisionPlana, que heredara de televisi�n,
 * tendr� el atributo string tipo de pantalla ( tft, plasma,..) y constructores,
 * m�todos get y set para rellenar los datos de los objetos que se creen,
 * incluyendo todos los atributos de los objetos de las clases padres de las que
 * heredan <br>
 * Una vez creado esta jerarqu�a de herencia, realizar un programa que nos pida
 * insertar televisiones planas dentro de un array de electrodom�sticos.<br>
 * Dicho array * constara de 5 electodomesticos, pero lo rellenaremos con
 * objetos de tipo televisi�nPlana.
 * 
 * @author Leshou
 *
 */

public class Herencia1 {

	private static int NUM_ELECTROS = 5;

	public static void main(String[] args) {

		ArrayList<Electrodomestico> listaTV = new ArrayList<Electrodomestico>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < NUM_ELECTROS; i++) {

			TelevisionPlana tv = new TelevisionPlana();

			System.out.println("Insertar nombre:");
			tv.setNombre(sc.nextLine());

			System.out.println("Insertar pantalla:");
			tv.setPantalla(sc.nextLine());

			System.out.println("Insertar precio:");
			tv.setPrecio(Integer.parseInt(sc.nextLine()));

			System.out.println("Insertar pulgadas:");
			tv.setPulgadas(Integer.parseInt(sc.nextLine()));

			listaTV.add(tv);

		}

		for (Electrodomestico tv : listaTV) {

			// System.out.println(tv);

		}
		sc.close();
	}

}
