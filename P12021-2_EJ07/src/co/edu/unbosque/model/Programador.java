package co.edu.unbosque.model;

public class Programador extends Empleado{

	private String lenguaje_dominante_programacion;
	private int num_lineas_x_hora;
	
	public Programador(String nombre, int edad, double salario, String cedula, String ldp, int nlh) {
		super(nombre, edad, salario, cedula);
		lenguaje_dominante_programacion = ldp;
		num_lineas_x_hora = nlh;
	}

	public String getLenguaje_dominante_programacion() {
		return lenguaje_dominante_programacion;
	}

	public void setLenguaje_dominante_programacion(String lenguaje_dominante_programacion) {
		this.lenguaje_dominante_programacion = lenguaje_dominante_programacion;
	}

	public int getNum_lineas_x_hora() {
		return num_lineas_x_hora;
	}

	public void setNum_lineas_x_hora(int num_lineas_x_hora) {
		this.num_lineas_x_hora = num_lineas_x_hora;
	}

	@Override
	public String toString() {
		return super.toString() +", lenguaje_dominante_programacion=" + lenguaje_dominante_programacion
				+ ", num_lineas_x_hora=" + num_lineas_x_hora + "]";
	}

	@Override
	public void aplicarAumentoSalario() {
		salario += salario * 0.25;
	}
	
}
