package co.edu.unbosque.model;


public class Arrendatarios  {

	private int inquilino_id;
	private String inquilino_cc;
	private String inquilino_name;
	private String cuota;
	private String date;
	private int viviendas_id;

	
	public Arrendatarios(int inquilino_id, int viviendas_id, String inquilino_cc, String inquilino_name
		,String cuota, String date) {
		this.setInquilino_id(inquilino_id);
		this.setInquilino_cc(inquilino_cc);
		this.setInquilino_name(inquilino_name);
		this.setCuota(cuota);
		this.setDate(date); 
		this.setViviendas_id(viviendas_id);
		
	}

	public int getViviendas_id() {
		return viviendas_id;
	}

	public void setViviendas_id(int viviendas_id) {
		this.viviendas_id = viviendas_id;
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

	public int getInquilino_id() {
		return inquilino_id;
	}

	public void setInquilino_id(int inquilino_id) {
		this.inquilino_id = inquilino_id;
	}

	public String getInquilino_cc() {
		return inquilino_cc;
	}

	public void setInquilino_cc(String inquilino_cc) {
		this.inquilino_cc = inquilino_cc;
	}

	public String getInquilino_name() {
		return inquilino_name;
	}

	public void setInquilino_name(String inquilino_name) {
		this.inquilino_name = inquilino_name;
	}
	
	
	
	

	
	
	
}
