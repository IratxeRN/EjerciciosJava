package principal;

import clases.Patinete;

public class VehiculosDeCiudad {

	public static void main(String[] args) throws Exception {

		Patinete patinete = new Patinete();

		patinete.Arrancar();
		System.out.println(patinete.toString());

		patinete.Acelerar(30);
		System.out.println(patinete.toString());

		patinete.Frenar(0);
		System.out.println(patinete.toString());

		patinete.Apagar();
		System.out.println(patinete.toString());

	}

}
