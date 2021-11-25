<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Usuario</title>
</head>
<body>
        <div class="container">
                <h1>Registro de usuarios</h1>
                <form action="update" method="post">
                        <table class="table table-bordered">
                        	    	<input type="hidden" name="id" value=${producto.getId()}>
                                <tr>
                                        <td><label for="nombre">Nombre: </label></td>
                                        
                                        <td><input type="text" name="nombre" id="nombre"  value ="${producto.getNombre()}"></td>
                                        
                                </tr>
                                <tr>
                                        <td><label for="apellido"> Precio: </label></td>
                                        <td><input type="text" name="precioBase" id="precioBase" value ="${producto.getPrecioBase()}"></td>
                                        
                                </tr>
                                
                               
                                <tr>
                                        <td><span style="color:red;">${mensajeError}</span></td>
                                        <td><input type="reset" value="limpiar" class="btn btn-warning"> 
                                        	<input type="submit" value="enviar" class="btn btn-success">
                                        	
                                        </td>
                                        
                                </tr>
                                
                        </table>
                </form>
                
                
        
        </div>
</body>
</html>