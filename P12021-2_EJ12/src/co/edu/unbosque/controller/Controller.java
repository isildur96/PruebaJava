package co.edu.unbosque.controller;

import co.edu.unbosque.model.Campeonato;
import co.edu.unbosque.view.VistaConsola;

public class Controller  {
		
	private VistaConsola vista;
	private Campeonato campeonato;
	
	public Controller() {
		vista= new VistaConsola();
		campeonato = new Campeonato();
		funcionar();
	}
	
	public void funcionar() {
		vista.mostrarInformacion(campeonato.InformacionCampeonato());
		campeonato.agregarEquipo("Pasto");
		campeonato.agregarEquipo("Junior");
		vista.mostrarInformacion("Adicionados los nuevo equipos");
		vista.mostrarInformacion(campeonato.InformacionCampeonato());
	}


}
