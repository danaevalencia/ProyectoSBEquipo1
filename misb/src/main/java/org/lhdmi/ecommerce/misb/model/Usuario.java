package org.lhdmi.ecommerce.misb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="usuarios")
public class Usuario{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable=false)
	private Long id;
	@Column(nullable=false)
	private String nombre;
	@Column(nullable=false)
	private String correo;
	@Column(nullable=false)
	private String contrasena;
	@Column(nullable=false)
	private String registrof;
	@Column(nullable=false)
	private String tipo;
	@Column(nullable=false)
	private String foto;
	@Column(nullable=false)
	private String direccion;
	
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
			
		}//Constructor
		
		//2 Encapsular
		public Usuario() {
		
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
		