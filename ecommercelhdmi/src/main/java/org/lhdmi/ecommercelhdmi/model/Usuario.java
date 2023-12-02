package org.lhdmi.ecommercelhdmi.model;

public class Usuario {
	private Long id;
	private String nombre;
	private String correo;
	private String contrasena;
	private String registrof;
	private String tipo;
	private String foto;
	private String direccion;
	
	private static long total = 0;
	
	//1 Constructor sin id
	public Usuario(String nombre, String correo, String contrasena, String registrof, String tipo, String foto,
			String direccion) {
		this.nombre = nombre;
		this.correo = correo;
		this.contrasena = contrasena;
		this.registrof = registrof;
		this.tipo = tipo;
		this.foto = foto;
		this.direccion = direccion;
		Usuario.total++;
		this.id=total;
	}//Constructor
	
	//2 Encapsular
	public Usuario() {
		Usuario.total++;
		this.id=total;
	}//ConstructorVacio

	public String getNombre() {
		return nombre;
	}//getUsuario

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setUsuario

	public String getCorreo() {
		return correo;
	}//getCorreo

	public void setCorreo(String correo) {
		this.correo = correo;
	}//setCorreo

	public String getContrasena() {
		return contrasena;
	}//getContrasena

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}//setContrasena

	public String getRegistrof() {
		return registrof;
	}//getRegistrof

	public void setRegistrof(String registrof) {
		this.registrof = registrof;
	}//setRegistrof

	public String getTipo() {
		return tipo;
	}//getTipo

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}//setTipo

	public String getFoto() {
		return foto;
	}//getFoto

	public void setFoto(String foto) {
		this.foto = foto;
	}//setFoto

	public String getDireccion() {
		return direccion;
	}//getDireccion

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}//setDireccion
	
	public Long getId() {
		return id;
	}//getId

	//3 toString
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", contrasena=" + contrasena
				+ ", registrof=" + registrof + ", tipo=" + tipo + ", foto=" + foto + ", direccion=" + direccion + "]";
	}//toString

}//classUsuario
