package co.edu.unicundi.recursosInvestigacion.service;

import java.util.List;

import co.edu.unicundi.recursosInvestigacion.dto.docenteDTO;
import co.edu.unicundi.recursosInvestigacion.entity.Docente;
import co.edu.unicundi.recursosInvestigacion.exception.ModelNotFoundException;

public interface IDocenteService {

	public List<docenteDTO> retornar();

	public docenteDTO retornarPorId(Integer id) throws ModelNotFoundException;

	public void guardar(Docente user) throws ModelNotFoundException;

	public void editar(Docente user) throws ModelNotFoundException;

	public void eliminar(Integer id) throws ModelNotFoundException;
	
	public docenteDTO findByDoceUsuarioAndDoceContrasena(String doceUsuario, String doceContrasena)  throws ModelNotFoundException ;
	
    public docenteDTO consultarUsuarioAndContrasena(String doceUsuario, String doceContrasena)  throws ModelNotFoundException ;

}
