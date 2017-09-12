package com.ipartek.formacion.canciones.modelos;

import java.util.ArrayList;

import com.ipartek.formacion.canciones.pojo.Cancion;

/**
 * clase para gestionar las canciones en memoria mediante un Arraylist
 * Mas adelanta aprenderemos a hacer lo mismo con una base de datos
 * 
 * Vamos a usar un patros <b>singleton</b> para que exista una unica instancia de esta clase
 * @see https://es.wikipedia.org/wiki/Singleton#Java
 * 
 * @author Administrador
 *
 */
public class ModeloCancionImpl implements ModeloCancion{
	
	private static ModeloCancionImpl INSTANCE = null;
	 private ArrayList<Cancion> canciones = null;
	 private long indice = 1;
	
	
	
	private ModeloCancionImpl() {
		super();
		
		canciones = new ArrayList<Cancion>();
		crearMocks();
		this.indice = 526;
		
	}
	
	public static ModeloCancionImpl getInstance() {
		if (INSTANCE ==null) {
			INSTANCE = new ModeloCancionImpl();
			}
		return INSTANCE;
	}
	
	private void crearMocks() {
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

	@Override
	public ArrayList<Cancion> getAll() {
		return this.canciones;
	}

	/**
	 * busca cancion por id 
	 * @return null si no en cuentra, instancia de canion si encuentra
	 */
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
		boolean resultado = false;
		for (Cancion cancion : canciones) {
			if (cancion.getId() == id) {
				resultado = canciones.remove(cancion);
				break;
			}
		};
		return resultado;
	}

	/**
	 * Al insertar no tenemos id, así que buscamos el id mas alto y le añadimos uno
	 */
	
	@Override
	public boolean insert(Cancion c) {
		// TODO Auto-generated method stub
		c.setId(indice);
		boolean resul = this.canciones.add(c);
		if (resul) {
			indice++;
		}
		return resul;
	}

	@Override
	public boolean update(Cancion c) {
		boolean resul = false;
		int c2; 
		if (c !=null && getByPosicion(c.getId()) != null) {
			c2 = canciones.indexOf(c);
			this.canciones.set(c2, c);
			resul = true;
		}
		return resul;
	}

}
