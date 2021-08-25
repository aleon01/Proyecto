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
@Table(name = "docente")
public class Docente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer doce_id;
    
	@Column(name = "doce_codigo", nullable = false, length = 30)
    private Integer doceCodigo;
	
	@Size(min = 3, max = 20, message = "Debe tener entre 3 y 20 letras")
    @Column(name = "doce_nombre", nullable = false, length = 50)
    private String doceNombre;
	
	@Size(min = 4, max = 20, message = "Debe tener entre 4 y 20 letras")
    @Column(name = "doce_apellido", nullable = false, length = 50)
    private String doceApellido;
	
	@ManyToOne
	@JoinColumn(name = "tdoc_id", nullable = false, foreignKey = @ForeignKey(name = "DOCENTE_FK1"))
	private TipoDocumento tdocId;
	
	@Size(min = 7, max = 15, message = "Debe tener entre 7 y 15 letras")
    @Column(name = "doce_documento", nullable = false, length = 30)
    private String doceDocumento;
	
	@Size(min = 7, max = 15, message = "Debe tener entre 7 y 15 letras")
    @Column(name = "doce_direccion", nullable = false, length = 30)
    private String doceDireccion;
	
	@Size(min = 7, max = 15, message = "Debe tener entre 7 y 15 letras")
    @Column(name = "doce_correo", nullable = false, length = 30)
    private String doceCorreo;
	
	@Column(name = "doce_telcelular", nullable = false, length = 30)
    private Integer doceTelCelular;
	
	@Column(name = "doce_telcelular1", nullable = false, length = 30)
    private Integer doceTelCelular1;
	
	@Size(min = 7, max = 15, message = "Debe tener entre 7 y 15 letras")
    @Column(name = "doce_sede", nullable = false, length = 30)
    private String doceSede;
	
	@Size(min = 4, max = 15, message = "Debe tener entre 4 y 15 letras")
    @Column(name = "doce_lugarnacimiento", nullable = false, length = 30)
    private String doceLugarNacimiento;
	
	@Column(name = "doce_fechanacimiento", nullable = false)
    private Date doceFechaNacimiento;
	
	@Size(min = 7, max = 15, message = "Debe tener entre 7 y 15 letras")
    @Column(name = "doce_usuario", nullable = false, length = 30)
    private String doceUsuario;
	
	@Size(min = 7, max = 15, message = "Debe tener entre 7 y 15 letras")
    @Column(name = "doce_contrasena", nullable = false, length = 30)
    private String doceContrasena;
	
	@ManyToOne
	@JoinColumn(name = "rolu_id", nullable = false, foreignKey = @ForeignKey(name = "DOCENTE_FK2"))
	private RolUser rolUser;

	public Integer getDoce_id() {
		return doce_id;
	}

	public void setDoce_id(Integer doce_id) {
		this.doce_id = doce_id;
	}

	public Integer getDoceCodigo() {
		return doceCodigo;
	}

	public void setDoceCodigo(Integer doceCodigo) {
		this.doceCodigo = doceCodigo;
	}

	public String getDoceNombre() {
		return doceNombre;
	}

	public void setDoceNombre(String doceNombre) {
		this.doceNombre = doceNombre;
	}

	public String getDoceApellido() {
		return doceApellido;
	}

	public void setDoceApellido(String doceApellido) {
		this.doceApellido = doceApellido;
	}


	public TipoDocumento getTdocId() {
		return tdocId;
	}

	public void setTdocId(TipoDocumento tdocId) {
		this.tdocId = tdocId;
	}

	public String getDoceDocumento() {
		return doceDocumento;
	}

	public void setDoceDocumento(String doceDocumento) {
		this.doceDocumento = doceDocumento;
	}

	public String getDoceDireccion() {
		return doceDireccion;
	}

	public void setDoceDireccion(String doceDireccion) {
		this.doceDireccion = doceDireccion;
	}

	public String getDoceCorreo() {
		return doceCorreo;
	}

	public void setDoceCorreo(String doceCorreo) {
		this.doceCorreo = doceCorreo;
	}

	public Integer getDoceTelCelular() {
		return doceTelCelular;
	}

	public void setDoceTelCelular(Integer doceTelCelular) {
		this.doceTelCelular = doceTelCelular;
	}

	public Integer getDoceTelCelular1() {
		return doceTelCelular1;
	}

	public void setDoceTelCelular1(Integer doceTelCelular1) {
		this.doceTelCelular1 = doceTelCelular1;
	}

	public String getDoceSede() {
		return doceSede;
	}

	public void setDoceSede(String doceSede) {
		this.doceSede = doceSede;
	}

	public String getDoceLugarNacimiento() {
		return doceLugarNacimiento;
	}

	public void setDoceLugarNacimiento(String doceLugarNacimiento) {
		this.doceLugarNacimiento = doceLugarNacimiento;
	}

	public Date getDoceFechaNacimiento() {
		return doceFechaNacimiento;
	}

	public void setDoceFechaNacimiento(Date doceFechaNacimiento) {
		this.doceFechaNacimiento = doceFechaNacimiento;
	}

	public String getDoceUsuario() {
		return doceUsuario;
	}

	public void setDoceUsuario(String doceUsuario) {
		this.doceUsuario = doceUsuario;
	}

	public String getDoceContrasena() {
		return doceContrasena;
	}

	public void setDoceContrasena(String doceContrasena) {
		this.doceContrasena = doceContrasena;
	}

	public RolUser getRolUser() {
		return rolUser;
	}

	public void setRolUser(RolUser rolUser) {
		this.rolUser = rolUser;
	}

	 
}
