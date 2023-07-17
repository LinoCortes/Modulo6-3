package cl.awakelab.ejerciciogrupal.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity(name="administrativo")
public class Administrativo extends Usuario{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String area, experienciaPrevia;
	
	public Administrativo() {
		
	}
	
	public Administrativo(int id,String nombre, String run, String fechaNacimiento, String area, String experienciaPrevia) {
		super(id,nombre,run,fechaNacimiento);
		this.area=area;
		this.experienciaPrevia=experienciaPrevia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public String toString() {
		
		return super.toString()+" Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}
}