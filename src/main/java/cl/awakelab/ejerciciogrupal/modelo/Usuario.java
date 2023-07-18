package cl.awakelab.ejerciciogrupal.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	private String nombre, run;
	@OneToOne(mappedBy = "usuario")
	@PrimaryKeyJoinColumn
	private Profesional profesional;
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