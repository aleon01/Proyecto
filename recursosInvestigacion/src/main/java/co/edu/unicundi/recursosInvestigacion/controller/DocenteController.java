package co.edu.unicundi.recursosInvestigacion.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicundi.recursosInvestigacion.dto.docenteDTO;
import co.edu.unicundi.recursosInvestigacion.entity.Docente;
import co.edu.unicundi.recursosInvestigacion.exception.ModelNotFoundException;
import co.edu.unicundi.recursosInvestigacion.service.IDocenteService;

@RestController
@RequestMapping("/docente")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class DocenteController {

	@Autowired
	private IDocenteService service;
	
	@GetMapping("/retornaAdmiPassJPQL/{user}/{pass}")
	public ResponseEntity<?> retornaUserPass(@PathVariable String user, @PathVariable String pass) throws ModelNotFoundException{
			docenteDTO userUsuario = service.consultarUsuarioAndContrasena(user, pass);
			return new ResponseEntity<docenteDTO>(userUsuario, HttpStatus.OK);			
	}
	
	@GetMapping("/retornaUserPassFind/{user}/{pass}")
	public ResponseEntity<?> retornaUserPassFind(@PathVariable String user, @PathVariable String pass) throws ModelNotFoundException{
		docenteDTO userUsuario = service.findByDoceUsuarioAndDoceContrasena(user, pass);
			return new ResponseEntity<docenteDTO>(userUsuario, HttpStatus.OK);			
	}
	
	@GetMapping("/retornar")
	public ResponseEntity<?> retornar() {
			List<docenteDTO> listaUser = service.retornar();
			return new ResponseEntity<List<docenteDTO>>(listaUser, HttpStatus.OK);			
	}	
	
	@GetMapping("/retornaPorId/{id}")
	public ResponseEntity<?> retornarPorId(@PathVariable int id) throws ModelNotFoundException{
		docenteDTO user = service.retornarPorId(id);
			return new ResponseEntity<docenteDTO>(user, HttpStatus.OK);			
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardar(@Valid @RequestBody Docente usuario) throws ModelNotFoundException {	
			service.guardar(usuario);
			return new ResponseEntity<Object>("", HttpStatus.CREATED);				
	}
	
	@PutMapping("/editar")
	public ResponseEntity<?> editar(@Valid @RequestBody Docente usuario) throws ModelNotFoundException{	
			service.editar(usuario);
			return new ResponseEntity<Object>("", HttpStatus.OK);				
	}	
	
	@DeleteMapping("eliminar/{id}") 
	public ResponseEntity<Object> elimianr(@PathVariable int id) throws ModelNotFoundException{
		service.eliminar(id);
		return new ResponseEntity<Object>("", HttpStatus.NO_CONTENT);
	}	

}
