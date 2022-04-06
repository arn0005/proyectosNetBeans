/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruiz_nadal_angel_e4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Ruiz_Nadal_Angel_E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = new int[10]; //Creo el array
        int opcion = 0;
        int i = 0;
        int cajon = 0;
        int cajon1 = 0;
        Scanner lector = new Scanner(System.in); //Añado scanner
        Random aleatorio = new Random(); //Añado random

        for (i = 0; i < array.length; i++) { //Relleno el array con valores aleatorios entre 25 y 3
            array[i] = aleatorio.nextInt(26 - 3) + 3;
        }

 

        do { //Pregunta que opcion quieres utilizar
            System.out.println("Sumador de cajones");
            System.out.println("---------------------");
            System.out.println("1. Mismo");
            System.out.println("2. Adyacentes");
            System.out.println("3. Imprimir array");
            System.out.println("4. Salir");
            System.out.print("Opcion?: ");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1: //Opcion de mismo
                    System.out.print("Que cajon vas a usar?: ");
                    cajon = lector.nextInt();

                    while (cajon < 0 || cajon > 9) {
                        System.out.println("Error, el cajon debe ser entre 0 y 9");
                        cajon = lector.nextInt();
                    }
                    for (i = 0; i < array.length; i++) {
                         cajon1 = cajon + 1;
                        array[cajon] = cajon1;
                       
                        System.out.println(array[i] + " ");
                    }
                    System.out.println("Se ha sumado 1 al cajon " + cajon);
                    break;
                case 2: //Opcion de adyacentes
                    System.out.print("Que cajon quieres usar?: ");
                    cajon = lector.nextInt();

                    while (cajon < 0 || cajon > 9) {
                        System.out.println("Error, el cajon debe ser entre 0 y 9");
                        cajon = lector.nextInt();
                    }
                    for (i = 0; i < array.length; i++) {
                        array[cajon] = cajon1;
                        cajon1 = cajon - 1;
                        cajon1 = cajon + 1;
                    }
                    break;

                case 3: //Opcion de mostrar array
                    for (i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println("");

                    break;

                case 4: //Salir
                    System.out.println("Gracias por su visita");
                    break;
                default: //Cuando hay error con la opcion muestra el mensaje:
                    System.out.print("Opcion incorrecta, elige entre 1 y 4: ");
                    break;
            }
        } while (opcion != 4); //Mientras no diga 4, no sale del menu
    }
}
