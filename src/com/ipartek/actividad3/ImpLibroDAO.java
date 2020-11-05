package com.ipartek.actividad3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ImpLibroDAO implements LibroDao {

	private static HashMap<Integer, Libro> libros;
	private static int indice = 0;
	private static ImpLibroDAO INSTANCE = null;

	private ImpLibroDAO() {
		super();
		libros = new HashMap<Integer, Libro>();
		libros.put(1, new Libro(1, "El Codigo Davinci", 300));
		libros.put(2, new Libro(2, "Angeles y Demonios", 250));
		libros.put(3, new Libro(3, "El Simbolo Perdido", 500));
		libros.put(4, new Libro(4, "La Conspiracion", 180));
		indice = 5;
	}

	public static synchronized ImpLibroDAO getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new ImpLibroDAO();
		}

		return INSTANCE;
	}

	@Override
	public List<Libro> getAll() {

		return new ArrayList<>(libros.values());
	}

	@Override
	public Libro getById(int id) {

		return null;
	}

	@Override
	public boolean delete(int id) {

		if (libros.containsKey(id)) {
			libros.remove(id);
		}

		return true;
	}

	@Override
	public boolean insert(Libro libro) {

		libros.put(indice, libro);
		indice++;

		return true;
	}

}
