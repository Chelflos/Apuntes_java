package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce la cantidad de numeros de la secuencia que quieres que se muestren:");
		int numeroIntroducido = sc.nextInt();
		
		int ultimoNum;
		int penultimoNum;
		int[] secuencia =new int[numeroIntroducido];
		secuencia[0]=0;
		secuencia[1]=1;
		
		for(int i =2; i <numeroIntroducido;i++) {			
			ultimoNum=secuencia[i-1];
			penultimoNum=secuencia[i-2];
			secuencia[i]=penultimoNum+ultimoNum;
			}
		
		for(int i = 0;i<numeroIntroducido;i++) {
			System.out.println(secuencia[i]);
			}	
		
	}

}
