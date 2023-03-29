package co.edu.unbosque.model.persistance;

import java.io.File;

public class A_Viviendas {
	
private File file;

	public A_Viviendas() {
		// TODO Auto-generated constructor stub
		file = new File("Data//Viviendas.txt");
	}	
	public A_Viviendas(File file) {
		this.file = file;
	}
}	
	
	