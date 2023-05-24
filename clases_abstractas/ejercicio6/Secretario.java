package ejercicio6;

public class Secretario extends Empleado {

		/*public Secretario(String nombre, String apellidos, String dni, String direccion, int antiguedad, int telefono,
				double salario, Supervisor supervisor) {
				super(nombre, apellidos, dni, direccion, antiguedad, telefono, salario, supervisor);
		}*/
		
		private String despacho;
		private int nFax;		
		
		public Secretario(String nombre, String apellidos, String dni, String direccion, int antiguedad, int telefono, String puesto, 
				double salario, JefeZona supervisor, String despacho, int nFax) {
				super(nombre, apellidos, dni, direccion, antiguedad, telefono, puesto, salario, supervisor);

					this.despacho = despacho;
					this.nFax = nFax;
		}

		public String getDespacho() {
			return despacho;
		}
		
		public void setDespacho(String despacho) {
			this.despacho = despacho;
		}


		public int getnFax() {
			return nFax;
		}
		
		public void setnFax(int nFax) {
			this.nFax = nFax;
		}
		

		@Override
		public double IncrementarSueldo() {
			
			double sueldoIncrementado;		
			if(super.getAntiguedad() > 0) {
				
			 sueldoIncrementado = super.getSalario() + (super.getSalario() * ( 0.05 * super.getAntiguedad()) );
			 
				super.setSalario(sueldoIncrementado);
				System.out.println("Se incrementa el salario por "+ super.getAntiguedad() + " año/s de antiguedad: "+ (String.format("%.2f",super.getSalario())));
			}
			
			return super.getSalario();
		}
		
		public void cambiarSupervisor(JefeZona z) {			
			super.getSupervisor();
			super.setSupervisor(z);
			System.out.println("Supervisor cambiado a "+z.getNombre()+z.getApellidos()+".");
		}
		
		public static void generarSecretario(Secretario s,JefeZona su) {
			
			String[] nombres = {"Juan", "Carlos", "JoseLuis", "JoseMaria", "Elena", "Maria","Pablo","Arturo","Miguel,Alberto"};
			String[] apellidos = {"Diez", "Sanchez", "Bahillo", "Polo", "Sanz", "Mozo","Asturdillo", "Gonzalez", "Zazo","Agurcia"};
			String[] dni = {"01010101A", "02020202B", "03030303C", "04040404D", "05050505E", "06060606F","06060606G","06034606T","12340606F","06024306Z" };
			String[] direcciones = {"Calle falsa 1", "calle falsa 2", "calle falsa 3", "calle falsa 4", "calle falsa 5", "calle falsa 6"};
			int[] telefonos = {6666666, 62626262, 63636363, 646646464, 656565656, 61616116, 23232323,12345643,68754345};
			
			int n;
			n = (int)(Math.random()*nombres.length);
			s.setNombre(nombres[n]);
			
			n = (int)(Math.random()*apellidos.length);
			s.setApellidos(apellidos[n]);
			
			n = (int)(Math.random()*dni.length);
			s.setDni(dni[n]);
			
			n = (int)(Math.random()*direcciones.length);
			s.setDireccion(direcciones[n]);
			
			n = (int)(Math.random()*4);
			s.setAntiguedad(n);
			
			n = (int)(Math.random()*telefonos.length);
			s.setTelefono(telefonos[n]);
			
			double money = (Math.random()*600 + 700);
			s.setSalario(money);
			
			s.setSupervisor(su);
			
			s.setPuesto("Secretario");
			
			n = (int)(Math.random()*9);		
			String despacho = "0" + n;
			
			s.setDespacho(despacho);	
			
			n = (int)(Math.random()*telefonos.length);
			s.setnFax(telefonos[n]);
		}
		
		

		@Override
		public String toString() {
			return   "\n[ Nombre: " + super.getNombre() + " " + super.getApellidos() + "." + 
					"\nPuesto: " + super.getPuesto() + 
					"\nDireccion: " + super.getDireccion() + "]" +
					"\nD.N.I: " + super.getDni() + "." +
					
					"\nAntiguedad: " + super.getAntiguedad() + "." +
					"\nSalario: " + (String.format("%.2f",super.getSalario())) + " Euros." +
					 
					
					"\n[ Despacho numero " + despacho + ". ]" + 
					"\n[ Telefono: " + super.getTelefono() + "." + " ]"	+ 
					"[ Numero Fax: " + nFax + ". ]" +
					"\n\nLe/la supervisa :" +  supervisor.getNombre() + " " + supervisor.getApellidos();
			
		}
		

	}
