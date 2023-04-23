package co.edu.unbosque.model;

public class Caja3 {
	
	private Object obj;
	
	public Caja3(Object obj) {
		
		this.obj = obj;
		
	}

	/**
	 * @return the obj
	 */
	public Object getObj() {
		return obj;
	}

	/**
	 * @param obj the obj to set
	 */
	public void setObj(Object obj) {
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

}