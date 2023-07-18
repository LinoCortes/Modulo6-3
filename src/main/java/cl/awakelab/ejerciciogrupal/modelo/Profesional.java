package cl.awakelab.ejerciciogrupal.modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="profesional")
public class Profesional extends Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_profesional")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo;
	@Column(name="fecha_ingreso")
	private String fechaIngreso;

	public Profesional(int id,String nombre,String run, String fechaNacimiento,String titulo, String fechaIngreso) {
		//super(id,nombre,run,fechaNacimiento);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	

	public Profesional() {
		
	}


	public String getTitulo() {
		return titulo;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return super.toString() + " Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
}