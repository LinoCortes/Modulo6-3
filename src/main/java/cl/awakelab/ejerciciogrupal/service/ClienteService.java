package cl.awakelab.ejerciciogrupal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.ejerciciogrupal.modelo.Cliente;

@Service
public class ClienteService {
	
	@Autowired
	private IClienteRepository iClienteRepository;
	
	public ClienteService() {
		
	}
	
	public List<Cliente> getAll(){
		return iClienteRepository.findAll();
	}

}
