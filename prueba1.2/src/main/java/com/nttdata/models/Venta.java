package com.nttdata.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="ventas")
public class Venta {

	@Id //clave primaria o PK
	@GeneratedValue(strategy= GenerationType.IDENTITY)//auto incrementable
	private Long id;
	private String date;
	
	
	private String nombreProducto1=null;
	
	private String nombreProducto2=null;
	private String nombreProducto3=null;
	
	private double precioProducto1=0;
	private double precioProducto2=0;
	private double precioProducto3=0;
	private double totalVenta;

	
	public double getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}
	public Venta(Long id, String date, String nombreProducto1, String nombreProducto2, String nombreProducto3,
			double precioProducto1, double precioProducto2, double precioProducto3, double totalVenta) {
		super();
		this.id = id;
		this.date = date;
		this.nombreProducto1 = nombreProducto1;
		this.nombreProducto2 = nombreProducto2;
		this.nombreProducto3 = nombreProducto3;
		this.precioProducto1 = precioProducto1;
		this.precioProducto2 = precioProducto2;
		this.precioProducto3 = precioProducto3;
		this.totalVenta = totalVenta;
	}
	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNombreProducto1() {
		return nombreProducto1;
	}
	public void setNombreProducto1(String nombreProducto1) {
		this.nombreProducto1 = nombreProducto1;
	}
	public String getNombreProducto2() {
		return nombreProducto2;
	}
	public void setNombreProducto2(String nombreProducto2) {
		this.nombreProducto2 = nombreProducto2;
	}
	public String getNombreProducto3() {
		return nombreProducto3;
	}
	public void setNombreProducto3(String nombreProducto3) {
		this.nombreProducto3 = nombreProducto3;
	}
	public double getPrecioProducto1() {
		return precioProducto1;
	}
	public void setPrecioProducto1(double precioProducto1) {
		this.precioProducto1 = precioProducto1;
	}
	public double getPrecioProducto2() {
		return precioProducto2;
	}
	public void setPrecioProducto2(double precioProducto2) {
		this.precioProducto2 = precioProducto2;
	}
	public double getPrecioProducto3() {
		return precioProducto3;
	}
	public void setPrecioProducto3(double precioProducto3) {
		this.precioProducto3 = precioProducto3;
	}
	
	

}
