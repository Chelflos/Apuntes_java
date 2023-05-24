package ejercicio4_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

//Carlos Tenajas
public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); 
    	System.out.println("Introduce la ruta:");
		String ruta = sc.next();						//Se escribe la ruta
		File archivo = new File(ruta);
        List<String[]> restaurantes = leerArchivoCSV(ruta);
        if(archivo.exists()) {							//Si el archivo existe, 
			System.out.println("El archivo o ruta introducido" +" (" + ruta+ ") "+ "existe");
        for (String[] restaurante : restaurantes) {
            if (restaurante[4].startsWith("6")) {
                System.out.println("Nombre: " + restaurante[0]);
                System.out.println("Dirección: " + restaurante[1]);
                System.out.println("Ciudad: " + restaurante[2]);
                System.out.println("Estado o país: " + restaurante[3]);
                System.out.println("Código postal: " + restaurante[4]);
                
                System.out.println("\n\n");
            }
        }
        
        }else {System.out.println("El archivo o ruta introducido" +" (" + ruta + ") "+ " no existe");}
        sc.close();
    }

    public static List<String[]> leerArchivoCSV(String archivo) {
        List<String[]> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                lista.add(datos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
        
    }

}