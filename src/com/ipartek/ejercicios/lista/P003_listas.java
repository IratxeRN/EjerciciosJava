package com.ipartek.ejercicios.lista;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.PrendaVestir;

/**
 * Crear un proyecto nuevo que llamaremos P003_listas. Dicho proyecto constara
 * de las siguientes clases:
 * <ul>
 * <li>Una clase PrendaVestir, que contendr� los siguientes atributos:
 * <ul>
 * <li>un string para el nombre de producto,</li>
 * <li>un int para la talla y</li>
 * <li>un doubl� para el precio.</li>
 * </ul>
 * Tambi�n deber� contar con un constructor vac�o y uno completo, los m�todos
 * get y set correspondientes a cada atributo y un m�todo propio llamado
 * mostrarDatoProducto, que mostrara la informaci�n del producto desde el que se
 * llame a esta funci�n.</i>
 * <li>Una clase principal donde se definir� una lista de PrendaVestir vacia,
 * donde se solicitara al usuario si desea introducir una prenda. Para ello
 * deber� solicitarse por teclado al usuario que responda �si� o �no�. En caso
 * de que la respuesta sea �si�, se a�adir� a la lista un elemento nuevo. Los
 * datos de dicho elemento se introducir�n por teclado. Una vez que el usuario
 * escriba �no�, se recorrer� la lista y se mostraran los datos dentro de ella
 * en una l�nea por art�culo. Para ello se har� uso de la funci�n
 * mostrarDatosProducto de la clase el listado que se obtenga por deber� quedar
 * de la siguiente manera:
 * 
 * </ul>
 * o Cantidad de art�culos: 5
 * <ol>
 * <li>:Camisa de la talla 32, 45.55�</li>
 * <li>: Pantal�n de la talla 44, 29,95�</li>
 * <li>: Calcetines de la talla 42, 5,99�</li>
 * <li>: Blusa de la talla 38, 43,20�</li>
 * <li>: falda de la talla 44, 55,32�</li>
 * </ol>
 * Total: 179,97�<br>
 * <ul>
 * <li>Una vez creada la lista y mostrada por pantalla se mostrara por pantalla
 * el texto: ��est� todo correcto? Escriba si/no� y se solicitara que introduzca
 * por teclado en la consola s� o no.</li>
 * <li>Si la respuesta es �si�, si el importe es de mas de 120 euros se
 * realizara un descuento del 10%, si es de mayor de 180 eurso se descontara un
 * 20%. Una vez realizado el descuento, se mostrara en pantalla el siguiente
 * mensaje: �cargando importe a tarjeta de cr�dito� seguido del importe.</li>
 * <li>Si la respuesta es �no�, se mostrara el siguiente mensaje: ��cu�l es el
 * n�mero de art�culo que es err�neo?� aqu� se solicitara introducir un numero
 * de art�culo, que este dentro del rango de la lista. Y se solicitaran de nuevo
 * los datos de ese art�culo para reemplazarlos.</li>
 * </ul>
 * Una vez realizado los apartados anteriores, borrar los elementos de la lista
 * 
 * 
 * @author Leshou
 *
 */
public class P003_listas {
//TODO terminar el ejercicio
	static Scanner sc = null;
	static ArrayList<PrendaVestir> listaPrendas = new ArrayList<PrendaVestir>();
	static double total = 0;

	public static void main(String[] args) {

		boolean isYes = true;
		String sn = "";

		sc = new Scanner(System.in);

		do {
			System.out.println("Desea introducir una prenda?: S/N");
			sn = sc.nextLine();

			if ("S".equalsIgnoreCase(sn)) {

				anadirProducto();

			} else if ("N".equalsIgnoreCase(sn)) {

				isYes = false;

			} else {

				System.out.println("Dato erroneo. Debe introducir S o N.\n");
			}

		} while (isYes);

		mostrarProductos();
//TODO resto
		sc.close();
	}// main

///// A�ADIR LOS PRODUCTOS
	private static void anadirProducto() {

		sc = new Scanner(System.in);

		PrendaVestir prenda = new PrendaVestir();

		System.out.println("Producto: ");
		prenda.setProducto(sc.nextLine());

		System.out.println("Talla: ");
		prenda.setTalla(Integer.parseInt(sc.nextLine()));

		System.out.println("Precio: ");
		prenda.setPrecio(Double.parseDouble(sc.nextLine()));

		listaPrendas.add(prenda);

	}// anadir

///// MOSTRAR LOS PRODUCTOS
	private static double mostrarProductos() {

		System.out.printf("Cantidad de articulos: %s\n", listaPrendas.size());

		for (PrendaVestir prenda : listaPrendas) {
			prenda.mostrarDatoProducto();
			total += prenda.getPrecio();
		}
		System.out.printf("Total: %s�\n", total);
		return total;

	}// mostrar

}// class
