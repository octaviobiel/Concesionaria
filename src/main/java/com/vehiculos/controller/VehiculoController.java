package com.vehiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VehiculoController {

	@Autowired
	public VehiculoService autoService;
	
    @GetMapping("/ingreso")
    public String ingresoForm(Model model) {
        model.addAttribute("user", new Usuario());
        return "ingreso";
    }

    @PostMapping("/ingreso")
    public String ingresoSubmit(@ModelAttribute Usuario user) {
        return autoService.verificarIngreso(user);
    }
    
    @GetMapping("/cargar")
    public String cargaForm(Model model) {
        model.addAttribute("automotor", new Vehiculo(null, null, null, null, null));
        return "cargar";
    }

    @PostMapping("/cargar")
    public String cargaSubmit(@ModelAttribute Vehiculo automotor) {
        return autoService.cargarVehiculos(automotor);
    }
    
    @GetMapping("/buscar")
    public String busquedaForm(Model model) {
        model.addAttribute("automotor", new Vehiculo(null, null, null, null, null));
        return "buscar";
    }

    @PostMapping("/buscar")
    public String busquedaSubmit(@ModelAttribute Vehiculo automotor) {
        return autoService.seleccionarBusqueda(automotor);
    }
}