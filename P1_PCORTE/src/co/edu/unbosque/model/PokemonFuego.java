package co.edu.unbosque.model;

import javax.swing.JComboBox;

public class PokemonFuego extends Pokemon{
	
	private String nombre ;
	private String th1,taqueN1;
	private String th2,ataqueN;
	private int id;
	private String tipo = "Fuego";
	private String [] habilidades = {"Lanzallamas", "Envite ígneo", "Rueda fuego", 
									"Bola de fuego", "Ascuas, Llama", "Anillo ígneo", 
									"Llamarada"};
	
	public PokemonFuego() {
		// TODO Auto-generated constructor stub
	}

	public PokemonFuego(String nombre, int id,  String ataqueN, String ataqueN1, String ataqueT,
			String ataqueT1) {
		// TODO Auto-generated constructor stub
		
		setNombre(nombre);
		setId(id);
		setAtaqueN(ataqueN);
		setTaqueN1(ataqueN1);
		setTh1(ataqueT);
		setTh2(ataqueT1);
		setTipo(tipo);
	}

	public String getTaqueN1() {
		return taqueN1;
	}

	public void setTaqueN1(String taqueN1) {
		this.taqueN1 = taqueN1;
	}

	public String getAtaqueN() {
		return ataqueN;
	}

	public void setAtaqueN(String ataqueN) {
		this.ataqueN = ataqueN;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTh1() {
		return th1;
	}

	public void setTh1(String th1) {
		this.th1 = th1;
	}

	public String getTh2() {
		return th2;
	}

	public void setTh2(String th2) {
		this.th2 = th2;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String[] habilidades) {
		this.habilidades = habilidades;
	}
	
	public String getHabilidadesPf() {
		return super.getH1() + getTh1() + "\n" + getH2() + getTh2() ;
	}
	
	@Override
	public void llenarAtributos(JComboBox cb) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < getHabilidades().length ; i++) {
			cb.addItem(getHabilidades()[i].toString());
		}
		super.llenarAtributos(cb);
	}
	

}
