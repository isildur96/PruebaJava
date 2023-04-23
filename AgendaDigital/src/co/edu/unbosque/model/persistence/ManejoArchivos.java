package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManejoArchivos {

	public List<String> readFile(String filePath) {
        List<String> lines = new ArrayList<>();

        try {
            // Crear objeto File con la ruta del archivo
            File file = new File(filePath);

            // Crear objeto Scanner y pasarle el objeto File como parámetro
            Scanner scanner = new Scanner(file);

            // Leer el archivo línea por línea
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lines.add(line);
            }

            // Cerrar el objeto Scanner
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return lines;
    }	

	public void addLine(String rutaArchivo, String linea) {
	    try {
	        FileWriter fw = new FileWriter(rutaArchivo, true);
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(linea);
	        bw.newLine(); // Agrega un carácter de nueva línea
	        bw.close();
	        fw.close();
	    } catch (IOException e) {
	        System.out.println("Ocurrió un error al agregar la línea al archivo.");
	        e.printStackTrace();
	    }
	}	

	public void agregarLineaUltima(String rutaArchivo, String nuevaLinea) {
	    try {
	        // Leer el archivo para obtener su contenido actual
	        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
	        StringBuilder sb = new StringBuilder();
	        String lineaActual;

	        while ((lineaActual = br.readLine()) != null) {
	            sb.append(lineaActual);
	            sb.append(System.lineSeparator());
	        }

	        String contenidoActual = sb.toString();
	        br.close();

	        // Agregar la línea que se desea agregar al final del contenido actual
	        String contenidoNuevo = contenidoActual + nuevaLinea;

	        // Escribir el contenido actualizado en el archivo, sobrescribiendo su contenido anterior
	        FileWriter fw = new FileWriter(rutaArchivo);
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(contenidoNuevo);
	        bw.close();
	        fw.close();
	    } catch (IOException e) {
	        System.out.println("Ocurrió un error al agregar la línea al archivo.");
	        e.printStackTrace();
	    }
	}
	
	public void editLine(String rutaArchivo, String lineaAnterior, String nuevaLinea) {
	    try {
	        // Leer el archivo para obtener su contenido actual
	        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
	        StringBuilder sb = new StringBuilder();
	        String lineaActual;

	        while ((lineaActual = br.readLine()) != null) {
	            sb.append(lineaActual);
	            sb.append(System.lineSeparator());
	        }

	        String contenidoActual = sb.toString();
	        br.close();

	        // Identificar la línea que se desea editar y reemplazarla con la nueva línea
	        String[] lineas = contenidoActual.split(System.lineSeparator());

	        for (int i = 0; i < lineas.length; i++) {
	            if (lineas[i].equals(lineaAnterior)) {
	                lineas[i] = nuevaLinea;
	                break;
	            }
	        }

	        String contenidoNuevo = String.join(System.lineSeparator(), lineas);

	        // Escribir el contenido actualizado en el archivo, sobrescribiendo su contenido anterior
	        FileWriter fw = new FileWriter(rutaArchivo);
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(contenidoNuevo);
	        bw.close();
	        fw.close();
	    } catch (IOException e) {
	        System.out.println("Ocurrió un error al editar la línea en el archivo.");
	        e.printStackTrace();
	    }
	}	

	public boolean existsLine(String rutaArchivo, String linea) {
	    try {
	        // Leer el archivo para obtener su contenido actual
	        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
	        StringBuilder sb = new StringBuilder();
	        String lineaActual;

	        while ((lineaActual = br.readLine()) != null) {
	            sb.append(lineaActual);
	            sb.append(System.lineSeparator());
	        }

	        String contenidoActual = sb.toString();
	        br.close();

	        // Identificar la línea que se desea editar y reemplazarla con la nueva línea
	        String[] lineas = contenidoActual.split(System.lineSeparator());
	        
	        for (int i = 0; i < lineas.length; i++) {
	            if (lineas[i].equals(linea)) {
	                return true;	                
	            }
	        }	        
	      
	    } catch (IOException e) {
	        System.out.println("Ocurrió un error al buscar la línea en el archivo.");
	        e.printStackTrace();
	    }
		return false;
	}	

	public void eliminarLinea(String archivo, String lineaAEliminar) {
	    try {
	        // Abrir el archivo en modo lectura y escritura
	        FileReader fr = new FileReader(archivo);
	        BufferedReader br = new BufferedReader(fr);

	        // Crear un archivo temporal para escribir las líneas sin la que se quiere eliminar
	        File temp = new File("temp.txt");
	        FileWriter fw = new FileWriter(temp);
	        BufferedWriter bw = new BufferedWriter(fw);

	        // Leer y escribir cada línea del archivo original, excepto la que se quiere eliminar
	        String linea;
	        while ((linea = br.readLine()) != null) {
	            if (!linea.contains(lineaAEliminar)) {
	                bw.write(linea + "\n");
	            }
	        }

	        // Cerrar los archivos
	        br.close();
	        fr.close();
	        bw.close();
	        fw.close();

	        // Borrar el archivo original y renombrar el archivo temporal con el nombre del original
	        File original = new File(archivo);
	        original.delete();
	        temp.renameTo(original);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
