package co.edu.unbosque.model.persistance;

import java.io.File;
import java.io.FileWriter;

import co.edu.unbosque.model.Viviendas;

public class A_Viviendas {
	
private Viviendas viv;

private File file;

	public A_Viviendas() {
		// TODO Auto-generated constructor stub
		file = new File("src\\co\\edu\\unbosque\\model\\persistance\\Viviendas.txt");
		viv = new Viviendas();
	}	
	public A_Viviendas(File file) {
		this.file = file;
	}
	
	public String escribirEnArchivo(String texto) {
		String rta = "";
		texto = viv.toString();
		try {
			//System.out.println("escribiendo archivo");
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
	
	