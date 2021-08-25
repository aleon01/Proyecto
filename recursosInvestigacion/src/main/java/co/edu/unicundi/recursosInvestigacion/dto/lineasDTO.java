package co.edu.unicundi.recursosInvestigacion.dto;


import co.edu.unicundi.recursosInvestigacion.entity.ProgramaAcademico;

public class lineasDTO {

	private Integer liinId;
	
	private ProgramaAcademico pracId;
	
	private Integer liinCodigo;
	
	private String liinNombre;
	
	private String liinObjetivo;

	private String liinDescripcion;
	
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
