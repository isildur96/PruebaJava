package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistance.A_Viviendas;

public class ViviendasDao {

/**
 * ViviendasDao: Clase para ingresar, buscar y ver los arrays de tipo Viviendas
 * 	
 */
	
	private A_Viviendas file;

	
	public ViviendasDao() {
		file = new A_Viviendas();
	}

	/**
	 * verViviendas: Metodo para verificar que haya contenido en el ararray
	 * @param 
	 * @return texto : el contenido del array
	 */
	public String verViviendas(ArrayList<Viviendas> datos) {
		ArrayList<Viviendas> viviendasList = datos;
		String texto = "";
		for (int i = 0; i < viviendasList.size(); i++) {
			texto = texto.concat(viviendasList.get(i) + "\n");
		}
		return texto;

	}

	/**
	 * buscarVivienda : Metodo para buscar contenido en el array Viviendas
	 * @param id : id de vivienda para verificar que esté en el array
	 * @param viviendasList : Array de viviendas a buscar en 
	 * @return
	 */
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

	/**
	 * agregarVivienda: Metodo para agregar una vivienda al array del tipo Vivienda
	 * @param dir : direccion de la vivienda.
	 * @param habs : habitaciones de la vivienda
	 * @param propietario : Nombre del propietario de la vivienda
	 * @param vivienda_id : id asignada por el usuario a la vivienda
	 * @param space : espacio en metros 2 de la vivienad
	 * @param viviendasList : array de tipo vivienda
	 * @return
	 */
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

	public A_Viviendas getFile() {
		return file;
	}

	public void setFile(A_Viviendas file) {
		this.file = file;
	}

}