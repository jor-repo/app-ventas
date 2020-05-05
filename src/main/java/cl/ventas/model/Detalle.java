package cl.ventas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name="detalle")
public class Detalle {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer num_detalle;
	
	@ManyToOne
	@JoinColumn(name="id_factura", nullable=false, foreignKey = @ForeignKey(name = "FK_num_factura"))
	private Factura num_factura;

	@ManyToOne
	@JoinColumn(name="id_producto", nullable=false, foreignKey = @ForeignKey(name = "FK_id_producto"))
	private Producto id_producto;
	
	@Column(name="cantidad")
	private Integer cantidad;
	
	@Column(name="precio")
	private Integer precio;

	public Integer getNum_detalle() {
		return num_detalle;
	}

	public void setNum_detalle(Integer num_detalle) {
		this.num_detalle = num_detalle;
	}

	public Factura getNum_factura() {
		return num_factura;
	}

	public void setNum_factura(Factura num_factura) {
		this.num_factura = num_factura;
	}

	public Producto getId_producto() {
		return id_producto;
	}

	public void setId_producto(Producto id_producto) {
		this.id_producto = id_producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	
}
