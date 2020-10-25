package com.ipartek.pojo;

/**
 * La historia de los 8 perros mas famosos Crear 8 perros con su constructor por
 * defecto y setear el nombre e historia Mostrar por pantalla sus nombre e
 * historia
 * 
 * @author Leshou
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		Perro snoppy = new Perro();// constructor

		// snoppy.nombre = "Snoppy";
		snoppy.setNombre("Snoppy");
		// snoppy.peso = -12;
		snoppy.setPeso(12);

		System.out.println(snoppy.getNombre() + " " + snoppy.getPeso() + " kg");

		// tenemos dos constructores posibles

		Perro c2 = new Perro("Nombre");

		Perro p1 = new Perro();

		p1.setNombre("Laika");
		p1.setHistoria(
				"Esta famosa perrita sovi�tica fue el primer ser vivo en viajar al espacio.\nEn 1957 emprendi� su viaje y desafortunadamente muri� a las 5 horas de despegar por el estr�s\n y la falta de ox�geno. Este suceso puso en el punto de mira los experimentos con animales. \nDesde entonces Laika ha sido un icono en la historia.");

		System.out.println("* - " + p1.getNombre() + " - " + p1.getHistoria());

		Perro p2 = new Perro();

		p2.setNombre("Hachiko");
		p2.setHistoria(
				"Pocos perros han sido tan famosos como �l, llegando incluso a traspasar la pantalla y hacernos soltar alguna que otra lagrimilla. Este perro de raza Akita conmocion� al mundo con su historia de lealtad y amor por su amo. Su historia se hizo famosa por estar durante 10 a�os esperando a su due�o en la estaci�n de metro, a pesar de que �ste hab�a muerto en uno de los trayectos.");

		System.out.println("* - " + p2.getNombre() + " - " + p2.getHistoria());

		Perro p3 = new Perro();

		p3.setNombre("Balto");
		p3.setHistoria(
				"Este husky siberiano comand� a un grupo de perros para llevar vacunas a un pueblo que ten�a una epidemia de difteria y que se encontraba aislado a mil kil�metros de distancia del hospital m�s cercano. Se le considera el h�roe de los ni�os del pueblo Nome.");

		System.out.println("* - " + p3.getNombre() + " - " + p3.getHistoria());

		Perro p4 = new Perro();

		p4.setNombre("Rin tin tin");
		p4.setHistoria(
				"Este pastor alem�n se hizo famoso por interpretar 27 peliculas mudas de Hollywood. En 1929 incluso recibi� varios votos para ser el ganador de un premio �scar, sin embargo la propia academia lo tuvo que denegar por no ser una persona.");

		System.out.println("* - " + p4.getNombre() + " - " + p4.getHistoria());
	}

}
