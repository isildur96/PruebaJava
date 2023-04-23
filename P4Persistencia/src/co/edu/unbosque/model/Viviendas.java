package co.edu.unbosque.model;

public class Viviendas {

	private String vivienda_id;
	private int space;
	private String dir;
	private String habs;
	private String propietario;
/**
 * 
 * Viviendas : Clase para definir los atributos de un objeto de tipo vivienda.
 * @param dir : direccion de la vivienda
 * @param habs : habitaciones de la vivienda
 * @param propietario : nombre del propietario de la vivienda
 * @param vivienda_id : id de la vivienda asignada por el usuario
 * @param space : esácop en metros 2 de la vivienda
 */
	
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
		return "Propiedad # " + vivienda_id + " [ Dirección: " + dir + " ] " + "\n"
				+ "Tamaño : ## " + space + " m2" + "\n"
				+ "N° de habitaciones : (" + habs + ")" + "\n"
				+ "Propietario: " + propietario+ "\n"
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
