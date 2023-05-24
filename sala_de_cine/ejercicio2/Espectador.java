package ejercicio2;

public class Espectador {
	protected String nombre;
	protected int edad;
	protected double dinero;
	protected Butaca asiento;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	public Butaca getAsiento() {
		return asiento;
	}
	public void setAsiento(Butaca asiento) {
		this.asiento = asiento;
	}
	
	public static void generarEspectador(Espectador espectador) {		
			String[] nombres = new String[10];
			nombres[0] = "Juan";
			nombres[1]="Arturo";
			nombres[2]="Carlos";
			nombres[3]="Miguel";
			nombres[4]="Teresa";
			nombres[5]="Irvin";
			nombres[6]="Liza";
			nombres[7]="Alvaro";
			nombres[8]="Araceli";
			nombres[9]="Sandra";
			
				int nombreAleatorio = (int) (Math.random()*9);
				String name = nombres[nombreAleatorio];
				int age = (int) (Math.random()*5+80);
				double money = (Math.random()*30);
				Butaca seat =null;
				espectador.setNombre(name);
				espectador.setEdad(age);
				espectador.setDinero(money);
				espectador.setAsiento(seat);
				System.out.println(espectador);	
				
			
		
	}
	public Espectador(String nombre, int edad, double dinero, Butaca asiento) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
		this.asiento = null;
	}
	
	@Override
	public String toString() {
		if(this.asiento == null) {
		return "Espectador: " + nombre + ".\nEdad: " + edad + ".\nDinero: " + (String.format("%.2f",dinero)) + ".\n";
		}else return "\nEspectador: " + nombre + ".\nEdad: " + edad + ".\nDinero: " + (String.format("%.2f",dinero)) + ".\nButaca: " + asiento  + "\n";
		}
	
}
