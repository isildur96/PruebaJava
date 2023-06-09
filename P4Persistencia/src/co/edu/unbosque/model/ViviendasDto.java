package co.edu.unbosque.model;

import java.util.ArrayList;

public class ViviendasDto {
	
	private ArrayList<Viviendas> viviendasList;
	private ViviendasDao viviendasDao;
	
	/**
	 * 
	 * ViviendasDto: Clase para crear el array de tipo Viviendas y asignar sus getter setters
	 */
	
	public ViviendasDto() {
		viviendasList = new ArrayList<Viviendas>();
		viviendasDao = new ViviendasDao();
	}

	public ArrayList<Viviendas> getViviendasList() {
		return viviendasList;
	}

	public void setViviendasList(ArrayList<Viviendas> viviendasList) {
		this.viviendasList = viviendasList;
	}

	public ViviendasDao getViviendasDao() {
		return viviendasDao;
	}

	public void setViviendasDao(ViviendasDao viviendasDao) {
		this.viviendasDao = viviendasDao;
	}

	
	
	
}
