package cl.awakelab.ejerciciogrupal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.ejerciciogrupal.modelo.Capacitacion;
import cl.awakelab.ejerciciogrupal.service.CapacitacionService;

@RestController
public class ApiRestController {
    @Autowired
    private CapacitacionService capacitacionService;

      @RequestMapping(value="/api/clients", headers = "Accept=application/json")
      public List<Capacitacion> getClients() {
        return capacitacionService.getAll();
      }
}