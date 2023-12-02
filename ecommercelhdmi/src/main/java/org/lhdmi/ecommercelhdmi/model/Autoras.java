package org.lhdmi.ecommercelhdmi.model;

	public class Autoras {
		private Long id;
		private String nombre;
		private String correo;
		private String descripcion;
		private String redSocial;
		private String telefono;
		
		private static long total = 0;


		public Autoras(String nombre, String correo, String descripcion, String redSocial, String telefono) {
			this.nombre = nombre;
			this.correo = correo;
			this.descripcion = descripcion;
			this.redSocial = redSocial;
			this.telefono = telefono;
			Autoras.total++;
			this.id=total;
		}//constructor

		public Autoras() {
			Autoras.total++;
			this.id=total;
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
