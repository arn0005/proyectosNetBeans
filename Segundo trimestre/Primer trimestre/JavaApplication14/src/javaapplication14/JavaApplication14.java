/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class JavaApplication14 {

    /*
    º
    */
    public static void main(String[] args) {
        int i;
        int n;
        boolean esPrimo = true;
        // Lectura de numero
        System.out.println("Escribe un numero");
        Scanner lector = new Scanner(System.in);
        n = lector.nextInt();
        // Desde el número 2 hasta n vamos a comprobar si cada uno es primo
        for (i=2;i<=n;i++) {
            // Asumimos que el numero i es primo
            esPrimo = true;
            // Ahora comprobamos si NO es primo
            // Rrcorremos desde 2 hasta i-1 (j<i)
            for (int j=2;j<i;j++){
                // i es divisieble por j (un numero menor que el), por ello no es primo
                if (i%j==0){
                    esPrimo = false;
                }
            }
            // Si es primo sigue valiendo true, es que i es primo
            if (esPrimo){
                System.out.println(i + " es Primo");
            }
        }
    }
    
}
