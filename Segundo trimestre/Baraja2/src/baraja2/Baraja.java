package baraja2;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    private ArrayList baraja;

    public Baraja() {

        ArrayList<Carta> baraja = new ArrayList<Carta>(); // Creo un arraylist llamada baraja a partir de la clase carta
        for (int i = 0; i < 13; i++) { // Recorro el arraylist hasta que i sea 12
            Carta pica = new Carta(i, palo.Pica);
            Carta trebol = new Carta(i, palo.Trebol);
            Carta corazones = new Carta(i, palo.Corazones);
            Carta diamantes = new Carta(i, palo.Diamantes); // Creo cartas con los palos
            baraja.add(pica);
            baraja.add(trebol);
            baraja.add(corazones);
            baraja.add(diamantes); // Agrego las cartas con los palos a la baraja
        }

    }

    public ArrayList getBaraja() { // Getter para la baraja
        return baraja;
    }

    public void setBaraja(ArrayList baraja) { // Setter de la baraja
        this.baraja = baraja;
    }

    public void Barajar() {
        Collections.shuffle(baraja); // Barajo la baraja con shuffle
    }

    @Override
    public String toString() { // Metodo toString para mostrar la baraja
        String mostrar = "";
        for (int i = 0; i < baraja.size(); i++) {
            mostrar += baraja.get(i);
        }
        return mostrar;
    }

}
