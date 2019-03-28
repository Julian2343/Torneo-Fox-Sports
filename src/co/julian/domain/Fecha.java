package co.julian.domain;


import java.util.ArrayList;

public class Fecha {
	private String dia;
	private ArrayList<Partido> partidos;
	
	public Fecha(String dia, ArrayList<Partido> partidos) {
		super();
		this.dia = dia;
		this.partidos = partidos;
	}
	
	//almacenar todos los datos de los partidos jugados por fecha
	public void alamacenarDatosFecha(Fecha fecha) {
		partidos = fecha.partidos;
		for (int i = 0; i < partidos.size(); i++) {
			int golesLocal = partidos.get(i).getGolesLocal();
			int golesVisitante = partidos.get(i).getGolesVisitante();
			Equipo equipoGanadorPartido;
			Equipo equipoPerdedorPartido;
			
			if(golesLocal > golesVisitante) {
				partidos.get(i).getEquipoLocal().setPuntos(3);
				
				equipoGanadorPartido = partidos.get(i).getEquipoLocal();
				partidos.get(i).setEquipoGanador(equipoGanadorPartido);
				
				equipoPerdedorPartido = partidos.get(i).getEquipoVisitante();
				partidos.get(i).setEquipoPerdedor(equipoPerdedorPartido);
						
	
			}else if(golesVisitante > golesLocal) {
				partidos.get(i).getEquipoVisitante().setPuntos(3);

				equipoGanadorPartido = partidos.get(i).getEquipoVisitante();
				partidos.get(i).setEquipoGanador(equipoGanadorPartido);
				
				equipoPerdedorPartido = partidos.get(i).getEquipoLocal();
				partidos.get(i).setEquipoPerdedor(equipoPerdedorPartido);
				
			}else{
				partidos.get(i).setEmpate(true);
				partidos.get(i).getEquipoLocal().setPuntos(1);
				partidos.get(i).getEquipoVisitante().setPuntos(1);
				
			}
			
		}
	}
	
	//getters y setters
	public String getDia() {
		return dia;
	}

	public void setDia(String nombre) {
		this.dia = nombre;
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(ArrayList<Partido> partidos) {
		this.partidos = partidos;
	}
	
	
	
}
