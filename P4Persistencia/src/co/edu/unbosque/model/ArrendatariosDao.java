package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistance.A_Arrendatarios;

public class ArrendatariosDao {

	private A_Arrendatarios file;

	public ArrendatariosDao() {
		file = new A_Arrendatarios();
	}

	public String verArrendatarios(ArrayList<Arrendatarios> datos) {
		ArrayList<Arrendatarios> arrendatariosList = datos;
		String texto = "";
		for (int i = 0; i < arrendatariosList.size(); i++) {
			texto = texto.concat(arrendatariosList.get(i) + "\n");
		}
		return texto;

	}

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

	
	public boolean eliminarArrendatario(int inquilino_id, int viviendas_id, String inquilino_cc, String inquilino_name
			,String cuota, String date, ArrayList<Arrendatarios> arrendatariosList) {
		boolean resp=false;
		Arrendatarios a = buscarArrendatarios(inquilino_cc, arrendatariosList);
		if (a!= null) {
			arrendatariosList.remove(a);
			resp = true;
		}
		return resp;
	}
	
	public boolean modificarVivienda(int inquilino_id, int viviendas_id, String inquilino_cc, String inquilino_name
			,String cuota, String date, ArrayList<Arrendatarios> arrendatariosList) {
		boolean resp = false;
		Arrendatarios a = buscarArrendatarios(inquilino_cc, arrendatariosList);
		if (a!=null) {
			arrendatariosList.remove(a);
			a.setInquilino_cc(inquilino_cc);
			arrendatariosList.add(a);
			resp = true;
		}
		return resp;
	}

	public A_Arrendatarios getFile() {
		return file;
	}

	public void setFile(A_Arrendatarios file) {
		this.file = file;
	}
	
}
