package cl.awakelab.ejerciciogrupal.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Usuario implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre, run;
	@Column(name="fecha_nacimiento")
	private String fechaNacimiento;
	
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