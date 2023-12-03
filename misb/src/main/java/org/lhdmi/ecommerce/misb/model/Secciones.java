package org.lhdmi.ecommerce.misb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="secciones")
public class Secciones {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idsecciones", unique = true, nullable = false)
	private  Long id;
	@Column(nullable = false)
     private String nombre;
	@Column(nullable = false)
     private String descripcion;
	@Column(nullable = false)
     private Byte cantidadobras; 
     
//     private static long total=0;
	public Secciones(String nombre, String descripcion, Byte cantidadobras) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidadobras = cantidadobras;
//		Secciones.total++;
//		this.id = total;
	}//constructor 

	public Secciones() {
//			Secciones.total++;
//			this.id=total;
		}//constructor vacío
	
	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setnombre
	public String getDescripcion() {
		return descripcion;
	}//getdescripcion

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}//set descripcion

	public Byte getCantidadobras() {
		return cantidadobras;
	}//getcantidadobras

	public void setCantidadobras(Byte cantidadobras) {
		this.cantidadobras = cantidadobras;
	}//setcantidadObras

	public Long getId() {
		return id;
	}//getId

	@Override
	public String toString() {
		return "Secciones [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", cantidadobras="
				+ cantidadobras + "]";
	}//tostring
     
}//class secciones