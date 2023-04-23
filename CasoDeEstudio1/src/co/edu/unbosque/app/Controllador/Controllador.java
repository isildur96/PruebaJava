package co.edu.unbosque.app.Controllador;

import java.util.List;

import co.edu.unbosque.app.Modelo.Estudiantes;
import co.edu.unbosque.app.Modelo.LogicEstudiantes;
import co.edu.unbosque.app.Vista.VistaConsola;

public class Controllador {
	
	public static List<Estudiantes> estudiantesList;
	private String x,menu;
	private int opcion;
	private VistaConsola vistacontrolador;
	private LogicEstudiantes sistemaestudiantes;
	private Estudiantes e;

	
	public Controllador(){
		
	vistacontrolador  = new VistaConsola();
	sistemaestudiantes= new LogicEstudiantes();
	menu              = 	"\n"
						
					        + "    BIENVENIDO A LA UNIVERSIDAD SAN MARINO\n"
							
					        + "1. Registrar estudiante\n"
						    + "2. Buscar estudiante\n"
						    + "3. Lista de estudiantes\n"
						    + "4. Salir\n";
		 			do {
		 				vistacontrolador.mostrarMensaje(menu);
		 				opcion = vistacontrolador.leerEntero("Por favor ingrese una opcion: ");
		 				vistacontrolador.leerString("");
		 				switch(opcion) {
		 				case 1 : pedirDatos();
		 				break;
		 				case 2 : findEstudiante();
		 				break;
		 				case 3 : x = sistemaestudiantes.listarEstudiantes();
		 				vistacontrolador.mostrarMensaje(x);
		 				break;
		 				         
		 							
		 				case 4 :
		 				break;
		 				default:vistacontrolador.mostrarMensaje("Opcion incorrecta");
		 				}
		 			}while(opcion !=5);
	}

	private void findEstudiante() {
		
	vistacontrolador.mostrarMensaje("1.Busqueda por Cedula. \n"
	+ "2.Busqueda por Nombre. \n ");
	opcion = vistacontrolador.leerEntero("Por favor ingrese una opcion :\n");
	vistacontrolador.leerString("");
	switch(opcion) {
	case 1:
		Cedula();
		vistacontrolador.mostrarMensaje("");
		break;
	case 2 :
		Nombre();
		vistacontrolador.mostrarMensaje("");
		break;
	default:vistacontrolador.mostrarMensaje("Opcion incorrecta");
	}
}
	private void Nombre() {
		// TODO Auto-generated method stub
		String nom; nom = vistacontrolador.leerString("Ingrese el nombre del estudiante :");
		String ap; ap = vistacontrolador.leerString("Ingrese el apellido del estudiante : ");
		e = sistemaestudiantes.BuscarNom(nom,ap);
		if(e==null) {
			vistacontrolador.mostrarMensaje("El estudiante no existe en la lista");
		}else {
			vistacontrolador.mostrarMensaje(e.toString());
		
		}
	}

	private void Cedula() {
		// TODO Auto-generated method stub
		String ced ; ced = vistacontrolador.leerString("Ingrese el numero de ID del estudiante :");
		e = sistemaestudiantes.BuscarCed(ced);
			if(e==null) {
				vistacontrolador.mostrarMensaje("El estudiante no existe en la lista");
	}else {
		vistacontrolador.mostrarMensaje(e.toString());


			}
	
	}
	


	private void pedirDatos() {
		// TODO Auto-generated method stub
		String nom;
		String ap;
		String ced;
		
		nom = vistacontrolador.leerString("Ingrese el nombre del estudiante:");
		ap  = vistacontrolador.leerString("Ingrese el apellido del estudiante :");
		ced = vistacontrolador.leerString("Ingrese la cedula del estudiante  :");
		
		e = new Estudiantes (nom,ap,ced);
		if(sistemaestudiantes.dardatosEstudiante(e)) {
			vistacontrolador.mostrarMensaje("Se añadio correctamente el estudiante");
		}else {
			vistacontrolador.mostrarMensaje("El estudiante ya existe en el sistema");
		}
	
	}
}
