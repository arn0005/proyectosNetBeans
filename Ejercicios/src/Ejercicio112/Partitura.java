package Ejercicio112;

import java.util.Random;

public class Partitura {

    private String nombre;
    private String autor;
    private Nota[] notas = new Nota[100];
    private Boolean notaVacia;

    public Partitura(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public int numNotas() {
        return 0;
    }

    public Boolean addNota(Nota nueva) {
        int i = 0;
        while (i < notas.length && notas[i] != null) {
            if (notas[i] == null) {
                notas[i] = nueva;
                System.out.println(notas[i]);
                notaVacia = true;
            } else {
                i++;
            }

        }
        return false;
    }

    @Override
    public String toString() {
        return this.nombre + " de " + this.autor;
    }
}
