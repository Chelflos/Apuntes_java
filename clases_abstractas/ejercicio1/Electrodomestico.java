package ejercicio1;

public class Electrodomestico {	
	
	protected final static String colorBase="blanco";
	protected final static char consumoBase='F';
	protected final static double precioInicial=100;
	protected final static double pesoBase=5;
	//Hasta aqui los valores por defecto
	protected String color;
	protected char consumoEnergetico;
	protected double precioBase;
	protected double peso;	
	
	//getters de todos los atributos
	public String getColor() {
		return color;
	}
	
	public char getconsumoEnergetico() {
		return consumoEnergetico;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public double getPeso() {
		return peso;
	}
	
	
//Metodo para comprobar el consumo energetico
	
			protected void comprobarConsumoEnergetico(char letra) {
				
				char [] consumo = new char[6];{				
					consumo[0]='A';
					consumo[1]='B';
					consumo[2]='C';
					consumo[3]='D';
					consumo[4]='E';
					consumo[5]='F';				
				}
				
				boolean check = false;
				
				for(int i = 0; i < consumo.length && !check; i++) {
					if(consumo [i] == (letra)) check = true;	//Se comprueba si la letra introducida por el usuario es uno de los valores aceptados.				
				}
				if(check) {
					this.consumoEnergetico = letra;		//Si es así, se asigna ese valor como el valor de consumo energético   
				} else {	
					this.consumoEnergetico=consumoBase; //En caso contrario el consumo energetico será el consumo por defecto.
				}
			}
			
//Metodo para comprobar el color
			
			protected void comprobarColor(String color) {
				
				String colores[] = new String[5];{					
					colores[0] = "Blanco";
					colores[1] = "Negro";
					colores[2] = "Rojo";
					colores[3] = "Azul";
					colores[4] = "Gris";				
				}
				
				boolean check = false;
				
				for(int i = 0; i<colores.length && !check; i++) {
					if(colores [i].equalsIgnoreCase(color)) check = true;//Se comprueba, ignorando el formato de la letra que el texto introducido es un color valido.
				}
				
				if(check) this.color = color;	//Si es así, se asigna ese color a la variable 'color'.
				else {this.color=colorBase;}	//De lo contrario se le asigna el color por defecto.
			}
			
			public double precioFinal() {
				
				double coste =0;
				//coste segun consumoEnergetico
				switch(consumoEnergetico) {
					case 'A':
						coste += 100;
						break;
					case 'B':
						coste += 80;
						break;
					case 'C':
						coste += 60;
						break;
					case 'D':
						coste += 50;
						break;
					case 'E':
						coste += 30;
						break;
					case 'F':
						coste +=10;
						break;
				}
				
				//coste segun peso
				
				if(peso <= 0 && peso <= 19) coste += 10;
				else if(peso <= 20 && peso <=49) coste += 50;				
				else if(peso <= 50 && peso <=79) coste += 80;				
				else if(peso > 80)	coste += 100;				
				
				return precioBase + coste;
				}

//Constructores
			public Electrodomestico() {
				this.precioBase = precioInicial;
				this.peso = pesoBase;
				this.color = colorBase;
				this.consumoEnergetico = consumoBase;
				}
			public Electrodomestico(double peso, double precioBase) {
				this.precioBase = precioBase;
				this.peso = peso;
				this.color = colorBase;
				this.consumoEnergetico = consumoBase;
				}
			public Electrodomestico(double peso, double precioBase, String color, char consumoEnergetico) {
				this.precioBase = precioBase;
				this.peso = peso;
				comprobarColor(color);
				comprobarConsumoEnergetico(consumoEnergetico);
				}		
}
