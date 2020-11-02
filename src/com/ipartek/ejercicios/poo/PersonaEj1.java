package com.ipartek.ejercicios.poo;

public class PersonaEj1 {

	private String nombre;
	private int edad;

	public PersonaEj1() {
		super();
		this.nombre = "";
		this.edad = 0;
	}

	public PersonaEj1(String nombre, int edad) {
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

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "PersonaEj1 [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public void mayorDeEdad(String nombre, int edad) {

		System.out.printf("%s tiene %s años.", nombre, edad);
		if (edad >= 18) {
			System.out.println("ES mayor de edad");
		} else {
			System.out.println("NO es mayor de edad");
		}

	}

}
