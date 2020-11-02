package com.ipartek.ejercicios.poo;

import java.util.Arrays;

public class Alumno implements IPoo2 {

	private String nombre;
	private int notas[];

	public Alumno() {
		super();
		this.nombre = "";
		this.notas = new int[5];
	}

	public Alumno(String nombre, int[] notas) {
		this();
		this.nombre = nombre;
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public int mejorNota(int[] notas) {
		int max = 0;
		for (int i = 0; i < notas.length; i++) {
			if (max < notas[i]) {
				max = notas[i];
			}
		}

		return max;
	}

	@Override
	public int menor(int[] notas) {
		int min = notas[0];
		for (int i = 0; i < notas.length; i++) {
			if (min > notas[i]) {
				min = notas[i];
			}
		}
		return min;
	}

	@Override
	public void mostrar(String nombre, int[] notas) {
		int suma = 0;
		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}
		System.out.printf("%s ha sacado de media %s", nombre, suma / notas.length);
	}

}
