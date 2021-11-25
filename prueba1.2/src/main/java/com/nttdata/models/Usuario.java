package com.nttdata.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuarios")

public class Usuario {
	
	@Id //clave primaria o PK
	@GeneratedValue(strategy= GenerationType.IDENTITY)//auto incrementable
	private Long id;
    // validaciones de campos
	@Size(min = 3, max = 10, message = "Se ha sobrepasado el limite")
	private String nombre;
	@Size(min = 3, max = 10, message = "Se ha sobrepasado el limite")
	private String apellido;
	
	private String correo;
	

	public Usuario() {
		super();
	}

	
	public Usuario(Long id, @Size(min = 3, max = 10, message = "Se ha sobrepasado el limite") String nombre,
			@Size(min = 3, max = 10, message = "Se ha sobrepasado el limite") String apellido, String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	


	
	
}
