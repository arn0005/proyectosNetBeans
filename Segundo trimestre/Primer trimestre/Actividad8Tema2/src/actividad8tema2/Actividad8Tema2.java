/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad8tema2;

import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Actividad8Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int resultado;
        Scanner lector = new Scanner(System.in);
        System.out.println("Numero de caras del dado: ");
        n = lector.nextInt();    
        
        resultado = (int)(Math.random()*n+1);
        System.out.println(resultado);
    }
    
}
