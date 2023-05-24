package ejercicio4_5;
import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
			System.out.println("Introduzca la ruta del directorio u archivo: \n");
			
			Scanner teclado = new Scanner(System.in);		
			File rutaUser = new File(teclado.next());			
			
			if (rutaUser.exists() == true) {
				System.out.println("Desea borrar el archivo? (Y/N)");
				teclado.next();
				String decision = teclado.next();
				if ( decision == "y") {
					rutaUser.delete();
					System.out.println("Archivo borrado");
				}else {
					System.out.println("No se borró el archivo");
				}
			}else if(rutaUser.exists() == false) {
				System.out.println("El archivo o directorio que quiere encontrar no existe, por favor, revise que esté bien escrito.\n");
			}	
			
			teclado.close();
		}
		
	}
