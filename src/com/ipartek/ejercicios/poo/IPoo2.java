package com.ipartek.ejercicios.poo;

public interface IPoo2 {

	/**
	 * M�todo que devuelve la mejor nota
	 * 
	 * 
	 */
	public int mejorNota(int[] notas);

	/**
	 * M�todo que devuelve la menor de las notas
	 * 
	 *
	 */
	public int menor(int[] notas);

	/**
	 * M�todo que devuelve el nombre del alumno y su nota media
	 * 
	 * 
	 */
	public void mostrar(String nombre, int[] notas);

}
