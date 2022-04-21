package Ejercicio117;

import java.util.*;

public class main {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner lector = new Scanner(System.in);
        int numAleatorio = r.nextInt(100) + 1;
        int num = 0;
        int contador = 0;
        boolean salir = false;
        while (num != numAleatorio) {
            try {
                contador++;
                System.out.println("Escribe un numero");
                num = lector.nextInt();
                if (num < numAleatorio) {
                    System.out.println(num + " es menor que el numero aleatorio");
                } else if (num > numAleatorio) {
                    System.out.println(num + " es mayor que el numero aleatorio");
                }
                if (num == numAleatorio) {
                    System.out.println("El numero era " + numAleatorio + ", lo has adivinado en " + contador + " intentos");
                }
            } catch (InputMismatchException e) {
                System.out.println("Escribe un numero entero");
                num = lector.nextInt();
            }

        }
    }
}
