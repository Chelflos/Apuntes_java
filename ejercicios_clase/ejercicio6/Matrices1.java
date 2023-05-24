package ejercicio6;

public class Matrices1 {
/*Realiza un programa que muestre por pantalla un array de 10  filas  por  10  columnas  relleno  con  números  aleatorios entre 200 y 300. 
 * A continuación, el programa debe mostrar los números de la diagonal que va desde la esquina superior izquierda a la esquina inferior derecha, 
 * así como el máximo, el  mínimo  y  la  media  de  los  números  que  hay  en  esa diagonal.*/

	public static int alea(int max,int min) {		
		 double num=(Math.random()*(max - min + 1)) + min;		
		return (int)num;		
		}
	
	public static void main(String[] args) {		
		
		int[][] array = new int[10][10];		
		int n,suma=0;
		int minimo=300;
		int maximo=0;
		
		System.out.println("\nMatriz de 10 X 10: ");
		//Se muestra y rellena la matriz
		for(int i = 0; i < array.length; i++) {
			System.out.print("\n");
			
			for(int j =0;j < array.length; j++) {			
				array[i][j] = alea(200, 300);
				System.out.print(array[i][j]+ " ");
			} 
		}
		
		System.out.println( "\n\nDIAGONAL:");
		//Se muestra la diagonal
		
		for(int i = 0; i < array.length; i++) {			
			System.out.print("\n");
			System.out.print(array[i][i]+" ");
		//Se suman los valores de la diagonal
			n=array[i][i];
			suma+=n;
		//Se obtiene el minimo y el maximo
			if(minimo>=array[i][i])minimo=array[i][i];
			if(maximo<=array[i][i])maximo=array[i][i];
		}
		
			System.out.println( "\n");
			System.out.println("Minimo: " + minimo +".");
			System.out.println("Maximo: "+ maximo+".");
			System.out.println("Media: "+ (suma/10)+".");	//se obtiene la media
	}		
		
}


	