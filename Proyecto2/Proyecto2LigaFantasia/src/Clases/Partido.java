package Clases;

public class Partido {
	private String id;
	private Equipo equipo_local;
	private Equipo equipo_visitante;
	private int goles_local;
	private int goles_visitante;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Equipo getEquipo_local() {
		return equipo_local;
	}

	public void setEquipo_local(Equipo equipo_local) {
		this.equipo_local = equipo_local;
	}

	public Equipo getEquipo_visitante() {
		return equipo_visitante;
	}

	public void setEquipo_visitante(Equipo equipo_visitante) {
		this.equipo_visitante = equipo_visitante;
	}

	public int getGoles_local() {
		return goles_local;
	}

	public void setGoles_local(int goles_local) {
		this.goles_local = goles_local;
	}

	public int getGoles_visitante() {
		return goles_visitante;
	}

	public void setGoles_visitante(int goles_visitante) {
		this.goles_visitante = goles_visitante;
	}

}
