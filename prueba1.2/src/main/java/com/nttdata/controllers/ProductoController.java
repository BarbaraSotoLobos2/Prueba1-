package com.nttdata.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nttdata.models.*;
import com.nttdata.services.*;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	// inyeccion de dependencias
	@Autowired
	ProductoService productoService;

	// desplegar inicialmente el jsp
	@RequestMapping("")
	public String usuario(@ModelAttribute("producto") Producto producto, Model model) {
		return "producto.jsp";
	}

	// capturar la informacion del formulario
	@RequestMapping("/guardar")

	public String guardar(@Valid @ModelAttribute("producto") Producto producto, BindingResult br, RedirectAttributes ra) {
		
		 if(br.hasErrors()) {

			ra.addFlashAttribute("mensajeError", "Campos no validos");
			return "redirect:/producto";
		}

		productoService.insertarProducto(producto);

		return "redirect:/producto";
	}
	//listar producto
	@RequestMapping("/lista")
	public String lista(Model model) {
		
		model.addAttribute("listaProductos", productoService.listarProductos());
		return "listarProductos.jsp";
	}
	///producto a eliminar
	@RequestMapping("/eliminar")
	public String eliminarUsuario(@RequestParam("id") Long id) {

		Producto producto = productoService.buscarProdutoId(id);
		if (producto != null) {
			productoService.eliminarUsuario(id);
		}

		return "redirect:/producto/lista";
	}
	/// mostrar usuario que se actualizará
	@RequestMapping("/show")
	public String showUsuario(@RequestParam("id") Long id, Model model) {

		Producto producto = productoService.buscarProdutoId(id);

		if (producto!= null) {
			model.addAttribute("producto", producto);
			return "productoUpdate.jsp";
		}
		return "redirect:/producto/show";
		
	}
	@RequestMapping("/update")
	public String actualizarProducto(@Valid @ModelAttribute("producto") Producto producto) {

		if (producto != null) {
			productoService.updateProducto(producto);
			return "redirect:/producto/lista";
		}
		return "redirect:/producto/lista";

	}
	
}
