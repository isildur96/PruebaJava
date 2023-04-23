package co.edu.unbosque.model;

public class Consultor extends Empleado{
	
	private int experiencia;
	private int num_equipos;

	public Consultor(String nombre, int edad, double salario, String cedula, int ex, int ne) {
		super(nombre, edad, salario, cedula);
		experiencia = ex;
		num_equipos = ne;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public int getNum_equipos() {
		return num_equipos;
	}

	public void setNum_equipos(int num_equipos) {
		this.num_equipos = num_equipos;
	}

	@Override
	public String toString() {
		return super.toString() + ", experiencia=" + experiencia + ", num_equipos=" + num_equipos;
	}

	@Override
	public void aplicarAumentoSalario() {
		salario += salario * 0.30;
	}

}
