package Clases;

import java.util.Objects;

public class JugadorFantasia extends DesempenioPartido{

	private String nombre;
	private String id;
	private String posicion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}

	public String getId() {
		return id; 
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JugadorFantasia other = (JugadorFantasia) obj;
		return Objects.equals(id, other.id);
	}

}