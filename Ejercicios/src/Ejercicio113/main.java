package Ejercicio113;

import java.util.Scanner;
import java.util.InputMismatchException;

public class main {

    public static void main(String[] args) {
        /*Scanner que pida un String y un entero N,
        el programa indica el caracter del String
        en la posicion numero N.*/
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String cadena = lector.next();
        System.out.println("Introduce un entero");
        int N = 0;
        do {
            N = lector.nextInt();
            System.out.println("ERROR: No existe la posicion " + N + " en la cadena");
        } while ((N > cadena.length()) || (N <= 0));
        System.out.println("La posicion " + N + " es ");
    }
}
