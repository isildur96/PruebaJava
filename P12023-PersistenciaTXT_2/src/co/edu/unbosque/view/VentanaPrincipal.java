package co.edu.unbosque.view;

import java.awt.Color;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	private PanelIngreso panel_botones;
	private PanelResultados panel_archivo;
	
	public VentanaPrincipal() {
		setTitle("Mostrar Imagen");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setSize(500,700);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.RED);
		
		inicializarComponentes();
		
		setResizable( true );
        setLocationRelativeTo( null );
        setVisible(true);
	}

	private void inicializarComponentes() {
		panel_botones = new PanelIngreso();
		panel_botones.setBounds(25, 25, 435, 200);
		getContentPane().add(panel_botones);
		
		panel_archivo = new PanelResultados();
		panel_archivo.setBounds(25, 255, 435, 375);
		getContentPane().add(panel_archivo);
		
	}

	public PanelIngreso getPanel_botones() {
		return panel_botones;
	}

	public void setPanel_botones(PanelIngreso panel_botones) {
		this.panel_botones = panel_botones;
	}

	public PanelResultados getPanel_archivo() {
		return panel_archivo;
	}

	public void setPanel_archivo(PanelResultados panel_archivo) {
		this.panel_archivo = panel_archivo;
	}
	
	public File abrirArchivo() {
		JFileChooser fc = new JFileChooser();
		int seleccion = fc.showOpenDialog(this);
		if(seleccion == JFileChooser.APPROVE_OPTION) {
			return fc.getSelectedFile();
		}else {
			return null;
		}
	}
}
