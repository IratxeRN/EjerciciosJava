package com.ipartek.apps.cartas;

public class Carta {

	private Palo palo;
	private int numero;

	public Carta(Palo palo, int numero) {
		super();
		this.palo = palo;
		this.numero = numero;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", numero=" + numero + "]";
	}

}
