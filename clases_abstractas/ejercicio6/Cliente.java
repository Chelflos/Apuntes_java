package ejercicio6;


public class Cliente {
	private String nombre;
	private int telefonoCliente;
	private static boolean alta = false;
	
	
	
	public Cliente(String nombre, int telefonoCliente) {
		super();
		this.nombre = nombre;
		this.telefonoCliente = telefonoCliente;
		Cliente.alta = false;
	}
	public Cliente() {
		super();
		this.nombre = "";
		this.telefonoCliente = 0;
		Cliente.alta = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(int telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public static boolean getAlta() {
		return alta;
	}

	

	public static void generarCliente(Cliente c) {
		
		String[] nombres = {"Juan", "Carlos", "JoseLuis", "JoseMaria", "Elena", "Maria","Pablo","Arturo","Miguel","Alberto"};		
		int[] telefonos = {6666666, 62626262, 63636363, 646646464, 656565656, 61616116, 23232323,12345643,68754345};		
		
		int n = (int)(Math.random()*9);
		c.setNombre(nombres[n]);
		
		n = (int)(Math.random()*9);
		c.setTelefonoCliente(telefonos[n]);
		
	}

	@Override
	public String toString() {
		return "Cliente -->" + " Nombre: " + nombre + ". " +  "Telefono: " + telefonoCliente+"\n";
	}	
}

