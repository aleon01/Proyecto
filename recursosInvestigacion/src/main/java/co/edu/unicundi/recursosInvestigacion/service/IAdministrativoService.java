package co.edu.unicundi.recursosInvestigacion.service;

import java.util.List;

import co.edu.unicundi.recursosInvestigacion.dto.administrativoDTO;
import co.edu.unicundi.recursosInvestigacion.entity.Administrativo;
import co.edu.unicundi.recursosInvestigacion.exception.ModelNotFoundException;

public interface IAdministrativoService {
	
	public List<administrativoDTO> retornar();

	public administrativoDTO retornarPorId(Integer id) throws ModelNotFoundException;

	public void guardar(Administrativo user) throws ModelNotFoundException;

	public void editar(Administrativo user) throws ModelNotFoundException;

	public void eliminar(Integer id) throws ModelNotFoundException;
	
	public administrativoDTO findByAdmiUsuarioAndAdmiContrasena(String admiUsuario, String admiContrasena)  throws ModelNotFoundException ;
	
    public administrativoDTO consultarUsuarioAndContrasena(String admiUsuario, String admiContrasena)  throws ModelNotFoundException ;

}
