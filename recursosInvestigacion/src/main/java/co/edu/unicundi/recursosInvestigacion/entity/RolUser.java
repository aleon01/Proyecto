package co.edu.unicundi.recursosInvestigacion.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "roluser")
public class RolUser {

	@Id
    private Integer roluId;
    
	@Size(min = 3, max = 20, message = "Debe tener entre 3 y 20 letras")
    @Column(name = "rolu_nombre", nullable = false, length = 50)
    private String roluNombre;
	
	@OneToMany(mappedBy = "rolUser")
	private List<Estudiante> estudiante;
	
	@OneToMany(mappedBy = "rolUser")
	private List<Docente> docente;
	
	@OneToMany(mappedBy = "rolUser")
	private List<Administrativo> administrativo;

	public Integer getRoluId() {
		return roluId;
	}

	public void setRoluId(Integer roluId) {
		this.roluId = roluId;
	}

	public String getRoluNombre() {
		return roluNombre;
	}

	public void setRoluNombre(String roluNombre) {
		this.roluNombre = roluNombre;
	}

	public List<Estudiante> getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(List<Estudiante> estudiante) {
		this.estudiante = estudiante;
	}

	public List<Docente> getDocente() {
		return docente;
	}

	public void setDocente(List<Docente> docente) {
		this.docente = docente;
	}

	public List<Administrativo> getAdministrativo() {
		return administrativo;
	}

	public void setAdministrativo(List<Administrativo> administrativo) {
		this.administrativo = administrativo;
	}
	

}
