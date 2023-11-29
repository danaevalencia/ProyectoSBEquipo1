package org.lhdmi.ecommercelhdmi.service;
import java.util.ArrayList;
import org.lhdmi.ecommercelhdmi.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductoService {
	public final ArrayList<Producto> lista  = new ArrayList<Producto>();

@Autowired
		public ProductoService() {
	lista.add(new Producto(
			"Qué es naturaleza?",
			"Esta serie de pinturas representa la relación de amor-odio entre la naturaleza y la civilización (lo apolíneo y la cultura). Óleo sobre lienzo. 45x45cm. 2023.",
			"Andrea Villalón 2.jpg",
			2000.00
			));
	
	lista.add(new Producto(
			"Cuerpos compartidos I",
			"Esta serie de pinturas representa la relación de amor-odio entre la naturaleza y la civilización. Lápiz de color sobre papel, 17.7 cm x 25.4 cm. 2022.",
			"248406969_858335791495785_7920988310028209038_n.jpg",
			3000.00
			));
	
	lista.add(new Producto(
			"Ladrón de miel",
			"El ladrón de miel tiene 28 manzanas de edad. Representa la relación de amor-odio entre la naturaleza y la civilización. Óleo sobre lienzo. 45x45cm. 2023.",
			"Andrea Villalón 1.1.1.jpg",
			2400.00
			));
	
	lista.add(new Producto(
			"Dónde guardo las cosas",
			"Esta serie de pinturas representa la relación de amor-odio entre la naturaleza y la civilización (lo apolíneo y la cultura). Óleo sobre lienzo. 45x45cm. 2023.",
			"Andrea Villalón 1.1.jpg",
			4000.00
			));
	
	lista.add(new Producto(
			"Cuerpos compartidos II",
			"Esta serie de pinturas representa la relación de amor-odio entre la naturaleza y la civilización. Lápiz de color sobre papel, 17.7 cm x 25.4 cm. 2022.",
			"272944750_675934553433170_3686686299154790905_n.jpg",
			3000.00
			));
	
	lista.add(new Producto(
			"Cuerpos compartidos III",
			"Esta serie de pinturas representa la relación de amor-odio entre la naturaleza y la civilización. Lápiz de color sobre papel, 17.7 cm x 25.4 cm. 2022.",
			"284532496_596135271564941_5147985414872795668_n.jpg",
			1900.00
			));
	
	lista.add(new Producto(
			"Magia en Kuwait",
			"Esta serie de pinturas representa la relación de amor-odio entre la naturaleza y la civilización (lo apolíneo y la cultura). Acrílico y óleo sobre tela, 2.40 x 1.95 m, 2014.",
			"Karen Reyes 2.jpg",
			3000.00
			));
	
	lista.add(new Producto(
			"Retrato doméstico",
			"Un retrato intimo de la vida cotidiana. Obra partícipe del premio nacional de pintura fermin revueltas. Pintura de acrílico y óleo sobre tela 120x130cm, 2014.",
			"1. Michelle Galavíz.jpg",
			4500.00
			));
	
	lista.add(new Producto(
			"El huésped",
			"¿Por qué de pronto nos sentimos impelidos a infligirnos pequeños suplicios sin razón aparente? ¿Qué nos mueve a arrojarnos de bruces a lo que odiamos?.",
			"Michelle Galavíz 2.jpg",
			3000.00
			));
	
	lista.add(new Producto(
			"Multi Orgasmic",
			"Jeans de segunda mano, deslavados y teñidos, colgado mediante cuerdas y accesorios de acero a la losa del museo. Dimensiones variables. 2022.",
			"Pía Camil 3.jpg",
			5000.00
			));
	
	lista.add(new Producto(
			"Nidos y nudos",
			"Acero, hormigón, pulpa de periódico reciclada, pigmentos, fotografías de periódico insertadas y base de madera contrachapada. 69x53x36 pulgadas. 2021",
			"Pía Camil 3.jpg",
			2000.00
			));
	
	lista.add(new Producto(
			"Bragueta","Acero, hormigón, pulpa de periódico reciclada, pigmentos, fotografías de periódico insertadas y base de madera contrachapada. 69x53x36 pulgadas. 2021.",
			"Pía Camil 1.jpg",
			3000.00
			));
	
		}//ProductoService

public ArrayList<Producto> getAllProductos() {
	
	return lista;
}

public Producto getProducto(long id) {
	Producto prod = null;
	for (Producto producto : lista) {
		if(id == producto.getId()) {
			prod=producto;
			break;
		}//if
	}//forEach
	return prod;
}//getProducto

public Producto deleteProducto(long id) {
	Producto prod = null;
	for (Producto producto : lista) {
		if(id == producto.getId()) {
			prod=producto;
			lista.remove(producto);
			break;
		}//if
	}//forEach
	return prod;
}//deleteProducto

public Producto addProducto(Producto producto) {
	lista.add(producto);
	return producto;
}

public Producto updateProducto(long id, String titulo, String descripcion, String imagen, Double precio) {
	Producto prod=null;
	for (Producto producto : lista) {
		if(id == producto.getId()) {
			if(titulo!=null) producto.setTitulo(titulo);
			if(descripcion!=null) producto.setDescripcion(descripcion);
			if(imagen!=null) producto.setImagen(imagen);
			if(precio!=null) producto.setPrecio(precio);
			
			prod=producto;			
			break;
		}//if
	}//forEach
	return prod;
}


}//class productoService
