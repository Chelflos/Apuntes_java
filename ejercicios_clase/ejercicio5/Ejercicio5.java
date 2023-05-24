package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base=0;
		int exponente=0;
		do {
			System.out.println("Introduzca una base: ");
			base = sc.nextInt();
			System.out.println("Introduzca un exponente: ");
			exponente = sc.nextInt();
		}while(base == 0 || exponente == 0);
		
		System.out.println("Base: " + base);
		System.out.println("Exponente: " + exponente);
		System.out.println("Resultado: " + Math.pow(base, exponente));
	}

}
