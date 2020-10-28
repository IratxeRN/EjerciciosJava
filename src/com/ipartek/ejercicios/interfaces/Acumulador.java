package com.ipartek.ejercicios.interfaces;

import java.io.Serializable;

public class Acumulador implements IModificacion, Cloneable, Serializable {
	private int valor;

	public Acumulador() {
		super();
		this.valor = 0;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Acumulador [valor=" + valor + "]";
	}

	@Override
	public void incremento(int a) {
		this.valor += a;

	}

	@Override
	public void incremento() {
		// TODO Auto-generated method stub

	}

}
