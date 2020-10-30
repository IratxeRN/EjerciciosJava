package com.ipartek.sqlite3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import clases.Patinete;

public class Ejercicio1 {

	public static void main(String[] args) throws SQLException {

		String sql = "SELECT * FROM coche;";
		String sql2 = "SELECT * FROM games;";

		// todo lo que generamos dentro de los parentesis del try se cierra
		// automaticamente al terminar el bloque
		// esto es posible porque los recursos inplementan la interface AutoClosable
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:ddbb/concesionario.db")) {
			// Statement es una clase q nos sirve para ejecutar consultas
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			Patinete patin = new Patinete();

			while (rs.next()) {
				System.out.println(rs.getInt("id") + rs.getString("nombre"));

			}

		} // try, se cierra Connection, PreparedStatement y ResulSet

		try (Connection conn2 = DriverManager.getConnection("jdbc:sqlite:ddbb/videojuegos.db")) {

			PreparedStatement pst2 = conn2.prepareStatement(sql2);
			ResultSet rs2 = pst2.executeQuery();

			while (rs2.next()) {
				System.out
						.println(rs2.getInt("id") + " " + rs2.getString("titulo") + " " + rs2.getString("desarrollador")
								+ " " + rs2.getInt("year") + " " + rs2.getString("plataforma"));

			}
		}
		System.out.println("terminamos");

	}

}
