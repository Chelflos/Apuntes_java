package ejercicio6;

import java.util.ArrayList;

public class JefeZona extends Empleado {
	String despacho;
	Secretario secretario;
	CocheEmpresa coche;
	static ArrayList<Vendedor> listaVendedores;
	

	public JefeZona(String nombre, String apellidos, String dni, String direccion, int antiguedad, int telefono,
			String puesto, double salario, JefeZona supervisor, String despacho, Secretario secretario,
			CocheEmpresa coche, ArrayList<Vendedor> listaVendedores) {
		super(nombre, apellidos, dni, direccion, antiguedad, telefono, puesto, salario, supervisor);
		this.despacho = despacho;
		this.secretario = secretario;
		this.coche = coche;
		JefeZona.listaVendedores = new ArrayList<>();
	}
	
	
	
	
	

	public String getDespacho() {
		return despacho;
	}
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public Secretario getSecretario() {
		return secretario;
	}
	public void setSecretario(Secretario secretario) {
		this.secretario = secretario;
	}


	public CocheEmpresa getCoche() {
		return coche;
	}
	public void setCoche(CocheEmpresa coche) {
		this.coche = coche;
	}

	public ArrayList<Vendedor> getListaVendedores() {
		return listaVendedores;
	}
	public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
		this.listaVendedores = listaVendedores;
	}
	
	/*-------------------------------------------------------------*/
	
	
	public void cambiarSupervisor(JefeZona s) {
		
	}

	public double IncrementarSueldo() {
		
		double sueldoIncrementado;		
		if(super.getAntiguedad() > 0) {
			
		 sueldoIncrementado = super.getSalario() + (super.getSalario() * ( 0.20 * super.getAntiguedad()) );		 
			super.setSalario(sueldoIncrementado);
			System.out.println("Se incrementa el salario a "+super.getNombre()+" "+super.getApellidos()+" ("+ super.getPuesto()+")" +" por "+ super.getAntiguedad() + " año/s de antiguedad: "+ (String.format("%.2f",super.getSalario())));
		}
		
		return super.getSalario();
	}	
	
	/*-------------------------------------------------------------*/
	
	public Secretario cambiarSecretario(Secretario s) {
		setSecretario(s);
		System.out.println("Se cambió de secretario a "+ s.getNombre() +" " +s.getApellidos());
		return s;
	}
	
	public CocheEmpresa cambiarCoche(CocheEmpresa c) {
		setCoche(c);
		System.out.println(super.getNombre()+" "+super.getApellidos() +"("+ super.getPuesto()  +")"+" ha cambiado de coche a: " + c);
		return c;
	}	
	
	public Vendedor altaVendedor(Vendedor v) {
		
		listaVendedores.add(v);
		v.setSupervisor(this);
		System.out.println("Vendedor ( "+ v.getNombre() + " " + v.getApellidos()  +" ) dado de alta.");
		return v ;
		
	}	
		
	public void bajaVendedor(Vendedor v) {		
				listaVendedores.remove(v);				
				System.out.println("Vendedor "+"( "+v.getNombre()+" "+v.getApellidos()+" )"+" dado de baja.\n");			
			
			
				
		}	

	public void mostrarLista() {
	System.out.println("\n" + "\nLista de vendedores de " +super.getNombre()+" "+super.getApellidos()+":\n\n" + listaVendedores);
	}
	
	public static void generarJefeZona(JefeZona boss , ArrayList<Vendedor> listaVendedores,Secretario s,CocheEmpresa c) {
		
		String[] nombres = {"Juan", "Carlos", "JoseLuis", "JoseMaria", "Elena", "Maria","Pablo","Arturo","Miguel","Alberto"};
		String[] apellidos = {"Diez", "Sanchez", "Bahillo", "Polo", "Sanz", "Mozo","Asturdillo", "Gonzalez", "Zazo","Agurcia"};
		String[] dni = {"01010101A", "02020202B", "03030303C", "04040404D", "05050505E", "06060606F","06060606G","06034606T","12340606F","06024306Z" };
		String[] direcciones = {"Dir01", "Dir02", "Dir03", "Dir04", "Dir05", "Dir06"};
		int[] telefonos = {6666666, 62626262, 63636363, 646646464, 656565656, 61616116, 23232323,12345643,68754345};
		
		int n;
		n = (int)(Math.random()*9);
		boss.setNombre(nombres[n]);
		
		n = (int)(Math.random()*9);
		boss.setApellidos(apellidos[n]);
		
		n = (int)(Math.random()*9);
		boss.setDni(dni[n]);
		
		n = (int)(Math.random()*5);
		boss.setDireccion(direcciones[n]);
		
		n = (int)(Math.random()*4);
		boss.setAntiguedad(n);
		
		n = (int)(Math.random()*9);
		boss.setTelefono(telefonos[n]);
		
		double money = (Math.random()*600 + 800);
		boss.setSalario(money);
		
		boss.setPuesto("Jefe de Zona");
		
		n = (int)(Math.random()*9);		
		String despacho = "0" + n;
		
		boss.setDespacho(despacho);
		
		boss.setSecretario(s);
		
		boss.setCoche(c);
	}
	
	
	
	

	@Override
	public String toString() {
		return  "Nombre: " + super.getNombre() +" "+ super.getApellidos() + ".\n" +
				"Puesto: " + super.getPuesto() + ".\n" +
				"D.N.I: " + super.getDni() + ".\n" +
				"Direccion: " + super.getDireccion() + "." + "\n" +
				"Coche: " + coche +
				"\nAntiguedad : " + super.getAntiguedad() + "." + 
				"\nSueldo: " + (String.format("%.2f",super.getSalario())) + ".\n" +
				"[ Despacho: " + despacho + ".]\n" + " \nSecretario/a de " + super.getNombre() + ": \n"
				+ secretario.getNombre() + " " + secretario.getApellidos()+" ( Fax: "+ secretario.getnFax()  +" Despacho: "+secretario.getDespacho()+" ). " ;
	}	
	
}
