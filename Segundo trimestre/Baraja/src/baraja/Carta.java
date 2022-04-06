/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baraja;

/**
 *
 * @author angel.ruiz
 */
public class Carta {

    private int numero;
    private String palo;

    public Carta(int numero, String palo) {
        this.numero = numero;
        if (palo.equalsIgnoreCase("Pica")) {
            palo = "\u2660";
        }
        if (palo.equalsIgnoreCase("Trebol")) {
            palo = "\u2663";
        }
        if (palo.equalsIgnoreCase("Diamante")) {
            palo = "\u2663";
        }
        if (palo.equalsIgnoreCase("Corazon")) {
            palo = "\u2665";
        }
        this.palo = palo;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + palo + "\n---";
    }
}
