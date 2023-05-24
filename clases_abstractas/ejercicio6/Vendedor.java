package ejercicio6;
import java.util.ArrayList;
import java.util.Iterator;


public class Vendedor extends Empleado {

	private CocheEmpresa cocheEmpresa;
	private int telefonoMovil;
	private String areaVenta;
	private static ArrayList<Cliente> listaClientes = new ArrayList<>();	

	public Vendedor(String nombre, String apellidos, String dni, String direccion, int antiguedad, int telefono,
			String puesto, double salario, JefeZona supervisor, CocheEmpresa cocheEmpresa, int telefonoMovil,
			String areaVenta, ArrayList<Cliente> listaClientes) {
		super(nombre, apellidos, dni, direccion, antiguedad, telefono, puesto, salario, supervisor);
		this.cocheEmpresa = cocheEmpresa;
		this.telefonoMovil = telefonoMovil;
		this.areaVenta = areaVenta;
		Vendedor.listaClientes = new ArrayList<>();;
	}	

	public CocheEmpresa getCocheEmpresa() {
		return cocheEmpresa;
	}
	public void setCocheEmpresa(CocheEmpresa cocheEmpresa) {
		this.cocheEmpresa = cocheEmpresa;
	}


	public int getTelefonoMovil() {
		return telefonoMovil;
	}
	public void setTelefonoMovil(int telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}


	public String getAreaVenta() {
		return areaVenta;
	}
	public void setAreaVenta(String areaVenta) {
		this.areaVenta = areaVenta;
	}


		public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}
	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		Vendedor.listaClientes = listaClientes;
	}

	
	public void cambiarSupervisor(JefeZona z) {
		super.getSupervisor();
		super.setSupervisor(z);
		System.out.println(super.getNombre()+" "+super.getApellidos() +"("+super.getPuesto()+")"+ " cambió de supervisor a "+z.getNombre()+" "+z.getApellidos()+".");
		
	}

	@Override
	public double IncrementarSueldo() {
		double sueldoIncrementado;		
		if(super.getAntiguedad() > 0) {
			
		 sueldoIncrementado = super.getSalario() + (super.getSalario() * ( 0.10 * super.getAntiguedad()) );
		 
			super.setSalario(sueldoIncrementado);
			System.out.println("Se incrementa el salario a "+super.getNombre()+" "+super.getApellidos()+" ("+ super.getPuesto()+")" +" por "+ super.getAntiguedad() + " año/s de antiguedad: "+ (String.format("%.2f",super.getSalario())));	
		}
		
		return super.getSalario();
	}
	
	
	/*public void mostrarLista() {
		Iterator<Cliente> it = listaClientes.iterator();
		while(it.hasNext())
		  System.out.println(it.next());
	}*/	
	
	public void altaCliente(Cliente c) {
		listaClientes.add(c);
		System.out.println("Cliente dado de alta.");
		
	}	
	
	public boolean bajaCliente(Cliente c) {
		boolean disponible = true;
	
			listaClientes.remove(c);
			System.out.println("Cliente dado de baja.\n");			
		
		
		return disponible;		
	}
	
	public CocheEmpresa cambiarCoche(CocheEmpresa c) {
		setCocheEmpresa(c);
		System.out.println("Se ha cambiado de coche a: " + c.getMatricula());
		return c;
	}

	
	public static void generarVendedor(Vendedor v, JefeZona z,CocheEmpresa c, ArrayList<Cliente> listaClientes) {
		
		String[] nombres = {"Juan", "Carlos", "JoseLuis", "JoseMaria", "Elena", "Maria","Pablo","Arturo","Miguel","Alberto"};
		String[] apellidos = {"Diez", "Sanchez", "Bahillo", "Polo", "Sanz", "Mozo","Asturdillo", "Gonzalez", "Zazo","Agurcia"};
		String[] dni = {"01010101A", "02020202B", "03030303C", "04040404D", "05050505E", "06060606F","06060606G","06034606T","12340606F","06024306Z" };
		String[] direcciones = {"Dir01", "Dir02", "Dir03", "Dir04", "Dir05", "Dir06"};
		int[] telefonos = {6666666, 62626262, 63636363, 646646464, 656565656, 61616116, 23232323,12345643,68754345};
		String[]zonas = {"01A","02A","01B","02B","02C","02B","03E","03C","04A","04B"};
		int n;
		n = (int)(Math.random()*9);
		v.setNombre(nombres[n]);
		
		n = (int)(Math.random()*9);
		v.setApellidos(apellidos[n]);
		
		n = (int)(Math.random()*9);
		v.setDni(dni[n]);
		
		n = (int)(Math.random()*5);
		v.setDireccion(direcciones[n]);
		
		n = (int)(Math.random()*4);
		v.setAntiguedad(n);
		
		n = (int)(Math.random()*9);
		v.setTelefono(telefonos[n]);
		
		double money = (Math.random()*600 + 700);
		v.setSalario(money);
		
		v.setPuesto("Vendedor");
				
		v.setSupervisor(z);
		
		v.setCocheEmpresa(c);
		
		n = (int)(Math.random()*9);
		v.setTelefonoMovil(telefonos[n]);
		
		n = (int)(Math.random()*10);
		v.setAreaVenta(zonas[n]);
		
				
	}
	public void mostrarLista() {
		System.out.println("\n" + "\nLista de clientes de " +super.getNombre()+" "+super.getApellidos()+ ":\n\n" + listaClientes);
	}




	@Override
	public String toString() {
		return "\n Vendedor: " + super.getNombre() + " "+ super.getApellidos() + ".\n"
				+ " D.N.I: " + super.getDni() + ".\n"
				+ " Direccion: " + super.getDireccion() + ".\n" +
				" Telefono: " + super.getTelefono() + ".\n" +
				" Puesto: " + super.getPuesto() + ". " +
				"Antiguedad :" + super.getAntiguedad() + ". " +
				" Sueldo : " + (String.format("%.2f",super.getSalario())) + ".\n" + 
				"\n[" + "Coche de Empresa: " + cocheEmpresa + 
				"Telefono Movil: " + telefonoMovil + 
				"\nArea de Venta: " + areaVenta + ".]\n";
	}
	
	
	
}
