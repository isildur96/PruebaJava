package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Arrendatarios;
import co.edu.unbosque.model.IngresarDatos;
import co.edu.unbosque.model.Viviendas;
import co.edu.unbosque.model.ViviendasDto;
import co.edu.unbosque.model.persistance.A_Arrendatarios;
import co.edu.unbosque.model.persistance.A_Viviendas;
import co.edu.unbosque.view.VistaConsola;

public class Controller {
	
	private ViviendasDto vDto;
	
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
		Vfile = new A_Viviendas();
		vDto = new ViviendasDto();
		
		addVivienda();
	}

	public void addVivienda() {
		//Viviendas viv = new Viviendas(dir, habs, prop, vivienda_id, space);
		//vista.mostrarInformacion(viv.toString());
		//vista.mostrarInformacion(i.guardar(viv));
		
		String dir = vista.leerDatoString("Ingrese la direccion de la propiedad: ");
		String vivienda_id = vista.leerDatoString("Ingrese el id de la propiedad");
		int	space = vista.leerDatoEntero("ingrese el espacio en metros de la propiedad");
		vista.mostrarInformacion("ingrese el numero de habitaciones");		
		String habs = vista.leerDatoString("ejm : ESTUDIO ó 1 HABITACION ó 2 HABITACIONES ó 3 HABITACIONES");;
		String prop = vista.leerDatoString("Ingrese el nombre del propietario");
		
		vDto.getViviendasDao().agregarVivienda(dir, habs, prop, vivienda_id, space, vDto.getViviendasList());
		
		vista.mostrarInformacion(vDto.getViviendasDao().verViviendas(vDto.getViviendasList()));
		
		System.out.println(vDto.getViviendasDao().getFile().escribirEnArchivo(vDto.getViviendasList()));
		
	}

	private Arrendatarios addArrendatario() {

		int iId = 0, vId = 0;
		String iCC = null, iName = null, cuota = null, date = null;
	
		iId = vista.leerDatoEntero("Ingrese el ID del arrendatario: ");
		iCC = vista.leerDatoString("Ingrese la CC del arrendador: ");
		iName = vista.leerDatoString("Ingrese el nombre del arrendador: ");
		vId = vista.leerDatoEntero("Ingres el ID de la propiedad: ");
		cuota = vista.leerDatoString("Ingrese el valor de la cuota ejm $xxx.xxx COP");
		date = vista.leerDatoString("ingrese la fecha de pago en formato dd/mm/aaaa");

		vista.mostrarInformacion(i.guardar(ar));
		Arrendatarios ar = new Arrendatarios(iId, vId, iCC, iName, cuota, date);
		//ar.buscarDatos(iId);

		
		return ar;
	}

}
