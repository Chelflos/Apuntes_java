package ejercicio6;

public abstract class Empleado {
	
	private String nombre;
	
	private String apellidos;
	
	private String dni;
	
	private String direccion;
	
	private int antiguedad;
	
	private int telefono;
	
	private String puesto;
	
	private double salario;
	
	protected JefeZona supervisor;
	
	
	public Empleado(String nombre, String apellidos, String dni, String direccion, int antiguedad, int telefono,
			String puesto, double salario, JefeZona supervisor) {
		
		super();
		
		this.nombre = nombre;
		
		this.apellidos = apellidos;
		
		this.dni = dni;
		
		this.direccion = direccion;
		
		this.antiguedad = antiguedad;
		
		this.telefono = telefono;
		
		this.puesto = puesto;
		
		this.salario = salario;
		
		this.supervisor = supervisor;
	}



	public String getNombre() {		
		return nombre;			
	}

	public void setNombre(String nombre) {		
		this.nombre = nombre;		
	}

	public String getApellidos() {		
		return apellidos;		
	}

	public void setApellidos(String apellidos) {		
		this.apellidos = apellidos;		
	}



	public String getDni() {		
		return dni;		
	}

	public void setDni(String dni) {		
		this.dni = dni;		
	}

	public String getDireccion() {		
		return direccion;		
	}

	public void setDireccion(String direccion) {		
		this.direccion = direccion;		
	}

	public int getAntiguedad() {		
		return antiguedad;		
	}
	
	public void setAntiguedad(int antiguedad) {		
		this.antiguedad = antiguedad;		
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	

	public String getPuesto() {
		return puesto;
	}
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}	
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public JefeZona getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(JefeZona supervisor) {
		this.supervisor = supervisor;
	}	
	
	public abstract void cambiarSupervisor(JefeZona z);
	public abstract double IncrementarSueldo();/*(int incremento, int antiguedad) {
		if(antiguedad > 0) {
			salario += (salario / ( incremento * antiguedad) ) * 100;
			return salario;
		}
		return salario;
	}*/	
	
	



	@Override
	public String toString() {
		return "Empleado: \n" + "Nombre y apellidos: " + nombre + apellidos + "\n" + "DNI: " + dni + "\n" + "Direccion:" + direccion + "\n"
				+ "Antiguedad: " + antiguedad + "\n" + "Telefono: " + telefono + "\n" + "Salario:" + salario + "Supervisor: "+ supervisor + "]";
	}



	
	
	
	
	
	
	
	
	
	
	
}
