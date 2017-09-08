<%@page import="com.ipartek.formacion.canciones.pojo.Cancion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		//recoger atributos
		String msg = (String)request.getAttribute("mensaje");
		Cancion c2 = (Cancion)request.getAttribute("cancion");
	%>
	<p style="color:green;"><%=msg %></p>
	<p style="color:green;">Cancion: <%=c2.getTitulo() %></p>
	<p style="color:green;">Artista: <%=c2.getArtista() %></p>
	<p style="color:green;">Duracion: <%=c2.getDuracion() %></p>
</body>
</html>