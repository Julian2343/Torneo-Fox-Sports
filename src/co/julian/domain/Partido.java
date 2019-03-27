package co.julian.domain;

public class Partido {
	private String nombre;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int golesLocal;
	private int golesVisitante;
	private Equipo equipoGanador;
	private Equipo equipoPerdedor;
	private boolean empate;
	
	public Partido(String nombre, Equipo equipoLocal, Equipo equipoVisitante, int golesLocal, int golesVisitante) {
		this.nombre = nombre;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
		
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public Equipo getEquipoGanador() {
		return equipoGanador;
	}

	public void setEquipoGanador(Equipo equipoGanador) {
		this.equipoGanador = equipoGanador;
	}

	public Equipo getEquipoPerdedor() {
		return equipoPerdedor;
	}

	public void setEquipoPerdedor(Equipo equipoPerdedor) {
		this.equipoPerdedor = equipoPerdedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEmpate() {
		return empate;
	}

	public void setEmpate(boolean empate) {
		this.empate = empate;
	}
	
	
	
	
	
}
