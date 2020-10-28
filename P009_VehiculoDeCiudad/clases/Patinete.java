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

		if (!estaArrancado) {
			estaArrancado = false;
		}
	}

	@Override
	public int Acelerar(int incrementoVel) throws Exception {

		if (velocidadActual <= VEL_MAX_PATINETE) {
			velocidadActual += incrementoVel;
		} else {
			throw new Exception("No se puede acelerar mas");
		}

		return velocidadActual;
	}

	@Override
	public int Frenar(int decrementoVel) throws Exception {

		if (velocidadActual >= 0) {
			velocidadActual -= decrementoVel;
		} else {
			throw new Exception("No se puede acelerar mas");
		}

		return velocidadActual;
	}

	@Override
	public void Apagar() {

		estaArrancado = false;

	}

}
