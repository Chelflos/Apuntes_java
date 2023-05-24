package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
/*Programa que obtenga e imprima el valor de la mayor diferencia entre dos elementos consecutivos del vector. 
 * Debe indicar también entre qué elementos del vector se da tal diferencia.*/
//CARLOS TENAJAS
	public static void main(String[] args) {
		
		int[] vector=new int [10];
		Scanner sc=new Scanner(System.in);
		int mayorDiferencia=0;
		int diferencia=0;
		int posicion=0;
		
		System.out.println("Por favor, introduce 10 numeros: ");
		
		for(int i =0;i<10;i++) {			
			int valor=sc.nextInt();
			vector[i]=valor;
		}
		
		for(int i =0;i+1<10;i++) {			
				diferencia = vector[i]-vector[i+1];			//se calcula la adiferencia
				if(diferencia < 0) {diferencia = diferencia *(-1);} 		//en caso de que el resultado sea negativo, se pasa a positivo
				System.out.println("La diferencia entre el valor "+ i + " y el valor "+ (i+1)+ " es de: "+ diferencia);
				if(mayorDiferencia < diferencia) {mayorDiferencia = diferencia; posicion=i;}		//se obtiene la mayor diferencia y la posicion				
		}
		System.out.println("\nLa mayor diferencia es de "+ mayorDiferencia + " y se encuentra entre las posiciones " + posicion +" y "+ (posicion+1));
	}

}
