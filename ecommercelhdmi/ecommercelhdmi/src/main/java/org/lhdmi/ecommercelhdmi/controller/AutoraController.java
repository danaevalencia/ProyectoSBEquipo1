package org.lhdmi.ecommercelhdmi.controller;

import java.util.List;

import org.lhdmi.ecommercelhdmi.model.Autoras;
import org.lhdmi.ecommercelhdmi.service.AutoraService;
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

//CRUD - CREATE - READ - UPDATE - DELETE
	//HTTP - POST - GET - PUT - DELETE
@RestController
@RequestMapping(path="/api/autoras/") //http://localhost:8080/api/autoras/
public class AutoraController {
	private final AutoraService autoraService;
@Autowired
public AutoraController(AutoraService autoraService) {
	this.autoraService = autoraService;
}//constructor

@GetMapping
	public List<Autoras> getAllAutoras(){
		return autoraService.getAllAutoras();
	}//getAllAutoras

@GetMapping (path="{autoraId}")  //http://localhost:8080/api/autoras/1
public Autoras getAutoras(@PathVariable("autoraId") long id){
	return autoraService.getAutoras(id);
}//get Autoras

@DeleteMapping(path = "{autoraId}") //http://localhost:8080/api/galeria/1
public Autoras deleteAutoras(@PathVariable("autoraId") long id){
	return autoraService.deleteAutoras(id);	
}//deleteautora

@PostMapping				//http://localhost:8080/api/galeria/1
public Autoras addAutoras(@RequestBody Autoras autora){
	return autoraService.addAutoras(autora);			
}//addautora

@PutMapping(path = "{autoraId}") 
//http://localhost:8080/api/productos/1?precio=55.80&imagen=bic40.jpg
public Autoras updateAutoras(@PathVariable("autoraId") 
		long id,
		@RequestParam(required=false) String nombre,
		@RequestParam(required=false) String correo,
		@RequestParam(required=false) String descripcion,
		@RequestParam(required=false) String redSocial,
		@RequestParam(required=false) String telefono
		){
	return autoraService.updateAutoras(id, nombre, correo, descripcion, redSocial, telefono);		
}//putAutoras

}//class AutorasController
	
