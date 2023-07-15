package cl.awakelab.ejerciciogrupal.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")

public class Usuario implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String nombre, run, fechaNacimiento;
	
	public Usuario() {
		
	}
	
	public Usuario(int id, String nombre, String run ,String fechaNacimiento) {
		this.id=id;
		this.nombre = nombre;
		this.run = run;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//Sobreescribe el metodo toString
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", run=" + run + ", fechaNacimiento=" + fechaNacimiento
				+ "]";
	}
	
	
}