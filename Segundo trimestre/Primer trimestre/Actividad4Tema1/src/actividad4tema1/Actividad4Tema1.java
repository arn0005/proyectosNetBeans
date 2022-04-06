/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad4tema1;

import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Actividad4Tema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1: Añadir 5 números
        2: Un algoritmo debe hacer la media de esos 5 numeros
        3: Que muestre dicha media
        */
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        int media;
        int arreglo;
        Scanner lectorNumeros = new Scanner(System.in);
        System.out.println("Escriba 5 números enteros");
        numero1 = lectorNumeros.nextInt();
        numero2 = lectorNumeros.nextInt();
        numero3 = lectorNumeros.nextInt();
        numero4 = lectorNumeros.nextInt();
        numero5 = lectorNumeros.nextInt();
        media = numero1 + numero2 + numero3 + numero4 + numero5;
        arreglo = media / 5;
        System.out.println("La media de los números " + numero1 + ", " + numero2 + ", " + numero3 + ", " + numero4 + " y " + numero5 + " es igual a " + arreglo);
        

    }
    
}
