package com.ipartek.pojo;

public class Game {

	private String titulo;
	private int year;
	private String desarrollador;
	private String plataforma;

	public Game() {
		super();
		this.titulo = "";
		this.year = 0;
		this.desarrollador = "";
		this.plataforma = "";
	}

	public Game(String titulo, int year, String desarrollador, String plataforma) {
		this();
		this.titulo = titulo;
		this.year = year;
		this.desarrollador = desarrollador;
		this.plataforma = plataforma;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws Exception {
		if (desarrollador == null) {
			throw new Exception("Debe rellenar el dato");
		}
		this.titulo = titulo;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) throws Exception {
		if (year < 1930 || year > 2030) {
			throw new Exception("El año no es valido. Debe in entre 1930 y 2030");
		}
		if (desarrollador.isEmpty()) {
			throw new Exception("Debe rellenar el dato");
		}
		this.year = year;
	}

	public String getDesarrollador() {
		return desarrollador;
	}

	public void setDesarrollador(String desarrollador) throws Exception {
		if (desarrollador.isEmpty()) {
			throw new Exception("Debe rellenar el dato");
		}
		this.desarrollador = desarrollador;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) throws Exception {
		if (plataforma.isEmpty()) {
			throw new Exception("Debe rellenar el dato");
		}
		this.plataforma = plataforma;
	}

	@Override
	public String toString() {
		return "Games [titulo=" + titulo + ", year=" + year + ", desarrollador=" + desarrollador + ", plataforma="
				+ plataforma + "]";
	}

}
