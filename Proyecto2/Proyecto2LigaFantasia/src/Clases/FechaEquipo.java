package Clases;


import java.util.ArrayList;
import java.util.List;

public class FechaEquipo {
	private String id;
	private int fecha;
	private int puntaje;
	private List<Formacion> formaciones = new ArrayList<>();
	

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

	public List<Formacion> getFormaciones() {
		return formaciones;
	}

	public void setFormaciones(List<Formacion> formaciones) {
		this.formaciones = formaciones;
	}

}
