
package org.lhdmi.ecommercelhdmi.service;

import java.util.List;
import java.util.Optional;


import org.lhdmi.ecommercelhdmi.model.Usuario;
import org.lhdmi.ecommercelhdmi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;
	
	@Autowired 
	public UsuarioService(UsuarioRepository usuarioRepository){
            this.usuarioRepository = usuarioRepository;
            }//constructor						
 
	public List<Usuario> getAllUsuarios() {
		return usuarioRepository.findAll();
	}//método getAllUsuarios
	
	
public Usuario getUsuario(long id){
return usuarioRepository.findById(id).orElseThrow(
	()-> new IllegalArgumentException("El usuario con el id "
					+ "[" + id +"] no existe") 
			);} //getUsuario

public Usuario deleteUsuario(long id) {
	Usuario user=null;
	if(usuarioRepository.existsById(id)) {
		user = usuarioRepository.findById(id).get();
		usuarioRepository.deleteById(id);
	}//isExistsById
	return user;
}//deleteUsuario

public Usuario addUsuario(Usuario usuario) {
	Optional<Usuario> tmpUser = usuarioRepository.findByNombre(usuario.getNombre());
	if (tmpUser.isEmpty()){
		return usuarioRepository.save(usuario);
	} else {
		System.out.println("Ya existe el usuario con el nombre [" +
	usuario.getNombre() + "]");
		return null;
	}//else
//	usuarioRepository.save(usuario);
//	return usuario;
            }//addUsuario

	public Usuario updateUsuario(long id, String nombre, String correo, String contrasena, String registrof, String tipo, String foto, String direccion) {
		Usuario user = null;
if (usuarioRepository.existsById(id)){
user = usuarioRepository.findById(id).get(); 
				if(nombre!=null) user.setNombre(nombre);
				if(correo!=null) user.setCorreo(correo);
				if(contrasena!=null) user.setContrasena(contrasena);
				if(registrof!=null) user.setRegistrof(registrof);
				if(tipo!=null) user.setTipo(tipo);
				if(foto!=null) user.setFoto(foto);
				if(direccion!=null) user.setDireccion(direccion);
				usuarioRepository.save(user);
			}//existById
                                     return user;
	}//upDateUsuario
	
}//classUsuarioService
