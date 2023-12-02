package org.lhdmi.ecommercelhdmi.service;

import java.util.ArrayList;

import org.lhdmi.ecommercelhdmi.model.Secciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeccionesService {
	public final ArrayList<Secciones> lista  = new ArrayList<Secciones>();
	@Autowired
	public SeccionesService() {
		lista.add(new Secciones("Temporada","lote de obras únicas de temporada que serán expuestas por 3 meses.", (byte) 10));
		
		lista.add(new Secciones("Descontinuadas","obras ya no disponibles para su elaboración", (byte) 2));

		lista.add(new Secciones("Próximamente","Obras en proceso para su venta", (byte) 3));

		lista.add(new Secciones("Stock","lote de obras aún disponibles después de temporada.", (byte) 10));

		lista.add(new Secciones("Personalizables","Obras de referencia para personalización de acuerdo al cliente", (byte) 10));

	}//SeccionesService
	public ArrayList<Secciones> getAllSecciones() {
		return lista;
	}//get all secciones
	public Secciones getSecciones(long id) {
		
		Secciones secc=null;
		for (Secciones secciones : lista) {
			if( id == secciones.getId()) {
				secc=secciones;
				break;
			}//if
		}//foreach
		return secc;
	}//get secciones
	
	public Secciones deleteSecciones(long id) {
		Secciones secc=null;
		for (Secciones secciones : lista) {
			if( id == secciones.getId()) {
				secc=secciones;
				lista.remove(secciones);
				break;
			}//if
		}//foreach
		return secc;
	}//deletesecciones	
	
	public Secciones updateSecciones(long id, String nombre, String descripcion, Byte cantidadobras) {
		Secciones secc=null;
		for (Secciones secciones : lista) {
			if( id == secciones.getId()) {
				if(nombre != null) secciones.setNombre(nombre);
				if(descripcion !=null)secciones.setDescripcion(descripcion);
				if(cantidadobras !=null)secciones.setCantidadobras(cantidadobras);
				secc = secciones;
				break;
			}//if
		}//foreach
		return secc;	
	}//updatesecciones
	
	public Secciones addSecciones(Secciones secciones) {
		lista.add(secciones);
		return secciones;
	}//add
	
	
}//class SeccionesService 
