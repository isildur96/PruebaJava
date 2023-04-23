package co.edu.unbosque.model;

public class Caja1 {

	public String decorar(int num) {
		String s = "" + num;
		String linea = "*";
		for (int i = 0; i <= s.length(); i++) {
			linea += "*";
		}
		return linea + "\n*" + s + "*\n" + linea;
	}

	public String decorar(Double num) {
		String s = "" + num;
		String linea = "*";
		for (int i = 0; i <= s.length(); i++) {
			linea += "*";
		}
		return linea + "\n*" + s + "*\n" + linea;
	}

	public String decorar(String num) {
		String s = "" + num;
		String linea = "*";
		for (int i = 0; i <= s.length(); i++) {
			linea += "*";
		}
		return linea + "\n*" + s + "*\n" + linea;
	}

}