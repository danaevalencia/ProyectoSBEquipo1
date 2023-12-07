package org.lhdmi.ecommerce.misb.controller;

import java.util.List;

import org.lhdmi.ecommerce.misb.model.Producto;
import org.lhdmi.ecommerce.misb.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/api/galeria/") //http://localhost:8080/api/galeria/
public class ProductoController {
	private final ProductoService productoService;
	@Autowired 
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}//constructor

	@GetMapping
		public List<Producto> getAllProductos(){
			return productoService.getAllProductos();
		}//getAllProductos
	
	@GetMapping (path="{prodId}")  //http://localhost:8080/api/galeria/1
	public Producto  getProducto(@PathVariable("prodId") long id){
		return productoService.getProducto(id);
	}//get producto
	
	@DeleteMapping(path = "{prodId}") //http://localhost:8080/api/galeria/1
	public Producto deleteProducto(@PathVariable("prodId") long id){
		return productoService.deleteProducto(id);		
	}//deleteproducto
	
	@PostMapping				//http://localhost:8080/api/galeria/1
	public Producto addProducto(@RequestBody Producto producto){
		return productoService.addProducto(producto);		
	}//addproducto
	
	@PutMapping(path = "{prodId}") 
	//http://localhost:8080/api/productos/1?precio=55.80&imagen=bic40.jpg
	public Producto updateProducto(@PathVariable("prodId") 
			long id,
			@RequestParam(required=false) String titulo,
			@RequestParam(required=false) String descripcion,
			@RequestParam(required=false) String imagen,
			@RequestParam(required=false) Double precio,
			@RequestParam(required=false) Integer seccion,
			@RequestParam(required=false) String autora
			){
		return productoService.updateProducto(id, titulo, descripcion, imagen, precio, seccion, autora);		
	}//putProductos
	
}//class ProductoController