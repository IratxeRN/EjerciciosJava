package com.ipartek.actividad3;

public class Libro {

	private int id;
	private String nombre;
	private int pags;

	public Libro() {
		super();
		this.id = 0;
		this.nombre = "";
		this.pags = 0;
	}

	public Libro(int id, String nombre, int pags) {
		this();
		this.id = id;
		this.nombre = nombre;
		this.pags = pags;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPags() {
		return pags;
	}

	public void setPags(int pags) {
		this.pags = pags;
	}

	@Override
	public String toString() {
		return "Libro [ id=" + id + ", nombre=" + nombre + ", pags=" + pags + "]\n";
	}

}
