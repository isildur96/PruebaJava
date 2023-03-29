package co.edu.unbosque.model.persistance;

import java.io.File;

public class A_Arrendatarios {
	
private File file;

	public A_Arrendatarios() {
		// TODO Auto-generated constructor stub
		file = new File("Data//Arrendatario.txt");
	}	
	public A_Arrendatarios(File file) {
		this.file = file;
	}
	
	
	
}
