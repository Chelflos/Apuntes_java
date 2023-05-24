package ejercicio7;

public class Matrices2 {
	
	/*Realiza un programa que muestre por pantalla un array de 9 filas por 9 columnas relleno con números aleatorios entre 500 y  900. 
	 * A  continuación,  el  programa  debe  mostrar  los números  de  la  diagonal  que  va  desde  la  esquina  inferior izquierda
	 * a   la   esquina   superior   derecha,   así   como   el máximo, el mínimo y la media de los números que hay en esa diagonal.*/
		
		public static int alea(int max,int min) {		
			 double num=(Math.random()*(max - min + 1)) + min;		
			return (int)num;		
			}
	
	//------------------------------------------
	
	public static void main(String[] args) {
		
		int[][] array = new int[9][9];
		int n=0;
		int suma=0;
		int maximo=500;
		int minimo=900;
		//Se rellena y muestra la matriz
		System.out.println("\nMatriz de 9 X 9: ");
		
		for(int i=0; i < array.length; i++) {
			System.out.println("\n");
			for(int j=0;j < array.length;j++) {
				array[i][j] = alea(500, 900);
				System.out.print(array[i][j]+ " ");
			}
		}
		//Se muestra la diagonal
		System.out.println( "\n\nDIAGONAL:");		
		
		for(int i = 8; i >=0; i--) {			
			System.out.print("\n");
			System.out.print(array[i][i]+" ");
		//Se suman los valores de  la diagonal
			n=array[i][i];
			suma+=n;
		//Se obtiene el minimo y el maximo
			if(minimo>=array[i][i])minimo=array[i][i];
			if(maximo<=array[i][i])maximo=array[i][i];
			
		}
		System.out.println("\n\nMáximo: "+maximo);
		System.out.println("Mínimo: "+minimo);
		System.out.println("Media: "+suma/9);	//Se hace la media
	}

}
