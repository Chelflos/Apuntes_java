package ejercicio2;

public class Ejercicio2 {
	
/*2.Programa que muestra el contenido del vector tb[] desde el primer elemento al último. 
 * Añada el código necesario para que lo muestre también desde el último al primero, 
 * en esta ocasión con un bucle while.*/
//CARLOS TENAJAS
	public static void main(String[] args) {
		
		int[] tb = {1,2,3,4,5,6,7,8,9,10} ;
		
		for(int i = 0; i<10;i++){
			System.out.println(tb[i]);
		}
		
		int i =tb.length-1;
		
		while(i>=0) {
			System.out.println(tb[i]);
			i--;
		}
		
	}

}
