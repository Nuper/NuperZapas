package modelos;
// Generated 19-may-2019 16:40:36 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PedidosTotalId generated by hbm2java
 */
@Embeddable
public class PedidosTotalId implements java.io.Serializable {

	private int idPedido;
	private String clienteEmail;

	public PedidosTotalId() {
	}

	public PedidosTotalId(int idPedido, String clienteEmail) {
		this.idPedido = idPedido;
		this.clienteEmail = clienteEmail;
	}

	@Column(name = "ID_PEDIDO", nullable = false)
	public int getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	@Column(name = "CLIENTE_EMAIL", nullable = false, length = 100)
	public String getClienteEmail() {
		return this.clienteEmail;
	}

	public void setClienteEmail(String clienteEmail) {
		this.clienteEmail = clienteEmail;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PedidosTotalId))
			return false;
		PedidosTotalId castOther = (PedidosTotalId) other;

		return (this.getIdPedido() == castOther.getIdPedido())
				&& ((this.getClienteEmail() == castOther.getClienteEmail())
						|| (this.getClienteEmail() != null && castOther.getClienteEmail() != null
								&& this.getClienteEmail().equals(castOther.getClienteEmail())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdPedido();
		result = 37 * result + (getClienteEmail() == null ? 0 : this.getClienteEmail().hashCode());
		return result;
	}

}
