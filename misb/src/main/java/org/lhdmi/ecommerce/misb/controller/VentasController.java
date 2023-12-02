package org.lhdmi.ecommerce.misb.controller;

import java.util.List;

import org.lhdmi.ecommerce.misb.model.Ventas;
import org.lhdmi.ecommerce.misb.service.VentasService;
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

	@RestController
	@RequestMapping(path ="/api/ventas/")
	public class VentasController {
		private final VentasService ventasService;
		@Autowired
		public VentasController(VentasService ventasService) {
			this.ventasService = ventasService;
		}//constructor
		
		@GetMapping
		public List<Ventas> getAllVentas(){
			return ventasService.getAllVentas();		
		}//getAllProductos
		
		@GetMapping(path = "{ventaId}") //http://localhost:8080/api/ventas/1
		public Ventas getVentas(@PathVariable("ventaId") long id){
			return ventasService.getVentas(id);		
		}//getUsuario
		
		@DeleteMapping(path = "{ventaId}") //http://localhost:8080/api/usuarios/1
		public Ventas deleteVentas(@PathVariable("ventaId") long id){
			return ventasService.deleteVentas(id);		
		}//DeleteUsuario
		
		@PostMapping					//http://localhost:8080/api/usuarios/
		public Ventas addVentas(@RequestBody Ventas ventas){
			return ventasService.addVentas(ventas);		
		}//postAllProductos
		@PutMapping(path = "{ventaId}") 
		//http://localhost:8080/api/usuarios/1?precio=55.80&imagen=bic40.jpg
		public Ventas updateVentas(@PathVariable("ventaId") 
				long id,
				@RequestParam(required=false) Double preciototal,
				@RequestParam(required=false) String fechacompra,
				@RequestParam(required=false) Double cantidad,
				@RequestParam(required=false) String status,
				@RequestParam(required=false) String metodopago,
				@RequestParam(required=false) String folio
				){
			return ventasService.updateVentas(id, preciototal, fechacompra, cantidad, status, metodopago, folio);		
		}//putVentas

}//class VentasController