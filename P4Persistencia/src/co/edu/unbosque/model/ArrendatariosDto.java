package co.edu.unbosque.model;

import java.util.ArrayList;


public class ArrendatariosDto {

	private ArrayList<Arrendatarios> arrendatariosList;
	private ArrendatariosDao arrendatariosDao;
	/**
	 * ArrendatariosDto: Clase para crear el array de arreendatarios
	 * 
	 */
	public ArrendatariosDto() {
		arrendatariosList = new ArrayList<Arrendatarios>();
		arrendatariosDao = new ArrendatariosDao();
	}

	public ArrayList<Arrendatarios> getArrendatariosList() {
		return arrendatariosList;
	}

	public void setArrendatariosList(ArrayList<Arrendatarios> arrendatariosList) {
		this.arrendatariosList = arrendatariosList;
	}

	public ArrendatariosDao getArrendatariosDao() {
		return arrendatariosDao;
	}

	public void setArrendatariosDao(ArrendatariosDao arrendatariosDao) {
		this.arrendatariosDao = arrendatariosDao;
	}
	
	
}


