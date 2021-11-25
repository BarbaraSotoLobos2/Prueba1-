package com.nttdata.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.models.Producto;
import com.nttdata.models.Venta;
import com.nttdata.repository.VentaRepository;

@Service
public class VentaService {
@Autowired 
VentaRepository ventaRepository;

public void insertarVenta(Venta venta) {

	ventaRepository.save(venta);
}
//lista registros de la BD
public List<Venta> listarVentas() {

	return (List<Venta>) ventaRepository.findAll(); // usuarioRepository.findAll()
}
public Venta buscarVentaId(Long id) {
	return ventaRepository.findById(id).get(); // retorna un producto
	
}
public void eliminarVenta(Long id) {
	ventaRepository.deleteById(id); // retorna un tipo object
		
	}
public void updateVenta(@Valid Venta venta) {
	if(ventaRepository.existsById(venta.getId()))
	{ventaRepository.save(venta);}
	
}


}
