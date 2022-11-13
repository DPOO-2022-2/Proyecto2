package Clases;

public class DesempenioPartido {
	private int cantidadMinutosJugados;
	private int goles;
	private int autogoles;
	private int asistencias;
	private int golesRecibidos;
	private int penalesDetenidos;
	private int penalesErrados;
	private int tarjetasAmarillas;
	private int tarjetasRojas;
	private int puntaje;
	private Puntaje puntajeDesenpenio;
	
	public Puntaje getPuntajeDesenpenio() {
		return puntajeDesenpenio;
	}

	public void setPuntajeDesenpenio(Puntaje puntajeDesenpenio) {
		this.puntajeDesenpenio = puntajeDesenpenio;
	}

	public int getCantidadMinutosJugados() {
		return cantidadMinutosJugados;
	}

	public void setCantidadMinutosJugados(int cantidadMinutosJugados) {
		this.cantidadMinutosJugados = cantidadMinutosJugados;
	}

	public int getAutogoles() {
		return autogoles;
	}

	public void setAutogoles(int autogoles) {
		this.autogoles = autogoles;
	}

	public int getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}

	public int getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(int golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public int getPenalesDetenidos() {
		return penalesDetenidos;
	}

	public void setPenalesDetenidos(int penalesDetenidos) {
		this.penalesDetenidos = penalesDetenidos;
	}

	public int getPenalesErrados() {
		return penalesErrados;
	}

	public void setPenalesErrados(int penalesErrados) {
		this.penalesErrados = penalesErrados;
	}

	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	public int getTarjetasRojas() {
		return tarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

}
