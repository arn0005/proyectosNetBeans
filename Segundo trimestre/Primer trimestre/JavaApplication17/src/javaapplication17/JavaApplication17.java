/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroCompleto;
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numeroalReves;
        int numeroalReves1;
        int numeroalReves2;
        int numeroalReves3;
        int numeroalReves4;
        System.out.print("Escriba un numero entero de 4 cifras: ");
        Scanner scanner = new Scanner (System.in);
        numeroCompleto = scanner.nextInt();
        System.out.println("Sus cifras serÃ­an: ");
        numero1 = numeroCompleto % 10000 /1000;
        numero2 = numeroCompleto % 1000 /100;
        numero3 = numeroCompleto % 100 /10;
        numero4 = numeroCompleto % 10;
        System.out.println(""+ numero1 + "" + numero2 +"" +  numero3 +"" + numero4);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);
        /*
        Me he complicado un montÃ³n haciendo este ejercicio pero es que no sabia
        como hacer para poner los 4 numeros al reves en un solo int
        */
        numeroalReves1 = numero4;
        numeroalReves2 = numero3;
        numeroalReves3 = numero2;
        numeroalReves4 = numero1;
        System.out.print("El numero al reves serÃ­a ");
        System.out.print(numeroalReves1);
        System.out.print(numeroalReves2);
        System.out.print(numeroalReves3);
        System.out.println(numeroalReves4);
        
        
    }
    
}
