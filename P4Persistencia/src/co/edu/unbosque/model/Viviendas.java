package co.edu.unbosque.model;

public class Viviendas {

	private String vivienda_id;
	private int space;
	private String dir;
	private String habs;
	private String propietario;

	public Viviendas(String dir, String habs, String propietario, String vivienda_id, int space) {
		this.vivienda_id = vivienda_id;
		this.dir = dir;
		this.space = space; 
		this.habs = habs;
		this.propietario = propietario;
	}
	
	public Viviendas(){
		
	}
	@Override
	public String toString() {
		return "Propiedad # " + vivienda_id + " [ Dirección: " + dir + " ] " + "\r \n"
				+ "Tamaño : ## " + space + "\r \n"
				+ "N° de habitaciones : (" + habs + ")" + "\r \n"
				+ "Propietario: " + propietario+ "\r \n"
				+ "******************************************************";
	}

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	public String getHabs() {
		return habs;
	}

	public void setHabs(String habs) {
		this.habs = habs;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getVivienda_id() {
		return vivienda_id;
	}

	public void setVivienda_id(String vivienda_id) {
		this.vivienda_id = vivienda_id;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	
}
