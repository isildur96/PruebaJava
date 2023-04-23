package co.edu.unbosque.App.Modelo;

public class Estudiante {
	private String id;
	private String nombre;
	
	public Estudiante() {}

	public Estudiante(String nombre, String id) {
		// TODO Auto-generated constructor stub
		this.setId(id);
		this.setNombre(nombre);
	}

	

	public void setId(String id) {
		// TODO Auto-generated method stub
		this.id = id != null && id.length() != 0 ? id : "";
	}

	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public String getNombre() {
		return this.nombre;
	}
	public String setNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.nombre = nombre != null && nombre.length() != 0 ? nombre : "";
	}

}
