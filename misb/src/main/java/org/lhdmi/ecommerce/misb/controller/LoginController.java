package org.lhdmi.ecommerce.misb.controller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;

import org.lhdmi.ecommerce.misb.config.JwtFilter;
import org.lhdmi.ecommerce.misb.model.ChangePassword;
import org.lhdmi.ecommerce.misb.model.Token;
import org.lhdmi.ecommerce.misb.model.Usuario;
import org.lhdmi.ecommerce.misb.service.UsuarioService;
/*
import org.lhdmi.ecommerce.config.JwtFilter;
import org.lhdmi.ecommerce.model.Token;
import org.lhdmi.ecommerce.model.Usuario;
import org.lhdmi.ecommerce.service.UsuarioService;
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
@RestController
@RequestMapping(path = "/api/login/")
public class LoginController {
	
private final UsuarioService usuarioService;
	
	@Autowired
	public LoginController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}//constructor
	
	@PostMapping
	public Token loginUsuario(@RequestBody Usuario usuario)throws ServletException {
		if (usuarioService.validateUser(usuario)) {
			System.out.println("usuario válido"+ usuario.getCorreo());
			return new Token(generateToken(usuario.getCorreo()));
		}//IFvalidateUser
		throw new ServletException("Nombre de usuario o contraseña incorrectos");
	}//loginUsuario
	
	private String generateToken(String username) {
		Calendar calendar = Calendar.getInstance();//Fecha hora actual
		calendar.add(Calendar.HOUR, 10); // Pruebas
		//calendar.add(Calendar.MINUTE, 30);// Producción
		return Jwts.builder().setSubject(username).claim("role", "user")
		.setIssuedAt(new Date())
		.setExpiration(calendar.getTime())
		.signWith(SignatureAlgorithm.HS256, JwtFilter.secret)
		.compact();
	}//generateToken
	
	@PutMapping (path="{userId}")//http://localhost:8080/api/login/1?precio=55.80&imagen=bic40.jpg
	public Usuario updatePassword (@PathVariable ("userId") Long id, @RequestBody ChangePassword changePassword) {
		return usuarioService.updatePassword(id, changePassword);
	}//upDateUsuario

}//LoginController
