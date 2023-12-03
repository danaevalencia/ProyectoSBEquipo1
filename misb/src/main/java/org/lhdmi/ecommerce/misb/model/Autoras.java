package org.lhdmi.ecommerce.misb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="autoras")
	public class Autoras {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column (name="idautoras", unique = true, nullable = false)
		private Long id;
	@Column(nullable = false)
		private String nombre;
	@Column(nullable = false)
		private String correo;
	@Column(nullable = false)
		private String descripcion;
	@Column(nullable = false)
		private String redSocial;
	@Column(nullable = false)
		private String telefono;
	
	
	public Autoras(String nombre, String correo, String descripcion, String redSocial, String telefono) {
		this.nombre = nombre;
		this.correo = correo;
		this.descripcion = descripcion;
		this.redSocial = redSocial;
		this.telefono = telefono;
//		Autoras.total++;
//		this.id=total;
	}//constructor
//	
	public Autoras() {
//		Autoras.total++;
//		this.id=total;
	}//constructor vacio

	public String getNombre() {
		return nombre;
	}//getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public String getCorreo() {
		return correo;
	}//getCorreo
	public void setCorreo(String correo) {
		this.correo = correo;
	}//setCorreo
	public String getDescripcion() {
		return descripcion;
	}//getDescripcion
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}//setDescripcion
	public String getRedSocial() {
		return redSocial;
	}//getRedSocial
	public void setRedSocial(String redSocial) {
		this.redSocial = redSocial;
	}//setRedSocial
	public String getTelefono() {
		return telefono;
	}//getTelefono

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}//setTelefono
	public Long getId() {
		return id;
	}//getId
	
	@Override
	public String toString() {
		return "Autoras [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", descripcion=" + descripcion
				+ ", redSocial=" + redSocial + ", telefono=" + telefono + "]";
	}//toString
	
}//class