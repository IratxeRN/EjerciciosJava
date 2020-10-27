package com.ipartek.pojo;

public class TelevisionPlana extends Televisor {

	private String pantalla;

	public TelevisionPlana(int pulgadas) {
		super(pulgadas);
	}

	public TelevisionPlana() {
		super();
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
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	/**
	 * @Override public String toString() { return super.toString() +
	 *           "TelevisionPlana [pantalla=" + pantalla + "]"; }
	 */

}
