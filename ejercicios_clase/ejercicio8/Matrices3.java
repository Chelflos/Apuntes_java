package ejercicio8;

public class Matrices3 {
/*Realiza un programa que calcule la estatura media, m�nima y m�xima en cent�metros de personas de diferentes pa�ses. 
 * El  array  que  contiene  los  nombres  de  los  paises  es  el siguiente:   pais   =   {�Espa�a�,   �Rusia�,   �Jap�n�, �Australia�}.
 *  Los datos sobre las estaturas se debensimular mediante un array de 4 filas por 10 columnas con n�meros aleatorios generados al azar entre 140 y 210. 
 *  Los decimales de la media se pueden despreciar. Los nombres de los pa�ses se deben mostrar utilizando el array de pa�ses (no se pueden escribir directamente).*/
	
	public static int alea(int max,int min) {		
		 double num=(Math.random()*(max - min + 1)) + min;		
		return (int)num;		
		}
	
	public static void main(String[] args) {
		
		String[]paises =new String[4];
		paises[0]="Espa�a";
		paises[1]="Rusia";
		paises[2]="Jap�n";
		paises[3]="Australia";		
		int[][] estaturas = new int[4][10];
		int minimo;
		int maximo;
		int n, suma=0;
		
		System.out.println("\nMatriz de 4 X 10: ");
		//Se rellena el array con numeros aleatorios entre 140 y 210.
		for(int i=0; i < estaturas.length; i++) {
			System.out.println("\n");
			for(int j=0;j < 10;j++) {estaturas[i][j] = alea(140,210);		
			System.out.print(estaturas[i][j] + " ");
			}
		}
		
		System.out.println("\n\n----------------------------------------");
		
		for(int i=0; i < estaturas.length; i++) {
			minimo =210;
			maximo =0;
			suma=0;
			System.out.println("\nPais: "+paises[i]);
			System.out.println("Estaturas: \n");
			for(int j=0;j < 10;j++) {
		//Se guarda la suma de los valores de cada fila.
				n=estaturas[i][j];
				suma+=n;
		//Se calcula el minimo y maximo.
				if(minimo>=estaturas[i][j])minimo=estaturas[i][j];
				if(maximo<=estaturas[i][j])maximo=estaturas[i][j];
				System.out.print(estaturas[i][j] + " ");
				
				
			}
			System.out.println("\n\nEstatura m�nima: "+ minimo);
			System.out.println("Estatura m�xima: "+ maximo);
		//Se calcula la media.
			System.out.println("Media: "+suma/9);
		}
		
	}

}
