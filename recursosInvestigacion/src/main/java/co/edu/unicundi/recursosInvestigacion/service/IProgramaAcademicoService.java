package co.edu.unicundi.recursosInvestigacion.service;

import java.util.List;

import co.edu.unicundi.recursosInvestigacion.entity.ProgramaAcademico;
import co.edu.unicundi.recursosInvestigacion.exception.ModelNotFoundException;

public interface IProgramaAcademicoService {
	
	public List<ProgramaAcademico> retornar();

	public ProgramaAcademico retornarPorId(Integer id) throws ModelNotFoundException;

	public void guardar(ProgramaAcademico programa) throws ModelNotFoundException;

	public void editar(ProgramaAcademico programa) throws ModelNotFoundException;

	public void eliminar(Integer id) throws ModelNotFoundException;
}
