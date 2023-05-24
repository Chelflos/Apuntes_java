package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroIntroducido;
		int contador=0;
		int resultado=0;
		do {
			System.out.println("Por favor, introduce un numero entero positivo:\n(para salir, introduce un numero entero negativo)");
			numeroIntroducido = sc.nextInt();
			System.out.println("Número introducido: "+ numeroIntroducido + "\n");
			contador++;
			resultado=resultado+numeroIntroducido;
			System.out.println("Media de los anteriores numeros: " + resultado/contador+"\n");
		}while(numeroIntroducido>0);	

	}
}
