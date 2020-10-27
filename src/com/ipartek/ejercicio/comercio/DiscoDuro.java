package com.ipartek.ejercicio.comercio;

public class DiscoDuro extends Producto {

	private int capacidad;
	private int velocidad;
	private boolean esSSD;

	public DiscoDuro() {
		super();
		this.capacidad = 0;
		this.velocidad = 0;
		this.esSSD = false;
	}

	public DiscoDuro(int capacidad, int velocidad, boolean esSSD) {
		this();
		this.capacidad = capacidad;
		this.velocidad = velocidad;
		this.esSSD = esSSD;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public boolean isEsSSD() {
		return esSSD;
	}

	public void setEsSSD(boolean esSSD) {
		this.esSSD = esSSD;
	}

	@Override
	public String toString() {
		return "DiscoDuro [capacidad=" + capacidad + ", velocidad=" + velocidad + ", esSSD=" + esSSD
				+ ", getReferencia()=" + getReferencia() + ", getPrecio()=" + getPrecio() + ", getClass()=" + getClass()
				+ "]";
	}

}
