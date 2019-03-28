package co.julian.domain;


import java.util.ArrayList;
import java.util.Collections;

public class Torneo {
	private String nombre;
	private ArrayList<Fecha> fechas;
	private ArrayList<Equipo> equipos;
	
	//constructor
	public Torneo(String nombre) {
		this.nombre = nombre;
	}

	//metodos
	
	//saber resultados de partidos por fecha
	public void partidosFechaResultados(Fecha fecha) {
		ArrayList<String> PartidosJugados = new ArrayList<String>();
		ArrayList<Partido> partidos = fecha.getPartidos();
		String nombresPartidos;
		Equipo equipoGanador;
		int golesLocal;
		int golesVisitante;
		
		for (int i = 0; i < partidos.size(); i++) {
			nombresPartidos = partidos.get(i).getNombre();
			PartidosJugados.add(nombresPartidos);
			
		}
		
		System.out.println("En " + fecha.getDia() + " Se jugaron los siguientes partidos " + PartidosJugados);
		
		for (int i = 0; i < partidos.size(); i++) {
			if (partidos.get(i).isEmpate() == false) {
				nombresPartidos = partidos.get(i).getNombre();
				equipoGanador = partidos.get(i).getEquipoGanador();
				golesLocal = partidos.get(i).getGolesLocal();
				golesVisitante = partidos.get(i).getGolesVisitante();
				
				System.out.println("En " + nombresPartidos + " Gano " +  equipoGanador.getNombre() + " y el partido quedo " + golesLocal + " a " + golesVisitante);

			}else {
				nombresPartidos = partidos.get(i).getNombre();
				golesLocal = partidos.get(i).getGolesLocal();
				golesVisitante = partidos.get(i).getGolesVisitante();
				System.out.println("En " + nombresPartidos + " Hubo un empate y el marcador quedo "  + golesLocal + " a " + golesVisitante );
			}
		}
	}
	
	//obtener la lista de los equipos
	public ArrayList<String> obtenerListaDeEquipos(ArrayList<Equipo> equipos) {
		ArrayList<String> nombresEquiposTorneo = new ArrayList<String>();
		String nombreEquipo;
		for (int i = 0; i < equipos.size(); i++) {
			nombreEquipo = equipos.get(i).getNombre();
			nombresEquiposTorneo.add(nombreEquipo);
		}
		return nombresEquiposTorneo;
	}
	
	//metodo de tabla de posiciones
	public ArrayList<String> tablaPosiciones(ArrayList<Equipo> equipos) {
		ArrayList<String> posiciones = new ArrayList<String>();
		ArrayList<Integer> puntos = new ArrayList<Integer>();
		int puntosPorEquipo;
		for (int i = 0; i < equipos.size(); i++) {
			puntosPorEquipo = equipos.get(i).getPuntos();
			puntos.add(puntosPorEquipo);
		}
		Collections.sort(puntos, Collections.reverseOrder());
		
		for (int i = 0; i < puntos.size(); i++) {
			for (int j = 0; j < equipos.size(); j++) {
				if (equipos.get(j).getPuntos() == puntos.get(i)) {
					posiciones.add(equipos.get(j).getNombre());
				}
			}
			
		}return posiciones;
	}
	
	//getters and setters
	public ArrayList<Fecha> getFechas() {
		return fechas;
	}
	
	public void setFechas(ArrayList<Fecha> fechas) {
		this.fechas = fechas;
	}
	
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	public String getNombre() {
		return nombre;
	}
	

}
