package cl.ventas.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name="fatura")
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer num_factura;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable=false, foreignKey = @ForeignKey(name = "FK_id_cliente"))
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="num_pago", nullable=false, foreignKey = @ForeignKey(name = "FK_num_pago"))
	private ModoPago num_pago;
	
	private LocalDateTime fecha;

	public Integer getNum_factura() {
		return num_factura;
	}

	public void setNum_factura(Integer num_factura) {
		this.num_factura = num_factura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ModoPago getNum_pago() {
		return num_pago;
	}

	public void setNum_pago(ModoPago num_pago) {
		this.num_pago = num_pago;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
}
