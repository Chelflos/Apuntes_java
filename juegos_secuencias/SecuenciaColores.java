package juegos_secuencias;

import java.util.Random;
import java.util.Scanner;

public class SecuenciaColores {
    private static final int NUMERO_COLORES = 4;
    private static final String[] COLORES = {"Rojo", "Verde", "Azul", "Amarillo"};
    private static final String[] CONTROLES = {"1", "2", "3", "4"};

    private String[] secuenciaAleatoria;
    private Scanner scanner;
    private int contadorAciertos;
    private int contadorIntentos;

    public SecuenciaColores() {
        secuenciaAleatoria = generarSecuenciaAleatoria();// Genera la secuencia aleatoria de colores
        scanner = new Scanner(System.in);
        contadorAciertos = 0;
        contadorIntentos = 0;
    }

    private String[] generarSecuenciaAleatoria() {
        String[] secuencia = new String[NUMERO_COLORES];
        Random random = new Random();

        // Genera un color aleatorio para cada posición de la secuencia
        for (int i = 0; i < NUMERO_COLORES; i++) {
            int indiceColor = random.nextInt(COLORES.length);
            secuencia[i] = COLORES[indiceColor];
        }

        return secuencia;
    }

    private boolean adivinarSecuencia() {
        System.out.println("Adivina la secuencia de colores. Ingresa los números correspondientes a los colores:");

        // Solicita al usuario que ingrese los números correspondientes a los colores
        for (int i = 0; i < NUMERO_COLORES; i++) {
            System.out.print("Color " + (i + 1) + ": ");
            String input = scanner.nextLine();

            if (!esControlValido(input)) { //Verifica si la entrada del usuario es válida
                System.out.println("Entrada inválida. Ingresa un número del 1 al " + NUMERO_COLORES);
                i--; //Vuelve a pedir el color para la misma posición
                continue;
            }

            int indiceColor = Integer.parseInt(input) - 1;
            String colorSeleccionado = COLORES[indiceColor];
            System.out.println("Color seleccionado: " + colorSeleccionado);

            if (colorSeleccionado.equals(secuenciaAleatoria[i])) { //Compara el color seleccionado con el de la secuencia
                contadorAciertos++; //Incrementa el contador de aciertos
            }
        }

        contadorIntentos++; //Incrementaa el contador de intentos

        System.out.println("Colores acertados: " + contadorAciertos);
        System.out.println("Intentos realizados: " + contadorIntentos);

        if (contadorAciertos == NUMERO_COLORES) {
            System.out.println("¡Felicidades! Has adivinado la secuencia correctamente.");
            return true; //El usuario ha adivinado la secuencia
        } else {
            System.out.println("Has fallado. La secuencia correcta era: " + String.join(", ", secuenciaAleatoria));
            return false; //El usuario no ha adivinado la secuencia
        }
    }

    private boolean esControlValido(String input) {
        for (String control : CONTROLES) {
            if (control.equals(input)) {
                return true; //La entrada del usuaario coincide con un control válido
            }
        }
        return false; //La entrada del usuario no coincide con ningún control válido
    }

    public void jugar() {
        System.out.println("¡Bienvenido al juego de Secuencia de Colores!");

        boolean adivinado = false;
        while (!adivinado) {
            adivinado = adivinarSecuencia();
        }

        scanner.close();
    }

    public static void main(String[] args) {
        SecuenciaColores juego = new SecuenciaColores();
        juego.jugar();
    }
}
