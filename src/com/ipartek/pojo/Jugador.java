package com.ipartek.pojo;

public class Jugador {

	private String nombre;
	private int dorsal;

	public Jugador() {
		super();
		this.nombre = "";
		this.dorsal = 0;
	}

	public Jugador(String nombre, int dorsal) {
		this();
		this.nombre = nombre;
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws Exception {
		if (nombre.isEmpty()) {
			throw new Exception("Debe rellenar el nombre");
		}
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) throws Exception {
		if (dorsal <= 0) {
			throw new Exception("Debe poner un dorsal");
		}
		this.dorsal = dorsal;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dorsal=" + dorsal + "]";
	}

}
