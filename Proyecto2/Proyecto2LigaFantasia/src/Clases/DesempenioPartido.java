package Clases;

public class DesempenioPartido {
	
	private String nombre;
	private String equipo;
	private int CantidadMinutosJugados;
	private int Goles;
	private int Autogoles;
	private int Asistencias;
	private int GolesRecibidos;
	private int PenalesDetenidos;
	private int PenalesErrados;
	private int TarjetasAmarillas;
	private int TarjetasRojas;
	private int Puntaje;
	private Puntaje PuntajeDesenpenio;
	
	public Puntaje getPuntajeDesenpenio() {
		return PuntajeDesenpenio;
	}

	public void setPuntajeDesenpenio(Puntaje puntajeDesenpenio) {
		this.PuntajeDesenpenio = puntajeDesenpenio;
	}

	public int getCantidadMinutosJugados() {
		return CantidadMinutosJugados;
	}

	public void setCantidadMinutosJugados(int cantidadMinutosJugados) {
		this.CantidadMinutosJugados = cantidadMinutosJugados;
	}

	public int getAutogoles() {
		return Autogoles;
	}

	public void setAutogoles(int autogoles) {
		this.Autogoles = autogoles;
	}

	public int getAsistencias() {
		return Asistencias;
	}

	public void setAsistencias(int asistencias) {
		this.Asistencias = asistencias;
	}

	public int getGolesRecibidos() {
		return GolesRecibidos;
	}

	public void setGolesRecibidos(int golesRecibidos) {
		this.GolesRecibidos = golesRecibidos;
	}

	public int getPenalesDetenidos() {
		return PenalesDetenidos;
	}

	public void setPenalesDetenidos(int penalesDetenidos) {
		this.PenalesDetenidos = penalesDetenidos;
	}

	public int getPenalesErrados() {
		return PenalesErrados;
	}

	public void setPenalesErrados(int penalesErrados) {
		this.PenalesErrados = penalesErrados;
	}

	public int getTarjetasAmarillas() {
		return TarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.TarjetasAmarillas = tarjetasAmarillas;
	}

	public int getTarjetasRojas() {
		return TarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		this.TarjetasRojas = tarjetasRojas;
	}

	public int getGoles() {
		return Goles;
	}

	public void setGoles(int goles) {
		this.Goles = goles;
	}

	public int getPuntaje() {
		return Puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.Puntaje = puntaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

}
