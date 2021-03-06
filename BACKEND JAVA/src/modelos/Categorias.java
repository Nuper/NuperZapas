package modelos;
// Generated 19-may-2019 19:37:15 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Categorias generated by hbm2java
 */
@Entity
@Table(name = "Categorias", schema = "dbo", catalog = "NuperBD")
public class Categorias implements java.io.Serializable {

	private CategoriasId id;
	private String nombre;

	public Categorias() {
	}

	public Categorias(CategoriasId id) {
		this.id = id;
	}

	public Categorias(CategoriasId id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "catCod1", column = @Column(name = "CAT_COD_1", nullable = false)),
			@AttributeOverride(name = "catCod2", column = @Column(name = "CAT_COD_2", nullable = false)) })
	public CategoriasId getId() {
		return this.id;
	}

	public void setId(CategoriasId id) {
		this.id = id;
	}

	@Column(name = "NOMBRE", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
