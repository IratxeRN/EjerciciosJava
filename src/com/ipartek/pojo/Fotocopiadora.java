package com.ipartek.pojo;

public class Fotocopiadora {

	private String modelo;
	private int numHojas;
	private String nivelTinta;
	private boolean laser;

	public Fotocopiadora() {
		super();
		/**
		 * this.modelo; this.numHojas; this.nivelTinta this.laser;
		 **/
	}// constructor principal

	public Fotocopiadora(String modelo, int numHojas, String nivelTinta, boolean laser) {
		this();
		this.modelo = modelo;
		this.numHojas = numHojas;
		this.nivelTinta = nivelTinta;
		this.laser = laser;
	}// constructor sobrecargado

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumHojas() {
		return numHojas;
	}

	public void setNumHojas(int numHojas) {
		this.numHojas = numHojas;
	}

	public String getNivelTinta() {
		return nivelTinta;
	}

	public void setNivelTinta(String nivelTinta) {
		this.nivelTinta = nivelTinta;
	}

	public boolean isLaser() {
		return laser;
	}

	public void setLaser(boolean laser) {
		this.laser = laser;
	}

	@Override
	public String toString() {
		return "Fotocopiadora [modelo=" + modelo + ", numHojas=" + numHojas + ", nivelTinta=" + nivelTinta + ", laser="
				+ laser + "]";
	}

}
