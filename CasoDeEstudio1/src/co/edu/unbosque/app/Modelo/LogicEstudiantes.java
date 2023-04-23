package co.edu.unbosque.app.Modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class LogicEstudiantes {
	
		

		private ArrayList<Estudiantes> es;
		
		Scanner sc = new Scanner(System.in);
		private Estudiantes e;
		
		
		public LogicEstudiantes() {
			es = new ArrayList<Estudiantes>();
		}
		public Estudiantes BuscarCed(String ced) {
			// TODO Auto-generated method stub
			Estudiantes est = null;
			for(Estudiantes e : es) {
				if(e.getCed().equals(ced)) {
					est = e;
					break;
				}
			}
			return est;
		}

		public boolean dardatosEstudiante(Estudiantes pEs) {
			// TODO Auto-generated method stub
			boolean noexiste;
			if(es.contains(pEs))
				noexiste = false;
			else {
				es.add(pEs);
				noexiste = true;
			}
			return noexiste;
		}
			public Estudiantes BuscarNom(String nom,String ap) {
				// TODO Auto-generated method stub
				Estudiantes est= null;
				for (Estudiantes e : es) {
					if(e.getNom().equals(nom)) {
						if(e.getAp().equals(ap)) {
						est = e;
						break;
						}
					}
				}
				return est;
			}
				public String listarEstudiantes() {
					// TODO Auto-generated method stub
					String res = "Listado de estudiantes\n";
					for(Estudiantes e : es) {
					res = res + e.toString() + "\n";
					}
				return res;
				}
			}

		

