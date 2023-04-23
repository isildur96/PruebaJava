package co.edu.unbosque.model;

public class Amigo {
	private int id;
    private String nombre;
    private String pais;
    private String correo;
    private String telefono;
    
    public Amigo() {}
    
    public Amigo(int id, String nombre, String pais, String correo, String telefono) {
		this.id = id;
		this.nombre = nombre;		
		this.pais = pais;
		this.correo = correo;
		this.telefono = telefono;
    }
    
	public int getId() {
        return id;
    }
    
	public void setId(int id) {
		this.id = id;
	}
    
    public String getNombre() {
        return nombre;
    }    
    
    public void setNombre(String nombre) {
        if (nombre.matches("^[a-zA-Z ]+$")) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre no debe contener números ni caracteres especiales");
        }
    }        
    
	public String getPais() {
        return pais;
    }

	public void setPais(String pais) {
		this.pais = pais;
	}

    public String getCorreo() {
        return correo;
    }      
    
    public void setCorreo(String correo) {
        if (correo.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[cC][oO][mM]$")) {
            this.correo = correo;
        } else {
            throw new IllegalArgumentException("El correo debe terminar en '@dominio.com' y no debe contener números ni caracteres especiales");
        }
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        if (telefono.matches("^\\d{3}-\\d{3}-\\d{3}$")) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("El teléfono no debería tener letras y debe tener una longitud de 9 dígitos separado por '-' cada 3 dígitos");
        }
    }
}