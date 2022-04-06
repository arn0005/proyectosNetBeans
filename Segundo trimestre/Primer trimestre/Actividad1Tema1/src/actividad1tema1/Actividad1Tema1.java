/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1tema1;

import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Actividad1Tema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1: Que pida un numero entero
        2: Que haga el cuadrado del mismo
        3: Que muestre dicha potencia
        */
        int numero;
        int resultado;
        Scanner lectorNumeros = new Scanner(System.in);
        System.out.println("Escribe un numero entero");
        numero = lectorNumeros.nextInt();
        resultado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es " + resultado);
    }
    
}
