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
import java.util.List;

import co.edu.unbosque.controller.*;
import co.edu.unbosque.model.*;

public class VentanaListaContactos extends JFrame {

    private static final long serialVersionUID = 1L;

    Controller coordinador;

    private JPanel contentPane;
    private JScrollPane scrollPane;
    private JLabel lblTitulo;
    private JTable tablaProductos;

    private DefaultTableModel model;

    public VentanaListaContactos() {
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
        lblTitulo = new JLabel("Lista De Contactos");
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
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Empresa");
        model.addColumn("Pais");
        model.addColumn("Correo");
        model.addColumn("Telefono");
        tablaProductos.setModel(model);        
    }

    public void llenarTabla() {
        List<Contacto> items = coordinador.getContactos();
        crearModeloTabla();
        if (!items.isEmpty()) {
            for (Contacto item : items) {
                Object[] fila = new Object[6];
                fila[0] = item.getId();
                fila[1] = item.getNombre();
                fila[2] = item.getEmpresa();
                fila[3] = item.getPais();
                fila[4] = item.getCorreo();
                fila[5] = item.getTelefono();
                model.addRow(fila);
            }
        }
    }

    public void setCoordinador(Controller coordinador) {
        this.coordinador = coordinador;
    }
}
