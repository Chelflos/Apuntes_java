package ejercicio2;

public class Pelicula {
	protected String titulo;
	protected int duracion;
	protected int edadMinima;
	protected String director;

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracion() {
		return duracion;
	}	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}


	public static void generarPelicula(Pelicula pelicula) {
		String[] titulos = new String[10];
			titulos[0]="Avatar";
			titulos[1]="No mires arriba";
			titulos[2]="El gato con botas";
			titulos[3]="Dunkirk";
			titulos[4]="Halloween";
			titulos[5]="Pesadilla en elm street";
			titulos[6]="Rambo";
			titulos[7]="Forest gump";
			titulos[8]="101 dalmatas";
			titulos[9]="El vengador toxico";
		
		int[] edadesMinimas = new int[6];
			edadesMinimas[0]=0;
			edadesMinimas[1]=8;
			edadesMinimas[2]=13;
			edadesMinimas[3]=16;
			edadesMinimas[4]=18;
		
		String[] directores= new String[5];
			directores[0]="James Cameron";
			directores[1]="Steven Spelbergo";
			directores[2]="Michael Bay";
			directores[3]="Nombre falso 123";
			directores[4]="Zack Snyder";
		
		int num = (int) (Math.random()*9);//genera un titulo
		pelicula.setTitulo(titulos[num]);
		num = (int) (Math.random()*4);
		pelicula.setEdadMinima(edadesMinimas[num]);//genera una edad minima
		num = (int) (Math.random()*4);
		pelicula.setDirector(directores[num]);//genera un director
		int alea = (int)(Math.random()*60+150);
		pelicula.setDuracion(alea);
		System.out.println(pelicula);
	}

	public Pelicula(String titulo, int duracion, int edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}
	@Override
	public String toString() {
		return "\nPel\u00edcula: : " + titulo + ".\nDuraci\u00f3n: " + duracion + " min.\nEdad M\u00ednima: " + edadMinima + ".\nDirector: "
				+ director + ".";
	}
}
