package org.lhdmi.ecommercelhdmi.service;
import java.util.List;

import org.lhdmi.ecommercelhdmi.model.Producto;
import org.lhdmi.ecommercelhdmi.repository.ProductoRepository;
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
			//TODO: validacion
			return productoRepository.save(producto);
	}//addProducto
	
	public Producto updateProducto(long id, String titulo, String descripcion, String imagen, Double precio) {
		Producto prod=null;
		if (productoRepository.existsById(id)) {
			prod = productoRepository.findById(id).get();
			if(titulo!= null) prod.setTitulo(titulo);
			if(descripcion!= null) prod.setDescripcion(descripcion);
			if(imagen!= null) prod.setImagen(imagen);
			if(precio!= null) prod.setPrecio(precio);
			productoRepository.save(prod);
		}//existById
		return prod;
	}//updateProducto


}//class productoService