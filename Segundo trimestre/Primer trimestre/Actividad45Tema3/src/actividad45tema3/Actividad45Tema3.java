/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad45tema3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Actividad45Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maximo;
        int num;
        int mayor = 0;
        int cont;

        System.out.println("Inserte el máximo de números: ");
        maximo = sc.nextInt();

        for (cont = 0; cont < maximo; cont++) {
            System.out.println("Inserte un número: ");
            num = sc.nextInt();
            if (num > mayor) {
                mayor = num;
            }
        }
        System.out.println("El valro mayor es " + mayor);

    }
}
