package cl.awakelab.ejerciciogrupal.service;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.ejerciciogrupal.modelo.Usuario;

public interface IUsuariosRepository  extends JpaRepository<Usuario, Integer>{
	

}
