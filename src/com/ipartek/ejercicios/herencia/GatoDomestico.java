package com.ipartek.ejercicios.herencia;

public class GatoDomestico extends Gato {

	private boolean vacunado;
	private boolean castrado;

	public GatoDomestico(String nombre) {
		super(nombre);
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	@Override
	public String toString() {
		// llamamos al metodo de padre y salen datos a traves del hijo.
		return super.toString() + "GatoDomestico [vacunado=" + vacunado + ", castrado=" + castrado + "]";
	}

}
