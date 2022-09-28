import java.util.*;


public class Usuario{

    private String Nombre;
    private String Apellido;
	private String Direccion;
	private String Telefono;
    
	private Usuario(String Nombre, String Apellido, String Direccion, String Telefono){
	this.Nombre = Nombre;
	this.Apellido = Apellido;
	this.Direccion = Direccion;
	this.Telefono = Telefono;
	}
	

	
    public String getNombre() {
        
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }
	
	public String getDireccion() {
        
        return Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }


    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
	
	public void setDireccion(String Direccion) {
        this.Nombre = Nombre;
    }

    
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
	
	public static void main (String[] args){
		
		String Nombre, Apellido, Direccion, Telefono;
		Usuario nuevaClase[] = new Usuario[2];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Ingresa tu nombre: ");
		Nombre = sc.next();
		
		System.out.println("Ingresa tu Apellido: ");
		Apellido = sc.next();
		
		System.out.println("Ingresa tu Direccion: ");
		Direccion = sc.next();
		
		System.out.println("Ingresa tu Telefono: ");
		Telefono = sc.next();
		
		
		System.out.println("BIENVENIDO A CONEKTA");
	}	
}