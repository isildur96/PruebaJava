package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Arrendatarios;
import co.edu.unbosque.model.ArrendatariosDto;
import co.edu.unbosque.model.Viviendas;
import co.edu.unbosque.model.ViviendasDto;
import co.edu.unbosque.model.persistance.A_Arrendatarios;
import co.edu.unbosque.model.persistance.A_Viviendas;
import co.edu.unbosque.view.VistaConsola;

public class Controller {

	private ViviendasDto vDto;

	private ArrendatariosDto aDto;

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
		viv = new Viviendas();
		Vfile = new A_Viviendas();
		Afile = new A_Arrendatarios();
		vDto = new ViviendasDto();
		aDto = new ArrendatariosDto();

		// addVivienda();
		// addArrendatario();
		funcionar();
	}

	
	public void funcionar() {
		int opcion= 0;
		
		
		String menu = ".:Administrador de Viviendas/Arrendatarios:." + "\n" 
					+ "\t1. Agregar Vivienda"  + "\n"
					+ "\t2. Agregar Arrendatario" + "\n"
					+ "\t3. Consultar Vivienda"  + "\n"
					+ "\t4. Consultar Arrendatario" + "\n"
					+ "\t5. Salir" + "\n"
					+ "Digite opción: ";
		do {
			opcion = vista.leerDatoEntero(menu);
					
			switch (opcion) {
			case 1: 
				addVivienda();
				
				break;
			case 2: 
				addArrendatario();
				break;
			case 3: 
				leerViviendas();
				break;
			case 4: 
				leerArrendatarios();
				break;	
				
			case 5:
				vista.mostrarInformacion("Hasta Pronto");
				break;
			default:
				vista.mostrarInformacion("Error: Opción Invalida");
			}
			
		}while(opcion != 5);
		
	}
	
	
	public void addVivienda() {

		String dir = vista.leerDatoString("Ingrese la direccion de la propiedad: ");
		String vivienda_id = vista.leerDatoString("Ingrese el id de la propiedad");
		int space = vista.leerDatoEntero("ingrese el espacio en metros de la propiedad");
		vista.mostrarInformacion("ingrese el numero de habitaciones");
		String habs = vista.leerDatoString("ejm : ESTUDIO ó 1 HABITACION ó 2 HABITACIONES ó 3 HABITACIONES");;
		String prop = vista.leerDatoString("Ingrese el nombre del propietario");
		vDto.getViviendasDao().agregarVivienda(dir, habs, prop, vivienda_id, space, vDto.getViviendasList());
		//vista.mostrarInformacion(vDto.getViviendasDao().verViviendas(vDto.getViviendasList()));
		System.out.println(vDto.getViviendasDao().getFile().escribirEnArchivo(vDto.getViviendasList()));
	}

	public void addArrendatario() {
		int iId = vista.leerDatoEntero("Ingrese el ID del inquilino : ");
		String iCc = vista.leerDatoString("Ingrese la CC del inquilino: ");
		int vId = vista.leerDatoEntero("Ingrese el numero de propiedad: ");
		String iName = vista.leerDatoString("Ingrese el nombre del inquilino: ");
		String cuota = vista.leerDatoString("Ingrese el valor de la cuota: " + "\n" + "EJM xxx.xxx");
		String fPago = vista.leerDatoString("Ingrese la fecha de pago formato dd/mm/aaaa");

		aDto.getArrendatariosDao().agregarArrendatarios(iId, vId, iCc, iName, cuota, fPago,
				aDto.getArrendatariosList());
		//vista.mostrarInformacion(aDto.getArrendatariosDao().verArrendatarios(aDto.getArrendatariosList()));
		System.out.println(aDto.getArrendatariosDao().getFile().escribirEnArchivo(aDto.getArrendatariosList()));

	}
	
	public void leerArrendatarios() {
		System.out.println(aDto.getArrendatariosDao().getFile().leerArchivo(aDto.getArrendatariosList()));
	}

	public void leerViviendas() {
		System.out.println(vDto.getViviendasDao().getFile().leerArchivo(vDto.getViviendasList()));
	}
}
