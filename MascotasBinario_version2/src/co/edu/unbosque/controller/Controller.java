package co.edu.unbosque.controller;

import co.edu.unbosque.model.Mascota;
import co.edu.unbosque.model.MascotaDTO;
import co.edu.unbosque.view.VistaConsola;

public class Controller {
    
    private VistaConsola vista;
    private MascotaDTO dto;
    
    public Controller() {
        vista = new VistaConsola();
        dto = new MascotaDTO();
        funcionar();
    }
    
    public void funcionar() {
        String nom = "";
        int e = 0;
        int opcion = 0;
        
        String menu = "**********************************************\n"+
        			  "**           Gestión de Veterinaria         **\n"+
        			  "**********************************************\n"+
        			  " Operaciones:\n"+
        			  " 	1. Ingresar mascota\n"+
        			  " 	2. Consultar mascota\n"+
        			  " 	3. Modificar mascota\n"+
        			  " 	4. Eliminar mascota\n"+
        			  " 	5. Ver directorio de mascotas\n"+
        			  " 	6. Salir\n"+
        			  " Operación a realizar:";
        
        do {
        	opcion = vista.leerDatoEntero(menu);
        	switch (opcion) {
			case 1:
				ingresarMascota();
				break;
			case 2:
				consultarMascota();
				break;
			case 3:
				modificarMascota();
				break;
			case 4:
				eliminarMascota();
				break;
			case 5:
				verDirectorio();
				break;
			case 6:
				vista.mostrarInformacion("Hasta pronto");
				break;

			default:
				vista.mostrarInformacion("Error: opción inválida");
				break;
			}
        	
        }while(opcion != 6);
        
        
              
    }
    
    public void modificarMascota() {
        
        String nom = vista.leerDatoString("Digite nombre de la mascota a actualizar: ");
        if (dto.getMascota_dao().buscarMascota(nom, dto.getVeterinaria()) != null) {
            String nom2 = vista.leerDatoString("Digite nuevo nombre de la mascota a actualizar: ");
            int e = vista.leerDatoEntero("Digite nueva edad: ");
            
            vista.mostrarInformacion("" + dto.getMascota_dao().modificarMascota(nom, nom2, e, dto.getVeterinaria(), dto.getFile()));
            vista.mostrarInformacion("La mascota fue actualizada");
        } else {
            vista.mostrarInformacion("La mascota no está registrada");
        }
        vista.mostrarInformacion("");
        vista.mostrarInformacion("" + dto.getMascota_dao().mostrarListado(dto.getFile()));
        
    }
    
    public void ingresarMascota() {
    	String nom = vista.leerDatoString("Digite nombre de la mascota a ingresar: ");
    	int e = vista.leerDatoEntero("Digite la edad de la mascota: ");
    	if(dto.getMascota_dao().agregarMascota(nom, e, dto.getVeterinaria(), dto.getFile())) {
    		vista.mostrarInformacion("Se agregó la mascota");
    	}else {
    		vista.mostrarInformacion("NO fue posible agregar la mascota");
    	}
    }
    
    public void consultarMascota() {
    	String nom = vista.leerDatoString("Digite nombre de la mascota a buscar: ");
    	Mascota aux = dto.getMascota_dao().buscarMascota(nom, dto.getVeterinaria());
    	if(aux == null) {
    		vista.mostrarInformacion("Las macota no se encuentra en la bd");
    	}else {
    		vista.mostrarInformacion(aux.toString());
    	}
    }
    
    public void eliminarMascota() {
    	String nom = vista.leerDatoString("Digite nombre de la mascota a eliminar: ");
    	if(dto.getMascota_dao().eliminarMascota(nom, dto.getVeterinaria(), dto.getFile())) {
    		vista.mostrarInformacion("Se eliminó la mascota");
    	}else {
    		vista.mostrarInformacion("NO fue posible eliminar la mascota");
    	}
    }
    
    public void verDirectorio() {
    	vista.mostrarInformacion(dto.getMascota_dao().mostrarListado(dto.getFile()));
    }
}
