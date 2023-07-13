package cl.awakelab.ejerciciogrupal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.ejerciciogrupal.modelo.Capacitacion;

@Service
public class CapacitacionService {
	
	@Autowired
	private ICapacitacionRepository iCapacitacionRepository;
	
	public CapacitacionService() {
		
	}
	
	public List<Capacitacion> getAll(){
		return iCapacitacionRepository.findAll();
	}
}
