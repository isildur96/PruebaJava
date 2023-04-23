package co.edu.unbosque.App.Modelo;

public class Materia {

	private String idMateria;
	private String materia;
	public Materia() {		
	}
	public Materia(String idMateria ,String materia, int nota1, int nota2, int nota3) {
		// TODO Auto-generated constructor stub
		this.setIdMateria(idMateria);
		this.setMateria(materia);
		this.setNota1(nota1);
		this.setNota2(nota2);
		this.setNota3(nota3);
	}
	private void setIdMateria(String idMateria) {
		// TODO Auto-generated method stub
		this.idMateria = idMateria != null && idMateria.length() != 0 ? idMateria : "";
		
	}
	private void setNota3(int nota3) {
		// TODO Auto-generated method stub
		
	}
	private void setNota2(int nota2) {
		// TODO Auto-generated method stub
		
	}
	private void setNota1(int nota1) {
		// TODO Auto-generated method stub
		
	}
	private void setMateria(String materia) {
		// TODO Auto-generated method stub
		this.materia = materia != null && materia.length() != 0 ? materia : "";
	}
	public String getIdMateria() {
		// TODO Auto-generated method stub
		return this.idMateria;
	}
	public String getMateria() {
		// TODO Auto-generated method stub
		return this.materia;
	}

}
