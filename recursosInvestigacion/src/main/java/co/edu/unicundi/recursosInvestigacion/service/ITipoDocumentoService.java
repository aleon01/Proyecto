package co.edu.unicundi.recursosInvestigacion.service;

import java.util.List;

import co.edu.unicundi.recursosInvestigacion.entity.TipoDocumento;
import co.edu.unicundi.recursosInvestigacion.exception.ModelNotFoundException;

public interface ITipoDocumentoService {
	
	public List<TipoDocumento> retornar();

	public TipoDocumento retornarPorId(Integer id) throws ModelNotFoundException;

	public void guardar(TipoDocumento tipor) throws ModelNotFoundException;

	public void editar(TipoDocumento tipor) throws ModelNotFoundException;

	public void eliminar(Integer id) throws ModelNotFoundException;
	
}
