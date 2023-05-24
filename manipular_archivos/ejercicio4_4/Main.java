package ejercicio4_4;
//Carlos Tenajas
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);    	
			String ruta = sc.next();
			File archivo = new File(ruta);
			File copia = new File("resultado.csv");
	        List<String[]> restaurantes = leerArchivo(ruta);
	        if(archivo.exists()) {
				System.out.println("El archivo o ruta introducido" +" (" + ruta+ ") "+ "existe");
				try (FileWriter writer = new FileWriter(copia)) {
				    for (String[] restaurante : restaurantes) {
				        if (restaurante[4].startsWith("6") == false) {
				        	
				        	System.out.println("Nombre: " + restaurante[0]);
				        	System.out.println("Dirección: " + restaurante[1]);
				        	System.out.println("Ciudad: " + restaurante[2]);
				        	System.out.println("Estado o país: " + restaurante[3]);
				        	System.out.println("Código postal: " + restaurante[4]);
				        	writer.write(restaurante[0] + "," + restaurante[1] + "," + restaurante[2] + "," + restaurante[3] + "," + restaurante[4] + "\n");
	                
				        	System.out.println("\n\n");
				        }
				    }
				} catch (IOException e) {
							e.printStackTrace();
					}
	        }else {System.out.println("El archivo o ruta introducido no existe");}
	        sc.close();
		}

	    

	    public static List<String[]> leerArchivo(String archivo) {
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