package co.edu.unicundi.recursosInvestigacion.service.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicundi.recursosInvestigacion.dto.docenteDTO;
import co.edu.unicundi.recursosInvestigacion.entity.Docente;
import co.edu.unicundi.recursosInvestigacion.entity.RolUser;
import co.edu.unicundi.recursosInvestigacion.exception.ModelNotFoundException;
import co.edu.unicundi.recursosInvestigacion.repository.IDocenteRepo;
import co.edu.unicundi.recursosInvestigacion.repository.IRolUserRepo;
import co.edu.unicundi.recursosInvestigacion.service.IDocenteService;

@Service
public class DocenteServiceImp implements IDocenteService{

	@Autowired
	private IDocenteRepo repo;

	@Autowired
	private IRolUserRepo repoRol;
	
	@Override
	public List<docenteDTO> retornar() {
		List<Docente> listaUser = repo.findAll();
		List<docenteDTO> DTOuser = new ArrayList<>();
		for(Docente listUsuario : listaUser) {
			 ModelMapper modelMapper = new ModelMapper();
			 docenteDTO dtousuarios = modelMapper.map(listUsuario, docenteDTO.class);
			 dtousuarios.getTdocId().setEstudiante(null);
			 dtousuarios.getTdocId().setAdministrativo(null);
			 dtousuarios.getTdocId().setDocente(null);
			 dtousuarios.getRolUser().setEstudiante(null);
			 dtousuarios.getRolUser().setDocente(null);
			 dtousuarios.getRolUser().setAdministrativo(null);
           DTOuser.add(dtousuarios);
			 
		}
		return DTOuser;
	}

	@Override
	public docenteDTO retornarPorId(Integer id) throws ModelNotFoundException {
		Optional<Docente> optional = repo.findById(id);
		Docente user;
		docenteDTO dtouser;
		if (optional.isPresent()) {
			user = optional.get();
			ModelMapper modelMapper = new ModelMapper();
			dtouser = modelMapper.map(user, docenteDTO.class);
			dtouser.getTdocId().setEstudiante(null);
			dtouser.getTdocId().setAdministrativo(null);
			dtouser.getTdocId().setDocente(null);
			dtouser.getRolUser().setEstudiante(null);
			dtouser.getRolUser().setDocente(null);
			dtouser.getRolUser().setAdministrativo(null);
		} else {
			throw new ModelNotFoundException("Docente no existe");
		}
		return dtouser;
	}

	@Override
	public void guardar(Docente user) throws ModelNotFoundException {
		Docente userCod = repo.findByDoceCodigo(user.getDoceCodigo());
		if(userCod == null) {
			
		}else {
			throw new ModelNotFoundException("El codigo del usuario ya existe");
		}
		//-----
		Docente userIden = repo.findByDoceDocumento(user.getDoceDocumento());
		if(userIden == null) {	
			
		}else {
			throw new ModelNotFoundException("El documeto del docente ya existe");
		}
		//-----
		//Valida el ROl
		Optional<RolUser> rolu = repoRol.findById(user.getRolUser().getRoluId());
		if(rolu.isPresent()) {
			
		}else {
			throw new ModelNotFoundException("El Rol no existe");
		}
		//-----
		Docente userUser = repo.findByDoceUsuario(user.getDoceUsuario());
		if(userUser == null) {
			
		}else {
			throw new ModelNotFoundException("Este usuario ya existe");
		}		
		repo.save(user);
		
	}

	@Override
	public void editar(Docente user) throws ModelNotFoundException {
		Optional<Docente> optional = repo.findById(user.getDoce_id());
		Docente userBus;
		if (optional.isPresent()) {
			userBus = optional.get();
			
			userBus.setDoceCodigo(user.getDoceCodigo());
			userBus.setDoceNombre(user.getDoceNombre());
			userBus.setDoceApellido(user.getDoceApellido());
			userBus.setTdocId(user.getTdocId());
			userBus.setDoceDocumento(user.getDoceDocumento());
			userBus.setDoceDireccion(user.getDoceDireccion());
			userBus.setDoceCorreo(user.getDoceCorreo());
			userBus.setDoceTelCelular(user.getDoceTelCelular());
			userBus.setDoceTelCelular1(user.getDoceTelCelular1());
			userBus.setDoceSede(user.getDoceSede());
			userBus.setDoceLugarNacimiento(user.getDoceLugarNacimiento());
			userBus.setDoceFechaNacimiento(user.getDoceFechaNacimiento());
			userBus.setDoceUsuario(user.getDoceUsuario());
			userBus.setDoceContrasena(user.getDoceContrasena());
			//VALIDA ROL
			Optional<RolUser> rolu = repoRol.findById(user.getRolUser().getRoluId());
			if(rolu.isPresent()) {
				
			} else {
				throw new ModelNotFoundException("Rol no existe");
			}
			repo.save(userBus);
		}else {
			throw new ModelNotFoundException("Doce no existe");
		}
	}

	@Override
	public void eliminar(Integer id) throws ModelNotFoundException {
		Optional<Docente> user = repo.findById(id);
		if(user.isPresent()) {
			repo.deleteById(id);	
		}else {
			new ModelNotFoundException("Usuario no se encontra Registrado");
		}

	}

	@Override
	public docenteDTO findByDoceUsuarioAndDoceContrasena(String doceUsuario, String doceContrasena)
			throws ModelNotFoundException {
		Docente optional = repo.findByDoceUsuarioAndDoceContrasena(doceUsuario, doceContrasena);
		docenteDTO dtouser;
		if (optional != null) {
			
			ModelMapper modelMapper = new ModelMapper();
			dtouser = modelMapper.map(optional, docenteDTO.class);
			dtouser.getRolUser().setEstudiante(null);
			dtouser.getRolUser().setDocente(null);
			dtouser.getRolUser().setAdministrativo(null);
		} else {
			throw new ModelNotFoundException("Usuario no existe");
		}
		return dtouser;
	}

	@Override
	public docenteDTO consultarUsuarioAndContrasena(String doceUsuario, String doceContrasena)
			throws ModelNotFoundException {
		Docente optional = repo.consultarUsuarioAndContrasena(doceUsuario, doceContrasena);;
		docenteDTO dtouser;
		if (optional != null) {
			
			ModelMapper modelMapper = new ModelMapper();
			dtouser = modelMapper.map(optional, docenteDTO.class);
			dtouser.getRolUser().setEstudiante(null);
			dtouser.getRolUser().setDocente(null);
			dtouser.getRolUser().setAdministrativo(null);
		} else {
			throw new ModelNotFoundException("Usuario no existe");
		}
		return dtouser;
	}

}
