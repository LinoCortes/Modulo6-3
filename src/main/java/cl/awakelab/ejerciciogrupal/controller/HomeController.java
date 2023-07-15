package cl.awakelab.ejerciciogrupal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;



// Ejercicio Grupal 7.1 Módulo 6 
// 	Integrantes: 
//		Lino Cortés
//		Sergio Morales
// 		Felipe Toro
//		Pedro urbina


@Controller
public class HomeController {

	
	
	@RequestMapping(path = "/" )
    public RedirectView mostrarHome() {
		RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/ejerciciogrupal/listar-capacitaciones");
        return redirectView;
    }
	
  

	@RequestMapping(path = "/login")
    public ModelAndView mostrarLogin() {
       return new ModelAndView("login");
    }
    
    @RequestMapping(path = "/error")
    public ModelAndView errorLogin() {
        return new ModelAndView("login", "error", "true");
    }
    @RequestMapping(path = "/logout")
    public ModelAndView logout() {
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	if(auth != null) {
    		SecurityContextHolder.getContext().setAuthentication(null);
    	}
    	return new ModelAndView("redirect:/login?logout");
    }
   
    
}