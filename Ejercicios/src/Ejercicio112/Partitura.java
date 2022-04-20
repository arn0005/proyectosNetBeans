package Ejercicio112;

import java.util.Random;

public class Partitura {

    private String nombre;
    private String autor;
    private Nota[] notas;

    public Partitura(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
        this.notas = new Nota[100];
    }

    public int numNotas() {
        int contador = 0;
        /*Recorro el array y cada hueco encontrado
        sumo uno al contador*/
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] != null) {
                contador++;
            }
        }
        return contador;
    }
    /*CORREGIR: Random del 1 al 7 para los tipos de notas
    y rellenar la partitura con cada tipo de nota aleatorio*/
    public Boolean addNota(Nota nueva) {
        /*Recorre el array al completo o hasta que encuentre
        un hueco vacio el que rellenar*/
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == null) {
                notas[i] = nueva;
                i = notas.length;
                return true;
            }
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Nota[] getNotas() {
        return notas;
    }

    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        int contador = 0;
        String res = this.nombre + " de " + this.autor + "\n";
        /*Bucle que cada 10 notas aniade un salto de linea*/
        for (int i = 0; i < notas.length; i++) {
            if (contador % 10 == 0 && contador != 0) {
                res += "\n";
                res += notas[i] + " ";
            } else {
                res += notas[i] + " ";
            }
            contador++;
        }
        return res;
    }
}
