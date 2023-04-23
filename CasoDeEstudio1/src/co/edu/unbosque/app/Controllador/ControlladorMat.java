package co.edu.unbosque.app.Controllador;

import java.util.Scanner;

import co.edu.unbosque.app.Modelo.Estudiantes;


public class ControlladorMat {

	
	Scanner scan = new Scanner (System.in);
	private Estudiantes e;
	public ControlladorMat() {
	
	System.out.println("Cuantas materias desea matricular?");
	int numeroMaterias;
	numeroMaterias= scan.nextInt();
	String [][] materias = new String [1][numeroMaterias];
	int nm = 0;
	
	for(int m = 0; m<numeroMaterias; m++) {
		nm = 1+m;
		System.out.println("Ingrese el nombre de la materia " + nm +" que desea registrar");
		Scanner scan2 = new Scanner (System.in);
		String materia = scan2.nextLine();
		materias[0][m] = materia;
	}
	int materiaPrimerCorte = 0;
	double[] matrizNotas = new double [numeroMaterias * 3];
	for(int m = 0; m <numeroMaterias; m++) {
		System.out.println("Ingrese las notas de " + materias[0][m]);
		System.out.println("Ingrese la nota del primer corte de " + materias[0][m] +"\n" + " Digite la nota dentro de un valor de 0 a 50 : \n");
		Scanner scan3 = new Scanner (System.in);
		double nota1 = scan3.nextDouble();
		matrizNotas[materiaPrimerCorte] = nota1;
		
		System.out.println("Ingrese las notas de " + materias[0][m]);
		System.out.println("Ingrese la nota del segundo corte de " + materias[0][m] +"\n" + " Digite la nota dentro de un valor de 0 a 50 : ");
		Scanner scan4 = new Scanner (System.in);
		double nota2 = scan4.nextDouble();
		matrizNotas[materiaPrimerCorte+1] = nota2;
		
		System.out.println("Ingrese las notas de " + materias[0][m]);
		System.out.println("Ingrese la nota del tercer corte de " + materias[0][m] +"\n" + " Digite la nota dentro de un valor de 0 a 50 : ");
		Scanner scan5 = new Scanner (System.in);
		double nota3 = scan3.nextDouble();
		matrizNotas[materiaPrimerCorte+2] = nota3;
		
		materiaPrimerCorte = materiaPrimerCorte +3;
	}
	
		int materiaActual = 0;
		for(int t = 0; t<numeroMaterias; t++) {
			double promedioMateria = 0;
			promedioMateria = matrizNotas[materiaActual]*0.30 + matrizNotas[materiaActual+1]*0.30 + matrizNotas[materiaActual+2]*0.40;
			System.out.println("Materia : " + materias[0][t] + "\n"
							  +"Promedio: " + promedioMateria);
			materiaActual = materiaActual +3;
		}
		
		double promedioPonderado = 0;
		
		for(int m = 0; m<numeroMaterias; m++) {
			double nota = matrizNotas[m];
			promedioPonderado = promedioPonderado + nota;
		}
		
		double promedio = promedioPonderado/numeroMaterias;
		
		double materias70 = numeroMaterias*0.70;
		double materias72 = numeroMaterias*0.72;
		double materias50 = numeroMaterias*0.50;
		
		int materias70Int = (int) Math.round(materias70);
		int materias72Int = (int) Math.round(materias72);
		int materias50Int = (int) Math.round(materias50);
		int notas70 = 41*materias70Int;
		int notas72 = 38*materias72Int;
		int notas50 = 30*materias50Int;
		
		if(promedioPonderado>41) {
				
				System.out.println("El estudiante recibira ebca del 60%\n");
				
		}else if (promedio>notas70) {
		
			System.out.println("El estudiante recibira beca del 50\n");
		
			
		}else if (promedio>notas72) {

			System.out.println("El estudiante recibira beca del 10%\n");
			
			
		}else if (promedioPonderado>38) {
		
			System.out.println("El estudiante recibira beca del 25% \n");
			
			
		}else if (promedio>notas50) {
			
			System.out.println("El estudiante pasara a prueba academica\n");
			
		}
		
		
}
}