package co.edu.unbosque.model.persistance;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import co.edu.unbosque.model.Viviendas;

public class A_Viviendas {
	
private Viviendas viv;

private File file;

	public A_Viviendas() {
		// TODO Auto-generated constructor stub
		file = new File("Viviendas.txt");
		viv = new Viviendas();
	}	
	public A_Viviendas(File file) {
		this.file = file;
	}
	
	public String escribirEnArchivo(ArrayList<Viviendas>viviendasList) {
		String rta = "";
		
		try {
			System.out.println("escribiendo archivo");
			FileWriter lineatxt = new FileWriter(file);
			for (Viviendas v: viviendasList) {
				lineatxt.write(v.toString() + "\r\n");
			}
			System.out.println("escribiendo archivo 2");
			rta = "Linea ingresada con exito";
			lineatxt.close();
			
		}catch (Exception e) {
			rta = "No fue posible registrar la informacion en el archivo";
		}
		return rta;
	
	}	
}
	
	