package com.ipartek.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class PerroDAOSqlite implements PerroDao {

	private static final String PATH = "ddbb/perrera.db";

	@Override
	public ArrayList<Perro> listar() {
		final String SQL = "SELECT id, nombre, raza, peso, vacunado, historia FROM perro ORDER BY nombre ASC;";
		ArrayList<Perro> perros = new ArrayList<Perro>();

		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
				PreparedStatement pst = conn.prepareStatement(SQL);
				ResultSet rs = pst.executeQuery();) {

			System.out.println(pst);

			while (rs.next()) {

				Perro p = new Perro();
				p.setId(rs.getInt("id"));
				p.setNombre(rs.getString("nombre"));
				p.setRaza(rs.getString("raza"));
				p.setPeso(rs.getFloat("peso"));
				p.setVacunado(rs.getBoolean("vacunado"));
				p.setHistoria(rs.getString("historia"));

				perros.add(p);

			} // while

		} catch (Exception e) {
			e.printStackTrace();
		}
		return perros;
	}

	@Override
	public Perro recuperar(int id) {

		Perro perro = null;
		final String SQL = "SELECT id, nombre, raza, peso, vacunado, historia FROM perro WHERE id = ?;";

		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
				PreparedStatement pst = conn.prepareStatement(SQL);) {

			pst.setInt(1, id); // sustituimos el ? de la SQL por el parametro id

			try (ResultSet rs = pst.executeQuery()) {
				if (rs.next()) {
					perro = new Perro();
					perro.setId(rs.getInt("id"));
					perro.setNombre(rs.getString("nombre"));
					perro.setRaza(rs.getString("raza"));
					perro.setPeso(rs.getFloat("peso"));
					perro.setVacunado(rs.getBoolean("vacunado"));
					perro.setHistoria(rs.getString("historia"));

				} // while
			} // 2� try

		} catch (Exception e) {
			e.printStackTrace();
		}
		return perro;
	}

	@Override
	public Perro crear(Perro p) throws Exception {
		final String SQL = "INSERT INTO perro (nombre,raza,peso, vacunado, historia) VALUES (?, ?, ?,?,?);";

		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
				PreparedStatement pst = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);) {

			pst.setString(1, p.getNombre());
			pst.setString(2, p.getRaza());
			pst.setFloat(3, p.getPeso());
			pst.setBoolean(4, p.isVacunado());
			pst.setString(5, p.getHistoria());

			int affectedsRows = pst.executeUpdate();

			// recuperar el ultimo id generado
			if (affectedsRows == 1) {
				try (ResultSet rsKeys = pst.getGeneratedKeys()) {
					if (rsKeys.next()) {
						int id = rsKeys.getInt(1);
						p.setId(id);
					}
				}
			}

		}

		return p;
	}

	@Override
	public Perro modificar(Perro p) throws Exception {
		Perro perro = null;
		final String SQL = "UPDATE perro SET nombre = ? , raza =?, peso = ?, vacunado=?, historia=? WHERE id = ?;";
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
				PreparedStatement pst = conn.prepareStatement(SQL);) {

			pst.setString(1, p.getNombre());
			pst.setString(2, p.getRaza());
			pst.setFloat(3, p.getPeso());
			pst.setBoolean(4, p.isVacunado());
			pst.setString(5, p.getHistoria());

			pst.setInt(6, p.getId());

			pst.executeUpdate(); // CUIDADO no usar executeQuery

		}

		return perro;
	}

	@Override
	public boolean eliminar(int id) throws Exception {
		boolean resul = false;
		final String SQL = "DELETE FROM perro WHERE id = ?;";
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
				PreparedStatement pst = conn.prepareStatement(SQL);) {

			pst.setInt(1, id);

			if (1 == pst.executeUpdate()) {
				resul = true;
			}

		}
		return resul;
	}

}
