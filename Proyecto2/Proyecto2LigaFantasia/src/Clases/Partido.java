package Clases;

public class Partido {
	private String Id;
	private String Equipo_local;
	private String Equipo_visitante;
	private String Goles_local;
	private String Goles_visitante;
	private String Fecha;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		this.Id = id;
	}

	public String getEquipo_local() {
		return Equipo_local;
	}

	public void setEquipo_local(String string) {
		this.Equipo_local = string;
	}

	public String getEquipo_visitante() {
		return Equipo_visitante;
	}

	public void setEquipo_visitante(String equipo_visitante) {
		this.Equipo_visitante = equipo_visitante;
	}

	public String getGoles_local() {
		return Goles_local;
	}

	public void setGoles_local(String goles_local) {
		this.Goles_local = goles_local;
	}

	public String getGoles_visitante() {
		return Goles_visitante;
	}

	public void setGoles_visitante(String goles_visitante) {
		this.Goles_visitante = goles_visitante;
	}

	public void setId(int size) {
		// TODO Auto-generated method stub
		
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

}
