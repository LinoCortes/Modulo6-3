package cl.awakelab.ejerciciogrupal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.ejerciciogrupal.modelo.Capacitacion;
import cl.awakelab.ejerciciogrupal.modelo.Cliente;
import cl.awakelab.ejerciciogrupal.service.CapacitacionService;
import cl.awakelab.ejerciciogrupal.service.ClienteService;


@RestController
public class ApiRestController {
  
      
      @Autowired
      private ClienteService clienteService;
      
      @Autowired
      private CapacitacionService capacitacionService;
      
      @RequestMapping(value="/api/clientes", headers = "Accept=application/json")
      public List<Cliente> getClientes() {
        return clienteService.getAll();
      }
      
      @RequestMapping(value="/api/capacitacion", headers = "Accept=application/json" )
      public List<Capacitacion> getCapacitaciones() {
          return capacitacionService.getAll();
      }
      
      @RequestMapping(value="/api/capacitaciones", method = RequestMethod.POST)
      public Capacitacion createCapacitacion(@RequestBody Capacitacion capacitacion) {
        return capacitacionService.save(capacitacion);
      }
      
}