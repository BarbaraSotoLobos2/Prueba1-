package com.nttdata.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.models.Usuario;
import com.nttdata.repository.UsuarioRepository;

@Service
public class UsuarioServices {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public void insertarUsuario(Usuario usuario) {
		
		usuarioRepository.save(usuario);
	}
	
	//lista registros de la BD
	public List<Usuario> listarUsuarios(){
		
		return (List<Usuario>) usuarioRepository.findAll(); // usuarioRepository.findAll()
	}
	
	public Usuario buscarUsuarioId(Long id) {
		return usuarioRepository.findById(id).get(); // retorna un dato
		
	}


	public void eliminarUsuario(Long id) {
	 usuarioRepository.deleteById(id); // retorna un tipo object
		
	}
	public void updateUsuario (@Valid Usuario usuario)
	{
		if(usuarioRepository.existsById(usuario.getId()))
		{usuarioRepository.save(usuario);}
	}
}
