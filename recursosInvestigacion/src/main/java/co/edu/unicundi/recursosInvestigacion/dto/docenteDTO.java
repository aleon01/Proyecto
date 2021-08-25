package co.edu.unicundi.recursosInvestigacion.dto;

import java.sql.Date;

import co.edu.unicundi.recursosInvestigacion.entity.RolUser;
import co.edu.unicundi.recursosInvestigacion.entity.TipoDocumento;

public class docenteDTO {

	private Integer doceId;
    
	private Integer doceCodigo;
	
	private String doceNombre;
	
	private String doceApellido;
	
	private TipoDocumento tdocId;
	
	private String doceDocumento;
	
	private String doceDireccion;
	
	private String doceCorreo;
	
	private Integer doceTelCelular;
	
	private Integer doceTelCelular1;
	
	private String doceSede;
	
	private String doceLugarNacimiento;
	
	private Date doceFechaNacimiento;
	
	private String doceUsuario;
	
	private RolUser rolUser;

	public Integer getDoceId() {
		return doceId;
	}

	public void setDoceId(Integer doceId) {
		this.doceId = doceId;
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

	public RolUser getRolUser() {
		return rolUser;
	}

	public void setRolUser(RolUser rolUser) {
		this.rolUser = rolUser;
	}

	
}
