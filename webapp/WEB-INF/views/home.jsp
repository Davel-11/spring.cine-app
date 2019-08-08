<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenido a CineApp</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	<spring:url value="/resources" var="urlPublic" />
</head>
<body>

	<%-- <h1>Listado de Peliculas</h1>
	
	<ol>
		<c:forEach items="${ peliculas }" var="pelicula" >
			<li> ${pelicula}  </li>
		</c:forEach>
	</ol> 
	
	--%>


	<div class="panel panel-default">
		
		<div class="panel-heading">Pelis</div>
		
		<div class="panel-body">

			<table class="table table-hover table-bordered">
				<thead>
					<tr>
						<th>Id</th>
						<th>Titulo</th>
						<th>Duracion</th>
						<th>Clasificacion</th>
						<th>Genero</th>
						<th>imagen</th>
						<th>Fecha</th>
						<th>Estado</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach items="${ peliculas }" var="pelicula">
						<tr>
							<td>${ pelicula.id }</td>
							<td>${ pelicula.titulo }</td>
							<td>${ pelicula.clasificacion } Min.</td>
							<td>${ pelicula.clasificacion }</td>
							<td>${ pelicula.genero }</td>
							<td>  <img src="${urlPublic}/imagenes/${pelicula.imagen}" style="width: 80px; height: 100px"> </td>
							<td>${ pelicula.fechaEstreno }</td>
							<td>${ pelicula.stattus }</td>
						</tr>
					</c:forEach>
				</tbody>

			</table>

		</div>
	</div>

</body>
</html>