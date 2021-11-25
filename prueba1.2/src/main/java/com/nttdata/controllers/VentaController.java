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

import com.nttdata.models.Producto;
import com.nttdata.models.Usuario;
import com.nttdata.models.Venta;
import com.nttdata.services.UsuarioServices;
import com.nttdata.services.VentaService;

@Controller
@RequestMapping("/venta")
public class VentaController {
	//inyeccion de dependencias
	@Autowired
	VentaService ventaService;

	
	// desplegar inicialmente el jsp
	@RequestMapping("")
	public String usuario(@ModelAttribute("venta") Venta venta, Model model) {
		return "venta.jsp";
	}
	//capturar la informacion del formulario
	@RequestMapping("/guardar")
	
	public String guardar( @ModelAttribute("venta") Venta venta) {
		
		
		ventaService.insertarVenta(venta);

		return "redirect:/venta";
	}

	// listar venta
	@RequestMapping("/lista")
	public String lista(Model model) {

		model.addAttribute("listaVentas", ventaService.listarVentas());
		return "listarVenta.jsp";
	}
		
	/// venta/eliminar
	@RequestMapping("/eliminar")
	public String eliminarUsuario(@RequestParam("id") Long id) {

		Venta venta = ventaService.buscarVentaId(id);
		if (venta != null) {
			ventaService.eliminarVenta(id);
		}

		return "redirect:/venta/lista";
	}

	/// mostrar usuario que se actualizará
	@RequestMapping("/show")
	public String showVenta(@RequestParam("id") Long id, Model model) {

		Venta venta = ventaService.buscarVentaId(id);

		if (venta != null) {

			model.addAttribute("venta", venta);
			return "ventaUpdate.jsp";
		}
		return "redirect:/venta/mostar";
		// return "redirect:/usuario/lista";
	}
	
	// actualizar la venta
	@RequestMapping("/update")
	public String updateVenta(@Valid @ModelAttribute("venta") Venta venta) {

		if (venta != null) {
			ventaService.updateVenta(venta);
			return "redirect:/venta/lista";
		}
		return "redirect:/venta/lista";

	}

}
