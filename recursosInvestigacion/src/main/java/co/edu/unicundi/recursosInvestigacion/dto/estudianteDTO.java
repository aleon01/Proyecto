package co.edu.unicundi.recursosInvestigacion.dto;

import java.sql.Date;

import co.edu.unicundi.recursosInvestigacion.entity.ProgramaAcademico;
import co.edu.unicundi.recursosInvestigacion.entity.RolUser;
import co.edu.unicundi.recursosInvestigacion.entity.TipoDocumento;

public class estudianteDTO {

	private Integer estu_id;
    
	private Integer estuCodigo;
	
	private String estuNombre;
	
	private String estuApellido;
	
	private TipoDocumento tdocId;
	
	private String estuDocumento;
	
	private ProgramaAcademico pracId;
	
	private String estuDireccion;
	
	private String estuCorreo;
	
	private Integer estuTelCelular;
	
	private Integer estuTelCelular1;
	
	private String estuSede;
	
	private String estuLugarNacimiento;
	
	private Date estuFechaNacimiento;
	
	private String estuUsuario;
	
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

	public String getEstuUsuario() {
		return estuUsuario;
	}

	public void setEstuUsuario(String estuUsuario) {
		this.estuUsuario = estuUsuario;
	}

	public RolUser getRolUser() {
		return rolUser;
	}

	public void setRolUser(RolUser rolUser) {
		this.rolUser = rolUser;
	}
	
	

}
