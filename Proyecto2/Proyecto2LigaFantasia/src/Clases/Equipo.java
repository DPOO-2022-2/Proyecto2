package Clases;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private String id;
	private boolean Equipo_real;
	private List<Jugador> Jugadores = new ArrayList<>();
	private String Nombre;
	private double Presupuesto;
	private List<FechaEquipo> Fechas = new ArrayList<>();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isEquipo_real() {
		return Equipo_real;
	}

	public void setEquipo_real(boolean equipo_real) {
		this.Equipo_real = equipo_real;
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

	public List<Jugador> getJugadores() {
		return Jugadores;
	}

	public void setJugadores(List<Jugador> arreglo) {
		this.Jugadores = arreglo;
	}

	public List<FechaEquipo> getFechas() {
		return Fechas;
	}

	public void setFechas(List<FechaEquipo> fechas) {
		this.Fechas = fechas;
	}

	

}
