package co.edu.unbosque.model;

public abstract class Empleado {
	
	protected String nombre;
	protected int edad;
	protected double salario;
	protected String cedula;
	
	public Empleado(String nombre, int edad, double salario, String cedula) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.cedula = cedula;
	}
	
	public abstract void aplicarAumentoSalario() ;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", cedula=" + cedula ;
	}

}
