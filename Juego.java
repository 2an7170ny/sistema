package Actividad4;

public class Juego extends Base {

	private String estilo;
	private String plataforma;

	public Juego(String estilo, String plataforma) {
		super();
		this.estilo = estilo;
		this.plataforma = plataforma;
	}

	public Juego() {

	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

}
