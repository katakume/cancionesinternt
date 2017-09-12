package com.ipartek.formacion.canciones.modelos;

import java.util.ArrayList;

import com.ipartek.formacion.canciones.pojo.Cancion;

public class ModeloCancionImpl implements ModeloCancion{
	ArrayList<Cancion> canciones = null;
	
	
	
	public ModeloCancionImpl() {
		super();
		if (canciones ==null) {
			canciones = new ArrayList<Cancion>();
			canciones.add(new Cancion(1,"Bombayah","Blakpink","4:02"));
			canciones.add(new Cancion(2,"Corazon de mimbre", "Marea", "4:30"));
			canciones.add(new Cancion(3,"YMCA", "Villague People", "3:52"));
			canciones.add(new Cancion(4,"Barbie Girl", "Aqua", "3:22"));
			canciones.add(new Cancion(5,"I will survive", "Gloria Gaynor", "4:32"));
			canciones.add(new Cancion(6,"Perro Verde", "Marea", "4:02"));
			canciones.add(new Cancion(7,"One", "Jhony Cash", "3:02"));
			canciones.add(new Cancion(8,"Rock Star", "NikelBlack", "4:42"));
			canciones.add(new Cancion(9,"Song 2", "Blur", "2:59"));
			canciones.add(new Cancion(10,"Hitz margotuak", "Su ta gar", "4:52"));
		}
	}

	@Override
	public ArrayList<Cancion> getAll() {
		return canciones;
	}

	@Override
	public Cancion getByPosicion(long id) {
		Cancion c1 = null;
		for (Cancion cancion : canciones) {
			if (cancion.getId() == id) {
				c1 = cancion;
			}
		};
		return c1;
	}

	@Override
	public boolean eliminar(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(Cancion c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Cancion c) {
		// TODO Auto-generated method stub
		return false;
	}

}
