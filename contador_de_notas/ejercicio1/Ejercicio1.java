package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {
	/*1.Programa que lea 10 calificaciones y calcule e imprima la cantidad de aprobados ( nota mayor o igual que 5 )
	 *  y de sobresalientes ( nota mayor o igual que 9 ).*/
//CARLOS TENAJAS
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double[] notas = new double[10];
		int aprobados = 0;
		int sobresalientes = 0;
		
		System.out.println("A continuación, introduce 10 notas: ");
		
		for(int i = 0; i < 10; i++) {
			
			double nota = sc.nextDouble();
			notas[i] = nota;
		
			if(nota >= 5 && nota <9) {	aprobados++;}
			if(nota>=9 && nota < 11) {sobresalientes++;}
		}
	
		System.out.println("Número de aprobados: " + aprobados);
		System.out.println("Número de sobresalientes: " + sobresalientes);
		
	}

}
