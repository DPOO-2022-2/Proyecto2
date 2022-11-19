package Clases;

import java.util.ArrayList;
import java.util.List;

public class EquipoFantasia {
	private boolean Equipo_fantasia;
	private List<JugadorFantasia> Jugadores = new ArrayList<>();
	private String Nombre;
	private double Presupuesto;
	private List<FechaEquipo> Fechas = new ArrayList<>();
	

	public boolean isEquipo_Fantasia() {
		return Equipo_fantasia;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public Double getPresupuesto() {
		return Presupuesto;
	}

	public void setPresupuesto(Double presupuesto) {
		this.Presupuesto = presupuesto;
	}

	public List<JugadorFantasia> getJugadores() {
		return Jugadores;
	}

	public void setJugadores(List<JugadorFantasia> arreglo) {
		this.Jugadores = arreglo;
	}

	public List<FechaEquipo> getFechas() {
		return Fechas;
	}

	public void setFechas(List<FechaEquipo> fechas) {
		this.Fechas = fechas;
	}

	

}
