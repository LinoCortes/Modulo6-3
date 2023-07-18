package cl.awakelab.ejerciciogrupal.service;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import cl.awakelab.ejerciciogrupal.modelo.Profesional;
import cl.awakelab.ejerciciogrupal.service.repository.IProfesionalRepository;

@Service
public class ProfesionalService {
	
	private IProfesionalRepository iProfesionalRepository;
	
	@Autowired
	public ProfesionalService(IProfesionalRepository iProfesionalRepository) {
		this.iProfesionalRepository=iProfesionalRepository;
	}
	
	public List<Profesional> getAll(){
		System.out.println(iProfesionalRepository.findAll());
		return iProfesionalRepository.findAll();
	}
}