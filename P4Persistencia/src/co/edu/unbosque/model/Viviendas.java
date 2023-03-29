package co.edu.unbosque.model;

public class Viviendas extends Guest{
	
	private int id;
	private String dir;
	private int space;
	private	int habs;
	
	
	public Viviendas(int id, int space, int habs, String dir, String name, String cc, int idg) {
		super(idg, cc, name);
		this.id = id; 
		this.dir = dir;  
		this.space= space;
		this.habs= habs;		
	}


	@Override
	public String toString() {
		return "Viviendas [id=" + id + ", space=" + space + ", habs=" + habs + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSpace() {
		return space;
	}


	public void setSpace(int space) {
		this.space = space;
	}


	public int getHabs() {
		return habs;
	}


	public void setHabs(int habs) {
		this.habs = habs;
	}


	public String getDir() {
		return dir;
	}


	public void setDir(String dir) {
		this.dir = dir;
	}

	
	
}
