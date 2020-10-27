package com.ipartek.pojo;

public class PrendaVestir {

	private String producto;
	private int talla;
	private double precio;

	public PrendaVestir() {
		super();
	}

	public PrendaVestir(String producto, int talla, double precio) {
		this();
		this.producto = producto;
		this.talla = talla;
		this.precio = precio;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * public void mostrarDatoProducto() { System.out.printf("- %s de la talla %s,
	 * %s€\n", getProducto(), getTalla(), getPrecio());
	 * 
	 * }
	 */
	public String mostrarDatoProducto() {
		return "-" + producto + " de la talla " + talla + " - " + precio + "€";

	}

	@Override
	public String toString() {
		return "PrendaVestir [producto=" + producto + ", talla=" + talla + ", precio=" + precio + "]";
	}

}
