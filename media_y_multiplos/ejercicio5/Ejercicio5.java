package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
/*Realizar un programa que solicite por teclado 10 n�meros y los aguarde en un array, 
 * mostrar en pantalla todos aquellos n�meros que superen la media aritm�tica y, 
 * visualizar tambi�n todos los n�meros que sean m�ltiplos de 5.*/
//CARLOS TENAJAS
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double[] array = new double[10];
		double suma = 0;
		
		System.out.println("Por favor, introduce 10 numeros: ");
		for(int i = 0; i < 10; i++) {
			double numero = sc.nextDouble();
			array[i]=numero;
			suma+=array[i];
			}
		
		double media = suma/10;
		System.out.println(" Media: "+ media+".\n");
	
		for(int i = 0; i < 10; i++) {
			if(array[i] % 5 == 0 && array[i] > media) {
				System.out.println(array[i]+" supera la media aritm�tica y es divisible entre 5.");
			}else if(array[i] > media) {
				System.out.println(array[i]+" supera la media aritm�tica.");
			}
			if(array[i] < media && array[i] % 5 == 0) {System.out.println(array[i]+" es divisible entre 5.");}
				
		}
	}
}
