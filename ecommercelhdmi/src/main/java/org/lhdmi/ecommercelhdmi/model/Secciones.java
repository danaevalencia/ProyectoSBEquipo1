package org.lhdmi.ecommercelhdmi.model;

public class Secciones {
	private  Long id;
     private String nombre;
     private String descripcion;
     private Byte cantidadobras; 
     
     private static long total=0;

	public Secciones(String nombre, String descripcion, Byte cantidadobras) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidadobras = cantidadobras;
		Secciones.total++;
		this.id = total;
	}//constructor 

	public Secciones() {
			Secciones.total++;
			this.id=total;
		}
	
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

	public static long getTotal() {
		return total;
	}//gettotal

	public static void setTotal(long total) {
		Secciones.total = total;
	}//settotal

	public Long getId() {
		return id;
	}//getId

	@Override
	public String toString() {
		return "Secciones [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", cantidadobras="
				+ cantidadobras + "]";
	}//tostring
     
     
}//class secciones 
