package modelos;
// Generated 18-may-2019 13:11:36 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Carros generated by hbm2java
 */
@Entity
@Table(name = "Carros", schema = "dbo", catalog = "NuperBD")
public class Carros implements java.io.Serializable {

	private CarrosId id;
	private Clientes clientes;
	private Pedidos pedidos;

	public Carros() {
	}

	public Carros(CarrosId id, Clientes clientes, Pedidos pedidos) {
		this.id = id;
		this.clientes = clientes;
		this.pedidos = pedidos;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idCarro", column = @Column(name = "ID_CARRO", nullable = false)),
			@AttributeOverride(name = "idPedido", column = @Column(name = "ID_PEDIDO", nullable = false)),
			@AttributeOverride(name = "productoSku", column = @Column(name = "PRODUCTO_SKU", nullable = false, length = 20)),
			@AttributeOverride(name = "clienteEmail", column = @Column(name = "CLIENTE_EMAIL", nullable = false, length = 100)) })
	public CarrosId getId() {
		return this.id;
	}

	public void setId(CarrosId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLIENTE_EMAIL", nullable = false, insertable = false, updatable = false)
	public Clientes getClientes() {
		return this.clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "ID_PEDIDO", referencedColumnName = "ID_PEDIDO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PRODUCTO_SKU", referencedColumnName = "PRODUCTO_SKU", nullable = false, insertable = false, updatable = false) })
	public Pedidos getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}

}