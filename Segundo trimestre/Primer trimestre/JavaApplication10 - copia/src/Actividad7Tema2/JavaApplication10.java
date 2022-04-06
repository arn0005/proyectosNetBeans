/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad7Tema2;

/**
 *
 * @author angel.ruiz
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*
        1º: Crear cadena “Volando, volando… siempre arriba”.
        2º: Crear un algoritmo que indique donde esta la d en los primeros 7 caracteres de la cadena.
        3º: Igual pero ahora busca la letra ‘d’ en los 7 últimos caracteres.
     */
        String cadena = "Volando, volando....siempre arriba";
        String cadena1 = cadena.substring(0,7);
        String cadena2 = cadena.substring (24,31);
        int posicion1 = cadena1.indexOf ("d");
        int posicion2 = cadena2.indexOf ("d");
        System.out.println(posicion1);
        System.out.println(posicion2);
        
        
    }
}