package baraja2;

public class Carta {

    private int numero; // Declaro las variables
    private palo palos;

    public Carta(int numero, palo palos) { // Agrego el constructor de carta
        this.numero = numero;

    }

    public int getNumero() {
        return numero;
    }
// GETTER y SETTER de los numeros de las cartas

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalos() {
        if (this.palos == palo.Pica) { // Si el palo de la carta es igual a pica, transforma el texto a simbolo
            return "\u2660";
        }
        if (this.palos == palo.Trebol) {
            return "\u2663";
        }
        if (this.palos == palo.Corazones) {
            return "\u2665";
        }
        return "\u2666"; //Si no, muestra el simbolo diamantes
    }

    public void setPalos(palo palos) { // Setter para ajustar el palo a la carta
        this.palos = palos;
    }

    @Override
    public String toString() { // To string para mostrar el palo
        return "Carta: " + this.numero + this.getPalos();
    }

}
