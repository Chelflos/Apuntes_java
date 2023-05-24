package ejercicio2;

public class Main {
//Carlos Tenajas
	public static void main(String[] args) {
		
		
		Pelicula pelicula = new Pelicula("",0,0,"");
		
		double precio = 0;
		
		Butaca[][] butacas= new Butaca [8][9];
		
		Sala sala = new Sala(pelicula,0.0,butacas);
		
		Sala.crearSala(sala,precio, pelicula, butacas);
		
		Espectador espectador = new Espectador("",0,0,null);		
				
		/* Se sientan espectadores de uno en uno, asignandoles una butaca y marcando esta como ocupada 
		siempre y cuando estos tengan dinero, la edad minima requerida y haya butacas vacias. */
		System.out.println("\n");
		
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);
		Sala.sentarEspectador(espectador,sala,butacas);

		
				
			
	}
		
	}


