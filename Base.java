package Actividad4;

public class Base {

	private String nombreProducto;
	private int precioProducto;
	private int diasRenta;
	private int disponible;

	public Base() {

	}

	public Base(String nombreProducto, int precioProducto, int diasRenta, int disponible) {
		super();
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.diasRenta = diasRenta;
		this.disponible = disponible;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(int precioProducto) {
		this.precioProducto = precioProducto;
	}

	public int getDiasRenta() {
		return diasRenta;
	}

	public void setDiasRenta(int diasRenta) {
		this.diasRenta = diasRenta;
	}

	public int getDisponible() {
		return disponible;
	}

	public void setDisponible(int disponible) {
		this.disponible = disponible;
	}
}
