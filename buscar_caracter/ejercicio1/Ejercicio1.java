package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

	/*
	 * Cada vez que se empieza un partido, el programa debe elegir un numero de
	 * cuatro cifras(sin cifras repetidas) que sera el codigo que el jugador debe
	 * adivinar en la menor cantidad de intentos posibles.Cada intento consiste en
	 * una propuesta de un codigo posible que tipea el jugado y unmarespuesta de un
	 * codigo posibleque tipea el jugador, y una respuesta del programa.Las
	 * respuestas le daran pistas al jugador para que pueda deducir el codigo
	 * 
	 * Estas pista indican cuan cerca estuvo el numero propuesto de la solucion real
	 * a traves de dos vlaores: la cantidad de aciertos es la cantidad de digitos
	 * que propuso el jugadorqque tambirn estan en el codigo en la misma posicion.
	 * La cantidad de coincidencias es la cantidad de digitos que propuso el jugador
	 * qi=ue tambien estan en el codigo pero en una posicion distinta. 4 cifras
	 * ---->5432 1234-->1 acierto y 2 coincidencia.
	 */

	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;
	}

	public static void resolucion(String pro, String juga) {
		String n1, n2;
		int aciertos = 0,coincidencias=0;
		for (int i = 0; i < pro.length(); i++) {
			n1 = String.valueOf(pro.charAt(i));
			n2 = String.valueOf(juga.charAt(i));
			if(n1.equals(n2)) {
				aciertos++;
			}

		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String[] numeros = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String num;
		int nDigitos = 4, intentos = 5;
		String cadena = " ";
		String jugador="";
		String propuesta = "";

		while (cadena.length() != nDigitos) {

			num = numeros[alea(0, numeros.length - 1)];
			if (cadena.indexOf(num) == -1) {
				cadena += num;
			}

			System.out.println(propuesta);

			for (int i = 1; i <= intentos; i++) {
				System.out.println("Indique el numero " + String.valueOf(nDigitos) + " digitos.");
				jugador = sc.readLine();
				if (jugador.length() == nDigitos) {
					if (propuesta.equals(jugador)) {
						System.out.println("Enhorabuena ha acertado en el intento " + i);
						break;
					} else {
						resolucion(propuesta, jugador);
					}
				}
			}
			if (!propuesta.equals(jugador))
				System.out.println("Lo siento, demasiados intentos.");

		}
	}
}
