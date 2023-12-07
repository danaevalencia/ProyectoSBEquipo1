package org.lhdmi.ecommerce.misb.service;

import java.util.List;
import java.util.Optional;

import org.lhdmi.ecommerce.misb.model.Producto;
import org.lhdmi.ecommerce.misb.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
	
	private final ProductoRepository productoRepository;

	@Autowired
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}//constructor
	
	public List<Producto> getAllProductos() {
		return productoRepository.findAll();
	}//getAllProductos

	public Producto getProducto(long id) {
		return productoRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("El producto con el id["
						+ "] no existe")
				);
	}//getProducto
	public Producto deleteProducto(long id) {
		Producto prod=null;
		if (productoRepository.existsById(id)) {
			prod = productoRepository.findById(id).get();
			productoRepository.deleteById(id);
		}//iff existById
	return prod;
}//deleteProducto

public Producto addProducto(Producto producto) {
	Optional<Producto> tmpProducto = productoRepository.findByTitulo(producto.getTitulo());
	if (tmpProducto.isEmpty()) {
		return productoRepository.save(producto);
	}//if 
	else {
		System.out.println("Ya existe el producto con el nombre [ " + producto.getTitulo() + " ]");
		return null;
	}//else
}//addProducto

public Producto updateProducto(long id, String titulo, String descripcion, String imagen, Double precio, Integer seccion, String autora) {
	Producto prod=null;
	if (productoRepository.existsById(id)) {
		prod = productoRepository.findById(id).get();
		if(titulo!= null) prod.setTitulo(titulo);
		if(descripcion!= null) prod.setDescripcion(descripcion);
		if(imagen!= null) prod.setImagen(imagen);
		if(precio!= null) prod.setPrecio(precio);
		if(seccion!= null) prod.setSeccion(seccion);
		if(autora!= null) prod.setAutora(autora);
		productoRepository.save(prod);
	}//existById
	return prod;
}//updateProducto
}//class productoService