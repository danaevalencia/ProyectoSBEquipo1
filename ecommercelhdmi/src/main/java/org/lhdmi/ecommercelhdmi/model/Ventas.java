package org.lhdmi.ecommercelhdmi.model;
//POJO Plain Old Java Object

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ventas")//el nombre de la tabla es ventas
public class Ventas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	private Long id;
	@Column(nullable=false)
	private Double preciototal;
	@Column(nullable=false)
	private String fechacompra;
	@Column(nullable=false)
	private Double cantidad;
	@Column(nullable=false)
	private String status;
	@Column(nullable=false)
	private String metodopago;
		
		
		public Ventas(Double preciototal, String fechacompra, Double cantidad, String status, String metodopago) {
			this.preciototal = preciototal;
			this.fechacompra = fechacompra;
			this.cantidad = cantidad;
			this.status = status;
			this.metodopago = metodopago;
		}//constructor

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