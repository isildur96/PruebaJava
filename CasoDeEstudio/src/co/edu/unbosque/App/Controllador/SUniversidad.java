package co.edu.unbosque.App.Controllador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.edu.unbosque.App.Modelo.Estudiante;
import co.edu.unbosque.App.Modelo.Materia;

public class SUniversidad {

	//LIST ESTUDIANTES 
	public static List<Estudiante> estudianteList;
	public static List<Materia> materiaList;
	
	//VARIABLE ESTATICA ENTERO PARA EL MENU 
	public static int menuOption;
	//IMPORTAR EL SCANNER  
	public static Scanner scan;
	
	public static void main(String[] args) {
		//POSICION DEL MENU
		menuOption = 0;
		//PASAMOS LA LISTA A UN ARRAYLIST
		estudianteList = new ArrayList<Estudiante>();
		materiaList = new ArrayList<Materia>();
		//ASIGNAR VARIABLE SCAN AL SCANNER
		scan = new Scanner(System.in);
		
		do {
			//MOSTRAR EL METODO PRINT MENU
			menuOption = printMenu();
			//EL SWITCH TRABAJARA CON LA VARIABLE MENU OPTION
			//EL VALOR DE MENU OPTION LO DARA EL METODO PRINT MENU 
			switch(menuOption) {
			case 1:
				//METODO PARA METER ESTUDIANTES AL SISTEMA 
				insertNewEstudiante();
				break;
			case 2: 
				//METODO PARA BUSCAR EL ESTUDIANTE POR ID 
				searchEstudiante();
				break;
			case 3:
				//METODO PARA BUSCAR ESTUDIANTE POR NOMBRE 
				searchEstudianteName();
				break;
			case 4:
				//MUESTRA UN LISTADO DE TODOS LOS ESTUDIANTES 
				showAllEstudiante();
				break;
			case 5 :
				//AGREGAR MATERIAS 
				insertNewMateria();
				break;
			case 6: 
				//AGREGAR MATERIAS A UN ESTUDIANTE 
				searchEstudianteMa();
				break;
			default:
				//OPCIONES EQUIVOCADAS DE RESPUESTA 
				System.out.println("Ha ingresado una opcion invalida. Por favor ingrese una opcion de nuevo ");
				break;
			}
			//SE REPETIE SIEMPRE Y CUANDO LA RESPUESTA NO COINCIDE CON LAS DEL SISTEMA 
		}while(menuOption != 6 );
	}
	private static void searchEstudianteMa() {
		// TODO Auto-generated method stub
			List<Estudiante> queryResult;
					//LISTA LLAMA AL METODO ENCONTRAR ESTUDIANTE 
					queryResult = findEstudiante();
					
					//GENERAR UN IF PATRA BUSCAR DATOS 
					//SE VALIDA QUE LA LISTA TENGA UN VALOR MAYOR 0
					if (queryResult.size()> 0) {
						//SE USA EL METODO FOR ECHA PARA UBICAR LOS DATOS 
						queryResult.forEach(estudiantes -> {
						
							System.out.println("------------------------------------------------");
							System.out.println("Nombre: " + estudiantes.getNombre());
							System.out.println("Id: " + estudiantes.getId());
							insertNewMateria();
							System.out.println("------------------------------------------------");
						});	
					}else {
						System.out.println("No se encontraron estudiantes");
					}
					
			
		
	
	}
	//BUSCAR ESTUDIANTE POR NOMBRE
	private static void searchEstudianteName() {
				List<Estudiante> queryResult;
				//LISTA LLAMA AL METODO ENCONTRAR ESTUDIANTE 
				queryResult = findEstudianteName();
				
				//GENERAR UN IF PATRA BUSCAR DATOS 
				//SE VALIDA QUE LA LISTA TENGA UN VALOR MAYOR 0
				if (queryResult.size()> 0) {
					//SE USA EL METODO FOR ECHA PARA UBICAR LOS DATOS 
					queryResult.forEach(estudiantes -> {
						System.out.println("-------------------------------------------");
						System.out.println("Nombre: " + estudiantes.getNombre());
						System.out.println("Id: " + estudiantes.getId());
						showAllMaterias();
						System.out.println("-------------------------------------------");
					});	
				}else {
					System.out.println("No se encontraron estudiantes");
				}
	}
	private static List<Estudiante> findEstudianteName() {
		//SE GENERA LA VARIABLE CON LA CUAL SE VA A BUSCAR 
		String nombre;
		System.out.println("");
		System.out.println("Ingrese el nombre del estudiante a buscar : ");
		nombre = scan. nextLine();
		List<Estudiante> estudiantes;
		
		//busca la id en estudiantes y la muestra por medio de stream()
		
		estudiantes = estudianteList.stream().filter(y -> y.getNombre().toLowerCase().contains(nombre.toLowerCase())).toList();
		return estudiantes;
	}
	
	//MOSTRAR TODOS LOS CONTACTOS 
	private static void showAllEstudiante() {
		// TODO Auto-generated method stub
		if(estudianteList.size()> 0) {
		estudianteList.forEach(estudiantes -> {
				System.out.println("-------------------------------------------------");
				System.out.println("Nombre: " + estudiantes.getNombre());
				System.out.println("Id: " + estudiantes.getId());
				System.out.println("-------------------------------------------------");
			});
		}else {
			System.out.println("La agenda esta vacia");
		}
	}
	
	

	//METODO PARA BUSCAR EL ESTUDIANTE 
	private static void searchEstudiante() {
		// TODO Auto-generated method stub
		List<Estudiante> queryResult;
		List<Materia>queryResultMateria;
		//LISTA LLAMA AL METODO ENCONTRAR ESTUDIANTE 
		queryResult = findEstudiante();

		//GENERAR UN IF PATRA BUSCAR DATOS 
		//SE VALIDA QUE LA LISTA TENGA UN VALOR MAYOR 0
		if (queryResult.size()> 0) {
			//SE USA EL METODO FOR ECHA PARA UBICAR LOS DATOS 
			queryResult.forEach(estudiantes -> {
			
				System.out.println("------------------------------------------------");
				System.out.println("Nombre: " + estudiantes.getNombre());
				System.out.println("Id: " + estudiantes.getId());
				showAllMaterias();
				System.out.println("------------------------------------------------");
			});	
		}else {
			System.out.println("No se encontraron estudiantes");
		}
		
		
		
	}
	
	
	
	private static List<Materia> findMateria() {
		// TODO Auto-generated method stub
		String idMateria;
		System.out.println("");
		System.out.println("Ingrese el identificador de materias : ");
		idMateria = scan. nextLine();
		List<Materia> materias;
		
		//busca la id en estudiantes y la muestta por medio de stream()
		
		materias = materiaList.stream().filter(x -> x.getIdMateria().toLowerCase().contains(idMateria)).toList();
		return materias;
		
	}
	private static List<Materia> showAllMaterias() {
		// TODO Auto-generated method stub
		List<Materia> queryResult;
		//LISTA LLAMA AL METODO ENCONTRAR MATERIAS 
		queryResult = findMateria();
		
		//GENERAR UN IF PATRA BUSCAR DATOS 
		//SE VALIDA QUE LA LISTA TENGA UN VALOR MAYOR 0
		if (queryResult.size()> 0) {
			//SE USA EL METODO FOR ECHA PARA UBICAR LOS DATOS 
			queryResult.forEach(materias -> {
				System.out.println("-------------------------------------------");
				System.out.println("Materias: " + materias.getMateria());
				System.out.println("Codigo de materia: " + materias.getIdMateria());
				System.out.println("-------------------------------------------");
			});	
		}else {
			System.out.println("No se encontraron materias");
		}

		return null;
	}
	private static List<Estudiante> findEstudiante() {
		// TODO Auto-generated method stub
		//SE GENERA LA VARIABLE CON LA CUAL SE VA A BUSCAR 
		String id;
		System.out.println("");
		System.out.println("Ingrese el id  del estudiante a buscar : ");
		id = scan. nextLine();
		List<Estudiante> estudiantes;
		
		//busca la id en estudiantes y la muestta por medio de stream()
		
		estudiantes = estudianteList.stream().filter(x -> x.getId().toLowerCase().contains(id)).toList();
		return estudiantes;
	}
	//METODO DE INGRESO DE ESTUDIANTES 
	private static void insertNewEstudiante() {
		// TODO Auto-generated method stub
		//GENERA UN NUEVO OBJEETO DEPENDIENDO DE LA INFORMACION DE 
		//GET ESTUDAINTE INFO 
		Estudiante newEstudiante = getEstudianteInfo();
		
		//SI LA LISTA TIENE UN ESTUDIANTE CON LOS MISMOS VALORES
		//MOSTRARA EL SYSTEM.OUT 
		if(estudianteList.contains(newEstudiante)) {
			System.out.println("Ya existe un estudiante con los mismos datos");
			//SINO ESTA REPETIDO EL ESTUDIANTE MOSTRARA EL MENSAJE 
			//DEL SYSTEM.OUT 
		}else {
			estudianteList.add(newEstudiante);
			System.out.println("Estudiante guardado exitosamente");
			
		}
	}
	private static void insertNewMateria() {
		// TODO Auto-generated method stub
		Materia newMateria = getMateriaInfo();
		if(materiaList.contains(newMateria)) {
			System.out.println("Esa materia ya esta guardada");
		}else {
			materiaList.add(newMateria);
			System.out.println("Materias gurdadas exitosamente");
		}
	}
	//METODO PARA OBTENER MATERIAS 
	private static Materia getMateriaInfo() {
		// TODO Auto-generated method stub
		//DATOS DE LA MATERIA A RECIVIR 
	
		String idMateria;
		int codigoma = 1;
		String materia;
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		
		System.out.println("");
		System.out.println("Materia numero : " + codigoma++);
		System.out.println("Creee su identificador de materias si ya tiene uno digitelo:");
		idMateria = scan.nextLine();
		System.out.println("Su identificador es : " + idMateria);
		System.out.println("Identificador guardado con exito");
		System.out.println("Ingrese la asignatura a matricular :");
		materia = scan.nextLine();
		
		Materia materias = new Materia (idMateria ,materia , nota1 , nota2 , nota3);
		return materias;
	}

	//METODO PARA LA OBTENSION DE DATOS 
	private static Estudiante getEstudianteInfo() {
		// TODO Auto-generated method stub
		//DATOS A RECIVIR NOMBRE Y IDENTIFICACION 
		String nombre , id;
		
		System.out.print("Ingrese el nombre del estudiante: ");
		nombre  = scan.nextLine();
		
		System.out.print("Ingrese el numero de identificacion del estudiante: ");
		id= scan.nextLine();
		//ENVIA DATOS A LA CLASE ESTUDIANTE 
		insertNewMateria();
		Estudiante estudiantes = new Estudiante(nombre,id);
		
		//RETORNA LOS DATOS GUARDADOS DENTRO DE LA VARIABLE estudiantes
		return estudiantes;
		
	}
	//METODO ESTATICO PARA MOSTRAR UN MENU QUE SERA EJECUTADO CON UN SWITCH
	private static int printMenu() {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------------------------");
		System.out.println("-                   UNIVERSIDAD                     -");
		System.out.println("-             FACULTAD DE INGIENERIA                -");
		System.out.println("-        PROGRAMA: INGIENERIA DE SISTEMAS           -");
		System.out.println("-----------------------------------------------------");
		System.out.println("");
		System.out.println("1. Agregar un estudiante nuevo");
		System.out.println("2. Buscar un estudiante con numero de identificacion");
		System.out.println("3. Buscar un estudiante con nombre");
		System.out.println("4. Mostrar todos los estudiantes");
		System.out.println("5. Consulta de notas");
		System.out.println("6. Agregar materias");
		System.out.println("6. Eliminar todos los estudiantes");
		System.out.println("8. Salir del programa");
		System.out.println("");
		System.out.print("Ingrese el numero de la opcion deseada:");
		return Integer.parseInt(scan.nextLine());
		
	}

}
