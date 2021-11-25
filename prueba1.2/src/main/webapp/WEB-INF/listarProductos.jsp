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
                <h1>Registro de productos</h1>

		<a href="../producto" class="btn btn-primary">Volver</a>
		
		<table class="table">
			<thead >
				<tr>
					
					<th>Nombre</th>
					<th>Precio</th>
					<th>Acción</th>
				</tr>
			</thead>
			<c:forEach items="${listaProductos}" var="lista">
				<tr>
					<td>${lista.getNombre()}</td>
					<td>${lista.getPrecioBase()}</td>
					<td>
						<form action="/producto/eliminar" method="get">
						<input type="hidden" name="id" value=${lista.getId()}>
						<input type="submit"  class="btn btn-danger" value="Eliminar">
						</form>
					</td>
					<td>
						<form action="/producto/show" method="get">
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