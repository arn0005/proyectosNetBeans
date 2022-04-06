/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class JavaApplication12 {

    /*
    Hacer una calculadora que compruebe si un numero es primo o no
    1º: Solicita un numero
    2º: Comprueba si es primo o no
    3º: Escribe el resultado
    */
    public static void main(String[] args) {
        int n = 0;
        int i;
        int suma = 0;
        System.out.println("Escriba un numero primo");
        Scanner lector = new Scanner(System.in);
        n = lector.nextInt();
        for (i = 1; i<=n; i++)
            if (n % i == 0){
                suma++;
            }
        if (suma <=2)
        {
            System.out.println("El numero es primo");}
        else {
            System.out.println("El numero no es primo");
        }
    }
}