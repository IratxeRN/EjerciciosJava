package reguera.iratxe.ejercicios;

import java.util.ArrayList;

public interface ICGenerica<C> {

	ArrayList<C> listar();

	C crear(C c);

	boolean borrar(int id);

	C buscar(int id);

	C modificar(int id);

}
