package co.edu.unbosque.model;

public class Directivo extends Empleado {
	
	private int experiencia;
	private String area;

	public Directivo(String nombre, int edad, double salario, String cedula, int ex, String ar) {
		super(nombre, edad, salario, cedula);
		experiencia = ex;
		area = ar;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return super.toString() + ", experiencia=" + experiencia + ", area=" + area ;
	}
	
	@Override
	public void aplicarAumentoSalario() {
		salario += salario * 0.35;
	}
	
}
