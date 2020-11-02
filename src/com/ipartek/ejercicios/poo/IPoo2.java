package com.ipartek.ejercicios.poo;

public interface IPoo2 {

	/**
	 * Método que devuelve la mejor nota
	 * 
	 * 
	 */
	public int mejorNota(int[] notas);

	/**
	 * Método que devuelve la menor de las notas
	 * 
	 *
	 */
	public int menor(int[] notas);

	/**
	 * Método que devuelve el nombre del alumno y su nota media
	 * 
	 * 
	 */
	public void mostrar(String nombre, int[] notas);

}
