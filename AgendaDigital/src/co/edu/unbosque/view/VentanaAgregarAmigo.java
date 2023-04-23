
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.*;
import co.edu.unbosque.model.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class VentanaAgregarAmigo extends JFrame {

	private static final long serialVersionUID = 1L;

	Controller coordinador;
	Amigo item = null;

	private JPanel panel;

	private JLabel lblTitulo;
	private JLabel lblError;

	private JLabel lblId;
	private JLabel lblNombre;
	private JLabel lblPais;
	private JLabel lblCorreo;
	private JLabel lblTelefono;

	private JTextField txtId;
	private JTextField txtNombre;
	//private JTextField txtPais;
	private JTextField txtCorreo;
	private JTextField txtTelefono;

	private JButton btnAgregar;
	JComboBox<String> comboBox;

	public VentanaAgregarAmigo() {
		setSize(460, 337);
		setTitle("Agenda");
		setLocationRelativeTo(null);// centra la ventana
		setResizable(false);
		IniciarComponentes();
	}

	private void IniciarComponentes() {
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(null);

		/* Etiquetas */
		lblTitulo = new JLabel("Agregar Amigo");
		lblTitulo.setBackground(Color.BLACK);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setOpaque(true);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTitulo.setBounds(0, 10, 450, 30);
		panel.add(lblTitulo);

		lblError = new JLabel("Editar Amigo");
		lblError.setBackground(Color.RED);
		lblError.setForeground(Color.WHITE);
		lblError.setOpaque(true);
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setFont(new Font("Arial", Font.PLAIN, 12));
		lblError.setBounds(0, 240, 450, 30);
		lblError.setVisible(false);
		panel.add(lblError);

		titulos();
		campos();
		botones();
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(130, 120, 150, 20);
		panel.add(comboBox);
	}

	private void titulos() {
		lblId = new JLabel("Id");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setBounds(25, 60, 120, 20);
		panel.add(lblId);

		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(25, 90, 120, 20);
		panel.add(lblNombre);

		lblPais = new JLabel("Pais");
		lblPais.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPais.setBounds(25, 120, 120, 20);
		panel.add(lblPais);

		lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCorreo.setBounds(25, 150, 120, 20);
		panel.add(lblCorreo);

		lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefono.setBounds(25, 180, 120, 20);
		panel.add(lblTelefono);
	}

	
	private void campos() {
		txtId = new JTextField();
		txtId.setBounds(130, 60, 150, 20);
		txtId.setEditable(false);
		txtId.setColumns(10);
		panel.add(txtId);

		txtNombre = new JTextField();
		txtNombre.setBounds(130, 90, 150, 20);
		txtNombre.setColumns(10);
		panel.add(txtNombre);
		
		/*txtPais = new JTextField();
		txtPais.setColumns(10);
		txtPais.setBounds(130, 120, 150, 20);
		panel.add(txtPais);*/

		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(130, 150, 150, 20);
		panel.add(txtCorreo);

		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(130, 180, 150, 20);
		panel.add(txtTelefono);
	}

	private void botones() {
		btnAgregar = new JButton("Agreagr");
		btnAgregar.setBounds(130, 210, 150, 20);
		panel.add(btnAgregar);
		btnAgregar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String nombre = txtNombre.getText();
					//String pais = txtPais.getText();
					String pais = comboBox.getSelectedItem().toString();
					String correo = txtCorreo.getText();
					String telefono = txtTelefono.getText();
					
	                Amigo item = new Amigo();                //
	                item.setNombre(nombre);
	                item.setPais(pais);
	                item.setCorreo(correo);
	                item.setTelefono(telefono);
	                
	                coordinador.registrarAmigo(item);
	                
	                //JOptionPane.showMessageDialog(null, "Equipo agregado " + item.getNombre());
	                
	                lblError.setText("Amigo agregado " + item.getNombre());
	                lblError.setBackground(Color.GREEN);
	                lblError.setVisible(true);
	                limpiarCampos();	
				} catch (Exception e2) {
                    lblError.setText("Error : " + e2.getMessage());
                    lblError.setVisible(true);
				}				
			}
		});

	}
	
	public void cargarComboItems() {
		lblError.setVisible(false);
		comboBox.removeAllItems();
		List<Pais> items = coordinador.getPaises();
		for (Pais item : items) {
			comboBox.addItem(item.getNombre());
		}
	}

	public void limpiarCampos() {
		txtId.setText("");
		txtNombre.setText("");
		//txtPais.setText("");
		txtTelefono.setText("");
		txtCorreo.setText("");
	}

	public void setCoordinador(Controller coordinador) {
		this.coordinador = coordinador;
	}
}
