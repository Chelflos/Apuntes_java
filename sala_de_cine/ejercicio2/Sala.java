package ejercicio2;
public class Sala {
	protected Pelicula pelicula;
 	protected double precio;
 	protected Butaca[][] butacas;
 	
 	 
 	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

	public Butaca[][] getButacas() {
		return butacas;
	}

	public void setButacas(Butaca[][] butacas) {
		this.butacas = butacas;
	}
	
	

	public static void crearSala(Sala sala, double precio, Pelicula pelicula, Butaca[][] butacas) {
 		Pelicula.generarPelicula(pelicula);
 		precio = Math.random()*4+7;
 		System.out.println("Precio: " + (String.format("%.2f",precio)));
		System.out.println("\nDistribucion de la sala:"); 		
 		for(int i = 7; i >= 0; i--) { 						
 			System.out.println("\n");
 			for(int j = 0; j <= butacas.length; j++) { 
 				int numero =i+1;	
 				int nLetra=65+j;
 				char letra = (char)nLetra;
//se generan las butacas en el orden correcto				
 				Butaca butacaActual = new Butaca(numero,letra,false);	
 				butacas[i][j] = butacaActual; 	
 				System.out.print(butacas[i][j]);
 				nLetra++;
 			}
 		}
 		sala.setPelicula(pelicula);
 		sala.setPrecio(precio);
 		sala.setButacas(butacas);
 	}
	
	
 	
 	public static boolean comprobarEdad(Sala sala, Espectador espectador){
 		boolean edadOk;
 		Pelicula pelicula = sala.getPelicula();
 		
 		if(espectador.getEdad() >= pelicula.getEdadMinima()) {
 			edadOk=true;
 		}else {
 			edadOk=false;
 			System.out.println(espectador.getNombre() + " no cumple la edad minima");
 			}
 		return edadOk;
 	}
 	
 	
 	
 	public static boolean comprobarDinero(Sala sala, Espectador espectador){
 		boolean dineroOk;
 		
 		if(espectador.getDinero() >= sala.getPrecio()) {
 			dineroOk=true;
 		}else {
 			dineroOk=false;
 			System.out.println(espectador.getNombre() + " no tiene suficiente dinero");
 			}
 		return dineroOk;
 	}
 	
 	
 	public static int alea(int n) {
 		int fila = (int) (Math.random()*n);
 		return fila;
 	}
 	public static boolean verificarSalaLlena(Butaca[][] butacas) {
 		for(int i = 7; i >= 0; i--) { 						
			 	for(int j = 0; j <= butacas.length; j++) {
			 		if (butacas[i][j].isOcupado() != true) {
			 			return true;
			 		}
			 	}
 	    }
 	    return false;
 	}

 	
 	
 	public static void sentarEspectador(Espectador espectador, Sala sala, Butaca[][] butacas){ 		
 		Espectador.generarEspectador(espectador);
//Se comprueba que el espectador tenga dinero suficiente, que no tenga asiento y la edad minima para acceder a la sala.En caso contrario se le deniega la entrada
 		if (comprobarDinero(sala, espectador)==true & Sala.comprobarEdad(sala,espectador)==true	&& espectador.getAsiento()==null) {

 			System.out.println(espectador.getNombre() + " tiene dinero y edad suficientes. Se le asigna un asiento:\n"); 				 					
 			int fila = alea(7);
 			int columna = alea(8); 		
//Se comprueba que el asiento a asignar este vacio, en ese caso se asigna ese asiento al espectador y se marca la butaca como ocupada.
 			if (butacas[fila][columna].isOcupado()==false) { 									
 				espectador.setAsiento(butacas[fila][columna]);
 				butacas[fila][columna].setOcupado(true);
 				System.out.println(espectador); 		
//En caso de que este ocupado, se buscara otro que no lo este y se le asigna al espectador.
 			}else if(butacas[fila][columna].isOcupado()==true) {
 				System.out.println(butacas[fila][columna] + " asiento ocupado");
 				for(int i = 7; i >= 0; i--) { 						
 					 for(int j = 0; j <= butacas.length; j++) {
 					 	if(butacas[i][j].isOcupado()==false) {
 					 		espectador.setAsiento(butacas[i][j]);
 					 	}else if(butacas[i][j].isOcupado()==true) {
 					 		j++;
 					 	}else if(verificarSalaLlena(butacas)==true) {
 					 		System.out.println("Sala llena, no quedan asientos.");
 					 	}
 					 } 									
 				}
 			} 							 				
 		}else {
 				System.out.print(espectador.getNombre() + " no puede comprar una entrada.\n\n");
 				; 				
 		}
 	}
 		
 			 		
 			
 		
	
	public Sala(Pelicula pelicula, double precio, Butaca[][] butacas) {
		super();
		this.pelicula = pelicula;
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "\nPrecio: " + (String.format("%.2f",precio)) + " euros.";
	} 
}
