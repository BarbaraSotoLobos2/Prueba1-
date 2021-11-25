<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Lista</title>
</head>
<body>
        <div class="container">
                <h1>Registro de usuarios</h1>

		<a href="../usuario" class="btn btn-primary">Volver</a>
		
		<table class="table">
			<thead >
				<tr>
					
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Correo</th>
					<th>Acción</th>
				</tr>
			</thead>
			<c:forEach items="${listaUsuarios}" var="lista">
				<tr>
					
					<td>${lista.getNombre()}</td>
					<td>${lista.getApellido()}</td>
					<td>${lista.getCorreo()}</td>
					
					<td>
						<form action="/usuario/eliminar" method="get">
						<input type="hidden" name="id" value=${lista.getId()}>
						<input type="submit"  class="btn btn-danger" value="Eliminar">
						</form>
					</td>
					<td>
						<form action="/usuario/actualizar" method="get">
						<input type="hidden" name="id" value=${lista.getId()}>
						<input type="submit"  class="btn btn-primary" value="Actualizar">
						</form>
					</td>
					
				</tr>
			</c:forEach>
		</table>
		


	</div>
</body>
</html>