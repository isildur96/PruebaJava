package co.edu.unbosque.view;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Map;

import co.edu.unbosque.controller.*;

public class VentanaResultadoContactosPorPais extends JFrame {

    private static final long serialVersionUID = 1L;

    Controller coordinador;

    private JPanel contentPane;
    private JScrollPane scrollPane;
    private JLabel lblTitulo;
    private JTable tablaProductos;

    private DefaultTableModel model;

    public VentanaResultadoContactosPorPais() {
        setSize(527, 337);
        setTitle("Agenda");
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        titulo();

        scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 51, 491, 168);
        contentPane.add(scrollPane);
    }

    private void titulo() {
        lblTitulo = new JLabel("Lista De Contactos Por Pais");
        lblTitulo.setBackground(Color.BLACK);
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setOpaque(true);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblTitulo.setBounds(0, 10, 527, 30);
        contentPane.add(lblTitulo);
    }

    private void crearModeloTabla() {
        tablaProductos = new JTable();
        scrollPane.setViewportView(tablaProductos);

        model = new DefaultTableModel();
        model.addColumn("Pais");
        model.addColumn("Cantidad");
        model.addColumn("Porcentaje");
        tablaProductos.setModel(model);        
    }

    public void llenarTabla() {
        Map<String, Integer> items = coordinador.resultadoPorcentajeContactosPorPais();
        
        crearModeloTabla();
        if (!items.isEmpty()) {            
            for (String pais : items.keySet()) {
            	int count = items.get(pais);
                double percentage = count * 100.0 / coordinador.getContactos().size();
            	
    			Object[] fila = new Object[3];
    			fila[0] = pais;
    			fila[1] = count;
    			fila[2] = percentage;
    			model.addRow(fila);    			            
                //System.out.printf("- %s: %d (%.2f%%)\n", pais, count, percentage);
            }
        }
    }

    public void setCoordinador(Controller coordinador) {
        this.coordinador = coordinador;
    }
}
