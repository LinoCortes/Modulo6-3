package cl.awakelab.ejerciciogrupal.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.awakelab.ejerciciogrupal.modelo.Profesional;

public interface IProfesionalRepository extends JpaRepository<Profesional, Integer>{

}