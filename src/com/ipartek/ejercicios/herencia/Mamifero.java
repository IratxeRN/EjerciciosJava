package com.ipartek.ejercicios.herencia;

import javax.swing.JOptionPane;

public class Mamifero {

	private int patas;
	private String nombre;

	/**
	 * public void imprimirPatas() { System.out.println(null + "Tiene " + patas +
	 * "Mamifero ", INFORMATION_MESSAGE);
	 * 
	 * }
	 */

	public void imprimirPatas() {
		JOptionPane.showMessageDialog(null, " Tiene " + patas + " patas\n", "Mamifero",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public Mamifero() {
		super();
		this.patas = 4;
	}

	public Mamifero(String nombre, int patas) {
		this();
		this.nombre = nombre;
		this.patas = patas;
	}

	// esto esta sobreescribiendo al padre Mamifero
	@Override
	public String toString() {
		return "Mamifero [patas=" + patas + ", nombre=" + nombre + "]";
	}

}
