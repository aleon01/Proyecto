package co.edu.unicundi.recursosInvestigacion.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicundi.recursosInvestigacion.entity.TipoDocumento;
import co.edu.unicundi.recursosInvestigacion.exception.ModelNotFoundException;
import co.edu.unicundi.recursosInvestigacion.repository.ITipoDocumentoRepo;
import co.edu.unicundi.recursosInvestigacion.service.ITipoDocumentoService;

@Service
public class TipoDocumentoServiceImp implements ITipoDocumentoService{

	@Autowired
	private ITipoDocumentoRepo repo;
	
	@Override
	public List<TipoDocumento> retornar() {
		List<TipoDocumento> listaTipoR = repo.findAll();
		return listaTipoR;
	}

	@Override
	public TipoDocumento retornarPorId(Integer id) throws ModelNotFoundException {
		TipoDocumento tipoD = repo.findById(id).orElseThrow(() -> new ModelNotFoundException("Tipo de Documento no encontrado"));
		return tipoD;
	}

	@Override
	public void guardar(TipoDocumento tipod) throws ModelNotFoundException {
		Optional<TipoDocumento> optional = repo.findById(tipod.getTdocId());
		if (optional.isPresent()) {
			throw new ModelNotFoundException("Este tipo de documento ya existe");
		}else {
			repo.save(tipod);
		}
	}

	@Override
	public void editar(TipoDocumento tipod) throws ModelNotFoundException {
		Optional<TipoDocumento> optional = repo.findById(tipod.getTdocId());
		TipoDocumento tDoc;
		if (optional.isPresent()) {
			tDoc = optional.get();
			tDoc.setTdocNombre(tipod.getTdocNombre());
			repo.save(tDoc);	
		}else {
			throw new ModelNotFoundException("Tipo de Documento no existe");
		}
	}

	@Override
	public void eliminar(Integer id) throws ModelNotFoundException {
		Optional<TipoDocumento> optional = repo.findById(id);
		if (optional.isPresent()) {
			repo.deleteById(id);
		}else {
			throw new ModelNotFoundException("Tipo de documento no existe");
		}
	}

}
