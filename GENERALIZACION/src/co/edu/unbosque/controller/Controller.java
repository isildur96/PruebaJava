package co.edu.unbosque.controller;

import co.edu.unbosque.model.Caja1;
import co.edu.unbosque.model.Caja2;
import co.edu.unbosque.model.Caja3;
import co.edu.unbosque.model.Caja4;
import co.edu.unbosque.view.VistaConsola;

public class Controller {

	private VistaConsola vista;
	private Caja1 x;
	private Caja2 y;
	private Caja3 z;
	private Caja4 a;
		
	public Controller() {
	
	vista = new VistaConsola();
	x = new Caja1();
	y = new Caja2();
	
	funcionar();
	}
	
	public void funcionar() {
		/*
		int n1 = Integer.parseInt(vista.leerDato("ingrese numero entero: "));
		vista.mostrarInformacion("");
		vista.mostrarInformacion(x.decorar(n1));
		
		vista.mostrarInformacion("");
		vista.mostrarInformacion("");
		
		double n2 = Double.parseDouble(vista.leerDato("Ingrese un numero real: "));
		vista.mostrarInformacion("");
		vista.mostrarInformacion(x.decorar(n2));
		
		vista.mostrarInformacion("");
		vista.mostrarInformacion("");
		
		String n3 = vista.leerDato("Ingrese un texto: ");
		vista.mostrarInformacion("");
		vista.mostrarInformacion(x.decorar(n3));
		*/
		/* 
		 int n1 = Integer.parseInt(vista.leerDato("ingrese numero entero: "));
		 
		vista.mostrarInformacion("");
		vista.mostrarInformacion(y.decorar(n1));
		
		vista.mostrarInformacion("");
		vista.mostrarInformacion("");
		
		double n2 = Double.parseDouble(vista.leerDato("Ingrese un numero real: "));
		vista.mostrarInformacion("");
		vista.mostrarInformacion(y.decorar(n2));
		
		vista.mostrarInformacion("");
		vista.mostrarInformacion("");
		
		String n3 = vista.leerDato("Ingrese un texto: ");
		vista.mostrarInformacion("");
		vista.mostrarInformacion(y.decorar(n3));
		*/
		
		/*z = new Caja3("Tengo Hambre");
		vista.mostrarInformacion(z.decorar());
		vista.mostrarInformacion(""+((String)z.getObj()).charAt(5));
		*/
		
		Caja4 <Integer> c1 = new Caja4<Integer>(206);
		Caja4 <Double> c2 = new Caja4<Double>(123.6);
		Caja4 <String> c3 = new Caja4<String>("Tengo Hambre");
		
		vista.mostrarInformacion(""+ c1.decorar());
		vista.mostrarInformacion(""+ c2.decorar());
		vista.mostrarInformacion(""+ c3.decorar());
		
		
	}

}

