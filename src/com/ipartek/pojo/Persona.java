package com.ipartek.pojo;

public class Persona {
	// constantes, se le aplica el valor final porque no se pueden modificar
	public static final int EDAD_MIN = 0;
	public static final int EDAD_MAX = 120;
//atributos
	private String nombre;
	private int edad;

//constructor vacio
	public Persona() {
		super();
		this.nombre = "";
		this.edad = 0;
	}

	public Persona(String nombre, int edad) {
		this();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		if (edad <= EDAD_MIN || edad >= EDAD_MAX) {
			throw new Exception("Edad debe ir entre 0 y 200");
		}
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]"; // para que al hacer un .toString
	}

}
