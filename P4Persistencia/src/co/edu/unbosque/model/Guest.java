package co.edu.unbosque.model;

public class Guest {
	
	private int idg;
	private String name;
	private String cc;
	
	
public Guest(int idg, String name, String cc) {
	super();
	this.name = name;
	this.cc = cc;
	this.idg = idg;
}


@Override
public String toString() {
	return "Guest [Nombre =" + name + "\n" 
			+ "Identificación = " + cc + "\n"
			+ "id = " + idg;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getCc() {
	return cc;
}


public void setCc(String cc) {
	this.cc = cc;
}


public int getIdg() {
	return idg;
}


public void setIdg(int idg) {
	this.idg = idg;
}



}
