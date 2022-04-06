/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaApplication9;

/**
 *
 * @author angel.Ruiz
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*
        1º: Cadena “Volando, volando… siempre arriba”
        2º: Crear un algoritmo que nos indique la posición de la letra ‘d’ en los 7 primeros caracteres de cad.
        3º: Igual pero ahora busca la letra ‘d’ en los 7 últimos
     */
        String cadena = "Volando, volando....siempre arriba";
        String cadena1 ;
        int posicion1;
        String cadena2 ;
        int posicion2;
        
        cadena1 = cadena.substring(0,7);
        posicion1 = cadena1.indexOf("d");
        System.out.println("La cadena 1 tiene la 'd' en la posicion: "+posicion1);
        
        cadena2 = cadena.substring(cadena.length()-7);
        posicion2 = cadena2.indexOf("d");
        System.out.println("La cadena 1 tiene la 'd' en la posicion: "+posicion2);
        
      
    }
    
}
