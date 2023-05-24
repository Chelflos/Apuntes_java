package ejercicio4_4;

import java.io.File;
import java.io.IOException;

public class Archivo {
	
	
	private void crearArchivo(File archivo) {
		archivo= new File("copiaRestaurants.csv");
		try {
			if(archivo.createNewFile()) {
				System.out.println("Archivo creado con éxito");
			}
			else {
				System.out.println("Error al crear archivo.");
			}	
		}catch(IOException exepcion){
			exepcion.printStackTrace(System.out);
		}
	}
}
