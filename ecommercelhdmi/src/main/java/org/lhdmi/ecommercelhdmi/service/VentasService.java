package org.lhdmi.ecommercelhdmi.service;

import java.util.ArrayList;

import org.lhdmi.ecommercelhdmi.model.Ventas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

	@Service
	public class VentasService {
		public final ArrayList<Ventas> lista = new ArrayList<Ventas>();
		@Autowired
		public VentasService() {
			lista.add(new Ventas(2000.00, "2023-11-20", 1.0, "proceso de envío", "tarjeta de crédito"));
			lista.add(new Ventas(7000.00, "2023-10-18", 3.0, "enviado", "paypal"));
			lista.add(new Ventas(5000.00, "2023-01-26", 2.0, "devuelto", "oxxo"));
			lista.add(new Ventas(3000.00, "2023-11-02", 1.0, "enviado", "tarjeta débito"));
			lista.add(new Ventas(6000.00, "2023-05-03", 2.0, "entregado", "tarjeta de crédito"));  
			lista.add(new Ventas(2500.00, "2023-07-20", 1.0, "enviado", "débito"));
			lista.add(new Ventas(4000.00, "2023-11-08", 2.0, "procesodeenvio", "paypal"));
			lista.add(new Ventas(1000.00, "2023-02-14", 1.0, "enviado", "tarjeta de crédito")); 
			lista.add(new Ventas(1500.00, "2023-09-12", 2.0, "enviado", "oxxo"));
			lista.add(new Ventas(7000.00, "2023-09-07", 1.0, "entregado", "tarjeta de crédito"));
		}//constructor
		
		public ArrayList<Ventas> getAllVentas(){
			return lista;
		}//getAllVentas

		public Ventas getVentas(long id) {
				Ventas venta=null;
				for (Ventas ventas : lista) {
					if(id==ventas.getId()) {
						venta=ventas;
						break;
					}
				}//forEach
				return venta;
			}//getProducto

		public Ventas deleteVentas(long id) {
				Ventas venta=null;
				for (Ventas ventas : lista) {
					if(id==ventas.getId()) {
						venta=ventas;
						lista.remove(ventas);
						break;
					}
				}//foEach
				return venta;
		}

		public Ventas addVentas(Ventas ventas) {
				lista.add(ventas);
				return ventas;
			}
		
		public Ventas updateVentas(long id, Double preciototal, String fechacompra, Double cantidad, String status, String metodopago) {
			Ventas venta=null;
			for (Ventas ventas : lista) {
				if(id==ventas.getId()) {
					if(preciototal!=null)ventas.setPreciototal(preciototal);
					if(fechacompra!=null)ventas.setFechacompra(fechacompra);
					if(cantidad!=null)ventas.setCantidad(cantidad);
					if(status!=null)ventas.setStatus(status);
					if(metodopago!=null)ventas.setMetodopago(metodopago);
					venta=ventas;
					break;
				}//if
			}//forEach
			return venta;
		}
		
	}//classVentasService

