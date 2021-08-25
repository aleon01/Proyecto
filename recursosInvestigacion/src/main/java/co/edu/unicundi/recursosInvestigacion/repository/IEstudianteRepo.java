package co.edu.unicundi.recursosInvestigacion.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import co.edu.unicundi.recursosInvestigacion.entity.Estudiante;

@Repository
public interface IEstudianteRepo extends JpaRepository<Estudiante, Integer>{

	@Transactional
	@Modifying
	@Query(value="Delete FROM Estudiante estu WHERE estu.rolUser.roluId = :roluId")
    public void eliminarEstu(@Param("roluId") Integer roluId);
	
	public Estudiante findByEstuCodigo(Integer estuCodigo);
		
	public Estudiante findByEstuDocumento(String estuDocumento);
	
	/*public Estudiante findByEstuUsuario(String estuUsuario);
		
	public Estudiante findByEstuUsuarioAndEstuContrasena(String estuUsuario, String estuContrasena);
		
	@Query(value="SELECT estu FROM Estudiante estu WHERE estu.estuUsuario = :estuUsuario AND estu.estuContrasena = :estuContrasena")
    public Estudiante consultarUsuarioAndContrasena(String estuUsuario, String estuContrasena);*/
	
}
