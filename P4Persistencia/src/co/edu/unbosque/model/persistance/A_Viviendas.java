package co.edu.unbosque.model.persistance;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

import co.edu.unbosque.model.Arrendatarios;
import co.edu.unbosque.model.Viviendas;

public class A_Viviendas {
	
private Viviendas viv;

private File file;

/**
 * 
 * A_Viviendas: Clase para crear el archivo de texto y el array de tipo viviendas
 */
	public A_Viviendas() {
		// TODO Auto-generated constructor stub
		file = new File("Viviendas.txt");
		viv = new Viviendas();
	}	
	public A_Viviendas(File file) {
		this.file = file;
	}
	/**
	 * escribirEnArchivo: Metodo para escribir el Array creado en controller.addVivienda en un archivio de texto
	 * 
	 * @param viviendasList : Array de Viviendas creado. 
	 * 
	 * @return rta : mensaje si fue posible o no guardarlo en el archivo de texto
	 */
	public String escribirEnArchivo(ArrayList<Viviendas>viviendasList) {
		String rta = "";
		
		try {
			FileWriter lineatxt = new FileWriter(file, true);
			for (Viviendas v: viviendasList) {
				lineatxt.write(v.toString() + "\r\n");
			}
			rta = "\n" + "Vivienda Agregada con exito.";
			lineatxt.close();
			
		}catch (Exception e) {
			rta = "\n " + "No fue posible registrar la vivienda en el archivo";
		}
		return rta;
	
	}	
	/**
	 * 
	 * leerArchivo: metodo para leer el archivo de texto donde se almacena el array de viviendas
	 * @param arrendatariosList : Array de viviendas creado
	 * @return rta: mensaje si el archivo pudo ser leido o no. 
	 */
	public String leerArchivo(ArrayList<Viviendas>viviendasList) {
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
			rta = "El archivo no pudo ser leido";
		}
		
		return rta;
	}
}
	
	