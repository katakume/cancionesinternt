<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.ipartek.formacion.canciones.pojo.Cancion"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>LISTADO DE CANCIONES</h1>
	<%
		ArrayList<Cancion> canciones =(ArrayList<Cancion>)request.getAttribute("listado");
		out.print("<ol>");
		for(int i = 0; i < canciones.size();i++){
			out.print("<li><a href=\"detallar\"> -- " + canciones.get(i).getTitulo() + "</a></li>");
		}
		out.print("</ol>");
	%>
	<form action="crear" method="post">
		<input type="text" name="titulo" placeholder="Titulo de la cancion" required><br>
		<input type="text" name="artista" placeholder="Artista de la cancion" required><br>
		<input type="text" name="duracion" placeholder="Duracion de la cancion" required><br>
		<input type="submit" value="Crear Cancion Nueva">
	</form>
	
</body>
</html>