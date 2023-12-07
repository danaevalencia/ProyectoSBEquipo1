package org.lhdmi.ecommerce.misb.service;

import java.util.List;
import java.util.Optional;

import org.lhdmi.ecommerce.misb.model.ChangePassword;
import org.lhdmi.ecommerce.misb.model.Usuario;
import org.lhdmi.ecommerce.misb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
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
			Usuario user = null;
			if (usuarioRepository.findByCorreo(usuario.getCorreo()).isEmpty()){
				//cifrar la contraseña
				usuario.setContrasena(passwordEncoder.encode(usuario.getContrasena()));
				return usuarioRepository.save(usuario);
			}//if 
			else {
				System.out.println("Ya existe el usuario con el email [ " + usuario.getCorreo() + " ]");
			}//else
			return user;
			
		}//addUsuario
		
		public Usuario updatePassword(Long id, ChangePassword changePassword) {
			Usuario user = null;
			if (usuarioRepository.existsById(id)) {
				user = usuarioRepository.findById(id).get();
				if(passwordEncoder.matches(changePassword.getPassword(),user.getContrasena())) {	
//				if(user.getContrasena().equals(changePassword.getPassword())){
					user.setContrasena(passwordEncoder.encode(changePassword.getNewPassword()));
//					user.setContrasena(changePassword.getNewPassword());
					usuarioRepository.save(user);
				}//comparación
				else {
					System.out.println("updateUser- El password con el id [ " + id + " ] es incorrecto ");
					user = null;
				}
			}//if
			else {
				System.out.println("updateUser- El usuario con el id [ " + id + " ] No se encuentra registrade");
			}//else
			return user;
		}//upDatePassword

		public boolean validateUser(Usuario usuario) {
			Optional<Usuario> userByCorreo = usuarioRepository.findByCorreo(usuario.getCorreo());
			if(userByCorreo.isPresent()) {
				Usuario user = userByCorreo.get();
				if (passwordEncoder.matches(usuario.getContrasena(), user.getContrasena())) {
//				if (user.getContrasena().equals(usuario.getContrasena())) {
					return true;
				}//if password
			}//if isPresent		
			return false;
		}//validateUser
		
		public Usuario updateUsuario(long id, String nombre, String foto, String direccion) {
			Usuario user=null;
			if (usuarioRepository.existsById(id)) {
				user = usuarioRepository.findById(id).get();

					if(nombre!=null) user.setNombre(nombre);
					if(foto!=null) user.setFoto(foto);
					if(direccion!=null) user.setDireccion(direccion);
					usuarioRepository.save(user);	
			}//existById
			return user;
		}//updateUsuarios
		
}//classUsuarioService