package org.lhdmi.ecommercelhdmi.controller;

import java.util.List;

import org.lhdmi.ecommercelhdmi.model.Secciones;
import org.lhdmi.ecommercelhdmi.service.SeccionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

///CRUD - Create Read Update Delete
/// HTTP - POST  GET   PUT   DELETE
	@RestController
	@RequestMapping(path="/api/secciones/") //http://localhost:8080/api/secciones/
	
public class SeccionesController {
		private final SeccionesService seccionesService;
		@Autowired
			public SeccionesController( SeccionesService seccionesService) {
				this.seccionesService =seccionesService;
			}//constructor
		@GetMapping    //http://localhost:8080/api/secciones/
		    public List<Secciones> getAllSecciones(){
		    	return seccionesService.getAllSecciones();
		    }//get all secciones
		
	    
		@GetMapping (path="{seccId}")  //http://localhost:8080/api/secciones/1
		public Secciones  getSecciones(@PathVariable("seccId") long id){
			return seccionesService.getSecciones(id);
		}//get secciones

		@PostMapping 
		public Secciones addSecciones(@RequestBody Secciones secciones) {
			return seccionesService.addSecciones(secciones);
		}//post secciones
		
		@DeleteMapping (path="{seccId}")  //http://localhost:8080/api/secciones/1
		public Secciones  deleteSecciones(@PathVariable("seccId") long id){
			return seccionesService.deleteSecciones(id);
		}//delete secciones

		@PutMapping (path="{seccId}")  //http://localhost:8080/api/secciones/1?precio=55.80&imagen=bic40.jpg
		public Secciones  updateSecciones(@PathVariable("seccId") long id,
			@RequestParam(required=false) String nombre,
			@RequestParam(required=false) String descripcion,
			@RequestParam(required=false) Byte cantidadobras){
			return seccionesService.updateSecciones(id, nombre, descripcion, cantidadobras);
		}//update seccion


}//class  secciones 
