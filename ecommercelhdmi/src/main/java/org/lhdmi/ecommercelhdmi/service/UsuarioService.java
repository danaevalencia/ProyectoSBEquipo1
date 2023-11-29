package org.lhdmi.ecommercelhdmi.service;

import java.util.ArrayList;

import org.lhdmi.ecommercelhdmi.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	public final ArrayList<Usuario> lista = new ArrayList<Usuario>();
	
	@Autowired 
	public UsuarioService() {
		lista.add(new Usuario(
				"Akary Larios",
				"akary.larios@gmail.com",
				"Akary_01", 
				"2023-11-23",
				"usuario_mortal",
				"https://drive.google.com/file/d/1hI2ROV7aQFNq19UA4adFVwy_bHnN3yIi/view?usp=sharing",
				"Colima, colima, col. frutería, calle moras #10 , c.p 28100"
				));

		lista.add(new Usuario(
				"Dánae Valencia",
				"danae.valen96@gmail.com",
				"Danae_01", 
				"2023-11-23",
				"usuario_mortal",
				"https://drive.google.com/file/d/1hI2ROV7aQFNq19UA4adFVwy_bHnN3yIi/view?usp=sharing",
				"Jalisco,Zapopan , col. frutería, calle moras #10 , c.p 28100"
				));

		lista.add(new Usuario(
				"Alicia Perez",
				"aliciapbarreda@gmail.com",
				"Alicia_01", 
				"2023-11-23",
				"usuario_mortal",
				"https://drive.google.com/file/d/1Kue9SJNLh0bAIKDQZA7R4Zj0r0StoP3N/view?usp=sharing",
				"CDMX, Verónica Anzures, col. frutería, calle moras #10 , c.p 28100"
				));

		lista.add(new Usuario(
				"Zuri Santos",
				"zurisadaisantospadilla@gmail.com",
				"ZuriSantos_01", 
				"2023-11-23",
				"usuario_mortal",
				"https://drive.google.com/file/d/1FsWh_8WtostXlrE86oDbov9zGz_6inHP/view?usp=sharing",
				"Estado de México, Ecatepec, col. frutería, calle moras #10 , c.p 28100"
				));

		lista.add(new Usuario(
				"Berez Vélez",
				"ab.jvelez@gmail.com",
				"BerezVelez_01", 
				"2023-11-23",
				"usuario_mortal",
				"https://drive.google.com/file/d/1keCnB3JHwmPO9e3tp1B0Ti_53R__hu17/view?usp=sharing",
				"CDMX, MiguelHidalgo, col. frutería, calle moras #10 , c.p 28100"
				));

		lista.add(new Usuario(
				"Fernanda Aldana",
				"ma.fe.al.ll.00@gmail.com",
				"Fernanda_01", 
				"2023-11-23",
				"usuario_mortal",
				"https://drive.google.com/file/d/1jBH8It2p5XZBoN3cEqSQtofKS77tmKIi/view?usp=sharing",
				"Jalisco, Zapotlán el Grande, col. frutería, calle moras #10 , c.p 28100"
				));

		lista.add(new Usuario(
				"Luz Becerril",
				"luzbecerril055@gmail.com",
				"Luzbp_01", 
				"2023-11-23",
				"usuario_mortal",
				"https://drive.google.com/file/d/1Wc9ypkeKY7Vd2zjlr6pfAY3q5JJif2Pb/view?usp=sharing",
				"Jalisco, colima, col. frutería, calle moras #10 , c.p 28100"
				));

		lista.add(new Usuario(
				"Cynthia Avila",
				"qfbcynthiaavi@gmail.com",
				"C&n2023", 
				"2023-11-23",
				"usuario_mortal",
				"https://drive.google.com/file/d/15pmUF6hQc0D4dZ_uDSjnIvvJm4SdH1wo/view?usp=sharing",
				"Jalisco, Tala, col. El Refugio, calle México #100 , c.p 20100"
				));

		lista.add(new Usuario(
				"Galeria Hijas Izquierdo",
				"hijasmariaizquierdogaleria@gmail.com",
				"MariaDerecho_01", 
				"2023-11-23",
				"administrador",
				"https://drive.google.com/file/d/1ksZTMC5cwfzN5fL1Zj08i9sGGNSAEAYi/view?usp=sharing",
				"CDMX, MiguelHidalgo, col. Polanco, Enrique Ibsen 32-A , c.p 11560"
				));
		
	}//ConstructorUsuarioService

	public ArrayList<Usuario> getAllUsuarios() {
		return lista;
	}//getAllUsuarios

	public Usuario getUsuario(long id) {
		Usuario user = null;
		for (Usuario usuario : lista) {
			if(id == usuario.getId()) {
				user = usuario;
				break;
			}//if
		}//forEach
		return user;
	}//getUsuario

	public Usuario deleteUsuario(long id) {
		Usuario user = null;
		for (Usuario usuario : lista) {
			if(id == usuario.getId()) {
				user = usuario;
				lista.remove(usuario);
				break;
			}//if
		}//forEach
		return user;
	}//deleteUsuario

	public Usuario addUsuario(Usuario usuario) {
		lista.add(usuario);
		return usuario;
	}//addUsuario

	public Usuario updateUsuario(long id, String nombre, String correo, String contrasena, String registrof, String tipo, String foto, String direccion) 
	{
		Usuario user = null;
		for (Usuario usuario: lista) {
			if (id== usuario.getId()) {
				if(nombre!=null) usuario.setNombre(nombre);
				if(correo!=null) usuario.setCorreo(correo);
				if(contrasena!=null) usuario.setContrasena(contrasena);
				if(registrof!=null) usuario.setRegistrof(registrof);
				if(tipo!=null) usuario.setTipo(tipo);
				if(foto!=null) usuario.setFoto(foto);
				if(direccion!=null) usuario.setDireccion(direccion);
				
				user = usuario;
			}//if
		}//forEach
		return user;
	}//upDateUsuario
	
}//classUsuarioService
