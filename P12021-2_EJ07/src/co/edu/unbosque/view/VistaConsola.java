package co.edu.unbosque.view;

import java.util.Scanner;

public class VistaConsola {
	
	private Scanner leer;
	
	public VistaConsola() {
		leer = new Scanner(System.in);
	}
	
	public double leerDatoDouble(String mensaje) {
		double dato = 0.0;
		System.out.println(mensaje);
		dato = leer.nextDouble();
		leer.nextLine();
		return dato;
	}
	
	public int leerDatoEntero(String mensaje) {
		int dato = 0;
		System.out.println(mensaje);
		dato = leer.nextInt();
		leer.nextLine();
		return dato;
	}
	
	public String leerDatoString(String mensaje) {
		String dato = "";
		System.out.println(mensaje);
		dato = leer.nextLine();
		return dato;
	}
	
	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}
}

