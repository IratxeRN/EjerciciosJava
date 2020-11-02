package com.ipartek.sqlite3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class Ejercicio1_2 {

	public static void main(String[] args) throws Exception {

		String sql = "SELECT * FROM perro ORDER BY id ASC;";
		// creamos la lista donde van a ir todos los resultados de la query
		ArrayList<Perro> perros = new ArrayList<Perro>();

		// ESTABLECEMOS LA CONEXION
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:ddbb/perrera.db");
				// preparamos un statement con la consulta
				PreparedStatement pst = conn.prepareStatement(sql);
				// ejecutamos la consulta que va a una variable resultado
				ResultSet rs = pst.executeQuery();) {
//recorremos los resultados
			while (rs.next()) {
				// System.out.println(rs.getInt("id") + " " + rs.getString("nombre"));
				// sacamos el primer resultado y lo metemos en un objeto nuevo de Perro
				Perro p = new Perro();
				p.setId(rs.getInt("id"));
				p.setNombre(rs.getString("nombre"));
				p.setRaza(rs.getString("raza"));
				p.setPeso(rs.getFloat("peso"));
				p.setVacunado(rs.getBoolean("vacunado"));
				p.setHistoria(rs.getString("historia"));
//añadimos el obejto Perro a la lista
				perros.add(p);

			}
//recorremos la lista para mostrar por pantalla el resultado
			for (Perro perro : perros) {
				System.out.println(perro);
			}

		} // try, se cierran Connection, PreparedStatement, ResultSet

		System.out.println("terminamos");

	}

}