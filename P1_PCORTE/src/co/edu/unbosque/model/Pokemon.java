package co.edu.unbosque.model;

import java.util.Random;

import javax.swing.JComboBox;

public class Pokemon {
	
	
	private double hp = 0;
	private double dp = 0;
	private String nombre;
	private String h1;
	private String h2;
	private int id;
	private String tipos [] = {"Agua" , "Fuego" , "Planta" , "Electrico" 
			, "Hielo" , "Tierra" ,"Lucha" , "Psiquico"};
	private String habilidades [] = {"Arañazo" , "Ataque Rapido" , "Corte" , "Destructor" , "Placaje"};
	private Random r;

	
	public Pokemon(String n) {
		// TODO Auto-generated constructor stub
		
		nombre = n;	
	}
	public Pokemon(String nombre1, String ataqueN1, String ataqueN, int id1) {
		// TODO Auto-generated constructor stub
		setNombre(nombre = nombre1);
		setId(id = id1);
		setH1(h1 = ataqueN);
		setH2(getH2() ,h1 = ataqueN1);
		setHp(hp);
		setDp(dp);
	}


	public Pokemon() {
		// TODO Auto-generated constructor stub
	}
	public double getHp() {
		return hp;
	}


	public void setHp(double hp) {
		
		hp = r.nextDouble(100.0);
		
		this.hp = hp;
	}


	public double getDp() {
		return dp;
	}


	public void setDp(double dp) {
		r = new Random();
		dp = r.nextDouble(100.0);
		this.dp = dp;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getH1() {
		return h1;
	}


	public void setH1(String h1) {
		r = new Random();
		int op = r.nextInt(habilidades.length);
		h1=habilidades[op];
		setH2(h2 , h1);
		this.h1 = h1;
	}


	public String getH2() {		
		return h2;
	}


	public void setH2(String h2, String h1) {
		
		r = new Random();
		int op = r.nextInt(habilidades.length);
		h2=habilidades[op];
		
		if (h2.equals(h1)) {
			setH2(h2 ,h1);
		}else {
			this.h2 = h2;
		}
	
		
		
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		r = new Random();
		id = r.nextInt(1000);
		this.id = id;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "hp : "  + getHp() +"\n" 
				+ "dp: " + getDp() + "\n"
				+ "Habilidades : " + getH1() + "\n"
				+ "              " + getH2();
	}
	
	public void llenarAtributos(JComboBox cb) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < getTipos().length ; i++) {
		cb.addItem(getTipos()[i].toString());
		}
	}


	public String[] getTipos() {
		return tipos;
	}


	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}


	public String[] getHabilidades() {
		return habilidades;
	}


	public void setHabilidades(String[] habilidades) {
		this.habilidades = habilidades;
	}
	

}
