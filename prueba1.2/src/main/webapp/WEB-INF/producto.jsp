<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Producto</title>
</head>
<body>
        <div class="container">
                <h1>Registro de producto</h1>
                <form action="producto/guardar" method="post">
                        <table class="table table-bordered">
                                <tr>
                                        <td><label for="nombre">Nombre: </label></td>
                                        <td><input type="text" name="nombre" id="nombre" ></td>
                                        
                                </tr>
                                <tr>
                                        <td><label for="precioBase">Precio: </label></td>
                                        <td><input type="number" name="precioBase" id="precioBase" ></td>
                                        
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