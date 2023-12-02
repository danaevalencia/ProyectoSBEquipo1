package org.lhdmi.ecommercelhdmi.model;

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
	@Column (name="id", unique = true, nullable = false)
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
		
//		private static long total = 0;


		public Autoras(String nombre, String correo, String descripcion, String redSocial, String telefono) {
			this.nombre = nombre;
			this.correo = correo;
			this.descripcion = descripcion;
			this.redSocial = redSocial;
			this.telefono = telefono;
//			Autoras.total++;
//			this.id=total;
		}//constructor

		public Autoras() {
//			Autoras.total++;
//			this.id=total;
		}

		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public String getCorreo() {
			return correo;
		}



		public void setCorreo(String correo) {
			this.correo = correo;
		}



		public String getDescripcion() {
			return descripcion;
		}



		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}



		public String getRedSocial() {
			return redSocial;
		}



		public void setRedSocial(String redSocial) {
			this.redSocial = redSocial;
		}



		public String getTelefono() {
			return telefono;
		}



		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}



		public Long getId() {
			return id;
		}



		@Override
		public String toString() {
			return "Autoras [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", descripcion=" + descripcion
					+ ", redSocial=" + redSocial + ", telefono=" + telefono + "]";
		}



		
		
	}//class
