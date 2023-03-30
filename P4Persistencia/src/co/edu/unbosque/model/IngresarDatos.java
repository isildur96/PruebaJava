package co.edu.unbosque.model;

import java.util.List;

public class IngresarDatos {

	public static List<Arrendatarios> arrendatariosList;
	public static List<Viviendas> viviendasList;
	public IngresarDatos() {
		// TODO Auto-generated constructor stub
		

	}
	
	public String guardar(Arrendatarios a){
		
		
		
		String x="";
		if(arrendatariosList.contains(a)) {
			x = ("EL arrendatario ya ha sido registrado");
		}else {
			arrendatariosList.add(a);
		x=("El arrendatario se ha añadido correctamente");
		}
		
		return x;
		
		
	}
	public void leer() {}
	
	

}
