package cl.awakelab.ejerciciogrupal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.ejerciciogrupal.service.ProfesionalService;

@Controller
public class UsuarioController {

	
	
	@Autowired
	ProfesionalService profesionalService;
	
	//@Autowired
	//AdministrativoService administrativoService;
	
	@RequestMapping(path = "/listar-usuarios", method = RequestMethod.GET)
    public ModelAndView mostrarListarUsuarios() {
		System.out.println("Prueba dentro del controller de usuarios");
		return new ModelAndView("listar-usuarios", "profesionales", profesionalService.getAll());}
}
