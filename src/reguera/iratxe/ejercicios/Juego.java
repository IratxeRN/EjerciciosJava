package reguera.iratxe.ejercicios;

public class Juego {

	private int id;
	private String nombre;

	public Juego() {
		super();
		this.id = 0;
		this.nombre = "Desconocido";
	}

	public Juego(int id) {
		this();
		this.id = id;
	}

	public Juego(int id, String nombre) {
		this();
		this.id = id;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Juegos [id=" + id + ", nombre=" + nombre + "]";
	}

}
