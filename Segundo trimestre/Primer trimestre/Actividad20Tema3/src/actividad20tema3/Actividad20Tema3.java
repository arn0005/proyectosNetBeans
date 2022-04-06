/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad20tema3;

import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Actividad20Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int mayor = 0;
        int menor = 0;
        System.out.println("Escribe 3 numeros");
        Scanner lector = new Scanner(System.in);
        n1 = lector.nextInt();
        n2 = lector.nextInt();
        n3 = lector.nextInt();
        if (n1 > mayor) {
            mayor = n1;
        }
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        System.out.println(mayor);
        if (n1 < 0) {
            System.out.println("Los numeros introducidos son " + n1 + " " + n2 + " " + n3 + " ");
        }
        if (n2 < 0) {
            System.out.println(mayor);
        }
        if (n3 < 0) {
        }
    }
}
