package co.edu.unbosque.model;

import java.io.IOException;

import co.edu.unbosque.model.persistence.Archivo;

public class Campeonato {
	
	private int maxEquipos;
	private Equipo[] equipos;
	private Archivo archivo;
	
	public Campeonato() {
		archivo = new Archivo();
		try {
			archivo.leerConfiguracion();
		} catch (IOException e) {
			e.printStackTrace();
		}
		maxEquipos = Integer.parseInt(obtenerPropiedad("campeonato.equipos"));
		equipos = new Equipo[maxEquipos];
		inicializarEquipos();
	}
	
	public String obtenerPropiedad(String propiedad) {
		return archivo.getDatos().getProperty(propiedad);
	}
	
	public void modificarPropiedad(String propiedad, String valor) {
		archivo.escribirPropiedades(propiedad, valor);
	}
	
	public void inicializarEquipos() {
		for(int i= 0; i < maxEquipos; i++) {
			String nombre = obtenerPropiedad("campeonato.nombre"+i);
			equipos[i] = new Equipo(nombre);
		}
	}
	
	public String InformacionCampeonato() {
		String info = "Cantidad de equipos: " + maxEquipos + "\n";
		for(int i = 0; i < maxEquipos; i++) {
			info += equipos[i] + "\n";
		}
		return info;
	}
	
	public void agregarEquipo(String nombre) {
		maxEquipos++;
		modificarPropiedad("campeonato.equipos", ""+maxEquipos);
		equipos = new Equipo[maxEquipos];
		modificarPropiedad("campeonato.nombre"+(maxEquipos-1), nombre);
		inicializarEquipos(); 
	}
	
}
