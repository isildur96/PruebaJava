package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistance.A_Viviendas;

public class ViviendasDao {
	
	private A_Viviendas file;

	public ViviendasDao() {
		file = new A_Viviendas();
	}

	public String verViviendas(ArrayList<Viviendas> datos) {
		ArrayList<Viviendas> viviendasList = datos;
		String texto = "";
		for (int i = 0; i < viviendasList.size(); i++) {
			texto = texto.concat(viviendasList.get(i) + "\n");
		}
		return texto;

	}

	public Viviendas buscarVivienda(String id, ArrayList<Viviendas> viviendasList) {
		Viviendas encontrado = null;

		if (!viviendasList.isEmpty()) {
			for (int i = 0; i < viviendasList.size(); i++) {
				if (viviendasList.get(i).getVivienda_id().equals(id)) {
					encontrado = viviendasList.get(i);
				}
			}
		}
		return encontrado;
	}

	public boolean agregarVivienda(String dir, String habs, String propietario, String vivienda_id, int space,
			ArrayList<Viviendas> viviendasList) {

		Viviendas nuevo = new Viviendas(dir, habs, propietario, vivienda_id, space);

		if (buscarVivienda(vivienda_id, viviendasList) == null) {
			viviendasList.add(nuevo);
			return true;
		} else {
			return false;
		}
	}

	
	public boolean eliminarVivienda(String dir, String habs, String propietario, String vivienda_id, int space,
			ArrayList<Viviendas> viviendasList) {
		boolean resp=false;
		Viviendas v = buscarVivienda(vivienda_id, viviendasList);
		if (v!= null) {
			viviendasList.remove(v);
			resp = true;
		}
		return resp;
	}
	
	public boolean modificarVivienda(String dir, String habs, String propietario, String vivienda_id, int space,
			ArrayList<Viviendas> viviendasList) {
		boolean resp = false;
		Viviendas v = buscarVivienda(vivienda_id, viviendasList);
		if (v!=null) {
			viviendasList.remove(v);
			v.setHabs(habs);
			viviendasList.add(v);
			resp = true;
		}
		return resp;
	}

	public A_Viviendas getFile() {
		return file;
	}

	public void setFile(A_Viviendas file) {
		this.file = file;
	}
	
}