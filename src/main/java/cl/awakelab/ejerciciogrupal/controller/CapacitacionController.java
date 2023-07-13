package cl.awakelab.ejerciciogrupal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.ejerciciogrupal.service.CapacitacionService;

// Ejercicio Grupal 6 Módulo 6 
// 	Integrantes: 
//		Lino Cortés
//		Sergio Morales
// 		Felipe Toro
//		Pedro urbina


@Controller
public class CapacitacionController {

	@Autowired
	CapacitacionService capacitacionService;
	
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView mostrarListarCapacitaciones() {
        return new ModelAndView("listar-capacitaciones", "capacitaciones", capacitacionService.getAll());
    }
}