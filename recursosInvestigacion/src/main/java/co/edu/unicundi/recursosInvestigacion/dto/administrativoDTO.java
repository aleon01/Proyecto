package co.edu.unicundi.recursosInvestigacion.dto;

import java.sql.Date;

import co.edu.unicundi.recursosInvestigacion.entity.ProgramaAcademico;
import co.edu.unicundi.recursosInvestigacion.entity.RolUser;
import co.edu.unicundi.recursosInvestigacion.entity.TipoDocumento;

public class administrativoDTO {

	private Integer admi_id;
    
	private Integer admiCodigo;
	
	private String admiNombre;
	
	private String admiApellido;
	
	private TipoDocumento tdocId;
	
	private String admiDocumento;
	
	private ProgramaAcademico pracId;
	
	private String admiDireccion;
	
	private String admiCorreo;
	
	private Integer admiTelCelular;
	
	private Integer admiTelCelular1;
	
	private String admiSede;
	
	private String admiLugarNacimiento;
	
	private Date admiFechaNacimiento;
	
	private String admiUsuario;
	
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

	public RolUser getRolUser() {
		return rolUser;
	}

	public void setRolUser(RolUser rolUser) {
		this.rolUser = rolUser;
	}
	
}
