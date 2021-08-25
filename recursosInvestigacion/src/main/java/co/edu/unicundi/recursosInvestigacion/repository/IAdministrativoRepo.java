package co.edu.unicundi.recursosInvestigacion.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.edu.unicundi.recursosInvestigacion.entity.Administrativo;

@Repository
public interface IAdministrativoRepo extends JpaRepository<Administrativo, Integer>{

	@Transactional
	@Modifying
	@Query(value="Delete FROM Administrativo admi WHERE admi.rolUser.roluId = :roluId")
    public void eliminarUser(@Param("roluId") Integer roluId);
	
	public Administrativo findByAdmiCodigo(Integer admiCodigo);
		
	public Administrativo findByAdmiDocumento(String admiDocumento);
	
	public Administrativo findByAdmiUsuario(String admiUsuario);
	
	public Administrativo findByAdmiUsuarioAndAdmiContrasena(String admiUsuario, String admiContrasena);
	
	@Query(value="SELECT admi FROM Administrativo admi WHERE admi.admiUsuario = :admiUsuario AND admi.admiContrasena = :admiContrasena")
    public Administrativo consultarUsuarioAndContrasena(String admiUsuario, String admiContrasena);
	
}
