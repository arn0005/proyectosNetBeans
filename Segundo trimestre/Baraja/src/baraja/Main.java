/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baraja;

/**
 *
 * @author angel.ruiz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Carta carta1 = new Carta(11, "corazon");
        Carta carta2 = new Carta(12, "pica");
        System.out.println(carta1.toString());
        System.out.println(carta2.toString());
        Baraja baraja1 = new Baraja();

    }
}
