package interfaces;

public interface Vehiculo {

	final int VEL_MAX_COCHE = 150;
	final int VEL_MAX_BICI = 50;
	final int VEL_MAX_PATINETE = 80;

	/**
	 * Pone el veniculo en marcha. Esta arrancado a true
	 * 
	 * @throws debe estar apagado para poder arrancarse
	 */
	void Arrancar();

	/**
	 * incrementara la velocidad actual con el valor que se le pasa por parámetro
	 * sin sobrepasar el limite máximo de velocidad.
	 * 
	 * @throws Solo acelerara si esta encendido
	 * @param incrementoVel
	 */
	void Acelerar(int incrementoVel);

	/**
	 * decrementara la velocidad actual con el valor que se le pasa por parámetro
	 * 
	 * 
	 * @throws No puede llegar a bajar de 0. Solo frenara si esta encendido
	 * @param decrementoVel
	 */
	void Frenar(int decrementoVel);

	/**
	 * pondrá el atributo estaArrancado a false,
	 * 
	 * @throws velocidadActual es 0
	 */
	void Apagar();

	/**
	 * mostrara una cadena de texto con el siguiente formato: “Soy un patinete,
	 * estoy (encendido/apagado) y mi velocidad es de (velocidadActual) Km/h”
	 * 
	 * @return
	 */

	public String toString();

}
