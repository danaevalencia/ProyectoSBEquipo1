package org.lhdmi.ecommerce.misb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//POJO Plain Old Java Object
@Entity
@Table(name="productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Long id;
	private String titulo;
	private String descripcion;
	private String imagen;
	private Double precio;
	
	//private static long total = 0;
	
	//Constructor (sin id)
		public Producto(String titulo, String descripcion, String imagen, Double precio) {

			this.titulo = titulo;
			this.descripcion = descripcion;
			this.imagen = imagen;
			this.precio = precio;
			//Producto.total++;
			//this.id=total;
		}//constructor

		public Producto() {
			//Producto.total++;
			//this.id=total;
		}//constructorVacio
		
		//Encapsular getter & setter *NO* incluir setId
		public String getTitulo() {
			return titulo;
		}//getTitulo
		
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}//setTitulo


		public String getDescripcion() {
			return descripcion;
		}//getDescripcion


		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}//setDescripcion


		public String getImagen() {
			return imagen;
		}//getImagen


		public void setImagen(String imagen) {
			this.imagen = imagen;
		}//setImagen


		public Double getPrecio() {
			return precio;
		}//getPrecio


		public void setPrecio(Double precio) {
			this.precio = precio;
		}//setPrecio


		public Long getId() {
			return id;
		}//getId

		//toString
		@Override
		public String toString() {
			return "Producto [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", imagen=" + imagen
					+ ", precio=" + precio + "]";
		}//toString
		
}//class Producto
