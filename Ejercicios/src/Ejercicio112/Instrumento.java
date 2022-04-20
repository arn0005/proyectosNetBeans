package Ejercicio112;

import java.util.Random;

public abstract class Instrumento {

    Random r = new Random();
    private String marca;
    private int mesFabricacion;
    private int anioFabricacion;
    private String fechaFabricacion;
    private Partitura partitura;
    private int longPartitura;

    public Instrumento(String marca, int mesFabricacion, int anioFabricacion, Partitura partitura) {
        this.marca = marca;
        //Creo la fecha aniadiendo tanto el  mes como el anio de fabricacion
        this.fechaFabricacion = mesFabricacion + "/" + anioFabricacion;
        this.partitura = partitura;
    }

    public Instrumento(String marca, int mesFabricacion, int anioFabricacion) {
        this.marca = marca;
        //Creo la fecha aniadiendo tanto el  mes como el anio de fabricacion
        this.fechaFabricacion = mesFabricacion + "/" + anioFabricacion;
        // Partitura de long. entre 10 y 100
        this.longPartitura = r.nextInt(90) + 10;
    }
}
