package org.lhdmi.ecommerce.misb.service;

import java.util.List;
import java.util.Optional;

import org.lhdmi.ecommerce.misb.model.Secciones;
import org.lhdmi.ecommerce.misb.repository.SeccionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeccionesService {
	 private final SeccionesRepository seccionesRepository;
	 @Autowired
		public SeccionesService(SeccionesRepository seccionesRepository) {
			this.seccionesRepository = seccionesRepository;
		}//constructor
	 
	 public List<Secciones> getAllSecciones() {
			return seccionesRepository.findAll();
		}//get all secciones
		
		public Secciones getSecciones(long id) {
			
			return seccionesRepository.findById(id).orElseThrow(
					()-> new IllegalArgumentException("la sección con el Id ["
							+ "] no existe")
					);
		}//get secciones
		
		public Secciones deleteSecciones(long id) {
			Secciones secc=null;
			if (seccionesRepository.existsById(id)) {
				secc  = seccionesRepository.findById(id).get();
				seccionesRepository.deleteById(id);
			}//ifexistbyid
			return secc;
		}//deletesecciones
		public Secciones addSecciones(Secciones secciones) {
//			seccionesRepository.save(secciones);
//			return secciones;
//			
			//todo:validación de producto no repetido
			Optional<Secciones> tmpSecc = seccionesRepository.findByNombre(secciones.getNombre());
			if (tmpSecc.isEmpty()) {
				return seccionesRepository.save(secciones);
			}else {
				System.out.println("ya existe la sección con el nombre ["
					+ secciones.getNombre()	+ "]");
				return null;
			}//if//else
		}//addseciones
		public Secciones updateSecciones(long id, String nombre, String descripcion, Byte cantidadobras) {
			Secciones secc=null;
			if (seccionesRepository.existsById(id)) {
				secc = seccionesRepository.findById(id).get();
					if(nombre != null)secc.setNombre(nombre);
					if(descripcion !=null)secc.setDescripcion(descripcion);
					if(cantidadobras !=null)secc.setCantidadobras(cantidadobras);
					seccionesRepository.save(secc);
				}//existById
			return secc;
	}//updatesecciones
	
}//class SeccionesService
