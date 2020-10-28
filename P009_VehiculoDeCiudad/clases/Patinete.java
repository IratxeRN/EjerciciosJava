package clases;

import interfaces.IVehiculo;

public class Patinete implements IVehiculo {

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

	public Patinete(int velocidadActual) {
		this();
		this.velocidadActual = velocidadActual;
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
	public void arrancar() {
		if (!this.estaArrancado) {
			this.estaArrancado = true;
		}

	}

	@Override
	public void acelerar(int incrementoVel) throws Exception {

		if (this.isEstaArrancado()) {
			int nuevaVelocidad = this.getVelocidadActual() + incrementoVel;
			if (nuevaVelocidad <= VEL_MAX_PATINETE) {
				this.velocidadActual += incrementoVel;
			} else {
				this.setVelocidadActual(nuevaVelocidad);
			}
		} else {
			this.setVelocidadActual(this.getVelocidadActual());
		}
	}

	@Override
	public void frenar(int decrementoVel) throws Exception {
		if (this.isEstaArrancado()) {
			int nuevaVelocidad = this.getVelocidadActual() + decrementoVel;
			if (nuevaVelocidad >= VEL_MIN && nuevaVelocidad <= VEL_MAX_PATINETE) {
				this.velocidadActual -= decrementoVel;
			} else {
				throw new Exception("No se puede frenar mas");
			}
		} else {
			throw new Exception("Debe arrancar el motor");
		}
	}

	@Override
	public void apagar() {
		if (velocidadActual == 0) {
			estaArrancado = false;
		}

	}

}
