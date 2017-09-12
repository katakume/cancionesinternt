package com.ipartek.formacion.canciones.pojo;

public class Cancion {
	
	private long id;
	private String titulo;
	private String artista;
	public Cancion(String titulo, String artista, String duracion) {
		super();
		this.id = 0;
		this.titulo = titulo;
		this.artista = artista;
		Duracion = duracion;
	}
	public Cancion(long id, String titulo, String artista, String duracion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.artista = artista;
		Duracion = duracion;
	}

	private String Duracion;
	
	/*public Cancion(String titulo, String artista, String duracion) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		Duracion = duracion;
	}*/

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getDuracion() {
		return Duracion;
	}

	public void setDuracion(String duracion) {
		Duracion = duracion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	//otros metodos

}
