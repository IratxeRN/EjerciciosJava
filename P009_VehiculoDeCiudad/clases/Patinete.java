package clases;

import interfaces.Vehiculo;

public class Patinete implements Vehiculo {

	int velocidadActual;
	boolean estaArrancado;

	public Patinete() {
		super();
		this.velocidadActual = 0;
		this.estaArrancado = false;
	}

	public Patinete(int velocidadActual, boolean estaArrancado) {
		this();
		this.velocidadActual = velocidadActual;
		this.estaArrancado = estaArrancado;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean isEstaArrancado() {
		return estaArrancado;
	}

	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}

	@Override
	public String toString() {
		return "Patinete [velocidadActual=" + velocidadActual + ", estaArrancado=" + estaArrancado + "]";
	}

	///////////// METODOS DEL INTERFACE
	@Override
	public void Arrancar() {
	}

	@Override
	public void Acelerar(int incrementoVel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Frenar(int decrementoVel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Apagar() {
		// TODO Auto-generated method stub

	}

}
