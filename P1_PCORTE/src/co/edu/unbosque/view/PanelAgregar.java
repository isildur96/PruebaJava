package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.unbosque.model.Pokemon;

public class PanelAgregar extends JPanel{

	
	private JLabel lbl_nombre;
	private JLabel lbl_id;
	private JLabel lbl_habilidades;
	private JLabel lbl_tipo;

	private JTextField txt_nombre;
	private JComboBox cb_tipo;
	private JComboBox cb_habilidades;
	private JComboBox cb_habilidades1;
	private JButton btn_guardar;
	private JButton btn_tipo;
	
	
	public PanelAgregar() {
		// TODO Auto-generated constructor stub
	
		setLayout(null);
		setVisible(true);
		setBounds(10,10,460,240);
		repaint();
		iniciarComponentes();
	}

	
	private void iniciarComponentes() {
		// TODO Auto-generated method stub
		
		lbl_nombre = new JLabel("Nombre : ");
		lbl_nombre.setBounds(10,20,250,20);
		add(lbl_nombre);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(80,20,100 ,20);
		add(txt_nombre);
		
		lbl_id = new JLabel("ID : ***");
		lbl_id.setBounds(10,60,100,20);
		add(lbl_id);
		
		
		lbl_tipo = new JLabel ("Tipo  :");
		lbl_tipo.setBounds(10,90,100,20);
		add(lbl_tipo);
	
	
		
		cb_tipo = new JComboBox();
		cb_tipo.setSelectedItem(null);;
		cb_tipo.setBounds(80,90,100,40);
		add(cb_tipo);
		
		
		lbl_habilidades = new JLabel("Habilidades :");
		lbl_habilidades.setBounds(220 , 10 , 100,20);
		add(lbl_habilidades);
		
		cb_habilidades = new JComboBox();
		cb_habilidades.setBounds(260,40,140,40);
		
		add(cb_habilidades);
		
		cb_habilidades1 = new JComboBox();
		cb_habilidades1.setBounds(260,90,140,40);
		
		add(cb_habilidades1);
		
		
		btn_tipo = new JButton("Fijar tipo");
		btn_tipo.setBounds(80 , 180 ,100, 40);
		add(btn_tipo);
		
		btn_guardar = new JButton("Guardar Pokemon");
		btn_guardar.setBounds(260,150,150,40);
		add(btn_guardar);
		
	
	}



	public JLabel getLbl_nombre() {
		return lbl_nombre;
	}

	public void setLbl_nombre(JLabel lbl_nombre) {
		this.lbl_nombre = lbl_nombre;
	}

	public JLabel getLbl_id() {
		return lbl_id;
	}

	public void setLbl_id(JLabel lbl_id) {
		this.lbl_id = lbl_id;
	}

	public JLabel getLbl_habilidades() {
		return lbl_habilidades;
	}

	public void setLbl_habilidades(JLabel lbl_habilidades) {
		this.lbl_habilidades = lbl_habilidades;
	}

	public JLabel getLbl_tipo() {
		return lbl_tipo;
	}

	public void setLbl_tipo(JLabel lbl_tipo) {
		this.lbl_tipo = lbl_tipo;
	}

	public JTextField getTxt_nombre() {
		return txt_nombre;
	}

	public void setTxt_nombre(JTextField txt_nombre) {
		this.txt_nombre = txt_nombre;
	}

	public JComboBox getCb_tipo() {
		return cb_tipo;
	}

	public void setCb_tipo(JComboBox cb_tipo) {
		this.cb_tipo = cb_tipo;
	}

	public JComboBox getCb_habilidades() {
		return cb_habilidades;
	}

	public void setCb_habilidades(JComboBox cb_habilidades) {
		this.cb_habilidades = cb_habilidades;
	}

	public JComboBox getCb_habilidades1() {
		return cb_habilidades1;
	}

	public void setCb_habilidades1(JComboBox cb_habilidades1) {
		this.cb_habilidades1 = cb_habilidades1;
	}

	public JButton getBtn_tipo() {
		return btn_tipo;
	}

	public void setBtn_tipo(JButton btn_tipo) {
		this.btn_tipo = btn_tipo;
	}

	public JButton getBtn_guardar() {
		return btn_guardar;
	}

	public void setBtn_guardar(JButton btn_guardar) {
		this.btn_guardar = btn_guardar;
	}
	
	
	
}
