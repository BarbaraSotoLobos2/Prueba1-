package com.nttdata.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="productos")
public class Producto{
	
	@Id //clave primaria o PK
	@GeneratedValue(strategy= GenerationType.IDENTITY)//auto incrementable
	private Long id;
    // validaciones de campos
	@Size(min = 3, max = 10, message = "Se ha sobrepasado el limite")
	private String nombre;
	
	private Double precioBase;
	
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(Long id, @Size(min = 3, max = 10, message = "Se ha sobrepasado el limite") String nombre, Double precioBase) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precioBase = precioBase;
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
	public Double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(Double precioBase) {
		this.precioBase = precioBase;
	}
	
	






}
