package co.julian.app;

import java.util.ArrayList;
import java.util.Arrays;

import co.julian.domain.Equipo;
import co.julian.domain.Fecha;
import co.julian.domain.Jugador;
import co.julian.domain.Partido;
import co.julian.domain.Torneo;

public class Main {

	public static void main(String[] args) {
		
		//Jugador
		
			//nacional
		Jugador christianVargas = new Jugador("Christian Vargas", "Portero");
		Jugador joseCuadrado = new Jugador("Jose Cuadrado", "Portero");
		Jugador davidAgudelo = new Jugador("David Agudelo", "Portero");
		Jugador carlosCuesta = new Jugador("Carlos Cuesta", "Defensa central");
		Jugador alexisHenriquez = new Jugador("Alexis Henriquez", "Defensa central");
		Jugador brayanCordoba = new Jugador("Brayan Cordoba", "Defensa central");
		Jugador andresReyes = new Jugador("Andres Reyes", "Defensa central");
		Jugador sebastianYabur = new Jugador("Sebastian Yabur", "Centro campista");
		Jugador aldoLeaoRamirez = new Jugador("Aldo Leao Ramirez", "Medio centro");
		Jugador juanPabloRamirez = new Jugador("Juan Pablo Ramirez", "Medio centro ofensivo");
		Jugador omarDuarte = new Jugador("Omar Duarte", "Extemo izquierdo");
		Jugador andresSarmiento = new Jugador("Andres Sarmiento", "Extemo izquierdo");
		Jugador yersonCandelo = new Jugador("Yerson Candelo", "Extemo derecho");
		Jugador jeisonLucumi = new Jugador("Jeison Lucumí", "Extemo derecho");
		Jugador hernanBarcos = new Jugador("Hernan Barcos", "Delantero centro");
		Jugador carlosRivas = new Jugador("Carlos Rivas", "Delantero centro");
			
			//millonarios
		Jugador wuilkerFariñez = new Jugador("Wuilker Fariñez", "Portero");
		Jugador ramiroSanchez = new Jugador("Ramiro Sánchez", "Portero");
		Jugador LuisPayares = new Jugador("Luis Payares", "Defensa central");
		Jugador matiasdeLosSantos = new Jugador("Matias de los Santos", "Defensa central");
		Jugador omarBertel = new Jugador("Omar Bertel", "Lateral izquierdo");
		Jugador andresFelipeRoman = new Jugador("Andres Felipe Roman", "Lateral derecho");
		Jugador jhonDuque = new Jugador("Jhon Duque", "Pivote");
		Jugador juanGarcia = new Jugador("Juan Garcia", "Pivote");
		Jugador juanDominguez = new Jugador("Juan Dominguez", "Medio centro");
		Jugador felipeJaramillo = new Jugador("Felipe Jaramillo", "Medio centro");
		Jugador santiagoMontoya = new Jugador("Santiago Montoya Sarmiento", "Medio centro ofensivo");
		Jugador christianMarrugo = new Jugador("Christian Marrugo", "Medio centro ofensivo");
		Jugador orlesAragon = new Jugador("Orles Aragon", "Extemo izquierdo");
		Jugador christianHurfano = new Jugador("Christian Huerfano", "Extremo derecho");
		Jugador carlosLopez = new Jugador("Carlos Lopez", "Delantero centro");
		Jugador jorgeRengifo = new Jugador("Jorge Rengifo", "Delantero centro");
		
			//santafe
		Jugador leandroCastellanos = new Jugador("Leandro Castellanos", "Portero");
		Jugador geovanniBanguera = new Jugador("Geovanni Banguera", "Portero");
		Jugador carlosHenao = new Jugador("Carlos Henao", "Defensa central");
		Jugador joseMoya = new Jugador("Jose Moya", "Defensa central");
		Jugador andresPerez = new Jugador("Andres Perez", "Pivote");
		Jugador yonatanMurillo = new Jugador("Yonatan Murillo", "Lateral izquierdo");
		Jugador carlosArboleda = new Jugador("Carlos Arboleda", "Lateral derecho");
		Jugador jhonJairoVelasquez = new Jugador("Jhon Jairo Velasquez", "Centro campista");
		Jugador carlosPolo = new Jugador("Carlos Polo", "Centro campista");
		Jugador baldomeroPerlaza = new Jugador("Baldomero Perlaza", "Medio centro");
		Jugador mateoCardona = new Jugador("Mateo Cardona", "Medio centro ofensivo");
		Jugador fabioBurbano = new Jugador("Fabio Burbano", "Extemo izquierdo");
		Jugador jorgeAguirre = new Jugador("Jorge Aguirre", "Extemo Derecho");
		Jugador ArleyRodriguez = new Jugador("Arley Rodríguez", "Delantero centro");
		Jugador BrayanPerea = new Jugador("Brayan Perea", "Delantero centro");
		Jugador camiloRosero = new Jugador("Camilo Rosero", "Delantero centro");
		
			//medellin
		Jugador davidGonzalez = new Jugador("David Gonzalez", "Portero");
		Jugador andresMosquera = new Jugador("Andres Mosquera", "Portero");
		Jugador yimyGomez = new Jugador("Yimy Gomez", "Portero");
		Jugador jesusMurillo = new Jugador("Jesus Murillo", "Defensa central");
		Jugador hectorUrrego = new Jugador("Hector Urrego", "Defensa central");
		Jugador nicolasPalacios = new Jugador("Nicolas Palacios", "Defensa central");
		Jugador guillermoTegue = new Jugador("Guillermo Tegue", "Defensa central");
		Jugador wilsonLopez = new Jugador("Wilson Lopez", "Centro campista");
		Jugador williamParra = new Jugador("William Parra", "Medio centro");
		Jugador juanManuelCuesta = new Jugador("Juan Manuel Cuesta", "Medio centro ofensivo");
		Jugador larryAngulo = new Jugador("Larry Angulo", "Extemo izquierdo");
		Jugador yorleysMena = new Jugador("Yorleys Mena", "Extemo izquierdo");
		Jugador alejandroBarbaro = new Jugador("Alejandro Barbaro", "Extemo derecho");
		Jugador williamPalacios = new Jugador("William Palacios", "Delantero centro");
		Jugador diegoHerazo = new Jugador("Diego Herazo", "Delantero centro");
		Jugador leonardoCastro = new Jugador("Leonardo Castro", "Delantero centro");
		
		ArrayList<Jugador> jugadoresNacional = new ArrayList<Jugador>(Arrays.asList(christianVargas, joseCuadrado , davidAgudelo, carlosCuesta ,alexisHenriquez, brayanCordoba, andresReyes, sebastianYabur, aldoLeaoRamirez, juanPabloRamirez, omarDuarte, andresSarmiento, yersonCandelo, jeisonLucumi, hernanBarcos, carlosRivas));
		ArrayList<Jugador> jugadoresMillonarios = new ArrayList<Jugador>(Arrays.asList(wuilkerFariñez, ramiroSanchez , LuisPayares, matiasdeLosSantos ,omarBertel, andresFelipeRoman, jhonDuque, juanGarcia, juanDominguez, felipeJaramillo, santiagoMontoya, christianMarrugo, orlesAragon, christianHurfano, carlosLopez, jorgeRengifo));
		ArrayList<Jugador> jugadoresSantafe = new ArrayList<Jugador>(Arrays.asList(leandroCastellanos, geovanniBanguera , carlosHenao, joseMoya , andresPerez, yonatanMurillo, carlosArboleda, jhonJairoVelasquez, carlosPolo, baldomeroPerlaza, mateoCardona, fabioBurbano, jorgeAguirre, ArleyRodriguez, BrayanPerea, camiloRosero));
		ArrayList<Jugador> jugadoresMedellin = new ArrayList<Jugador>(Arrays.asList(davidGonzalez, andresMosquera , yimyGomez, jesusMurillo , hectorUrrego, nicolasPalacios, guillermoTegue, wilsonLopez, williamParra, juanManuelCuesta, larryAngulo, yorleysMena, alejandroBarbaro, williamPalacios, diegoHerazo, leonardoCastro));
		
		//Equipo
		Equipo nacional = new Equipo("Atletico Nacional", jugadoresNacional);
		Equipo millonarios = new Equipo("Millonarios FC", jugadoresMillonarios);
		Equipo santafe = new Equipo("Independiente Santa Fe", jugadoresSantafe);
		Equipo medellin = new Equipo("Independiente Medellin", jugadoresMedellin);	
		ArrayList<Equipo> equiposTorneo = new ArrayList<Equipo>(Arrays.asList(nacional, millonarios, santafe, medellin));
		
		//Partido
		
		//1er dia
		Partido nacionalVSmillonarios = new Partido("Atletico Nacional VS Millonarios FC", nacional, millonarios, 3, 3 );
		Partido medellinVSsantafe = new Partido("Independiente Medellin VS Independiente Santa Fe", medellin, santafe, 2, 4);
		ArrayList<Partido> partidosFecha1 = new ArrayList<Partido>(Arrays.asList(nacionalVSmillonarios, medellinVSsantafe));
		
		//2do dia
		Partido nacionalVSmedellin = new Partido("Atletico Nacional VS Independiente Medellin", nacional, medellin, 4, 3 );
		Partido millonariosVSsantafe = new Partido("Millonarios FC VS Independiente Santa Fe", millonarios, santafe, 5, 4);
		ArrayList<Partido> partidosFecha2 = new ArrayList<Partido>(Arrays.asList(nacionalVSmedellin, millonariosVSsantafe));
		
		//3er dia
		Partido nacionalVSsantafe = new Partido("Atletico Nacional VS Independiente Santa Fe", nacional, santafe, 3, 5 );
		Partido medellinVSmillonarios = new Partido("Independiente Medellin VS Millonarios FC", medellin, millonarios, 4, 3);
		ArrayList<Partido> partidosFecha3 = new ArrayList<Partido>(Arrays.asList(nacionalVSsantafe, medellinVSmillonarios));
		
		//Fecha
		Fecha fecha1 = new Fecha("3 de junio del 2019", partidosFecha1);
		Fecha fecha2 = new Fecha("4 de junio del 2019", partidosFecha2);
		Fecha fecha3 = new Fecha("5 de junio del 2019", partidosFecha3);
		
		fecha1.alamacenarDatosFecha(fecha1);
		fecha2.alamacenarDatosFecha(fecha2);
		fecha3.alamacenarDatosFecha(fecha3);
	
		
		//Torneo
		Torneo copaAlpinito = new Torneo("Copa Alpinito");
		copaAlpinito.setEquipos(equiposTorneo);
		
		
		System.out.println("Los equipos que participaron en el torneo fueron: " + copaAlpinito.obtenerListaDeEquipos(equiposTorneo) +  "\n");
		copaAlpinito.partidosFechaResultados(fecha1);
		System.out.println("\n");
		copaAlpinito.partidosFechaResultados(fecha2);
		System.out.println("\n");
		copaAlpinito.partidosFechaResultados(fecha3);
		System.out.println("\n");
		
		System.out.println("Los jugadores " + nacional.jugadoresCompartenPosicionPorEquipo("Portero") + " comparten la misma posicion" + "\n");
		System.out.println("Los jugadores " + millonarios.jugadoresCompartenPosicionPorEquipo("Defensa central") + " comparten la misma posicion" + "\n");
		
		
		
		

	}

}
