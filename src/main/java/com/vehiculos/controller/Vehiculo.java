package com.vehiculos.controller;

public class Vehiculo {
	
	private String modelo;
	private String color;
	private String anio;
	private String precio;
	private String stock;
	
	public Vehiculo(String mod, String col, String a, String pre, String cant) {
		this.modelo = mod;
		this.color = col;
		this.anio = a;
		this.precio = pre;
		this.stock = cant;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}
	
	
	
	
}
