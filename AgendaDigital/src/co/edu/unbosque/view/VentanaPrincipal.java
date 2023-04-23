package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import co.edu.unbosque.controller.*;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

    Controller coordinador;

    private JPanel panel;

    private JLabel lblTitulo;
    private JLabel lblError;
   
    private JButton btnAgregarContacto;
    private JButton btnAgregarAmigo;
    private JButton btnEditarContacto;
    private JButton btnEditarAmigo;
    private JButton btnMostrarListaAmigos;    
    private JButton btnMostrarListaContactos;
    private JButton btnMostrarAmigosXpais;
    private JButton btnMostrarListaContactosXpais;
    private JButton btnMostrarListaAmigosXdominio;
    private JButton btnMostrarListaContactosXdominio;
    
    
    private JLabel lblPorcentajeAmigosRegistrados;
    private JLabel lblPorcentajeContactosRegistrados;
    
    private JLabel lblResultadoPorcentajeAmigosRegistrados;
    private JLabel lblResultadoPorcentajeContactosRegistrados;
    
    JFileChooser fileChooser;
    
    public VentanaPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 350);
        setTitle("Agenda");
        setResizable(false);

        IniciarComponentes();
    }

    private void IniciarComponentes() {
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(panel);
        panel.setLayout(null);

        /**/
        lblTitulo = new JLabel("Panel Principal");
        lblTitulo.setBackground(Color.BLACK);
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setOpaque(true);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblTitulo.setBounds(0, 10, 450, 30);
        panel.add(lblTitulo);

        lblError = new JLabel("Agregar Equipo");
        lblError.setBackground(Color.RED);
        lblError.setForeground(Color.WHITE);
        lblError.setOpaque(true);
        lblError.setHorizontalAlignment(SwingConstants.CENTER);
        lblError.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblError.setBounds(0, 40, 450, 30);
        lblError.setVisible(false);
        panel.add(lblError);

        titulos();
        //campos();
        botones();
    }

    private void titulos() {
    	lblPorcentajeAmigosRegistrados = new JLabel("Porcentaje Amigos Registrados");
    	lblPorcentajeAmigosRegistrados.setFont(new Font("Tahoma", Font.PLAIN, 14));
    	lblPorcentajeAmigosRegistrados.setBounds(25, 60, 240, 20);
    	panel.add(lblPorcentajeAmigosRegistrados);
		
    	lblPorcentajeContactosRegistrados = new JLabel("Porcentaje Contactos Registrados");
    	lblPorcentajeContactosRegistrados.setFont(new Font("Tahoma", Font.PLAIN, 14));
    	lblPorcentajeContactosRegistrados.setBounds(25, 80, 240, 20);
    	panel.add(lblPorcentajeContactosRegistrados);  	
    }

    public void campos() {
    	/**/
    	float result = coordinador.resultadoPorcentajeAmigosRegistrados();
    	lblResultadoPorcentajeAmigosRegistrados = new JLabel(result + "");
    	lblResultadoPorcentajeAmigosRegistrados.setFont(new Font("Tahoma", Font.PLAIN, 14));
    	lblResultadoPorcentajeAmigosRegistrados.setBounds(250, 60, 240, 20);
    	panel.add(lblResultadoPorcentajeAmigosRegistrados);
    	
    	result = coordinador.resultadoPorcentajeContactosRegistrados();
    	lblResultadoPorcentajeContactosRegistrados = new JLabel(result + "");
    	lblResultadoPorcentajeContactosRegistrados.setFont(new Font("Tahoma", Font.PLAIN, 14));
    	lblResultadoPorcentajeContactosRegistrados.setBounds(250, 80, 240, 20);
    	panel.add(lblResultadoPorcentajeContactosRegistrados);    	
    }

    private void botones() {

    	fileChooser = new JFileChooser("Nuevo Contacto");
    	fileChooser.setBounds(220, 50, 123, 23);
    	
    	
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
        
        JButton btnCargarArchivo = new JButton("Cargar archivo");
        btnCargarArchivo.setBounds(220, 110, 123, 23);
        panel.add(btnCargarArchivo);
        
        btnCargarArchivo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    coordinador.cargarArchivo(selectedFile.getAbsolutePath());
                    
                    System.out.println("Archivo seleccionado: " + selectedFile.getAbsolutePath());
                    // Aquí puedes hacer lo que quieras con el archivo seleccionado
                    campos();
                }
            }
        });
                      
    	
    	btnAgregarContacto = new JButton("Nuevo Contacto");
    	btnAgregarContacto.setBounds(220, 140, 123, 23);
        panel.add(btnAgregarContacto);
        btnAgregarContacto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	coordinador.mostrarVentanaAgregarContacto();
                lblError.setVisible(false);
            }
        });
        
        btnAgregarAmigo = new JButton("Nuevo Amigo");
        btnAgregarAmigo.setBounds(80, 140, 123, 23);
        panel.add(btnAgregarAmigo);
        btnAgregarAmigo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	coordinador.mostrarVentanaAgregarAmigo();
                lblError.setVisible(false);
            }
        });
        
    	btnEditarContacto = new JButton("Editar Contacto");
    	btnEditarContacto.setBounds(220, 170, 123, 23);
        panel.add(btnEditarContacto);
        btnEditarContacto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	coordinador.mostrarVentanaEditarContacto();
                lblError.setVisible(false);
            }
        });
        
        btnEditarAmigo = new JButton("Editar Amigo");
        btnEditarAmigo.setBounds(80, 170, 123, 23);
        panel.add(btnEditarAmigo);
        btnEditarAmigo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coordinador.mostrarVentanaEditarAmigo();
                lblError.setVisible(false);
            }
        });

        btnMostrarListaContactos = new JButton("Ver Contactos");
        btnMostrarListaContactos.setBounds(220, 200, 123, 23);
        panel.add(btnMostrarListaContactos);
        btnMostrarListaContactos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coordinador.mostrarVentanaListaContactos();
                lblError.setVisible(false);
            }
        });

        btnMostrarListaAmigos = new JButton("Ver Amigos");
        btnMostrarListaAmigos.setBounds(80, 200, 123, 23);
        panel.add(btnMostrarListaAmigos);
        btnMostrarListaAmigos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coordinador.mostrarVentanaListaAmigos();
                lblError.setVisible(false);
            }
        });  
        
        btnMostrarListaContactosXpais = new JButton("Contactos Pais");
        btnMostrarListaContactosXpais.setBounds(220, 230, 123, 23);
        panel.add(btnMostrarListaContactosXpais);
        btnMostrarListaContactosXpais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	coordinador.mostrarVentanaResultadoContactosPorPais();
                lblError.setVisible(false);
            }
        });

        btnMostrarAmigosXpais = new JButton("Amigos Pais");
        btnMostrarAmigosXpais.setBounds(80, 230, 123, 23);
        panel.add(btnMostrarAmigosXpais);
        btnMostrarAmigosXpais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	coordinador.mostrarVentanaResultadoAmigosPorPais();
                lblError.setVisible(false);
            }
        });  
        
        btnMostrarListaContactosXdominio = new JButton("Contactos Dominio");
        btnMostrarListaContactosXdominio.setBounds(220, 260, 123, 23);
        panel.add(btnMostrarListaContactosXdominio);
        btnMostrarListaContactosXdominio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coordinador.mostrarVentanaResultadoContactosPorDominio();
                lblError.setVisible(false);
            }
        });

        btnMostrarListaAmigosXdominio = new JButton("Amigos Dominio");
        btnMostrarListaAmigosXdominio.setBounds(80, 260, 123, 23);
        panel.add(btnMostrarListaAmigosXdominio);
        btnMostrarListaAmigosXdominio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coordinador.mostrarVentanaResultadoAmigosPorDominio();
                lblError.setVisible(false);
            }
        });  
    }

    protected void limpiarCampos() {

    }

    public void setCoordinador(Controller coordinador) {
        this.coordinador = coordinador;
    }
}
