package co.edu.unicundi.recursosInvestigacion.service.imp;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.unicundi.recursosInvestigacion.entity.ProgramaAcademico;
import co.edu.unicundi.recursosInvestigacion.exception.ModelNotFoundException;
import co.edu.unicundi.recursosInvestigacion.repository.IProgramaAcademicoRepo;
import co.edu.unicundi.recursosInvestigacion.service.IProgramaAcademicoService;


@Service
public class ProgramaAcademicoServiceImp implements IProgramaAcademicoService{

	@Autowired
	private IProgramaAcademicoRepo repo;
	
	@Override
	public List<ProgramaAcademico> retornar() {
		List<ProgramaAcademico> listaPrograma = repo.findAll();
		return listaPrograma;
	}

	@Override
	public ProgramaAcademico retornarPorId(Integer id) throws ModelNotFoundException {
		ProgramaAcademico programa = repo.findById(id).orElseThrow(() -> new ModelNotFoundException("Programa academico no encontrado"));
		return programa;
	}

	@Override
	public void guardar(ProgramaAcademico programa) throws ModelNotFoundException {
		Optional<ProgramaAcademico> optional = repo.findById(programa.getPracId());
		if (optional.isPresent()) {
			throw new ModelNotFoundException("Este Programa academico ya existe");
		}else {
			repo.save(programa);
		}
	}

	@Override
	public void editar(ProgramaAcademico programa) throws ModelNotFoundException {
		Optional<ProgramaAcademico> optional = repo.findById(programa.getPracId());
		ProgramaAcademico ProgramaAca;
		if (optional.isPresent()) {
			ProgramaAca = optional.get();
			ProgramaAca.setPracNombre(programa.getPracNombre());
			repo.save(ProgramaAca);	
		}else {
			throw new ModelNotFoundException("Programa academico no existe");
		}
		
	}

	@Override
	public void eliminar(Integer id) throws ModelNotFoundException {
		Optional<ProgramaAcademico> optional = repo.findById(id);
		if (optional.isPresent()) {
			repo.deleteById(id);
		}else {
			throw new ModelNotFoundException("Programa academico no existe");
		}
		
	}

}
