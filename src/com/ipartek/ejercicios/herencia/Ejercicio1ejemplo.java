package com.ipartek.ejercicios.herencia;

import com.ipartek.pojo.Estudiante;
import com.ipartek.pojo.Persona;
import com.ipartek.pojo.Profesor;

public class Ejercicio1ejemplo {

	public static void main(String[] args) throws Exception {

		Persona p = new Persona();
		p.setNombre("Antonio");

		Estudiante estu = new Estudiante();
		estu.setEdad(18);
		estu.setNotaMedia(8.5f);

		Profesor profe = new Profesor();
		profe.setNombre("Pepe");

	}

}
