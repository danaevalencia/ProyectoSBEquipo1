package org.lhdmi.ecommerce.misb.controller;

import java.util.List;

import org.lhdmi.ecommerce.misb.service.UsuarioService;
import org.lhdmi.ecommerce.misb.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/usuarios/") //http://localhost:8080/api/usuarios/
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}//constructor
	
	@GetMapping
	public List<Usuario> getAllUsuarios(){
		return usuarioService.getAllUsuarios();		
	}//getAllProductos
	
	@GetMapping(path = "{userId}") //http://localhost:8080/api/usuarios/1
	public Usuario getUsuario(@PathVariable("userId") long id){
		return usuarioService.getUsuario(id);		
	}//getUsuario
	
	@DeleteMapping(path = "{userId}") //http://localhost:8080/api/usuarios/1
	public Usuario deleteUsuario(@PathVariable("userId") long id){
		return usuarioService.deleteUsuario(id);		
	}//DeleteUsuario
	
	@PostMapping					//http://localhost:8080/api/usuarios/
	public Usuario addUsuario(@RequestBody Usuario usuario){
		return usuarioService.addUsuario(usuario);		
	}//postAllProductos
	
//	@PutMapping (path="{userId}")//http://localhost:8080/api/usuarios/1?precio=55.80&imagen=bic40.jpg
//	public Usuario updateUser (@PathVariable ("userId") Long id, @RequestBody ChangePassword changePassword) {
//		return usuarioService.updateUser(id, changePassword);
//	}//upDateUsuario
	
	@PutMapping(path = "{userId}") 
	//http://localhost:8080/api/usuarios/1?precio=55.80&imagen=bic40.jpg
	public Usuario updateUsuario(@PathVariable("userId") 
			long id,
			@RequestParam(required=false) String nombre,
			@RequestParam(required=false) String foto,
			@RequestParam(required=false) String direccion
			){
		return usuarioService.updateUsuario(id, nombre, foto, direccion);		
	}//putsuarios
	
}//classUsuarioController