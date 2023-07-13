package cl.awakelab.ejerciciogrupal.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.awakelab.ejerciciogrupal.modelo.Capacitacion;

public interface ICapacitacionRepository extends JpaRepository<Capacitacion, Integer>{

}
