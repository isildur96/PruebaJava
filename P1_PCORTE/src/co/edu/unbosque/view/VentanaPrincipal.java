package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;


 	
public class VentanaPrincipal extends JFrame {
	
	private PanelDatos pd;
 	
	public VentanaPrincipal(int x){
		setTitle("Bosquemon");
		setResizable(false);
		setSize(600,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		repaint();
		iniciarComponentes();
	}
	public VentanaPrincipal() {
	// TODO Auto-generated constructor stub
		
		setTitle("Bosquemon");
		setResizable(false);
		setSize(600,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		repaint();
		iniciarComponentes();
		
	}



	public VentanaPrincipal(String nombre, int id, String habilidades, String tipo) {
		// TODO Auto-generated constructor stub
		pd = new PanelDatos(nombre , id  , habilidades , tipo);
	}



	private void iniciarComponentes() {
		// TODO Auto-generated method stub
		pd = new PanelDatos();
		getContentPane().add(pd);
		repaint();
		
	
	}

	public PanelDatos getPd() {
		return pd;
	}

	public void setPd(PanelDatos pd) {
		this.pd = pd;
	}	
}
