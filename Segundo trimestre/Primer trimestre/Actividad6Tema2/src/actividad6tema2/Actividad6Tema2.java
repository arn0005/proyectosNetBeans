/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad6tema2;

import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Actividad6Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String cadena = "LA LLUVIA EN SEVILLA ES UNA MARAVILLA";
    String cadena_modificada1 = cadena.substring(13);
    cadena_modificada1 = cadena_modificada1.toLowerCase();
    cadena_modificada1 = cadena_modificada1.replaceFirst("s","s");
    
    String fragmento1 = cadena.substring(0,9);
    String fragmento2 = cadena.substring(20);
    String cadena_modificada2 = fragmento1.toLowerCase() + fragmento2.toLowerCase();
    System.out.println (cadena_modificada1);
    System.out.println (cadena_modificada2);

    }
    
}
