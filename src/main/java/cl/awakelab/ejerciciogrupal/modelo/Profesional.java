package cl.awakelab.ejerciciogrupal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profesional")
public class Profesional{
	
	private static final long serialVersionUID = 1L;
	@Id
	int id_usuario;
	String titulo;
	@Column(name="fecha_ingreso")
	String fechaIngreso;

	public Profesional(int id_usuario,String nombre,String run, String fechaNacimiento,String titulo, String fechaIngreso) {
//		super(id,nombre,run,fechaNacimiento);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	

	public Profesional() {
		
	}


	public String getTitulo() {
		return titulo;
	}

	public int getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
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