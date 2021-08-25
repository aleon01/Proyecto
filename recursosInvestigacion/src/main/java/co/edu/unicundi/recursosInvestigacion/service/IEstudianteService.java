package co.edu.unicundi.recursosInvestigacion.service;

import java.util.List;

import co.edu.unicundi.recursosInvestigacion.dto.estudianteDTO;
import co.edu.unicundi.recursosInvestigacion.entity.Estudiante;
import co.edu.unicundi.recursosInvestigacion.exception.ModelNotFoundException;

public interface IEstudianteService {

	public List<estudianteDTO> retornar();

	public estudianteDTO retornarPorId(Integer id) throws ModelNotFoundException;

	public void guardar(Estudiante user) throws ModelNotFoundException;

	public void editar(Estudiante user) throws ModelNotFoundException;

	public void eliminar(Integer id) throws ModelNotFoundException;
		
}
