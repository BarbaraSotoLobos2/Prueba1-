<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Registro de venta</title>
</head>
<body>
        <div class="container">
                <h1>Registro de venta</h1>
                <form action="venta/guardar" method="post">
                        <table class="table table-bordered">
                                <tr>
                                        <td><label for="fecha">Fecha: </label></td>
                                        <td><input type="date" name="date" id="date" ></td>
                                        
                                </tr>
                                <tr>
                                        <td><label for="nombreProducto1">Producto: </label></td>
                                        <td><input type="text" name="nombreProducto1" id="nombreProducto1" ></td>
                                        <td><label for="precioProducto1">Precio: </label></td>
                                        <td><input type="number" name="precioProducto1" id="precioProducto1" ></td>
                                </tr>
                                <tr>
                                        <td><label for="nombreProducto2">Producto: </label></td>
                                        <td><input type="text" name="nombreProducto2" id="nombreProducto2" ></td>
                                        <td><label for="precioProducto2">Precio: </label></td>
                                        <td><input type="number" name="precioProducto2" id="precioProducto2" ></td>
                                </tr>
                                 <tr>
                                        <td><label for="nombreProducto3">Producto: </label></td>
                                        <td><input type="text" name="nombreProducto3" id="nombreProducto3" ></td>
                                        <td><label for="precioProducto3">Precio: </label></td>
                                        <td><input type="number" name="precioProducto3" id="precioProducto3" ></td>
                                </tr>
                                
                                
                                <tr>
                                         <td><span style="color:red;">${mensajeError}</span></td>
                                        <td><input type="reset" value="Limpiar" class="btn btn-warning"> 
                                        <input type="submit" value="Guardar" class="btn btn-success"></td>
                                        
                                </tr>
                                
                        </table>
                </form>
                
                
        
        </div>
</body>
</html>