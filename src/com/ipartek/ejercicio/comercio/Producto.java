package com.ipartek.ejercicio.comercio;

public class Producto {
	private String referencia;
	private float precio;

	public Producto() {
		super();
		this.referencia = "";
		this.precio = 0;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [referencia=" + referencia + ", precio=" + precio + "]";
	}

}
