package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.model.Pokemon;

public class VentanaAgregar extends JFrame {

	
		private PanelAgregar pa;
		private Pokemon p;
		
		
	public VentanaAgregar() {
		// TODO Auto-generated constructor stub
		setTitle("Agregar Pokemon             BOSQUEMON");
		setResizable(false);
		setSize(600,300);
		setLayout(null);
		setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		iniciarComponentes();

	}



	private void iniciarComponentes() {
		// TODO Auto-generated method stub
		
		pa = new PanelAgregar();
		getContentPane().add(pa);
		repaint();
		
		
	}

	public PanelAgregar getPa() {
		return pa;
	}

	public void setPa(PanelAgregar pa) {
		this.pa = pa;
	}
}
