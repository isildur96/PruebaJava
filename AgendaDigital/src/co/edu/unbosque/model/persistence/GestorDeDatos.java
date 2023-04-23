package co.edu.unbosque.model.persistence;

public class GestorDeDatos {

	public String[] separateString(String text) {
	    // Dividir la cadena en dos partes por el signo igual (=)
	    String[] partes = text.split("=");

	    // Separar la primera parte en tres partes por el punto (.)
	    String[] primeraParte = partes[0].split("\\.");

	    // Crear un nuevo arreglo con cuatro partes
	    String[] result = new String[4];
	    result[0] = primeraParte[0]; // "agenda"
	
	    String[] item = separarCadenaDeNumeros(primeraParte[1]);
	    result[1] = item[0]; // "pais"	   	   
	    result[2] = item[1]; // "1"
	    result[3] = partes[1];// "contenido"

	    // Retornar el nuevo arreglo
	    return result;
	}	
	
	public String[] separarCadenaDeNumeros(String cadena) {
		// la expresión regular (?<=\D)(?=\d)|(?<=\d)(?=\D) coincide con una posición
	    // donde hay un carácter no numérico precedido por un carácter numérico o viceversa	    
		return cadena.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");	    
	}
	
	
}
