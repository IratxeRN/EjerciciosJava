package reguera.iratxe.ejercicios;

public class VideoGame extends Juego {

	private String genero;
	private int anio;

	public VideoGame() {
		super();
		this.genero = "Desconocido";
		this.anio = 0;
	}

	public VideoGame(int id, String nombre) {
		super(id, nombre);
		this.genero = "Desconocido";
		this.anio = 0;
	}

	public VideoGame(int id) {
		super(id);
		this.genero = "Desconocido";
		this.anio = 0;
	}

	public VideoGame(int id, String nombre, String genero, int anio) {
		this(id, nombre);
		this.genero = genero;
		this.anio = anio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Game [ - Id: " + getId() + ", - Nombre: " + getNombre() + " - Genero: " + genero + " , - Año: " + anio
				+ " ]";
	}

}
