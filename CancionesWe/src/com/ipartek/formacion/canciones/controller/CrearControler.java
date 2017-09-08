package com.ipartek.formacion.canciones.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.canciones.pojo.Cancion;

/**
 * Servlet implementation class CrearControler
 */
@WebServlet("/crear")
public class CrearControler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//recoger parametros del formulario		
		String titulo = request.getParameter("titulo");
		String artista = request.getParameter("artista");
		String duracion = request.getParameter("duracion");
		//creamos la cancion
		Cancion c = new Cancion (titulo, artista, duracion);
		//enviamos accion como ATRIBUTO ne la request
		request.setAttribute("cancion",c);
		request.setAttribute("mensaje","Cancion creada con exito");
		//vamos a la vista
		RequestDispatcher dispatch = request.getRequestDispatcher("detalle.jsp");
		dispatch.forward(request, response);
	}

}
