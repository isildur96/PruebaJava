package co.edu.unbosque.model;

import javax.swing.JComboBox;

public class PokemonTierra  extends Pokemon{

	private String th1;
	private String th2;
	private String tipo = "Tierra";
	private String [] habilidades = { "Terremoto", "Fisura", "Avalancha" ," Bola fango" 
									," Deslizador" ," Garra metal" ," Onda gravitatoria"
									, "Excavar"};
	
	public PokemonTierra() {
		// TODO Auto-generated constructor stub
	}

	public PokemonTierra(String nombre, int id,  String ataqueN, String ataqueN1, String ataqueT,
			String ataqueT1) {
		// TODO Auto-generated constructor stub
		super(nombre , ataqueN1 , ataqueN , id);
		setTh1(ataqueT);
		setTh2(ataqueT1);
		setTipo(tipo);
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

	public String[] getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String[] habilidades) {
		this.habilidades = habilidades;
	}
	
	public String getHabilidadesPt() {
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
