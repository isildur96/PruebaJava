package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Archivo {
	
	private File file;
	
	public Archivo() {
		file = new File("datos\\registro.txt");
	}
	
	public Archivo(File file) {
		this.file = file;
	}
	
	public String leerArchivo() {
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
	
	public String escribirArchivo(String texto) {
		String rta = "";
		try { 
			FileWriter lineatxt = new FileWriter(file);
			String linea_archivo = texto;
			lineatxt.write(linea_archivo + "\r\n");
			lineatxt.close();
			rta = "Linea ingresada con exito";
		}catch (Exception e) {
			rta = "No fue posible registrar la informacion en el archivo";
		}
		return rta;
	}
	

}
