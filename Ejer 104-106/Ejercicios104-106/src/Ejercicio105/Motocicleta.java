package Ejercicio105;

public class Motocicleta extends Bicicleta {

    protected int velocidad; //En km/h
    protected int cilindrada; //En cc

    public Motocicleta(int velocidad, int cilindrada, String tipoBici, String color, int ruedas) {
        super(tipoBici, color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
        this.tipo = "Motocicleta";
    }

    @Override
    public String toString() {
        return super.toString() + ", velocidad " + this.velocidad + "km/h, cilindrada " + this.cilindrada + "cc";
    }

}
