package cl.awakelab.ejerciciogrupal.service;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.ejerciciogrupal.modelo.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer>{
	

}
