/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad14;

import java.util.Scanner;
import java.lang.Math;

public class Actividad14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dimensiones de la habitación");
        System.out.println("Metros de Ancho?");
        int ancho = entrada.nextInt();
        System.out.println("Metros de largo?");
        int largo = entrada.nextInt();
        
        System.out.println("Información del material");
        System.out.println("Centimetros del lado?");
        int lado = entrada.nextInt();
        System.out.println("Precio de baldosa?");
        int precio = entrada.nextInt();
        
        int b1 = (largo*100) / lado;
        b1 = (int) Math.ceil(b1);
        
        int ba = (ancho*100)/lado;
        ba = (int) Math.ceil(b1);
        
        int nbaldosas = b1*ba;
        precio = nbaldosas*precio;
        System.out.println("Necesitas "+nbaldosas+" baldosas");
        System.out.println("Precio Total " + precio);
        
        
        
        // TODO code application logic here
    }
    
}
