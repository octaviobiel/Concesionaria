package com.vehiculos.controller;

import java.util.HashMap;

public class Vehiculos {

	private static HashMap<String, Vehiculo> vehiculos;
	static {
		vehiculos = new HashMap<String, Vehiculo>();
		vehiculos.put("Ford Falcon", new Vehiculo("Ford Falcon", "blanco", "1983", "2000", "3"));
		vehiculos.put("Audi v3", new Vehiculo("Audi v3", "blanco", "2005", "10000", "10"));
	}
	public static HashMap<String, Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public static void setVehiculos(HashMap<String, Vehiculo> vehiculos) {
		Vehiculos.vehiculos = vehiculos;
	}

	

}
