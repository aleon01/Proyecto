package co.edu.unicundi.recursosInvestigacion.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import co.edu.unicundi.recursosInvestigacion.entity.Docente;

@Repository
public interface IDocenteRepo extends JpaRepository<Docente, Integer>{

	@Transactional
	@Modifying
	@Query(value="Delete FROM Docente doce WHERE doce.rolUser.roluId = :roluId")
    public void eliminarDoce(@Param("roluId") Integer roluId);
	
	public Docente findByDoceCodigo(Integer doceCodigo);
		
	public Docente findByDoceDocumento(String doceDocumento);
	
	public Docente findByDoceUsuario(String doceUsuario);
		
	public Docente findByDoceUsuarioAndDoceContrasena(String doceUsuario, String doceContrasena);
		
	@Query(value="SELECT doce FROM Docente doce WHERE doce.doceUsuario = :doceUsuario AND doce.doceContrasena = :doceContrasena")
    public Docente consultarUsuarioAndContrasena(String doceUsuario, String doceContrasena);
	
}
