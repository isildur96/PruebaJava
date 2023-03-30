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
		i = new IngresarDatos();
		viv = new Viviendas();
		addVivienda();
	}

	private Viviendas addVivienda() {

		String dir = null, habs = null, prop = null;
		int vivienda_id = 0, space = 0;
		Viviendas viv = new Viviendas(dir, habs, prop, vivienda_id, space);

		viv.setDir(vista.leerDatoString("Ingrese la direccion de la propiedad: "));
		viv.setVivienda_id(vista.leerDatoEntero("Ingrese el id de la propiedad"));
		viv.setSpace(vista.leerDatoEntero("ingrese el espacio en metros de la propiedad"));
		vista.mostrarInformacion("ingrese el numero de habitaciones");
		viv.setHabs(vista.leerDatoString("ejm : ESTUDIO ó 1 HABITACION ó 2 HABITACIONES ó 3 HABITACIONES"));
		viv.setPropietario(vista.leerDatoString("Ingrese el nombre del propietario"));

		vista.mostrarInformacion(i.guardar(viv));

		return viv;
	}

	private Arrendatarios addArrendatario() {

		int iId = 0, vId = 0;
		String iCC = null, iName = null, cuota = null, date = null;
		Arrendatarios ar = new Arrendatarios(iId, vId, iCC, iName, cuota, date);

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
