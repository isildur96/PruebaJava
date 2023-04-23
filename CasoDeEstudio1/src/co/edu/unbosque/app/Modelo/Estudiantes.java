package co.edu.unbosque.app.Modelo;

public class Estudiantes {
	private String nom, ap , ced ;

	public Estudiantes(String nom, String ap, String ced) {
		// TODO Auto-generated constructor stub
		
		this.nom= nom;
		this.ap = ap;
		this.ced = ced;
	
	}

	
	

	public String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}
	public String getAp() {
		return ap;
	}
	public String getCed() {
		// TODO Auto-generated method stub
		return ced;
	}
	public void setNombre(String nombre) {
		this.nom= nombre;
	}
	public void setApellido(String apellido) {
		this.ap = apellido;
	}
	public void setCedula(String cedula) {
		this.ced = cedula;
	}

    public String toString() {
		
		return  "---------------------------------------------------\n"
				+"Datos del estudiante :\n"
				+ "Cedula        :" + ced + "\n"
				+ "Nombre        :" + nom + "\n"
				+ "Apellido      :" + ap + "\n"
				+ "---------------------------------------------------\n";
	}
}
