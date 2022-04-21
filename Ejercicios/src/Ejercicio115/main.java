package Ejercicio115;

import java.util.*;

public class main {

    public static void main(String[] args) {
        int tamanio = 0;
        boolean salir = false;
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el tamanio del array");
        while (!salir) {
            try {
                tamanio = lector.nextInt();
//                while (tamanio < 1) { // Se asegura de que el tamanio sea al menos de 1
//                    System.out.println("Introduce un numero mayor que 1 para el tamanio");
//                    tamanio = lector.nextInt();
//                }
                double array[] = new double[tamanio]; //Tamanio del array por scanner
                int i = 0;
                while (i < array.length) { // Se recorre el array por completo
                    System.out.println("Valor de la posicion " + i + " ?");
                    array[i] = lector.nextDouble(); //Rellena la posicion de la i
                    i++;
                    salir = true;
                }
            } catch (InputMismatchException e) { // Captura error si no se introduce un num entero
                System.out.println("Introduce un numero entero positivo para el tamanio del array");
                lector.next(); // Sigue preguntando el tamanio del array si no es correcto
            } catch (NegativeArraySizeException e) {
                System.out.println("Array con tam negativo");
            }
        }
    }
}
