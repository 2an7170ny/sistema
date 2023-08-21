package Actividad4;

public class Pelicula extends Base {
	private String genero;
	private int anio;

	public Pelicula(String genero, int anio) {
		super();
		this.genero = genero;
		this.anio = anio;
	}

	public Pelicula() {

	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

}
