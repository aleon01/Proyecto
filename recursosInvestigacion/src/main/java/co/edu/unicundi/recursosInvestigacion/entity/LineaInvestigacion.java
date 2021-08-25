package co.edu.unicundi.recursosInvestigacion.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "lineainvestigacion")
public class LineaInvestigacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer liinId;
	
	@ManyToOne
	@JoinColumn(name = "prac_id", nullable = false, foreignKey = @ForeignKey(name = " "))
	private ProgramaAcademico pracId;
	
	@Column(name = "liin_codigo", nullable = false)
    private Integer liinCodigo;
	
	@Size(min = 3, max = 20, message = "Debe tener entre 3 y 20 letras")
    @Column(name = "liin_nombre", nullable = false, length = 30)
    private String liinNombre;
	
	@Size(min = 3, max = 20, message = "Debe tener entre 3 y 20 letras")
    @Column(name = "liin_objetivo", nullable = false, length = 30)
    private String liinObjetivo;

	@Size(min = 3, max = 20, message = "Debe tener entre 3 y 20 letras")
    @Column(name = "liin_descripcion", nullable = false, length = 30)
    private String liinDescripcion;
	
	@Column(name = "liin_aval", nullable = false, length = 30)
    private String liinAval;

	public Integer getLiinId() {
		return liinId;
	}

	public void setLiinId(Integer liinId) {
		this.liinId = liinId;
	}

	public ProgramaAcademico getPracId() {
		return pracId;
	}

	public void setPracId(ProgramaAcademico pracId) {
		this.pracId = pracId;
	}

	public Integer getLiinCodigo() {
		return liinCodigo;
	}

	public void setLiinCodigo(Integer liinCodigo) {
		this.liinCodigo = liinCodigo;
	}

	public String getLiinNombre() {
		return liinNombre;
	}

	public void setLiinNombre(String liinNombre) {
		this.liinNombre = liinNombre;
	}

	public String getLiinObjetivo() {
		return liinObjetivo;
	}

	public void setLiinObjetivo(String liinObjetivo) {
		this.liinObjetivo = liinObjetivo;
	}

	public String getLiinDescripcion() {
		return liinDescripcion;
	}

	public void setLiinDescripcion(String liinDescripcion) {
		this.liinDescripcion = liinDescripcion;
	}

	public String getLiinAval() {
		return liinAval;
	}

	public void setLiinAval(String liinAval) {
		this.liinAval = liinAval;
	}
	
}
