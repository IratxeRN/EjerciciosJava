package mf0227.uf2404.actividad2;

//Extendemos la clase Coche como hija de Vehiculo.
public class Coche extends Vehiculo {

// definimos parametros
	private String marca;
	private String modelo;
	private int potencia;
	private int cilindrada;

//creamos constructor 
	public Coche() {
		super();
		this.marca = "";
		this.modelo = "";
		this.potencia = 0;
		this.cilindrada = 0;
	}

// creamos constructos sobrecargados
	public Coche(String color, String matricula) {
		super(color, matricula);
	}

	public Coche(String matricula) {
		super(matricula);
	}

	public Coche(String marca, String modelo, String color, String matricula, int potencia, int cilindrada) {
		super(color, matricula);
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
	}

	// setters y getters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

//toString construido para que muestre todos los parametros, tanto de clase hija Coche como clase padre Vehiculo
	@Override
	public String toString() {
		return "Coche [Marca= " + marca + ", Modelo= " + modelo + ", Potencia= " + potencia + ", Cilindrada= "
				+ cilindrada + " Color= " + getColor() + " Matricula= " + getMatricula() + " ]";
	}

}
