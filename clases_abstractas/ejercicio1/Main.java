package ejercicio1;
//Carlos Tenajas
public class Main {

	public static void main(String[] args)  {
		
		Electrodomestico[] lista = new Electrodomestico[10];			
			
		lista[0] = new Electrodomestico(50,  60, "azul",'F');		
		
		lista[1] = new Electrodomestico(90, 100, "BLANCO", 'A');	
		
		lista[2] = new Lavadora(120, 160, "ROJO", 'C', 20);
		
		lista[3] = new Lavadora( 130, 180, "NEGRO", 'B', 40);		
		
		lista[4] = new Television(80, 240, "GRIS", 'E', 34, false);
		
		lista[5] = new Television(60, 200, "rojo", 'R', 30, true);
		
		lista[6] = new Television();
		
		lista[7] = new Electrodomestico();
		
		lista[8] = new Lavadora();
		
		lista[9] = new Lavadora(150, 180);				
	//Sumas de los electrodomesticos, lavadoras y televisores
		double sumaElectrodomesticos = 0;
		
		double sumaLavadoras = 0;
		
		double sumaTelevisores = 0;
				
		for(int i = 0;i < lista.length;i++) {
			
			if(lista[i] instanceof Electrodomestico) {
				
				sumaElectrodomesticos += lista[i].precioFinal();
				
			}
			
			if(lista[i] instanceof Lavadora) {
				
				sumaLavadoras += lista[i].precioFinal();
				
			}
			
			if(lista[i] instanceof Television) {
				
				sumaTelevisores += lista[i].precioFinal();
				
			}
			
		}				
		
				System.out.println("\nLa suma del precio de los Electrodom\u00e9sticos es de " + sumaElectrodomesticos);
				
				System.out.println("\nLa suma del precio de las Lavadoras es de " + sumaLavadoras);
				
				System.out.println("\nLa suma del precio de los Televisores es de " + sumaTelevisores);
					
	}	
	
}
