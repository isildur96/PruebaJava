package co.edu.unbosque.model.persistence;

import co.edu.unbosque.controller.*;
import co.edu.unbosque.model.*;

import java.util.*;

public class Procesos {

	Controller coordinador;
	ManejoArchivos manejoArchivos;
	GestorDeDatos gestorDeDatos;

	List<Pais> paises;
	List<Amigo> amigos;
	List<Contacto> contactos;

	Amigo amigo;
	Contacto contacto;

	public Procesos() {
		manejoArchivos = new ManejoArchivos();
		gestorDeDatos = new GestorDeDatos();

		paises = new ArrayList<>();
		amigos = new ArrayList<>();
		contactos = new ArrayList<>();

		
	}

	/* Cargar Datos */
	public void cargaDatosIniciales(String path) {
		//List<String> collection = manejoArchivos.readFile("agendaFisica.properties");
		List<String> collection = manejoArchivos.readFile(path);
		// collection.remove(0);

		// iterar a través de la lista
		for (String entry : collection) {
			// filtrar valores que comienzan con `B`
			if (entry.contains("agenda.pais") && !entry.contains("agenda.paises")) {
				String[] partes = gestorDeDatos.separateString(entry);
				paises.add(new Pais(Integer.parseInt(partes[2]), partes[3]));
			}
			if (entry.contains("amigo") && !entry.contains("amigo.cantidad")) {
				addAmigosArchivoInicial(entry);
			}
			if (entry.contains("contacto") && !entry.contains("contacto.cantidad")) {
				addContactosArchivoInicial(entry);
			}
		}
	}

	private void addAmigosArchivoInicial(String entry) {

		String[] partes = gestorDeDatos.separateString(entry);

		if (partes[1].equals("nombre")) {
			amigo = new Amigo();
			amigo.setId(Integer.parseInt(partes[2]));
			amigo.setNombre(partes[3]);
		}
		if (partes[1].equals("pais")) {
			amigo.setPais(partes[3]);
		}
		if (partes[1].equals("telefono")) {
			amigo.setTelefono(partes[3]);
		}
		if (partes[1].equals("correo")) {
			amigo.setCorreo(partes[3]);
			amigos.add(amigo);
		}

	}

	private void addContactosArchivoInicial(String entry) {

		String[] partes = gestorDeDatos.separateString(entry);

		if (partes[1].equals("nombre")) {
			contacto = new Contacto();
			contacto.setId(Integer.parseInt(partes[2]));
			contacto.setNombre(partes[3]);
		}
		if (partes[1].equals("empresa")) {
			contacto.setEmpresa(partes[3]);
		}
		if (partes[1].equals("pais")) {
			contacto.setPais(partes[3]);
		}
		if (partes[1].equals("telefonoManager")) {
			contacto.setTelefono(partes[3]);
		}
		if (partes[1].equals("correo")) {
			contacto.setCorreo(partes[3]);
			contactos.add(contacto);
		}
	}

	public void cargaDatosBinarios() {
		List<String> contactosBinarios = manejoArchivos.readFile("data/contactos.txt");
		//contactosBinarios.remove(0);
		for (String string : contactosBinarios) {
			String[] partes = string.split("\t");
			contacto = new Contacto();
			contacto.setId(GetUltimoContactoId());
			contacto.setNombre(partes[0]);
			contacto.setEmpresa(partes[1]);
			contacto.setPais(partes[2]);
			contacto.setTelefono(partes[3]);
			contacto.setCorreo(partes[4]);
			contactos.add(contacto);
		}

		List<String> amigosBinarios = manejoArchivos.readFile("data/amigos.txt");
		//amigosBinarios.remove(0);
		for (String string : amigosBinarios) {
			String[] partes = string.split("\t");
			amigo = new Amigo();
			amigo.setId(GetUltimoAmigoId());
			amigo.setNombre(partes[0]);
			amigo.setPais(partes[1]);
			amigo.setTelefono(partes[2]);
			amigo.setCorreo(partes[3]);
			amigos.add(amigo);
		}
	}

	/**/
	public void cargarArchivo(String path) {
		cargaDatosIniciales(path);
		cargaDatosBinarios();
	}
	
	public int GetUltimoAmigoId() {
		int numMax = Integer.MIN_VALUE;
		for (Amigo item : amigos) {
			if (item.getId() > numMax) {
				numMax = item.getId();
			}
		}

		return (numMax + 1);
	}

	public int GetUltimoContactoId() {
		int numMax = Integer.MIN_VALUE;
		for (Contacto item : contactos) {
			if (item.getId() > numMax) {
				numMax = item.getId();
			}
		}

		return (numMax + 1);
	}

	public List<Pais> getPaises() {
		return paises;
	}

	public List<Amigo> getAmigos() {
		return amigos;
	}

	public List<Contacto> getContactos() {
		return contactos;
	}

	public Amigo getAmigo(int referencia) {
		for (Amigo item : amigos) {
			if (item.getId() == referencia) {
				return item;
			}
		}
		return null;
	}

	public Contacto getContacto(int referencia) {
		for (Contacto item : contactos) {
			if (item.getId() == referencia) {
				return item;
			}
		}
		return null;
	}

	public void registrarAmigo(Amigo item) {
		if (item.getId() == 0) {
			item.setId(GetUltimoAmigoId());
		}

		amigos.add(item);

		String line = item.getNombre() + "\t" + item.getPais() + "\t" + item.getTelefono() + "\t" + item.getCorreo();

		manejoArchivos.agregarLineaUltima("data/amigos.txt", line);
	}

	public void registrarContacto(Contacto item) {
		if (item.getId() == 0) {
			item.setId(GetUltimoContactoId());
		}

		contactos.add(item);

		String line = item.getNombre() + "\t" + item.getEmpresa() + "\t" + item.getPais() + "\t" + item.getTelefono()
				+ "\t" + item.getCorreo();

		manejoArchivos.agregarLineaUltima("data/contactos.txt", line);
	}

	public void editarAmigo(Amigo item) {
		String rutaArchvo = "data/amigos.txt";
		Amigo actual = getAmigo(item.getId());
		amigos.remove(actual);
		amigos.add(item);

		String vieja = actual.getNombre() + "\t" + actual.getPais() + "\t" + actual.getTelefono() + "\t"
				+ actual.getCorreo();
		String nueva = item.getNombre() + "\t" + item.getPais() + "\t" + item.getTelefono() + "\t" + item.getCorreo();			

		boolean exists = manejoArchivos.existsLine(rutaArchvo, vieja);
		if (exists) {
			manejoArchivos.eliminarLinea(rutaArchvo, vieja);
		} 		
		manejoArchivos.agregarLineaUltima(rutaArchvo, nueva);
	}

	public void editarContacto(Contacto item) {
		String rutaArchvo = "data/contactos.txt";
		Contacto actual = getContacto(item.getId());
		contactos.remove(actual);
		contactos.add(item);

		String vieja = actual.getNombre() + "\t" + actual.getEmpresa() + "\t" + actual.getPais() + "\t"
				+ actual.getTelefono() + "\t" + actual.getCorreo();
		String nueva = item.getNombre() + "\t" + item.getEmpresa() + "\t" + item.getPais() + "\t" + item.getTelefono()
				+ "\t" + item.getCorreo();

		boolean exists = manejoArchivos.existsLine(rutaArchvo, vieja);
		if (exists) {
			manejoArchivos.eliminarLinea(rutaArchvo, vieja);
		} 		
		manejoArchivos.agregarLineaUltima(rutaArchvo, nueva);
	}

	public void eliminarAmigo(Amigo item) {
		amigos.remove(item);
	}

	public void eliminarContacto(Contacto item) {
		contactos.remove(item);
	}

	public void setCoordinador(Controller coordinador) {
		this.coordinador = coordinador;
	}
	
	public float resultadoPorcentajeAmigosRegistrados () {
		float catidadAmigos = amigos.size();
		float catidadContactos = contactos.size();
		
		float totalAgenda = catidadAmigos + catidadContactos;
		if(totalAgenda == 0) {
			return 0;
		}else {
			float porcentaje = catidadAmigos/totalAgenda;
			return porcentaje;	
		}		
	}
	
	public float resultadoPorcentajeContactosRegistrados () {
		float catidadAmigos = amigos.size();
		float catidadContactos = contactos.size();
		
		float totalAgenda = catidadAmigos + catidadContactos;
		if(totalAgenda == 0) {
			return 0;
		}else {
			float porcentaje = catidadContactos/totalAgenda;
			return porcentaje;	
		}	
	}
	
	public Map<String, Integer> resultadoPorcentajeAmigosPorPais () {
        Map<String, Integer> countByCountry = new HashMap<>();
        for (Amigo amigo : amigos) {
            String pais = amigo.getPais();
            countByCountry.put(pais, countByCountry.getOrDefault(pais, 0) + 1);
        }        

		return countByCountry;
	}
	
	public Map<String, Integer> resultadoPorcentajeContactosPorPais () {
        Map<String, Integer> countByCountry = new HashMap<>();
        for (Contacto contacto : contactos) {
            String pais = contacto.getPais();
            countByCountry.put(pais, countByCountry.getOrDefault(pais, 0) + 1);
        }        
        
		return countByCountry;
	}
	
	public Map<String, Integer> resultadoPorcentajeAmigosDominio () {
        Map<String, Integer> countByDomain = new HashMap<>();
        for (Amigo amigo : amigos) {
            String mail = amigo.getCorreo();
            String domain = mail.substring(mail.indexOf('@') + 1);
            countByDomain.put(domain, countByDomain.getOrDefault(domain, 0) + 1);
        }
        
		return countByDomain;
	}
	

	public Map<String, Integer> resultadoPorcentajeContactosDominio () {
		Map<String, Integer> countByDomain = new HashMap<>();
        for (Contacto contacto : contactos) {
            String mail = contacto.getCorreo();
            String domain = mail.substring(mail.indexOf('@') + 1);
            countByDomain.put(domain, countByDomain.getOrDefault(domain, 0) + 1);
        }
        
		return countByDomain;
	}

}
