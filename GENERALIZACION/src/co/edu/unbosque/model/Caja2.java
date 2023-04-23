package co.edu.unbosque.model;

public class Caja2 {

	public String decorar(Object obj) {
		String s = "" + obj.toString();
		String linea = "*";
		for (int i = 0; i <= s.length(); i++) {
			linea += "*";
		}
		return linea + "\n*" + s + "*\n" + linea;
	}

}