package co.edu.unbosque.view;

import java.util.Scanner;

public class VistaConsola {

	private Scanner leer;

	public VistaConsola() {
		leer = new Scanner(System.in);

	}

	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}

	public String leerDato(String mensaje) {
		System.out.println(mensaje);
		String dato = leer.nextLine();
		return dato;
	}
}
