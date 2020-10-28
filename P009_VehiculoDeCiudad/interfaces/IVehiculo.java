package interfaces;

public interface IVehiculo {

	// se pueden omitir los calificadores
	final int VEL_MAX_COCHE = 150;
	final int VEL_MAX_BICI = 50;
	final int VEL_MAX_PATINETE = 80;
	final int VEL_MIN = 0;

	/**
	 * Pone el veniculo en marcha. Esta arrancado a true
	 * 
	 * @throws debe estar apagado para poder arrancarse
	 */
	public abstract void arrancar();

	/**
	 * incrementara la velocidad actual con el valor que se le pasa por parámetro
	 * sin sobrepasar el limite máximo de velocidad.
	 * 
	 * @throws Solo acelerara si esta encendido
	 * @param incrementoVel
	 */
	public abstract void acelerar(int incrementoVel) throws Exception;

	/**
	 * decrementara la velocidad actual con el valor que se le pasa por parámetro
	 * 
	 * 
	 * @throws No puede llegar a bajar de 0. Solo frenara si esta encendido
	 * @param decrementoVel
	 */
	public abstract void frenar(int decrementoVel) throws Exception;

	/**
	 * pondrá el atributo estaArrancado a false,
	 * 
	 * @throws velocidadActual es 0
	 */
	public abstract void apagar() throws Exception;

	/**
	 * mostrara una cadena de texto con el siguiente formato: “Soy un patinete,
	 * estoy (encendido/apagado) y mi velocidad es de (velocidadActual) Km/h”
	 * 
	 * @return
	 */

	public String toString();

}
