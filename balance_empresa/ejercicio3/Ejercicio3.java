package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {	
/*3.Programa que lea los siguientes datos acerca de 10 empresas: ingresos del mes y gastos del mes. 
 * El programa debe calcular cuál de ellas ( identificables como Empresa1,Empresa2, .., Empresa10 ) ha obtenido el peor resultado 
 * ( ingresos – gastos ) e indicar dicho resultado.*/

//CARLOS TENAJAS
	public static void main(String[] args) {
		
		
		double[]resultados = new double [10];	//acumula los resultados de ingresos-gastos
		Scanner sc = new Scanner(System.in);
		double ingresosMes, gastosMes ;		
		
		for(int i = 0; i < resultados.length; i++) {
			int numero=i+1; //variable para el nombre de las empresas
			
			System.out.println("Introduce los ingresos de la empresa "+ numero + ":");
			ingresosMes =sc.nextDouble();
			
			System.out.println("Introduce los gastos del mes de la empresa "+ numero + ":");
			gastosMes =sc.nextDouble();
			
			resultados[i]=ingresosMes-gastosMes;						
		}
		
		double peorResultado=resultados[0];
		int empresa=0;
		
		for(int i = 0; i < resultados.length; i++) {
			
			if(resultados[i]<peorResultado) {peorResultado=resultados[i];}
			if(resultados[i]==peorResultado) {empresa=i+1;}
		}
		System.out.println("\n Peor resultado: "+ "Empresa "+empresa + " " + "("+peorResultado+")");
			
	
	
	}

}
