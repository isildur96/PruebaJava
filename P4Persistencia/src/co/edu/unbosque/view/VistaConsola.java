package co.edu.unbosque.view;

import java.util.Scanner;

public class VistaConsola {

	private Scanner leer;

	public VistaConsola() {
		leer = new Scanner(System.in);
	}
/**
 * 
 * leerDatoDouble: metodo para recibir un dato por consola de tipo double
 * @param mensaje : mensaje solicitando la informacion 
 * @return dato : la informacion ingresada
 */
	public double leerDatoDouble(String mensaje) {
		double dato = 0.0;
		System.out.println(mensaje);
		dato = leer.nextDouble();
		leer.nextLine();
		return dato;
	}
/**
 * leerDatoEntero : metodo para recibir un dato por consola de tipo entero 
 * @param mensaje : mensaje solicitando la informacion 
 * @return dato : la informacion ingresada
 */
	public int leerDatoEntero(String mensaje) {
		int dato = 0;
		System.out.println(mensaje);
		dato = leer.nextInt();
		leer.nextLine();
		return dato;
	}
/**
 * 
 * leerDatoString: metodo para recibir un dato por consola de tipo String
 * @param mensaje : mensaje solicitando la informacion 
 * @return dato : informacion ingresada
 */
	public String leerDatoString(String mensaje) {
		String dato = "";
		System.out.println(mensaje);
		dato = leer.nextLine();
		return dato;
	}
 /**
  * mostrarInformacion: metodo para imprimir un string por consola  
  * @param mensaje : mensaje que se quiere imprimir.
  */
	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}
}
