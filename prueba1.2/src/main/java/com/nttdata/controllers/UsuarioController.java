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

import com.nttdata.models.Usuario;
import com.nttdata.services.UsuarioServices;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	//inyeccion de dependencias
		@Autowired
		UsuarioServices usuarioService;
		
		
		//desplegar inicialmente el jsp
		@RequestMapping("")
		public String usuario(@ModelAttribute("usuario") Usuario usuario,
				Model model) {
			return "usuario.jsp";
		}
		
		// capturar la informacion del formulario
		@RequestMapping("/login")

		public String login(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult br,
				RedirectAttributes ra) {
			if (br.hasErrors()) {

				ra.addFlashAttribute("mensajeError", "Campos no validos");
				return "redirect:/usuario";
			}
			System.out.println(usuario.getNombre() + " " + usuario.getApellido() + " ");

			usuarioService.insertarUsuario(usuario);

			return "redirect:/usuario/lista";
		}
			
		@RequestMapping("/lista")
		public String lista(Model model) {

			model.addAttribute("listaUsuarios", usuarioService.listarUsuarios());
			return "listar.jsp";
		}
			
		/// usuario/eliminar
		@RequestMapping("/eliminar")
		public String eliminarUsuario(@RequestParam("id") Long id) {

			Usuario usuario = usuarioService.buscarUsuarioId(id);
			if (usuario != null) {
				usuarioService.eliminarUsuario(id);
			}

			return "redirect:/usuario/lista";
		}
			
		/// mostrar usuario que se actualizará
		@RequestMapping("/actualizar")
		public String actualizarUsuario(@RequestParam("id") Long id, Model model) {

			Usuario usuario = usuarioService.buscarUsuarioId(id);

			if (usuario != null) {

				model.addAttribute("usuario", usuario);
				return "usuarioUpdate.jsp";
			}
			return "redirect:/usuario/actualizar";
			// return "redirect:/usuario/lista";
		}
			
		// actualizar el siguiente usuario
		@RequestMapping("/actualizarUsuario")
		public String actualizarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario) {

			if (usuario != null) {
				usuarioService.updateUsuario(usuario);
				return "redirect:/usuario/lista";
			}
			return "redirect:/usuario/lista";

		}
}
