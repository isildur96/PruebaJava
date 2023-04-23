package co.edu.unbosque.controller;

import co.edu.unbosque.model.Consultor;
import co.edu.unbosque.model.Directivo;
import co.edu.unbosque.model.Empleado;
import co.edu.unbosque.model.Programador;
import co.edu.unbosque.view.VistaConsola;


public class Controller {

	private VistaConsola vista;
	private Empleado emp;

	public Controller() {
		vista = new VistaConsola();
		funcionar();
	}

	public void funcionar() {
		int opcion= 0;
		String n,c,l,ar;
		int e,lh,ex,eq;
		double s;
		
		String menu = ".: MENU DE CREACIÓN DE CARGOS:." + "\n" 
					+ "\t1. Programador"  + "\n"
					+ "\t2. Consultor" + "\n"
					+ "\t3. Directivo"  + "\n"
					+ "\t4. Salir" + "\n"
					+ "Digite opción: ";
		do {
			opcion = vista.leerDatoEntero(menu);
					
			switch (opcion) {
			case 1: 
				n = vista.leerDatoString("Ingrese nombre: ");
				e = vista.leerDatoEntero("Ingrese edad: ");
				s = vista.leerDatoDouble("Ingrese salario: ");
				c = vista.leerDatoString("Ingrese cedula: ");
				l = vista.leerDatoString("Ingrese lenguaje dominante: ");
				lh = vista.leerDatoEntero("Ingrese cantidad de lineas hora: ");
				emp = new Programador(n, e, s, c, l, lh);
				break;
			case 2: 
				n = vista.leerDatoString("Ingrese nombre: ");
				e = vista.leerDatoEntero("Ingrese edad: ");
				s = vista.leerDatoDouble("Ingrese salario: ");
				c = vista.leerDatoString("Ingrese cedula: ");
				ex = vista.leerDatoEntero("Ingrese experiencia: ");
				eq = vista.leerDatoEntero("Ingrese cantidad de equipos: ");
				emp = new Consultor(n, e, s, c, ex, eq);
				break;
			case 3: 
				n = vista.leerDatoString("Ingrese nombre: ");
				e = vista.leerDatoEntero("Ingrese edad: ");
				s = vista.leerDatoDouble("Ingrese salario: ");
				c = vista.leerDatoString("Ingrese cedula: ");
				ex = vista.leerDatoEntero("Ingrese experiencia: ");
				ar = vista.leerDatoString("Ingrese area: ");
				emp = new Directivo(n, e, s, c, ex, ar);
				break;
				
			case 4:
				vista.mostrarInformacion("Hasta Pronto");
				break;
			default:
				vista.mostrarInformacion("Error: Opción Inválida");
			}
			if(opcion == 1 || opcion == 2 || opcion == 3) {
				vista.mostrarInformacion(emp.toString());
				emp.aplicarAumentoSalario();
				vista.mostrarInformacion(emp.toString());
			}
		}while(opcion != 4);
		
	}

}
