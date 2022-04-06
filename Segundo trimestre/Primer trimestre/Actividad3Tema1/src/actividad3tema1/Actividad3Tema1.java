/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad3tema1;

import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Actividad3Tema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1: Que solicite dos números por teclado
        2: Que muestre la suma, la resta, la multiplicación, la potencia y la división de esos números
        */
        int numero1;
        int numero2;
        int suma;
        int resta;
        int multiplicacion;
        double cociente;
        int potencia;
        Scanner lectorNumeros = new Scanner(System.in);
        System.out.println("Escriba dos números enteros");
        numero1 = lectorNumeros.nextInt();
        numero2 = lectorNumeros.nextInt();
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        cociente = (double) numero1 / numero2;
        potencia = (int) Math.pow(numero1, numero2);
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual a " + suma);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es igual a " + resta);
        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es igual a " + multiplicacion);
        System.out.println("El cociente de " + numero1 + " entre " + numero2 + " es igual a " + cociente);
        System.out.println("La potencia de " + numero1 + " elevado a " + numero2 + " es igual a " + potencia);
        
    }
    
}
