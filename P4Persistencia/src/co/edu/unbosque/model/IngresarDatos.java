package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.persistance.A_Viviendas;

public class IngresarDatos {

	public static List<Arrendatarios> arrendatariosList;
	public static List<Viviendas> viviendasList;
	public A_Viviendas aV; 

	public IngresarDatos() {
		// TODO Auto-generated constructor stub

		arrendatariosList = new ArrayList<Arrendatarios>();
		viviendasList = new ArrayList<Viviendas>();
		aV = new A_Viviendas();
	}

	public String guardar(Arrendatarios a) {

		String x = "";
		String z = "";
		if (arrendatariosList.contains(a)) {
			x = ("EL arrendatario ya ha sido registrado");
		} else {
			arrendatariosList.add(a);
			x = ("El arrendatario se ha añadido correctamente");
	
		}
		
		return x;

	}

	public String guardar(Viviendas v) {

		String z = "";
		if (viviendasList.contains(v)) {
			z = ("La vivienda ya ha sido registrado");
		} else {
			viviendasList.add(v);
			z = ("La vivienda se ha añadido correctamente");
			aV.escribirEnArchivo(z);
		}

		return z;

	}

	public void leer() {
		
	}

}
