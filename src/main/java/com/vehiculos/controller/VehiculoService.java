package com.vehiculos.controller;

import org.springframework.stereotype.Service;

@Service
public class VehiculoService {

	public String verificarIngreso(Usuario user) {
		
		if(Administrador.getAdmin().get(user.getUser()).equals(user.getContrasenia())){
			return "panel";
		} else return "noIngreso";
		
	}
	
	public String cargarVehiculos(Vehiculo automotor) {
		
		Vehiculos.getVehiculos().put(automotor.getModelo(), automotor);
		
		return "cargado";
	}
	
	public String buscarVehiculosPorModelo(Vehiculo automotor) {
		
		for(String modelo : Vehiculos.getVehiculos().keySet()) {
			if(modelo.equals(automotor.getModelo())) {
				automotor.setColor(Vehiculos.getVehiculos().get(modelo).getColor());
				automotor.setAnio(Vehiculos.getVehiculos().get(modelo).getAnio());
				automotor.setPrecio(Vehiculos.getVehiculos().get(modelo).getPrecio());
				automotor.setStock(Vehiculos.getVehiculos().get(modelo).getStock());
				return "buscarBien";
			} 
		}
		return "buscarMal";
	}
	
public String buscarVehiculosPorPrecio(Vehiculo automotor) {
		
		for(String modelo : Vehiculos.getVehiculos().keySet()) {
			if(Vehiculos.getVehiculos().get(modelo).getPrecio().equals(automotor.getPrecio())) {
				automotor.setColor(Vehiculos.getVehiculos().get(modelo).getColor());
				automotor.setAnio(Vehiculos.getVehiculos().get(modelo).getAnio());
				automotor.setModelo(Vehiculos.getVehiculos().get(modelo).getModelo());
				automotor.setStock(Vehiculos.getVehiculos().get(modelo).getStock());
				return "buscarBien";
			} 
		}
		return "buscarMal";
	}
	
public String seleccionarBusqueda(Vehiculo automotor) {
	if(!automotor.getModelo().equals("")) {
		return buscarVehiculosPorModelo(automotor);
	} else return buscarVehiculosPorPrecio(automotor);
}

}
