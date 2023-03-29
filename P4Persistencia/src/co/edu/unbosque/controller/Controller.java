package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Arrendatarios;
import co.edu.unbosque.model.Viviendas;
import co.edu.unbosque.model.persistance.A_Arrendatarios;
import co.edu.unbosque.model.persistance.A_Viviendas;
import co.edu.unbosque.view.VistaConsola;

public class Controller {
	// CREAR ARRALYLIST DE LOS ARRENDATARIOS Y VIVIENDAS

	public static List<Arrendatarios> arrendatariosList;
	public static List<Viviendas> viviendasList;

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
		insertArrendatario();
		insertVivienda();
		
	}
	
	private static void insertVivienda() {
		
		ArrayList<Viviendas> viviendasList  = new ArrayList<>();
		Viviendas newViviendas = getViviendaInfo();
		
		if(viviendasList.contains(newViviendas)) {
			vista.mostrarInformacion("La vivienda ya ha sido registrada");
		}else {
			viviendasList.add(newViviendas);
			vista.mostrarInformacion("la vivienda ha sido añadida correctamente");
		}
	}
	
	private static Viviendas getViviendaInfo() {
		
		String dir, habs, prop;
		int vivienda_id, space;
		
		dir = vista.leerDatoString("Ingrese la direccion de la propiedad: ");
		vivienda_id = vista.leerDatoEntero("Ingrese el id de la propiedad");
		space = vista.leerDatoEntero("ingrese el espacio en metros de la propiedad");
		vista.mostrarInformacion("ingrese el numero de habitaciones");
		habs = vista.leerDatoString("ejm : ESTUDIO ó 1 HABITACION ó 2 HABITACIONES ó 3 HABITACIONES");
		prop = vista.leerDatoString("Ingrese el nombre del propietario");
		Viviendas vivienda = new Viviendas(dir, habs, prop, vivienda_id, space); 
		
		return vivienda;
	}
	
	private static void insertArrendatario() {
		
		ArrayList<Arrendatarios> arrendatariosList  = new ArrayList<>();
		Arrendatarios newArrendatario = getArrendatarioInfo();
		
		if(arrendatariosList.contains(newArrendatario)) {
			vista.mostrarInformacion("EL arrendatario ya ha sido registrado");
		}else {
			arrendatariosList.add(newArrendatario);
			vista.mostrarInformacion("El arrendatario se ha añadido correctamente");
		}
	}
	
	private static Arrendatarios getArrendatarioInfo() {
		
		int iId, vId;
		String iCC, iName, cuota, date;
		
		
		iId = vista.leerDatoEntero("Ingrese el ID del arrendatario: ");
		iCC= vista.leerDatoString("Ingrese la CC del arrendador: ");
		iName = vista.leerDatoString("Ingrese el nombre del arrendador: ");
		vId = vista.leerDatoEntero("Ingres el ID de la propiedad: ");
		cuota = vista.leerDatoString("Ingrese el valor de la cuota ejm $xxx.xxx COP");
		date = vista.leerDatoString("ingrese la fecha de pago en formato dd/mm/aaaa");
		Arrendatarios arrendatarios = new Arrendatarios(iId, vId, iCC, iName, cuota, date); 
		
		return arrendatarios;
	}
	
}
