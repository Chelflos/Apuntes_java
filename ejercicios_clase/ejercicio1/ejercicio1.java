package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador=0;//lleva la cuenta del numero de digitos
		int divisor=10;
		int resultado=0;
		int numero;//numero a introducir por teclado

		do{
			System.out.println("Introduzca un número,por favor: ");
			numero=sc.nextInt();
			}while(numero<=0);
		
		System.out.println("Número introducido: " + numero);
		
		do{
			resultado = numero/divisor;
			contador++;
			divisor = divisor*10;
		}while(resultado>=1);
			System.out.println("Número de dígitos: "+contador);
		}
	}


