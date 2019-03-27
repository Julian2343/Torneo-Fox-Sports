package co.julian.domain;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList<Jugador> jugadores;
	private int puntos; //ganar +3 puntos,   empate +1;
	
	
	//constructores
	public Equipo(String nombre, ArrayList<Jugador> jugadores) {
		this.nombre = nombre;
		this.jugadores = jugadores;
		
	}

	
	//metodos
	
	public ArrayList<String> jugadoresCompartenPosicionPorEquipo(String posicionAConsultar){
		ArrayList<String> jugadoresMismaPosicion = new ArrayList<String>();
		String posicionJugador;
		String nombreJugador;
		
		for (int i = 0; i < jugadores.size(); i++) {
			posicionJugador = jugadores.get(i).getPosicion();
			nombreJugador = jugadores.get(i).getNombre();
			if (posicionJugador == posicionAConsultar) {
				jugadoresMismaPosicion.add(nombreJugador);
			}
		}
		return jugadoresMismaPosicion;
		
	}
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos += puntos;
	}
	
	
	
	
}
