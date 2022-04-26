package Ejercicio121;

import java.util.*;

public class principal {

    public static void main(String[] args) throws Exception {
        Random r = new Random();
        int tope = r.nextInt(99) + 1;
        System.out.println("El tope es " + tope);
        int numero = 0;
        Piscina p1 = new Piscina(tope);
        try {
            System.out.println("Llenando piscina");
            for (int i = 0; i < 6; i++) {
                numero = r.nextInt(24) + 1;
                p1.ponerAgua(numero);
                System.out.println(p1.getNivel());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            System.out.println("Vaciando piscina");
            for (int i = 0; i < 15; i++) {
                numero = r.nextInt(24) + 1;
                p1.quitarAgua(numero);
                System.out.println(p1.getNivel());
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
