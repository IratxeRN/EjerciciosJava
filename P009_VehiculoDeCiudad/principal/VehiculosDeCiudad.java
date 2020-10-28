package principal;

import clases.PatineteCorregido;

public class VehiculosDeCiudad {

	public static void main(String[] args) throws Exception {

		PatineteCorregido patinete = new PatineteCorregido();

		patinete.arrancar();
		System.out.println(patinete.toString());

		patinete.acelerar(30);
		System.out.println(patinete.toString());

		patinete.arrancar();
		System.out.println(patinete.toString());

		patinete.frenar(0);
		System.out.println(patinete.toString());

		patinete.apagar();
		System.out.println(patinete.toString());

	}

}
