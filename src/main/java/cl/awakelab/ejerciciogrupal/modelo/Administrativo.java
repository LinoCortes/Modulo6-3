package cl.awakelab.ejerciciogrupal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="administrativo")
public class Administrativo extends Usuario{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_administrativo")
	int id;
	String area;
	String experienciaPrevia;
	
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