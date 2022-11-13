package Clases;

import java.util.List;

public class FechaTemporada {
	private String id;
	private int fecha;
	private int puntaje;
	private List<Partido> partidos;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}

}
