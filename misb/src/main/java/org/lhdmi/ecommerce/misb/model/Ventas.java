package org.lhdmi.ecommerce.misb.model;

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
	@Column(name="idventas", unique=true, nullable=false)
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
	@Column(nullable=false)
	private String folio;
	public Ventas(Double preciototal, String fechacompra, Double cantidad, String status, String metodopago, String folio) {
		this.preciototal = preciototal;
		this.fechacompra = fechacompra;
		this.cantidad = cantidad;
		this.status = status;
		this.metodopago = metodopago;
		this.folio = folio;
		}

		public Ventas() {
			// TODO Auto-generated constructor stub
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
		public String getFolio() {
			return folio;
		}

		public void setFolio(String folio) {
			this.folio = folio;
		}

		@Override
		public String toString() {
			return "Ventas [id=" + id + ", preciototal=" + preciototal + ", fechacompra=" + fechacompra + ", cantidad="
					+ cantidad + ", status=" + status + ", metodopago=" + metodopago + ", folio=" + folio + "]";
		}//toString
		
}//class Ventas