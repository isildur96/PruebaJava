package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistance.A_Arrendatarios;

public class ArrendatariosDao {

	private A_Arrendatarios file;
/**
 * ArrendatariosDao: clase con las funciones de buscar, agregar y verificar arrendatarios en el Array de arrendatarios 
 * 
 */
	public ArrendatariosDao() {
		file = new A_Arrendatarios();
	}
/**
 * verArrendatarios : Metodo vara verificar que el array tenga informacion 
 * @param datos 
 * @return
 */
	public String verArrendatarios(ArrayList<Arrendatarios> datos) {
		ArrayList<Arrendatarios> arrendatariosList = datos;
		String texto = "";
		for (int i = 0; i < arrendatariosList.size(); i++) {
			texto = texto.concat(arrendatariosList.get(i) + "\n");
		}
		return texto;

	}

/**
 * buscarArrendatarios : Metodo para buscar un arrendatario con su identificacion en el array de arrendatarios	
 * @param cc : identificacion del arrendatario para buscarlo en el array 
 * @param arrendatariosList : Array de arrendatarios
 * @return encontrado 
 */
	public Arrendatarios buscarArrendatarios(String cc, ArrayList<Arrendatarios> arrendatariosList) {
		Arrendatarios encontrado = null;

		if (!arrendatariosList.isEmpty()) {
			for (int i = 0; i < arrendatariosList.size(); i++) {
				if (arrendatariosList.get(i).getInquilino_cc().equals(cc)) {
					encontrado = arrendatariosList.get(i);
				}
			}
		}
		return encontrado;
	}

	/**
	 * 
	 * agregar arrendatarios : metodo para agregar un arrendatario a el array de arrendatarios
	 * @param inquilino_id : id del arrendatario asignada 
	 * @param viviendas_id _: id de la propiedad 
	 * @param inquilino_cc : documento de identificacion del inquilino 
	 * @param inquilino_name : nombre del inquilino 
	 * @param cuota : cuota a pagar por el inmueble 
	 * @param date : fecha de pago del inmueble 
	 * @param arrendatariosList : array de arrendatarios
	 * @return
	 */
	
	public boolean agregarArrendatarios(int inquilino_id, int viviendas_id, String inquilino_cc, String inquilino_name
			,String cuota, String date, ArrayList<Arrendatarios> arrendatariosList) {

		Arrendatarios nuevo = new Arrendatarios(inquilino_id, viviendas_id, inquilino_cc, inquilino_name, cuota, date);

		if (buscarArrendatarios(inquilino_cc, arrendatariosList) == null) {
			arrendatariosList.add(nuevo);
			return true;
		} else {
			return false;
		}
	}

	public A_Arrendatarios getFile() {
		return file;
	}

	public void setFile(A_Arrendatarios file) {
		this.file = file;
	}
	
}
