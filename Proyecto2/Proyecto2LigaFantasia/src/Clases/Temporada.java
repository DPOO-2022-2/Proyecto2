package Clases;

import java.util.List;

public class Temporada {
	private String id;
	private List<FechaEquipo> fechas;
	private boolean temporada_activa;
	private List<Equipo> equipos;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<FechaEquipo> getFechas() {
		return fechas;
	}
	public void setFechas(List<FechaEquipo> fechas) {
		this.fechas = fechas;
	}
	public List<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}
	public boolean isTemporada_activa() {
		return temporada_activa;
	}
	public void setTemporada_activa(boolean temporada_activa) {
		this.temporada_activa = temporada_activa;
	}
	
}
