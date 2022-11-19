package Clases;

public class Formacion {
	private Jugador jugador;
	private boolean titular;
	private boolean capitan;

	public Formacion() {
		// TODO Auto-generated constructor stub
	}

	public Formacion(Jugador jugador, boolean titular, boolean capitan) {
		super();
		this.jugador = jugador;
		this.titular = titular;
		this.capitan = capitan;
	} 

	public boolean isCapitan() {
		return capitan;
	}

	public void setCapitan(boolean capitan) {
		this.capitan = capitan;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public boolean isTitular() {
		return titular;
	}

	public void setTitular(boolean titular) {
		this.titular = titular;
	}

}
