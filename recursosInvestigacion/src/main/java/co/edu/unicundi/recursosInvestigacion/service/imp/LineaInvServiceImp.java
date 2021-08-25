package co.edu.unicundi.recursosInvestigacion.service.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.unicundi.recursosInvestigacion.dto.lineasDTO;
import co.edu.unicundi.recursosInvestigacion.entity.LineaInvestigacion;
import co.edu.unicundi.recursosInvestigacion.exception.ModelNotFoundException;
import co.edu.unicundi.recursosInvestigacion.repository.ILineaInvestigacionRepo;
import co.edu.unicundi.recursosInvestigacion.service.ILineaInvService;

@Service
public class LineaInvServiceImp implements ILineaInvService{

	@Autowired
	private ILineaInvestigacionRepo repo;
	
	@Override
	public List<lineasDTO> retornar() {
		List<LineaInvestigacion> listaLineas = repo.findAll();
		List<lineasDTO> DTOlineas = new ArrayList<>();
		for(LineaInvestigacion listLinea : listaLineas) {
			 ModelMapper modelMapper = new ModelMapper();
			 lineasDTO dtolinea = modelMapper.map(listLinea, lineasDTO.class);
			 dtolinea.getPracId().setAdministrativo(null);
			 dtolinea.getPracId().setEstudiante(null);
		}
		return DTOlineas;
	}

	@Override
	public lineasDTO retornarPorId(Integer id) throws ModelNotFoundException {
		Optional<LineaInvestigacion> optional = repo.findById(id);
		LineaInvestigacion Lineas;
		lineasDTO dtoLinea;
		if(optional.isPresent()) {
			Lineas = optional.get();
			ModelMapper modelMapper = new ModelMapper();
			dtoLinea = modelMapper.map(Lineas, lineasDTO.class);
			dtoLinea.getPracId().setAdministrativo(null);
			dtoLinea.getPracId().setEstudiante(null);
		} else {
			throw new ModelNotFoundException("Linea no existe");
		}
			
		return dtoLinea;
	}

	@Override
	public void guardar(LineaInvestigacion Lineas) throws ModelNotFoundException {
		repo.save(Lineas);	
	}

	@Override
	public void editar(LineaInvestigacion Lineas) throws ModelNotFoundException {
		Optional<LineaInvestigacion> optional = repo.findById(Lineas.getLiinId());
		LineaInvestigacion lineasBus;
		if (optional.isPresent()) {
			lineasBus = optional.get();
			
			lineasBus.setPracId(Lineas.getPracId());
			lineasBus.setLiinCodigo(Lineas.getLiinCodigo());
			lineasBus.setLiinNombre(Lineas.getLiinNombre());
			lineasBus.setLiinObjetivo(Lineas.getLiinObjetivo());
			lineasBus.setLiinDescripcion(Lineas.getLiinDescripcion());
			lineasBus.setLiinAval(Lineas.getLiinAval());
			
			repo.save(lineasBus);
		}else {
			throw new ModelNotFoundException("Linea no existe");
		}
	}

	@Override
	public void eliminar(Integer id) throws ModelNotFoundException {
		Optional<LineaInvestigacion> lineas = repo.findById(id);
		if(lineas.isPresent()) {
			repo.deleteById(id);
		}else {
			throw new ModelNotFoundException("No existe una Linea con ese ID");
		}
	}

}
