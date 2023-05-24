package ejercicio4_3;
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

	    //Ruta del archivo  a leer
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la ruta completa al archivo: ");
		String ruta = sc.next();
		File archivo = new File(ruta);
	    // Lista para almacenar los datos del archivo CSV
	    List<String[]> listaDatos = new ArrayList<>();

	    //Cargar los datos del archivo CSV en la lista
	    
	    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
	        String linea;
	        while ((linea = br.readLine()) != null) {
	            String[] datos = linea.split(",");
	            listaDatos.add(datos);
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	        return;
	    }

	    //Se solicita al usuario que ingrese los nuevos datos
	    
	    System.out.print("Ingrese el nuevo dato de Nombre: ");
	    String dato1 = sc.nextLine();

	    System.out.print("Ingrese el nuevo dato de direccion: ");
	    String dato2 = sc.nextLine();

	    System.out.print("Ingrese el nuevo dato de ciudad: ");
	    String dato3 = sc.nextLine();
	    
	    System.out.print("Ingrese el nuevo dato de Estado u pais: ");
	    String dato4 = sc.nextLine();
	    sc.close();
	    //Se verifica que los nuevos datos tengan el mismo formato que los existentes
	    if (dato1.isEmpty() || dato2.isEmpty() || dato3.isEmpty() || dato4.isEmpty()) {
	        System.out.println("Error: los datos no pueden estar vacíos");
	        return;
	    }

	    if (!esNumero(dato1) || !esNumero(dato3)) {
	        System.out.println("Error: los datos 1 y 3 deben ser números");
	        return;
	    }
	    
	    //Se agregan nuevos datos a la lista
	    String[] nuevosDatos = {dato1, dato2, dato3, dato4};
	    listaDatos.add(nuevosDatos);

	    //Se escribe la lista actualizada en el archivo CSV
	    try (FileWriter fw = new FileWriter(archivo)) {
	        for (String[] datos : listaDatos) {
	            fw.append(datos[0]);
	            fw.append(",");
	            fw.append(datos[1]);
	            fw.append(",");
	            fw.append(datos[2]);
	            fw.append(",");
	            fw.append(datos[4]);
	            fw.append("\n");	            
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    System.out.println("Datos agregados exitosamente");
	    sc.close(); 
	}

	//Método para comprobar si un string es un número entero
	private static boolean esNumero(String s) {
	    try {
	        Integer.parseInt(s);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}

}
