package co.edu.unicundi.recursosInvestigacion.service;

import java.util.List;

import co.edu.unicundi.recursosInvestigacion.dto.lineasDTO;
import co.edu.unicundi.recursosInvestigacion.entity.LineaInvestigacion;
import co.edu.unicundi.recursosInvestigacion.exception.ModelNotFoundException;

public interface ILineaInvService {

	public List<lineasDTO> retornar();

	public lineasDTO retornarPorId(Integer id) throws ModelNotFoundException;

	public void guardar(LineaInvestigacion recurso) throws ModelNotFoundException;

	public void editar(LineaInvestigacion recurso) throws ModelNotFoundException;

	public void eliminar(Integer id) throws ModelNotFoundException;
}
