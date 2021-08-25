package co.edu.unicundi.recursosInvestigacion.entity;

import java.sql.Date;

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
@Table(name = "estudiante")
public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer estu_id;
    
	@Column(name = "estu_codigo", nullable = false, length = 30)
    private Integer estuCodigo;
	
	@Size(min = 3, max = 20, message = "Debe tener entre 3 y 20 letras")
    @Column(name = "estu_nombre", nullable = false, length = 50)
    private String estuNombre;
	
	@Size(min = 4, max = 20, message = "Debe tener entre 4 y 20 letras")
    @Column(name = "estu_apellido", nullable = false, length = 50)
    private String estuApellido;
	
	@ManyToOne
	@JoinColumn(name = "tdoc_id", nullable = false, foreignKey = @ForeignKey(name = "ESTUDIANTE_FK1"))
	private TipoDocumento tdocId;
	
	@Size(min = 7, max = 15, message = "Debe tener entre 7 y 15 letras")
    @Column(name = "estu_documento", nullable = false, length = 30)
    private String estuDocumento;
	
	@ManyToOne
	@JoinColumn(name = "prac_id", nullable = false, foreignKey = @ForeignKey(name = "ESTUDIANTE_FK2"))
	private ProgramaAcademico pracId;
	
	@Size(min = 7, max = 15, message = "Debe tener entre 7 y 15 letras")
    @Column(name = "estu_direccion", nullable = false, length = 30)
    private String estuDireccion;
	
	@Size(min = 7, max = 30, message = "Debe tener entre 7 y 30 letras")
    @Column(name = "estu_correo", nullable = false, length = 30)
    private String estuCorreo;
	
	@Column(name = "estu_telcelular", nullable = false, length = 50)
    private Integer estuTelCelular;
	
	@Column(name = "estu_telcelular1", nullable = false, length = 50)
    private Integer estuTelCelular1;
	
	@Size(min = 7, max = 15, message = "Debe tener entre 7 y 15 letras")
    @Column(name = "estu_sede", nullable = false, length = 30)
    private String estuSede;
	
	@Size(min = 4, max = 15, message = "Debe tener entre 4 y 15 letras")
    @Column(name = "estu_lugarnacimiento", nullable = false, length = 30)
    private String estuLugarNacimiento;
	
	@Column(name = "estu_fechanacimiento", nullable = false)
    private Date estuFechaNacimiento;
	
	@ManyToOne
	@JoinColumn(name = "rolu_id", nullable = false, foreignKey = @ForeignKey(name = "ESTUDIANTE_FK3"))
	private RolUser rolUser;

	public Integer getEstu_id() {
		return estu_id;
	}

	public void setEstu_id(Integer estu_id) {
		this.estu_id = estu_id;
	}

	public Integer getEstuCodigo() {
		return estuCodigo;
	}

	public void setEstuCodigo(Integer estuCodigo) {
		this.estuCodigo = estuCodigo;
	}

	public String getEstuNombre() {
		return estuNombre;
	}

	public void setEstuNombre(String estuNombre) {
		this.estuNombre = estuNombre;
	}

	public String getEstuApellido() {
		return estuApellido;
	}

	public void setEstuApellido(String estuApellido) {
		this.estuApellido = estuApellido;
	}

	public TipoDocumento getTdocId() {
		return tdocId;
	}

	public void setTdocId(TipoDocumento tdocId) {
		this.tdocId = tdocId;
	}

	public String getEstuDocumento() {
		return estuDocumento;
	}

	public void setEstuDocumento(String estuDocumento) {
		this.estuDocumento = estuDocumento;
	}

	public ProgramaAcademico getPracId() {
		return pracId;
	}

	public void setPracId(ProgramaAcademico pracId) {
		this.pracId = pracId;
	}

	public String getEstuDireccion() {
		return estuDireccion;
	}

	public void setEstuDireccion(String estuDireccion) {
		this.estuDireccion = estuDireccion;
	}

	public String getEstuCorreo() {
		return estuCorreo;
	}

	public void setEstuCorreo(String estuCorreo) {
		this.estuCorreo = estuCorreo;
	}

	public Integer getEstuTelCelular() {
		return estuTelCelular;
	}

	public void setEstuTelCelular(Integer estuTelCelular) {
		this.estuTelCelular = estuTelCelular;
	}

	public Integer getEstuTelCelular1() {
		return estuTelCelular1;
	}

	public void setEstuTelCelular1(Integer estuTelCelular1) {
		this.estuTelCelular1 = estuTelCelular1;
	}

	public String getEstuSede() {
		return estuSede;
	}

	public void setEstuSede(String estuSede) {
		this.estuSede = estuSede;
	}

	public String getEstuLugarNacimiento() {
		return estuLugarNacimiento;
	}

	public void setEstuLugarNacimiento(String estuLugarNacimiento) {
		this.estuLugarNacimiento = estuLugarNacimiento;
	}

	public Date getEstuFechaNacimiento() {
		return estuFechaNacimiento;
	}

	public void setEstuFechaNacimiento(Date estuFechaNacimiento) {
		this.estuFechaNacimiento = estuFechaNacimiento;
	}

	public RolUser getRolUser() {
		return rolUser;
	}

	public void setRolUser(RolUser rolUser) {
		this.rolUser = rolUser;
	}

}
