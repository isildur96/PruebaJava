package co.edu.unbosque.model;

public class Viviendas {

	private int vivienda_id;
	private int space;
	private String dir;
	private String habs;
	private String propietario;

	public Viviendas(String dir, String habs, String propietario, int vivienda_id, int space) {
		this.setVivienda_id(vivienda_id);
		this.setDir(dir);
		this.setSpace(space); 
		this.setHabs(habs);
		this.setPropietario(propietario);
	}

	@Override
	public String toString() {
		return "Viviendas [id=" + vivienda_id + ", space=" + space + ", habs=" + habs + "]";
	}

	public int getId() {
		return vivienda_id;
	}

	public void setId(int id) {
		this.vivienda_id = id;
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

	public int getVivienda_id() {
		return vivienda_id;
	}

	public void setVivienda_id(int vivienda_id) {
		this.vivienda_id = vivienda_id;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	
}
