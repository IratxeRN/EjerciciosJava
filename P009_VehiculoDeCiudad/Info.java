
/**
 * Crear un proyecto nuevo llamado P009_VehiculosDeCiudad. Dentro de dicho
 * proyecto crearemos la siguiente jerarqu�a de paquetes:
 * <ul>
 * �
 * <li>Com.ipartek.interfaces</li> �
 * <li>Com.ipartek.clases</li> �
 * <li>Com.ipartek.principal</li>
 * </ul>
 * Una vez creada esta jerarqu�a, se proceder� a crear una interfaz llamada
 * Vehiculo. Dicha interfaz tendr� las siguientes constantes: �
 * <li>VEL_MAX_COCHE=150</li> �
 * <li>VEL_MAX_BICI=50</li> �
 * <li>VEL_MAX_PATINETE=80.</li> Asimismo tambi�n contendr� la definici�n de los
 * siguientes m�todos
 * <ul>
 * �
 * <li>Arrancar()</li> �
 * <li>Acelerar(int incrementoVel)</li> �
 * <li>Frenar(int decrementoVel)</li> �
 * <li>Apagar()</li>
 * </ul>
 * Una vez creada se creara una clase patinete, con los atributos
 * velocidadActual (int) y estaArrancado (boolean) y el m�todo toString(), que
 * implementara la interfaz vehiculo. Dicha clase redefinir� los m�todos
 * anteriores para que realicen las siguientes tareas
 * <ul>
 * <li>Arrancar: pondr� el atributo estaArrancado a true. Debe estar apagado
 * para poder arrancarse</li> �
 * <li>Acelerar: incrementara la velocidad actual con el valor que se le pasa
 * por par�metro sin sobrepasar el limite m�ximo de velocidad. Solo acelerara si
 * el patinete esta encendido</li> �
 * <li>Frenar: decrementara la velocidad actual con el valor que se le pasa por
 * par�metro sin llegar a bajar de 0. Solo frenara si el patinete esta
 * encendido</li> �
 * <li>Apagar: pondr� el atributo estaArrancado a false, solo si la
 * velocidadActual es 0</li> �
 * <li>toString: mostrara una cadena de texto con el siguiente formato: �Soy un
 * patinete, estoy (encendido/apagado) y mi velocidad es de (velocidadActual)
 * Km/h�</li>
 * </ul>
 * De la misma manera que se ha creado una clase patinete, se crearan dos clases
 * llamadas Bici y Coche, con los mismos atributos. <br>
 * Tambi�n definir�n los mismos m�todos de la interfaz <br>
 * En un programa principal, se probaran los m�todos con los tres objetos de
 * cada tipo de vehiculo, arranc�ndolos, acelerando varias veces hasta que
 * lleguen a velocidad m�xima, frenando hasta detenerse en varias veces y
 * apag�ndose. <br>
 * El proceso deber� seguir la l�gica del mundo real.<br>
 * No se podr� apagar si ya est� encendido, no podr� acelerar ni frenar si esta
 * apagado� realizar las modificaciones pertinentes en el programa para que los
 * atributos arrancado y velocidadActual se hereden de una clase vehiculo, y que
 * no se pueda heredar de las clases patinete bici y coche
 * 
 * @author Iratxe Reguera
 *
 */
public @interface Info {

}
