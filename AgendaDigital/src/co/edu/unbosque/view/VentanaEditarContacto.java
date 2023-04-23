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
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.JComboBox;

public class VentanaEditarContacto extends JFrame {

	private static final long serialVersionUID = 1L;

	Controller coordinador;
    Contacto item = null;

    private JPanel panel;

    private JLabel lblTitulo;
    private JLabel lblError;

    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblEmpresa;
    private JLabel lblPais;
    private JLabel lblCorreo;
    private JLabel lblTelefono;
    
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtEmpresa;    
    private JTextField txtCorreo;
    private JTextField txtTelefono;

    private JButton btnConsultar;
    private JButton btnEditar;

    private JComboBox<Integer> comboBox;   
    JComboBox<String> comboBoxPaises;

    public VentanaEditarContacto() {
        setSize(460, 337);
        setTitle("Agenda");
        setLocationRelativeTo(null);//centra la ventana
        setResizable(false);
        IniciarComponentes();                
    }

    private void IniciarComponentes() {
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(panel);
        panel.setLayout(null);

        /*Etiquetas*/
        lblTitulo = new JLabel("Editar Contacto");
        lblTitulo.setBackground(Color.BLACK);
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setOpaque(true);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblTitulo.setBounds(0, 10, 450, 30);
        panel.add(lblTitulo);

        lblError = new JLabel("Editar Contacto");
        lblError.setBackground(Color.RED);
        lblError.setForeground(Color.WHITE);
        lblError.setOpaque(true);
        lblError.setHorizontalAlignment(SwingConstants.CENTER);
        lblError.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblError.setBounds(0, 265, 450, 30);
        lblError.setVisible(false);
        panel.add(lblError);

        titulos();
        campos();
        botones();

        comboBox = new JComboBox<Integer>();
        comboBox.setBounds(312, 61, 125, 22);
        panel.add(comboBox);
        
        comboBoxPaises = new JComboBox<String>();
        comboBoxPaises.setBounds(130, 150, 150, 20);
		panel.add(comboBoxPaises);
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
        
        lblEmpresa = new JLabel("Empresa");
        lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEmpresa.setBounds(25, 120, 120, 20);
        panel.add(lblEmpresa);

        lblPais = new JLabel("Pais");
        lblPais.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPais.setBounds(25, 150, 120, 20);
        panel.add(lblPais);

        lblCorreo = new JLabel("Correo");
        lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCorreo.setBounds(25, 180, 120, 20);
        panel.add(lblCorreo);
        
        lblTelefono = new JLabel("Telefono");
        lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTelefono.setBounds(25, 210, 120, 20);
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
        
        txtEmpresa = new JTextField();
        txtEmpresa.setBounds(130, 120, 150, 20);        
        txtEmpresa.setColumns(10);
        panel.add(txtEmpresa);

        /*txtPais = new JTextField();
        txtPais.setColumns(10);
        txtPais.setBounds(130, 150, 150, 20);
        panel.add(txtPais);*/

        txtCorreo = new JTextField();
        txtCorreo.setColumns(10);
        txtCorreo.setBounds(130, 180, 150, 20);
        panel.add(txtCorreo);
        
        txtTelefono = new JTextField();
        txtTelefono.setColumns(10);
        txtTelefono.setBounds(130, 210, 150, 20);
        panel.add(txtTelefono);
    }

    private void botones() {
        btnConsultar = new JButton("Buscar");
        btnConsultar.setBounds(348, 91, 89, 23);
        panel.add(btnConsultar);
        btnConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblError.setVisible(false);
                int referencia = Integer.parseInt(comboBox.getSelectedItem().toString());
                item = coordinador.getContacto(referencia);
                if (item != null) {
                    txtId.setText(item.getId() + "");
                    txtNombre.setText(item.getNombre());
                    txtEmpresa.setText(item.getEmpresa());
                    comboBoxPaises.setSelectedItem(item.getPais());
                    //txtPais.setText(item.getPais());
                    txtCorreo.setText(item.getCorreo());
                    txtTelefono.setText(item.getTelefono());
                    btnEditar.setEnabled(true);
                }
            }
        });

        btnEditar = new JButton("Editar");
        btnEditar.setBounds(130, 240, 150, 20);
        btnEditar.setEnabled(false);
        panel.add(btnEditar);
        btnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	try {
    				int id = Integer.parseInt(txtId.getText());
					String nombre = txtNombre.getText();
					String empresa = txtEmpresa.getText();
					String pais = comboBoxPaises.getSelectedItem().toString();//txtPais.getText();
					String correo = txtCorreo.getText();
					String telefono = txtTelefono.getText();
									
					Contacto item = new Contacto();
					item.setId(id);;
					item.setNombre(nombre);
					item.setEmpresa(empresa);
					item.setPais(pais);
					item.setCorreo(correo);
					item.setTelefono(telefono);

					coordinador.editarContacto(item);		

					lblError.setText(item.getNombre()+ " Fue editado");
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
    	List<Contacto> items = coordinador.getContactos();
    	for (Contacto item : items) {
    	    comboBox.addItem(item.getId());
    	}
    	
    	lblError.setVisible(false);
		comboBoxPaises.removeAllItems();
		List<Pais> paises = coordinador.getPaises();
		for (Pais item : paises) {
			comboBoxPaises.addItem(item.getNombre());
		}
    }

    public void limpiarCampos() {
        txtId.setText("");
        txtNombre.setText("");
        txtEmpresa.setText("");
        //txtPais.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
    }

    public void setCoordinador(Controller coordinador) {
        this.coordinador = coordinador;
    }
}
