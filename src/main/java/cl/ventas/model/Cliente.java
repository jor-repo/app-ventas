package cl.ventas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cliente;
	
	@Size(min=3, message= "Valor con minimo 3 caracteres")
	@Column(name="nombre", nullable=false, length=70)
	private String nombre;
	
	@Size(min=3, message="Valor con minimo 3 caractere")
	@Column(name="apellido", nullable=false, length=70)
	private String apellido;
	
	@Size(min=5, message="Valor con minimo 5 caractere")
	@Column(name="direccion", nullable=true, length=150)
	private String direccion;
	
	@Size(min=9, max=9, message="Telefono debe tener 9 caracteres")
	@Column(name="telefono", nullable=true, length=9)
	private String telefono;
	
	@Email
	@Column(name="email", nullable=true, length=55)
	private String email;

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
