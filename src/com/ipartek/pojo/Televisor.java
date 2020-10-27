package com.ipartek.pojo;

public class Televisor extends Electrodomestico {

	private int pulgadas;

	public Televisor() {
		super();
	}

	public Televisor(int pulgadas) {
		super();
		this.pulgadas = pulgadas;
	}

	public Televisor(String nombre, int precio, int pulgadas) {
		super(nombre, precio);
		this.pulgadas = pulgadas;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		return super.toString() + "Televisor [pulgadas=" + pulgadas + "]";
	}

}
