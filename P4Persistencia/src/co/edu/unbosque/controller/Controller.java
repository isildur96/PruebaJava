package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Arrendatarios;
import co.edu.unbosque.model.IngresarDatos;
import co.edu.unbosque.model.Viviendas;
import co.edu.unbosque.model.persistance.A_Arrendatarios;
import co.edu.unbosque.model.persistance.A_Viviendas;
import co.edu.unbosque.view.VistaConsola;

public class Controller {
	// CREAR ARRALYLIST DE LOS ARRENDATARIOS Y VIVIENDAS

	public static List<Arrendatarios> arrendatariosList;
	public static List<Viviendas> viviendasList;
    private IngresarDatos i = new IngresarDatos();
	// POSICION DEL MENU
	public static int menu;

	// INSTANCIA DE LA VISTA
	private static VistaConsola vista;

	// INSTANCIA DE LA CLASE ARRENDATARIOS
	private static Arrendatarios ar;

	// INSTANCIA DE LA CLASE VIVIENDAS
	private Viviendas viv;

	// INSTANCIA DE LA CLASE A_ARRENDATARIOS
	private A_Arrendatarios Afile;

	// INSTANCIA DE LA CLASE A_VIVIENDAS
	private A_Viviendas Vfile;

	public Controller() {
	 
		vista = new VistaConsola();
	
		insertVivienda();
		
		
	}
	
	private static void insertVivienda() {
		
		ArrayList<Viviendas> viviendasList  = new ArrayList<>();
		//Viviendas newViviendas = getViviendaInfo();
		
		//if(viviendasList.contains(newViviendas)) {
			vista.mostrarInformacion("La vivienda ya ha sido registrada");
	//	}else {
		//	viviendasList.add(newViviendas);
			vista.mostrarInformacion("la vivienda ha sido añadida correctamente");
		}
	//}
	
	private Viviendas getViviendaInfo() {
		
		String dir=null, habs=null, prop=null;
		int vivienda_id=0, space=0;
		Viviendas viv = new Viviendas(dir, habs, prop, vivienda_id, space); 
		
		dir = vista.leerDatoString("Ingrese la direccion de la propiedad: ");
		vivienda_id = vista.leerDatoEntero("Ingrese el id de la propiedad");
		space = vista.leerDatoEntero("ingrese el espacio en metros de la propiedad");
		vista.mostrarInformacion("ingrese el numero de habitaciones");
		habs = vista.leerDatoString("ejm : ESTUDIO ó 1 HABITACION ó 2 HABITACIONES ó 3 HABITACIONES");
		prop = vista.leerDatoString("Ingrese el nombre del propietario");

		
		return viv;
	}
	
	private  Arrendatarios addArrendatario() {
		
		int iId=0, vId=0;
		String iCC=null, iName=null, cuota=null, date=null;
		Arrendatarios ar = new Arrendatarios(iId, vId, iCC, iName, cuota, date); 
		
		IngresarDatos io = new IngresarDatos();
		ar.setInquilino_id(vista.leerDatoEntero("Ingrese el ID del arrendatario: "));
		ar.setInquilino_cc(vista.leerDatoString("Ingrese la CC del arrendador: "));
		ar.setInquilino_name(vista.leerDatoString("Ingrese el nombre del arrendador: "));
		ar.setViviendas_id(vista.leerDatoEntero("Ingres el ID de la propiedad: "));
		ar.setCuota(vista.leerDatoString("Ingrese el valor de la cuota ejm $xxx.xxx COP"));
		ar.setDate(vista.leerDatoString("ingrese la fecha de pago en formato dd/mm/aaaa"));
		
		
		
		
		
		vista.mostrarInformacion(i.guardar(ar));
	
		
		return ar;
	}
	
}
