package modelos;
// Generated 19-may-2019 19:37:15 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CategoriasId generated by hbm2java
 */
@Embeddable
public class CategoriasId implements java.io.Serializable {

	private int catCod1;
	private int catCod2;

	public CategoriasId() {
	}

	public CategoriasId(int catCod1, int catCod2) {
		this.catCod1 = catCod1;
		this.catCod2 = catCod2;
	}

	@Column(name = "CAT_COD_1", nullable = false)
	public int getCatCod1() {
		return this.catCod1;
	}

	public void setCatCod1(int catCod1) {
		this.catCod1 = catCod1;
	}

	@Column(name = "CAT_COD_2", nullable = false)
	public int getCatCod2() {
		return this.catCod2;
	}

	public void setCatCod2(int catCod2) {
		this.catCod2 = catCod2;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CategoriasId))
			return false;
		CategoriasId castOther = (CategoriasId) other;

		return (this.getCatCod1() == castOther.getCatCod1()) && (this.getCatCod2() == castOther.getCatCod2());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCatCod1();
		result = 37 * result + this.getCatCod2();
		return result;
	}

}
