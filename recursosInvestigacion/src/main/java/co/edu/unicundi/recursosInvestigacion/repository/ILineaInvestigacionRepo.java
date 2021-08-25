package co.edu.unicundi.recursosInvestigacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.edu.unicundi.recursosInvestigacion.entity.LineaInvestigacion;


@Repository
public interface ILineaInvestigacionRepo extends JpaRepository<LineaInvestigacion, Integer>{

	
	
}
