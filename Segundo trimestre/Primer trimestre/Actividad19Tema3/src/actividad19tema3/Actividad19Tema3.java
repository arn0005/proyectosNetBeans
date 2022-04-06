/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad19tema3;

import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Actividad19Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        int mayor = 0;
        System.out.println("Escribe 5 numeros para calcular el mayor");
        Scanner lector = new Scanner(System.in);
        n1 = lector.nextInt();
        n2 = lector.nextInt();
        n3 = lector.nextInt();
        n4 = lector.nextInt();
        n5 = lector.nextInt();
        
        if (n1 > mayor) {
            mayor = n1;
        }
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        if (n4 > mayor) {
            mayor = n4;
        }
        if (n5 > mayor) {
            mayor = n5;
        }
        System.out.println("El valor mayor es " + mayor);
    }

}
