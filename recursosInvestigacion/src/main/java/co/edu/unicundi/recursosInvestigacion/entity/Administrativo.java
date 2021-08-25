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
@Table(name = "administrativo")
public class Administrativo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer admi_id;
    
	@Column(name = "admi_codigo", nullable = false, length = 30)
    private Integer admiCodigo;
	
	@Size(min = 3, max = 20, message = "Debe tener entre 3 y 20 letras")
    @Column(name = "admi_nombre", nullable = false, length = 50)
    private String admiNombre;
	
	@Size(min = 4, max = 20, message = "Debe tener entre 4 y 20 letras")
    @Column(name = "admi_apellido", nullable = false, length = 50)
    private String admiApellido;
	
	@ManyToOne
	@JoinColumn(name = "tdoc_id", nullable = false, foreignKey = @ForeignKey(name = "ADMINISTRATIVO_FK1"))
	private TipoDocumento tdocId;
	
	@Size(min = 7, max = 15, message = "Debe tener entre 7 y 15 letras")
    @Column(name = "admi_documento", nullable = false, length = 30)
    private String admiDocumento;

	@ManyToOne
	@JoinColumn(name = "prac_id", nullable = false, foreignKey = @ForeignKey(name = "ADMINISTRATIVO_FK2"))
	private ProgramaAcademico pracId;
	
	@Size(min = 7, max = 15, message = "Debe tener entre 7 y 15 letras")
    @Column(name = "admi_direccion", nullable = false, length = 30)
    private String admiDireccion;
	
	@Size(min = 7, max = 15, message = "Debe tener entre 7 y 15 letras")
    @Column(name = "admi_correo", nullable = false, length = 30)
    private String admiCorreo;
	
	@Column(name = "admi_telcelular", nullable = false, length = 30)
    private Integer admiTelCelular;
	
	@Column(name = "admi_telcelular1", nullable = false, length = 30)
    private Integer admiTelCelular1;
	
	@Size(min = 7, max = 15, message = "Debe tener entre 7 y 15 letras")
    @Column(name = "admi_sede", nullable = false, length = 30)
    private String admiSede;
	
	@Size(min = 4, max = 15, message = "Debe tener entre 4 y 15 letras")
    @Column(name = "admi_lugarnacimiento", nullable = false, length = 30)
    private String admiLugarNacimiento;
	
	@Column(name = "admi_fechanacimiento", nullable = false)
    private Date admiFechaNacimiento;
	
	@Size(min = 7, max = 15, message = "Debe tener entre 7 y 15 letras")
    @Column(name = "admi_usuario", nullable = false, length = 30)
    private String admiUsuario;
	
	@Size(min = 7, max = 15, message = "Debe tener entre 7 y 15 letras")
    @Column(name = "admi_contrasena", nullable = false, length = 30)
    private String admiContrasena;
	
	@ManyToOne
	@JoinColumn(name = "rolu_id", nullable = false, foreignKey = @ForeignKey(name = "ADMINISTRATIVO_FK3"))
	private RolUser rolUser;

	public Integer getAdmi_id() {
		return admi_id;
	}

	public void setAdmi_id(Integer admi_id) {
		this.admi_id = admi_id;
	}

	public Integer getAdmiCodigo() {
		return admiCodigo;
	}

	public void setAdmiCodigo(Integer admiCodigo) {
		this.admiCodigo = admiCodigo;
	}

	public String getAdmiNombre() {
		return admiNombre;
	}

	public void setAdmiNombre(String admiNombre) {
		this.admiNombre = admiNombre;
	}

	public String getAdmiApellido() {
		return admiApellido;
	}

	public void setAdmiApellido(String admiApellido) {
		this.admiApellido = admiApellido;
	}

	public TipoDocumento getTdocId() {
		return tdocId;
	}

	public void setTdocId(TipoDocumento tdocId) {
		this.tdocId = tdocId;
	}

	public String getAdmiDocumento() {
		return admiDocumento;
	}

	public void setAdmiDocumento(String admiDocumento) {
		this.admiDocumento = admiDocumento;
	}

	public ProgramaAcademico getPracId() {
		return pracId;
	}

	public void setPracId(ProgramaAcademico pracId) {
		this.pracId = pracId;
	}

	public String getAdmiDireccion() {
		return admiDireccion;
	}

	public void setAdmiDireccion(String admiDireccion) {
		this.admiDireccion = admiDireccion;
	}

	public String getAdmiCorreo() {
		return admiCorreo;
	}

	public void setAdmiCorreo(String admiCorreo) {
		this.admiCorreo = admiCorreo;
	}

	public Integer getAdmiTelCelular() {
		return admiTelCelular;
	}

	public void setAdmiTelCelular(Integer admiTelCelular) {
		this.admiTelCelular = admiTelCelular;
	}

	public Integer getAdmiTelCelular1() {
		return admiTelCelular1;
	}

	public void setAdmiTelCelular1(Integer admiTelCelular1) {
		this.admiTelCelular1 = admiTelCelular1;
	}

	public String getAdmiSede() {
		return admiSede;
	}

	public void setAdmiSede(String admiSede) {
		this.admiSede = admiSede;
	}

	public String getAdmiLugarNacimiento() {
		return admiLugarNacimiento;
	}

	public void setAdmiLugarNacimiento(String admiLugarNacimiento) {
		this.admiLugarNacimiento = admiLugarNacimiento;
	}

	public Date getAdmiFechaNacimiento() {
		return admiFechaNacimiento;
	}

	public void setAdmiFechaNacimiento(Date admiFechaNacimiento) {
		this.admiFechaNacimiento = admiFechaNacimiento;
	}

	public String getAdmiUsuario() {
		return admiUsuario;
	}

	public void setAdmiUsuario(String admiUsuario) {
		this.admiUsuario = admiUsuario;
	}

	public String getAdmiContrasena() {
		return admiContrasena;
	}

	public void setAdmiContrasena(String admiContrasena) {
		this.admiContrasena = admiContrasena;
	}

	public RolUser getRolUser() {
		return rolUser;
	}

	public void setRolUser(RolUser rolUser) {
		this.rolUser = rolUser;
	}
	
}
