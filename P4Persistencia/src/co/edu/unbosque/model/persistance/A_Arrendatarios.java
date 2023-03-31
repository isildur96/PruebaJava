package co.edu.unbosque.model.persistance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

import co.edu.unbosque.model.Arrendatarios;


public class A_Arrendatarios {
	
	private Arrendatarios arr;
	private File file;

	public A_Arrendatarios() {
		// TODO Auto-generated constructor stub
		file = new File("Arrendatarios.txt");
		arr = new Arrendatarios();
	}	
	public A_Arrendatarios(File file) {
		this.file = file;
	}
	
	public String escribirEnArchivo(ArrayList<Arrendatarios>arrendatariosList) {
		String rta = "";
		
		try {
			
			FileWriter lineatxt = new FileWriter(file, true);
			for (Arrendatarios a: arrendatariosList) {
				lineatxt.write(a.toString() + "\r\n");
			}
			rta = "Linea ingresada con exito";
			lineatxt.close();
			
		}catch (Exception e) {
			rta = "No fue posible registrar la informacion en el archivo";
		}
		return rta;
	
	}	
	
	public String leerArchivo(ArrayList<Arrendatarios>arrendatariosList) {
		String rta = "";
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader linea = null;
		String contenido = "";
		try {
			
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis);
			linea = new BufferedReader(isr);
			
			if(file.exists()) {
				String linea_leida = linea.readLine();
				contenido = linea_leida;
				while(linea_leida != null) {
					linea_leida = linea.readLine();
					if(linea_leida != null) {
						contenido += "\n" + linea_leida; 
					}
				}
				linea.close();
				rta = contenido;
			}else {
				rta = "El archivo no existe";
			}
		}catch (Exception e) {
			rta = "El archiv no pudo ser leido";
		}
		
		return rta;
	}
}
	
	