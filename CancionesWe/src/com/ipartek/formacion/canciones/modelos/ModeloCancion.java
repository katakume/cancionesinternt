package com.ipartek.formacion.canciones.modelos;

import java.util.ArrayList;

import com.ipartek.formacion.canciones.pojo.Cancion;

public interface ModeloCancion {
	
	ArrayList<Cancion> getAll();
	
	Cancion getByPosicion(long id);
	
	boolean eliminar(long id);

	boolean insert(Cancion c);
	
	boolean update(Cancion c);

}
