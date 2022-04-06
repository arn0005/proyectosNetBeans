package Ejercicio105;

public class Coche extends Vehiculo {

    protected int velocidad; // En km/h
    protected int cilindrada; //En cc

    public Coche(int velocidad, int cilindrada, String color, int ruedas) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
        this.tipo = "Coche";
    }

    @Override
    public String toString() {
        return super.toString() + ", velocidad " + this.velocidad + "km/h" + ", cilindrada " + this.cilindrada + "cc";
    }

}
