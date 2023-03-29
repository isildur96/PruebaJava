package co.edu.unbosque.model;

public class Arrendatarios extends Guest {

	private String cuota;
	private String date;
	
	
	public Arrendatarios(String cuota, String date, int idg, String name, String cc) {
		super(idg, name, cc);
		this.cuota = cuota;
		this.date = date;
		
	}

	public String getCuota() {
		return cuota;
	}

	public void setCuota(String cuota) {
		this.cuota = cuota;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	

	
	
	
}
