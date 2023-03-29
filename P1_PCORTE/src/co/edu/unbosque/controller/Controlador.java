package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import co.edu.unbosque.model.Pokemon;
import co.edu.unbosque.model.PokemonAgua;
import co.edu.unbosque.model.PokemonElectrico;
import co.edu.unbosque.model.PokemonFuego;
import co.edu.unbosque.model.PokemonHielo;
import co.edu.unbosque.view.PanelDatos;
import co.edu.unbosque.view.VentanaAgregar;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controlador {

	
	private int id;
	private String nombre , tipo, ataqueN, ataqueN1,ataqueT1 ,ataqueT;
	private VentanaPrincipal vp;
	private VentanaAgregar va;
	private Pokemon p;
	private PokemonAgua pa;
	private PokemonFuego pf;
	private PokemonElectrico pe;
	private PokemonHielo ph;
		
		
		public Controlador() {
		// TODO Auto-generated constructor stub
			
			vp = new VentanaPrincipal();
			p = new Pokemon();
			p.llenarAtributos(vp.getPd().getCb_buscar_t());
			abrirVentanaAgregar();
			
			
			
		}








		private void abrirVentanaAgregar() {
			// TODO Auto-generated method stub
			vp.getPd().getBtn_agregar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			va = new VentanaAgregar();
			p = new Pokemon();
			p.llenarAtributos(va.getPa().getCb_tipo());
			va.getPa().getBtn_tipo().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			tipo = va.getPa().getCb_tipo().getSelectedItem().toString();
			definirTipo(tipo , va.getPa().getCb_habilidades() , va.getPa().getCb_habilidades1());
			va.getPa().getBtn_guardar().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					ataqueT = va.getPa().getCb_habilidades().getSelectedItem().toString();
					ataqueT1 = va.getPa().getCb_habilidades1().getSelectedItem().toString();
					nombre = va.getPa().getTxt_nombre().getText().toString();
					ataqueN = p.getH1();
					ataqueN1= p.getH2();
					tipo = va.getPa().getCb_tipo().getSelectedItem().toString();
					
					id = p.getId();
					
					if(nombre.equals("")) {
						JOptionPane.showMessageDialog(va, "Ingrese un nombre para el pokemon");	
					}else {
						if (ataqueT.equals(ataqueT1)){
							JOptionPane.showMessageDialog(va, "Ingrese dos habilidades distintas");
						}else {
							JOptionPane.showMessageDialog(va, "Pokemon guardado con exito");
							
							definirTipo(nombre ,id , ataqueN,   ataqueN1,ataqueT , ataqueT1 ,tipo);
							va.setVisible(false);
							va.dispose();
							
							
							
							
							
						}
					}
				}

				private void definirTipo(String nombre, int id, String ataqueN, String ataqueN1, String ataqueT,
						String ataqueT1, String tipo) {
					// TODO Auto-generated method stub
					System.out.println(nombre + "\n" + id + "\n" + ataqueN + "\n" + ataqueN1 + "\n" + ataqueT + "\n" +ataqueT1 + "\n" + tipo);
				}
				
			});
			
							
							
						}

			private void definirTipo(String tipo, JComboBox cb_habilidades, JComboBox cb_habilidades1) {
				// TODO Auto-generated method stub
				
				switch(tipo) {
					
				case "Agua":
						pa.llenarAtributos(cb_habilidades);
						pa.llenarAtributos(cb_habilidades1);
					break;
					
				case "Fuego":
						pf.llenarAtributos(cb_habilidades);
						pf.llenarAtributos(cb_habilidades1);
					break;
					
				case "Electrico":
						pe.llenarAtributos(cb_habilidades);
						pe.llenarAtributos(cb_habilidades1);
					 break;
				case "Hielo":
						ph.llenarAtributos(cb_habilidades);
						ph.llenarAtributos(cb_habilidades1);
			
				}
			}
	
					});;
					
					
						
				}
			

			});
		}
		
}
