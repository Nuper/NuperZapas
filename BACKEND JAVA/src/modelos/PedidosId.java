package modelos;
// Generated 18-may-2019 11:55:28 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PedidosId generated by hbm2java
 */
@Embeddable
public class PedidosId implements java.io.Serializable {

	private int idPedido;
	private String productoSku;

	public PedidosId() {
	}

	public PedidosId(int idPedido, String productoSku) {
		this.idPedido = idPedido;
		this.productoSku = productoSku;
	}

	@Column(name = "ID_PEDIDO", nullable = false)
	public int getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	@Column(name = "PRODUCTO_SKU", nullable = false, length = 20)
	public String getProductoSku() {
		return this.productoSku;
	}

	public void setProductoSku(String productoSku) {
		this.productoSku = productoSku;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PedidosId))
			return false;
		PedidosId castOther = (PedidosId) other;

		return (this.getIdPedido() == castOther.getIdPedido()) && ((this.getProductoSku() == castOther.getProductoSku())
				|| (this.getProductoSku() != null && castOther.getProductoSku() != null
						&& this.getProductoSku().equals(castOther.getProductoSku())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdPedido();
		result = 37 * result + (getProductoSku() == null ? 0 : this.getProductoSku().hashCode());
		return result;
	}

}
