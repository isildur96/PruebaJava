package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelIngreso extends JPanel {

	private JTextField campo_frase;
	private JButton boton_escribir;
	private JButton boton_ver;
	private JButton boton_borrar;

	public PanelIngreso() {

		setLayout(null);

		inicializarComponentes();

		setBorder(new TitledBorder("Ingreso de la información:"));
	}

	public void inicializarComponentes() {
		campo_frase = new JTextField();
		campo_frase.setBounds(25, 25, 280, 25);
		add(campo_frase);

		boton_escribir = new JButton("Escribir");
		boton_escribir.setBounds(310, 25, 100, 25);
		boton_escribir.setActionCommand("ESCRIBIR");
		add(boton_escribir);

		boton_ver = new JButton("Ver");
		boton_ver.setBounds(80, 140, 120, 25);
		boton_ver.setActionCommand("VER");
		add(boton_ver);
		
		boton_borrar= new JButton("Limpiar Campo");
		boton_borrar.setBounds(220, 140, 120, 25);
		boton_borrar.setActionCommand("BORRAR");
		add(boton_borrar);
	}

	public JTextField getCampo_frase() {
		return campo_frase;
	}

	public void setCampo_frase(JTextField campo_frase) {
		this.campo_frase = campo_frase;
	}

	public JButton getBoton_escribir() {
		return boton_escribir;
	}

	public void setBoton_escribir(JButton boton_escribir) {
		this.boton_escribir = boton_escribir;
	}

	public JButton getBoton_ver() {
		return boton_ver;
	}

	public void setBoton_ver(JButton boton_ver) {
		this.boton_ver = boton_ver;
	}

	public JButton getBoton_borrar() {
		return boton_borrar;
	}

	public void setBoton_borrar(JButton boton_borrar) {
		this.boton_borrar = boton_borrar;
	}
	
}
