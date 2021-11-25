package com.nttdata.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.models.Producto;
import com.nttdata.models.Usuario;
import com.nttdata.repository.*;
@Service
public class ProductoService {
	
	@Autowired
	ProductoRepository productoRepository;
	
	public void insertarProducto(Producto producto) {

		productoRepository.save(producto);
	}
	//lista registros de la BD
	public List<Producto> listarProductos() {

		return (List<Producto>) productoRepository.findAll(); // usuarioRepository.findAll()
	}
	public Producto buscarProdutoId(Long id) {
		return productoRepository.findById(id).get(); // retorna un producto
		
	}
	public void eliminarUsuario(Long id) {
		 productoRepository.deleteById(id); // retorna un tipo object
			
		}
	public void updateProducto(@Valid Producto producto) {
		if(productoRepository.existsById(producto.getId()))
		{productoRepository.save(producto);}
		
	}
}
