package co.edu.unbosque.app.Vista;

import java.util.Scanner;

public class VistaConsola {


	Scanner sc;
	public VistaConsola() {
		sc = new Scanner(System.in);
	}

	public void mostrarMensaje(String pMen) {
		// TODO Auto-generated method stub
		System.out.print(pMen);
		
	}

	public int leerEntero(String pMen) {
		// TODO Auto-generated method stub
		System.out.println(pMen);
		return sc.nextInt();
	}

	public String leerString(String pMen) {
		// TODO Auto-generated method stub
		System.out.println(pMen);
		return sc.nextLine();
	}

	public double leerDouble(String pMen) {
		// TODO Auto-generated method stub
		System.out.println(pMen);
		return sc.nextDouble();
	}

}


