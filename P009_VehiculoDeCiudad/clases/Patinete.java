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
		String onOff = "";
		if (estaArrancado) {
			onOff = "Arrancado";
		} else {
			onOff = "Apagado";
		}
		return "Soy un Patinete, estoy " + onOff + " y mi velocidad actual es " + velocidadActual;
	}

	///////////// METODOS DEL INTERFACE
	@Override
	public void Arrancar() {
		if (!estaArrancado) {
			estaArrancado = true;
		}

	}

	@Override
	public void Acelerar(int incrementoVel) throws Exception {

		if (estaArrancado) {

			if (incrementoVel <= VEL_MAX_PATINETE) {
				this.velocidadActual = incrementoVel;
			} else {
				System.out.println("No se puede acelerar mas");
			}
		} else {
			throw new Exception("Debe arrancar el motor");
		}
	}

	@Override
	public void Frenar(int decrementoVel) throws Exception {
		if (estaArrancado) {

			if (decrementoVel >= VEL_MIN && decrementoVel <= VEL_MAX_PATINETE) {
				this.velocidadActual = decrementoVel;
			} else {
				throw new Exception("No se puede frenar mas");
			}
		} else {
			throw new Exception("Debe arrancar el motor");
		}
	}

	@Override
	public void Apagar() {
		if (velocidadActual == 0) {
			estaArrancado = false;
		}

	}

}
