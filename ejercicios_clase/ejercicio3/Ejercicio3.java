package ejercicio3;

import java.util.Scanner;

/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.*/
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroIntroducido;
		int contador=1;
		System.out.println("Por favor, introduce 5 numeros: \n");
		do {
			numeroIntroducido = sc.nextInt();
			contador++;
			
			System.out.println(numeroIntroducido+"\t"+Math.pow(numeroIntroducido, 2)+"\t"+Math.pow(numeroIntroducido, 3)+"\n");
		}while(contador<=5);
	}

}
