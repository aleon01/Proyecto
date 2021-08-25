package co.edu.unicundi.recursosInvestigacion.service.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicundi.recursosInvestigacion.dto.administrativoDTO;
import co.edu.unicundi.recursosInvestigacion.entity.Administrativo;
import co.edu.unicundi.recursosInvestigacion.entity.RolUser;
import co.edu.unicundi.recursosInvestigacion.exception.ModelNotFoundException;
import co.edu.unicundi.recursosInvestigacion.repository.IAdministrativoRepo;
import co.edu.unicundi.recursosInvestigacion.repository.IRolUserRepo;
import co.edu.unicundi.recursosInvestigacion.service.IAdministrativoService;

@Service
public class AdministrativoServiceImp implements IAdministrativoService{

	@Autowired
	private IAdministrativoRepo repo;

	@Autowired
	private IRolUserRepo repoRol;
	
	@Override
	public List<administrativoDTO> retornar() { 
		List<Administrativo> listaUser = repo.findAll();
		List<administrativoDTO> DTOuser = new ArrayList<>();
		for(Administrativo listUsuario : listaUser) {
			 ModelMapper modelMapper = new ModelMapper();
			 administrativoDTO dtousuarios = modelMapper.map(listUsuario, administrativoDTO.class);
			 dtousuarios.getTdocId().setEstudiante(null);
			 dtousuarios.getTdocId().setAdministrativo(null);
			 dtousuarios.getTdocId().setDocente(null);
			 dtousuarios.getPracId().setEstudiante(null);
			 dtousuarios.getPracId().setAdministrativo(null);
			 dtousuarios.getRolUser().setEstudiante(null);
			 dtousuarios.getRolUser().setDocente(null);
			 dtousuarios.getRolUser().setAdministrativo(null);
           DTOuser.add(dtousuarios);
			 
		}
		return DTOuser;
	}

	@Override
	public administrativoDTO retornarPorId(Integer id) throws ModelNotFoundException {
		Optional<Administrativo> optional = repo.findById(id);
		Administrativo user;
		administrativoDTO dtouser;
		if (optional.isPresent()) {
			user = optional.get();
			ModelMapper modelMapper = new ModelMapper();
			dtouser = modelMapper.map(user, administrativoDTO.class);
			dtouser.getTdocId().setEstudiante(null);
			dtouser.getTdocId().setAdministrativo(null);
			dtouser.getTdocId().setDocente(null);
			dtouser.getPracId().setEstudiante(null);
			dtouser.getPracId().setAdministrativo(null);
			dtouser.getRolUser().setEstudiante(null);
			dtouser.getRolUser().setDocente(null);
			dtouser.getRolUser().setAdministrativo(null);
		} else {
			throw new ModelNotFoundException("Admi no existe");
		}
		return dtouser;
	}

	@Override
	public void guardar(Administrativo user) throws ModelNotFoundException {
		Administrativo userCod = repo.findByAdmiCodigo(user.getAdmiCodigo());
		if(userCod == null) {
			
		}else {
			throw new ModelNotFoundException("El codigo del usuario ya existe");
		}
		//-----
		Administrativo userIden = repo.findByAdmiDocumento(user.getAdmiDocumento());
		if(userIden == null) {	
			
		}else {
			throw new ModelNotFoundException("El documeto del Admi ya existe");
		}
		//-----
		//Valida el ROl
		Optional<RolUser> rolu = repoRol.findById(user.getRolUser().getRoluId());
		if(rolu.isPresent()) {
			
		}else {
			throw new ModelNotFoundException("El Rol no existe");
		}
		//-----
		Administrativo userUser = repo.findByAdmiUsuario(user.getAdmiUsuario());
		if(userUser == null) {
			
		}else {
			throw new ModelNotFoundException("Este usuario ya existe");
		}		
		repo.save(user);
	}

	@Override
	public void editar(Administrativo user) throws ModelNotFoundException {
		Optional<Administrativo> optional = repo.findById(user.getAdmi_id());
		Administrativo userBus;
		if (optional.isPresent()) {
			userBus = optional.get();
			
			userBus.setAdmiCodigo(user.getAdmiCodigo());
			userBus.setAdmiNombre(user.getAdmiNombre());
			userBus.setAdmiApellido(user.getAdmiApellido());
			userBus.setTdocId(user.getTdocId());
			userBus.setAdmiDocumento(user.getAdmiDocumento());
			userBus.setPracId(user.getPracId());
			userBus.setAdmiDireccion(user.getAdmiDireccion());
			userBus.setAdmiCorreo(user.getAdmiCorreo());
			userBus.setAdmiTelCelular(user.getAdmiTelCelular());
			userBus.setAdmiTelCelular1(user.getAdmiTelCelular1());
			userBus.setAdmiSede(user.getAdmiSede());
			userBus.setAdmiLugarNacimiento(user.getAdmiLugarNacimiento());
			userBus.setAdmiFechaNacimiento(user.getAdmiFechaNacimiento());
			userBus.setAdmiUsuario(user.getAdmiUsuario());
			
			repo.save(userBus);
		}else {
			throw new ModelNotFoundException("Estu no existe");
		}
	}

	@Override
	public void eliminar(Integer id) throws ModelNotFoundException {
		Optional<Administrativo> user = repo.findById(id);
		if(user.isPresent()) {
			repo.deleteById(id);	
		}else {
			new ModelNotFoundException("Usuario no se encontra Registrado");
		}
	}

	@Override
	public administrativoDTO findByAdmiUsuarioAndAdmiContrasena(String admiUsuario, String admiContrasena)
			throws ModelNotFoundException {
		Administrativo optional = repo.findByAdmiUsuarioAndAdmiContrasena(admiContrasena, admiContrasena);
		administrativoDTO dtouser;
		if (optional != null) {
			
			ModelMapper modelMapper = new ModelMapper();
			dtouser = modelMapper.map(optional, administrativoDTO.class);
			dtouser.getRolUser().setEstudiante(null);
			dtouser.getRolUser().setDocente(null);
			dtouser.getRolUser().setAdministrativo(null);
		} else {
			throw new ModelNotFoundException("Usuario no existe");
		}
		return dtouser;
		
	}

	@Override
	public administrativoDTO consultarUsuarioAndContrasena(String admiUsuario, String admiContrasena)
			throws ModelNotFoundException {
		Administrativo optional = repo.consultarUsuarioAndContrasena(admiUsuario, admiContrasena);;
		administrativoDTO dtouser;
		if (optional != null) {
			
			ModelMapper modelMapper = new ModelMapper();
			dtouser = modelMapper.map(optional, administrativoDTO.class);
			dtouser.getRolUser().setEstudiante(null);
			dtouser.getRolUser().setDocente(null);
			dtouser.getRolUser().setAdministrativo(null);
		} else {
			throw new ModelNotFoundException("Usuario no existe");
		}
		return dtouser;
	}

}
