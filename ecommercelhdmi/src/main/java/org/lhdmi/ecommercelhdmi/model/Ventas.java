package org.lhdmi.ecommercelhdmi.model;

public class Ventas {
		private Long id;
		private Double preciototal;
		private String fechacompra;
		private Double cantidad;
		private String status;
		private String metodopago;
		
		private static long total = 0;
		
		public Ventas(Double preciototal, String fechacompra, Double cantidad, String status, String metodopago) {
			this.preciototal = preciototal;
			this.fechacompra = fechacompra;
			this.cantidad = cantidad;
			this.status = status;
			this.metodopago = metodopago;
			Ventas.total++;
			this.id = total;
		}//constructor
		
		public Ventas() {
			Ventas.total++;
			this.id = total;
		}

		public Double getPreciototal() {
			return preciototal;
		}


		public void setPreciototal(Double preciototal) {
			this.preciototal = preciototal;
		}


		public String getFechacompra() {
			return fechacompra;
		}


		public void setFechacompra(String fechacompra) {
			this.fechacompra = fechacompra;
		}


		public Double getCantidad() {
			return cantidad;
		}


		public void setCantidad(Double cantidad) {
			this.cantidad = cantidad;
		}
		
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getMetodopago() {
		return metodopago;
	}


	public void setMetodopago(String metodopago) {
		this.metodopago = metodopago;
	}


	public Long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Ventas [id=" + id + ", preciototal=" + preciototal + ", fechacompra=" + fechacompra + ", cantidad="
				+ cantidad + ", status=" + status + ", metodopago=" + metodopago + "]";
	}
	
	

}//class Ventas
