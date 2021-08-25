package co.edu.unicundi.recursosInvestigacion.service.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.unicundi.recursosInvestigacion.dto.estudianteDTO;
import co.edu.unicundi.recursosInvestigacion.entity.Estudiante;
import co.edu.unicundi.recursosInvestigacion.entity.RolUser;
import co.edu.unicundi.recursosInvestigacion.exception.ModelNotFoundException;
import co.edu.unicundi.recursosInvestigacion.repository.IEstudianteRepo;
import co.edu.unicundi.recursosInvestigacion.repository.IRolUserRepo;
import co.edu.unicundi.recursosInvestigacion.service.IEstudianteService;

@Service
public class EstudianteServiceImp implements IEstudianteService{

	@Autowired
	private IEstudianteRepo repo;

	@Autowired
	private IRolUserRepo repoRol;
	
	@Override
	public List<estudianteDTO> retornar() {
		List<Estudiante> listaUser = repo.findAll();
		List<estudianteDTO> DTOuser = new ArrayList<>();
		for(Estudiante listUsuario : listaUser) {
			 ModelMapper modelMapper = new ModelMapper();
			 estudianteDTO dtousuarios = modelMapper.map(listUsuario, estudianteDTO.class);
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
	public estudianteDTO retornarPorId(Integer id) throws ModelNotFoundException {
		Optional<Estudiante> optional = repo.findById(id);
		Estudiante user;
		estudianteDTO dtouser;
		if (optional.isPresent()) {
			user = optional.get();
			ModelMapper modelMapper = new ModelMapper();
			dtouser = modelMapper.map(user, estudianteDTO.class);
			dtouser.getTdocId().setEstudiante(null);
			dtouser.getTdocId().setAdministrativo(null);
			dtouser.getTdocId().setDocente(null);
			dtouser.getPracId().setEstudiante(null);
			dtouser.getPracId().setAdministrativo(null);
			dtouser.getRolUser().setEstudiante(null);
			dtouser.getRolUser().setDocente(null);
			dtouser.getRolUser().setAdministrativo(null);
		} else {
			throw new ModelNotFoundException("Estudiante no existe");
		}
		return dtouser;
	}

	@Override
	public void guardar(Estudiante user) throws ModelNotFoundException {
		Estudiante userCod = repo.findByEstuCodigo(user.getEstuCodigo());
		if(userCod == null) {
			
		}else {
			throw new ModelNotFoundException("El codigo del usuario ya existe");
		}
		//-----
		Estudiante userIden = repo.findByEstuDocumento(user.getEstuDocumento());
		if(userIden == null) {	
			
		}else {
			throw new ModelNotFoundException("El documeto del estudiante ya existe");
		}
		//-----
		//Valida el ROl
		Optional<RolUser> rolu = repoRol.findById(user.getRolUser().getRoluId());
		if(rolu.isPresent()) {
			
		}else {
			throw new ModelNotFoundException("El Rol no existe");
		}
		//-----
		
		repo.save(user);
	}

	@Override
	public void editar(Estudiante user) throws ModelNotFoundException {
		Optional<Estudiante> optional = repo.findById(user.getEstu_id());
		Estudiante userBus;
		if (optional.isPresent()) {
			userBus = optional.get();
			
			userBus.setEstuCodigo(user.getEstuCodigo());
			userBus.setEstuNombre(user.getEstuNombre());
			userBus.setEstuApellido(user.getEstuApellido());
			userBus.setTdocId(user.getTdocId());
			userBus.setEstuDocumento(user.getEstuDocumento());
			userBus.setPracId(user.getPracId());
			userBus.setEstuDireccion(user.getEstuDireccion());
			userBus.setEstuCorreo(user.getEstuCorreo());
			userBus.setEstuTelCelular(user.getEstuTelCelular());
			userBus.setEstuTelCelular1(user.getEstuTelCelular1());
			userBus.setEstuSede(user.getEstuSede());
			userBus.setEstuLugarNacimiento(user.getEstuLugarNacimiento());
			userBus.setEstuFechaNacimiento(user.getEstuFechaNacimiento());
			
			repo.save(userBus);
		}else {
			throw new ModelNotFoundException("Estu no existe");
		}
		
	}

	@Override
	public void eliminar(Integer id) throws ModelNotFoundException {
		Optional<Estudiante> user = repo.findById(id);
		if(user.isPresent()) {
			repo.deleteById(id);	
		}else {
			new ModelNotFoundException("Usuario no se encontra Registrado");
		}
		
	}
	
}
