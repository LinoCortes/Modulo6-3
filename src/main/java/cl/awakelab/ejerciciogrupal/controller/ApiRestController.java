package cl.awakelab.ejerciciogrupal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cl.awakelab.ejerciciogrupal.modelo.Cliente;
import cl.awakelab.ejerciciogrupal.service.ClienteService;


@RestController
public class ApiRestController {
  
      
      @Autowired
      private ClienteService clienteService;
      
      @RequestMapping(value="/api/clientes", headers = "Accept=application/json")
      public List<Cliente> getClientes() {
        return clienteService.getAll();
      }
      
}