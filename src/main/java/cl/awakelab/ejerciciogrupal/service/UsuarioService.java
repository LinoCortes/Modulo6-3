package cl.awakelab.ejerciciogrupal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.ejerciciogrupal.modelo.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuariosRepository iusuariosRepository;
	
	public UsuarioService() {
		
	}
	
	public List<Usuario> getAll(){
		return iusuariosRepository.findAll();
	}
	

}
