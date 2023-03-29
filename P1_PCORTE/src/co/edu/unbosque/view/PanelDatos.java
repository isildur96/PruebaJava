package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{

	private JLabel lbl_nombre;
	private JLabel lbl_id;
	private JLabel lbl_tipo;
	private JLabel lbl_habilidades;
	private JLabel lbl_estadisticas;
	private JLabel lbl_evoluciones;
	private JTextArea ta_pokemones;
	private JButton btn_buscar_n;	
	private JButton btn_agregar;
	private JButton btn_eliminar;
	private JButton btn_buscar_t;
	private JComboBox cb_buscar_t;
	
	private String nombre = "";
	private int id ;
	private String tipo = "";
	private String habilidades ="";
	
	
	
	private JTextField txt_buscar_n;

	
	
	public PanelDatos() {
		// TODO Auto-generated constructor stub
		
		setLayout(null);
		setVisible(true);
		setBounds(10,10,560,340);
		repaint();
		iniciarComponentes();
	}


	public PanelDatos(String nombre2, int id2, String habilidades2 , String tipo2) {
		// TODO Auto-generated constructor stub
		
		nombre = nombre2;
		id = id2;
		habilidades = habilidades2;
		tipo = tipo2;
		iniciarComponentes();
	}


	private void iniciarComponentes() {
		// TODO Auto-generated method stub
		setBorder(new TitledBorder(""));
		
		lbl_nombre = new JLabel("Nombre : " + nombre );
		lbl_nombre.setBounds(10,100,250,20);
		add(lbl_nombre);
		
		lbl_id = new JLabel("ID : " + id);
		lbl_id.setBounds(10,120,250,20);
		add(lbl_id);
		
		lbl_tipo = new JLabel("Tipo : ");
		lbl_tipo.setBounds(300,100,250,20);
		add(lbl_tipo);
		
		lbl_habilidades = new JLabel("Habilidades : " + habilidades);
		lbl_habilidades.setBounds(300,130,250,40);
		add(lbl_habilidades);
		
		lbl_estadisticas = new JLabel("Estadiscas : " );
		lbl_estadisticas.setBounds(10,160,250,20);
		add(lbl_estadisticas);
		
		lbl_evoluciones = new JLabel("Evoluciones :");
		lbl_evoluciones.setBounds(10,200,250,20);
		add(lbl_evoluciones);
		
		btn_buscar_n = new JButton("Buscar Nombre");
		btn_buscar_n.setBounds(10,10,250,40);
		add(btn_buscar_n);
		
		txt_buscar_n = new JTextField();
		txt_buscar_n.setBounds(10,60,250,40);
		add(txt_buscar_n);
		
		cb_buscar_t = new JComboBox();
		cb_buscar_t.addItem(tipo);
		cb_buscar_t.setBounds(300,60,250,40);
		add(cb_buscar_t);
		
		
		ta_pokemones = new JTextArea();
		ta_pokemones.setBorder(null);
		ta_pokemones.setBounds(300,200,250,80);
		add(ta_pokemones);
		
		btn_buscar_t = new JButton("Buscar Tipo");
		btn_buscar_t.setBounds(300,10,250,40);
		add(btn_buscar_t);
		
		btn_agregar = new JButton("Agregar Pokemon");
		btn_agregar.setBounds(10,290,250,40);
		add(btn_agregar);
		
		btn_eliminar = new JButton("Eliminar Pokemon");
		btn_eliminar.setBounds(300,290,250,40);
		add(btn_eliminar);
		
		
		
		repaint();
		
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


	public JLabel getLbl_tipo() {
		return lbl_tipo;
	}


	public void setLbl_tipo(JLabel lbl_tipo) {
		this.lbl_tipo = lbl_tipo;
	}


	public JLabel getLbl_habilidades() {
		return lbl_habilidades;
	}


	public void setLbl_habilidades(JLabel lbl_habilidades) {
		this.lbl_habilidades = lbl_habilidades;
	}


	public JLabel getLbl_estadisticas() {
		return lbl_estadisticas;
	}


	public void setLbl_estadisticas(JLabel lbl_estadisticas) {
		this.lbl_estadisticas = lbl_estadisticas;
	}


	public JLabel getLbl_evoluciones() {
		return lbl_evoluciones;
	}


	public void setLbl_evoluciones(JLabel lbl_evoluciones) {
		this.lbl_evoluciones = lbl_evoluciones;
	}


	public JTextArea getTa_pokemones() {
		return ta_pokemones;
	}


	public void setTa_pokemones(JTextArea ta_pokemones) {
		this.ta_pokemones = ta_pokemones;
	}


	public JButton getBtn_buscar_n() {
		return btn_buscar_n;
	}


	public void setBtn_buscar_n(JButton btn_buscar_n) {
		this.btn_buscar_n = btn_buscar_n;
	}


	public JButton getBtn_agregar() {
		return btn_agregar;
	}


	public void setBtn_agregar(JButton btn_agregar) {
		this.btn_agregar = btn_agregar;
	}


	public JButton getBtn_eliminar() {
		return btn_eliminar;
	}


	public void setBtn_eliminar(JButton btn_eliminar) {
		this.btn_eliminar = btn_eliminar;
	}


	public JButton getBtn_buscar_t() {
		return btn_buscar_t;
	}


	public void setBtn_buscar_t(JButton btn_buscar_t) {
		this.btn_buscar_t = btn_buscar_t;
	}


	public JComboBox getCb_buscar_t() {
		return cb_buscar_t;
	}


	public void setCb_buscar_t(JComboBox cb_buscar_t) {
		this.cb_buscar_t = cb_buscar_t;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getHabilidades() {
		return habilidades;
	}


	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}


	public JTextField getTxt_buscar_n() {
		return txt_buscar_n;
	}


	public void setTxt_buscar_n(JTextField txt_buscar_n) {
		this.txt_buscar_n = txt_buscar_n;
	}




	
}
