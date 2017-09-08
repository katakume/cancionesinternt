package com.ipartek.formacion.canciones.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.canciones.modelos.ModeloCancion;
import com.ipartek.formacion.canciones.modelos.ModeloCancionImpl;
import com.ipartek.formacion.canciones.pojo.Cancion;

/**
 * Servlet implementation class ListarController
 */
@WebServlet("/listar")
public class ListarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//crear array con 10 canciones
		ModeloCancionImpl modelo = new ModeloCancionImpl();
		ArrayList<Cancion> canciones = modelo.getAll();

		
		//pasar ATRIBUTO listado en la request a la jsp
		request.setAttribute("listado", canciones);
		
		//ir a la listar.jsp
		RequestDispatcher dispatch = request.getRequestDispatcher("Listado.jsp");
		dispatch.forward(request, response);
		
	}
	
	

}
