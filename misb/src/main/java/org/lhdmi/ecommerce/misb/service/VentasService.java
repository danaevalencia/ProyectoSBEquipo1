package org.lhdmi.ecommerce.misb.service;

import java.util.List;
import java.util.Optional;
import org.lhdmi.ecommerce.misb.model.Ventas;
import org.lhdmi.ecommerce.misb.repository.VentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentasService {
	private final VentasRepository ventasRepository;
	
	@Autowired
	public VentasService(VentasRepository ventasRepository) {
		this.ventasRepository=ventasRepository;
	}
	public List<Ventas> getAllVentas(){
		return ventasRepository.findAll();
	}//getAllVentas

	public Ventas getVentas(long id) {
		return ventasRepository.findById(id).orElseThrow(
				()->new IllegalArgumentException("La venta con el id ["+id+"] no existe"));
		}//getProducto

	public Ventas deleteVentas(long id) {
			Ventas venta=null;
			if(ventasRepository.existsById(id)) {
				venta=ventasRepository.findById(id).get();
				ventasRepository.deleteById(id);
			}//is existsById
			return venta;
	}

	public Ventas addVentas(Ventas ventas) {
//		ventasRepository.save(ventas);
//				return ventas;
		
			Optional<Ventas>tmpVenta=ventasRepository.findByFolio(ventas.getFolio());
			if(tmpVenta.isEmpty()) {
				return ventasRepository.save(ventas);
			}else {
				System.out.println("Ya existe el producto con el Id ["+ventas.getFolio()+"]");
				return null;
			}
		}//addVentas
	
	public Ventas updateVentas(long id, Double preciototal, String fechacompra, Double cantidad, String status, String metodopago, String folio) {
		Ventas venta=null;
			if(ventasRepository.existsById(id)) {
				venta=ventasRepository.findById(id).get();
				if(preciototal!=null)venta.setPreciototal(preciototal);
				if(fechacompra!=null)venta.setFechacompra(fechacompra);
				if(cantidad!=null)venta.setCantidad(cantidad);
				if(status!=null)venta.setStatus(status);
				if(metodopago!=null)venta.setMetodopago(metodopago);
				if(folio!=null)venta.setFolio(folio);
				ventasRepository.save(venta);
			}//if
		return venta;
	}
	
}//classVentasService