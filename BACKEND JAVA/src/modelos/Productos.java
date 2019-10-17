package modelos;
// Generated 18-may-2019 11:55:28 by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Productos generated by hbm2java
 */
@Entity
@Table(name = "Productos", schema = "dbo", catalog = "NuperBD")
public class Productos implements java.io.Serializable {

	private String sku;
	private String nombre;
	private String descripcion;
	private String marca;
	private String categoria;
	private String categoriaPadre;
	private String tallas;
	private double precio;
	private int stock;
	private boolean esOferta;
	private boolean esRebajas;
	private String imgSmall;
	private String imgBig;
	//private Set<Pedidos> pedidoses = new HashSet<Pedidos>(0);
	//private Set<Valoraciones> valoracioneses = new HashSet<Valoraciones>(0);

	public Productos() {
	}

	public Productos(String sku, String nombre, String marca, String categoria, double precio, int stock,
			boolean esOferta, boolean esRebajas) {
		this.sku = sku;
		this.nombre = nombre;
		this.marca = marca;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
		this.esOferta = esOferta;
		this.esRebajas = esRebajas;
	}

	public Productos(String sku, String nombre, String descripcion, String marca, String categoria,
			String categoriaPadre, String tallas, double precio, int stock, boolean esOferta, boolean esRebajas,
			String imgSmall, String imgBig, Set<Pedidos> pedidoses, Set<Valoraciones> valoracioneses) {
		this.sku = sku;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.marca = marca;
		this.categoria = categoria;
		this.categoriaPadre = categoriaPadre;
		this.tallas = tallas;
		this.precio = precio;
		this.stock = stock;
		this.esOferta = esOferta;
		this.esRebajas = esRebajas;
		this.imgSmall = imgSmall;
		this.imgBig = imgBig;
		//this.pedidoses = pedidoses;
		//this.valoracioneses = valoracioneses;
	}

	@Id

	@Column(name = "SKU", unique = true, nullable = false, length = 20)
	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	@Column(name = "NOMBRE", nullable = false, length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "DESCRIPCION", length = 500)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "MARCA", nullable = false, length = 50)
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Column(name = "CATEGORIA", nullable = false, length = 50)
	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Column(name = "CATEGORIA_PADRE", length = 50)
	public String getCategoriaPadre() {
		return this.categoriaPadre;
	}

	public void setCategoriaPadre(String categoriaPadre) {
		this.categoriaPadre = categoriaPadre;
	}

	@Column(name = "TALLAS", length = 50)
	public String getTallas() {
		return this.tallas;
	}

	public void setTallas(String tallas) {
		this.tallas = tallas;
	}

	@Column(name = "PRECIO", nullable = false, precision = 53, scale = 0)
	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Column(name = "STOCK", nullable = false)
	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Column(name = "ES_OFERTA", nullable = false)
	public boolean isEsOferta() {
		return this.esOferta;
	}

	public void setEsOferta(boolean esOferta) {
		this.esOferta = esOferta;
	}

	@Column(name = "ES_REBAJAS", nullable = false)
	public boolean isEsRebajas() {
		return this.esRebajas;
	}

	public void setEsRebajas(boolean esRebajas) {
		this.esRebajas = esRebajas;
	}

	@Column(name = "IMG_SMALL", length = 500)
	public String getImgSmall() {
		return this.imgSmall;
	}

	public void setImgSmall(String imgSmall) {
		this.imgSmall = imgSmall;
	}

	@Column(name = "IMG_BIG", length = 500)
	public String getImgBig() {
		return this.imgBig;
	}

	public void setImgBig(String imgBig) {
		this.imgBig = imgBig;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productos")
//	public Set<Pedidos> getPedidoses() {
//		return this.pedidoses;
//	}
//
//	public void setPedidoses(Set<Pedidos> pedidoses) {
//		this.pedidoses = pedidoses;
//	}
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productos")
//	public Set<Valoraciones> getValoracioneses() {
//		return this.valoracioneses;
//	}
//
//	public void setValoracioneses(Set<Valoraciones> valoracioneses) {
//		this.valoracioneses = valoracioneses;
//	}

}
