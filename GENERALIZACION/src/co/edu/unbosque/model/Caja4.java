package co.edu.unbosque.model;

public class Caja4<T> {

	private T obj;

	public Caja4(T obj) {
		this.obj = obj;

	}

	public String decorar() {
		String s = "" + obj.toString();
		String linea = "*";
		for (int i = 0; i <= s.length(); i++) {
			linea += "*";
		}
		return linea + "\n*" + s + "*\n" + linea;

	}

	/**
	 * @return the obj
	 */
	public T getObj() {
		return obj;
	}

	/**
	 * @param obj the obj to set
	 */
	public void setObj(T obj) {
		this.obj = obj;
	}

}