package co.edu.unicundi.recursosInvestigacion.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "programaacademico")
public class ProgramaAcademico {

	@Id
    private Integer pracId;
    	
	@Size(min = 5, max = 20, message = "Debe tener entre 5 y 20 letras")
    @Column(name = "prac_nombre", nullable = false, length = 50)
    private String pracNombre;
	
	@OneToMany(mappedBy = "tdocId")
	private List<Estudiante> estudiante;
	
	@OneToMany(mappedBy = "tdocId")
	private List<Administrativo> administrativo;
	
	public Integer getPracId() {
		return pracId;
	}

	public void setPracId(Integer pracId) {
		this.pracId = pracId;
	}

	public String getPracNombre() {
		return pracNombre;
	}

	public void setPracNombre(String pracNombre) {
		this.pracNombre = pracNombre;
	}

	public List<Estudiante> getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(List<Estudiante> estudiante) {
		this.estudiante = estudiante;
	}

	public List<Administrativo> getAdministrativo() {
		return administrativo;
	}

	public void setAdministrativo(List<Administrativo> administrativo) {
		this.administrativo = administrativo;
	}

}
