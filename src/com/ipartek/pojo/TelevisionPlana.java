package com.ipartek.pojo;

public class TelevisionPlana extends Televisor {

	private String pantalla;

	public TelevisionPlana(int pulgadas) {
		super(pulgadas);
	}

	public TelevisionPlana() {
		super();
	}

	public TelevisionPlana(String pantalla) {
		super();
		this.pantalla = pantalla;
	}

	public TelevisionPlana(String nombre, int precio, int pulgadas, String pantalla) {
		super(nombre, precio, pulgadas);
		this.pantalla = pantalla;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	@Override
	public String toString() {
		return "TelevisionPlana [pantalla=" + pantalla + ", getPulgadas()=" + getPulgadas() + ", toString()="
				+ super.toString() + ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio() + ", getClass()="
				+ getClass() + "]";
	}

	/**
	 * @Override public String toString() { return super.toString() +
	 *           "TelevisionPlana [pantalla=" + pantalla + "]"; }
	 */

}
