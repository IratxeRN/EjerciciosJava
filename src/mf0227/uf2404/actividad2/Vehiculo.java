package mf0227.uf2404.actividad2;

public class Vehiculo implements IConducible {

//definimos parametros
	private String color;
	private String matricula;

//creamos constructor 
	public Vehiculo() {
		super();
		this.color = "";
		this.matricula = "";
	}
//creamos constructos sobrecargados

	public Vehiculo(String matricula) {
		this();
		this.matricula = matricula;
	}

	public Vehiculo(String color, String matricula) {
		this();
		this.color = color;
		this.matricula = matricula;
	}

	// Getters y Setters

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	// toString.
	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", matricula=" + matricula + "]";
	}

//metodos implementados de la interfaz IConducible
	@Override
	public void arrancar() {
		System.out.println("El vehiculo esta arrancado");

	}

	@Override
	public void parar() {
		System.out.println("El vehiculo esta parado");
	}

}
