package ejercicio4;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la ruta al archivo/directorio:");
		String ruta = sc.next();
		File archivo = new File(ruta);
		
		if(archivo.exists()) {
			System.out.println("El archivo o ruta introducido" +" (" + ruta+ ") "+ "existe");	
		
			if (archivo.isDirectory()) {
			System.out.println(ruta + " es un directorio");
			
			}else {
				System.out.println(ruta + " es un fichero");
				System.out.println("Nombre: " + archivo.getName());
				System.out.println("Tama\u00F1o: " + archivo.length());
				System.out.println("Lectura: " + archivo.canRead());
				System.out.println("Escritura: " + archivo.canWrite());
				System.out.println("Ejecucion: " + archivo.canExecute());		
		}
		}else {System.out.println("El archivo o ruta introducido" +" (" + ruta + ") "+ " no existe");}
		sc.close();
	}	
}
