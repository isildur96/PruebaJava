package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.Archivo;

public class Documento {

	private String contenido;
	private Archivo archivo;
	
	public Documento() {
		contenido = "";
		archivo = new Archivo();
	}
	
	public Documento(File file) {
		contenido = "";
		archivo = new Archivo(file);
	}
	
	public String leerDocumento() {
		contenido = archivo.leerArchivo();
		return contenido;
	}
	
	public String actualizarDocumento(String texto) {
		return archivo.escribirArchivo(texto);
		
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
}
