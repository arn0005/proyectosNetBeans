package Ejercicio105;

public class Vehiculo {

    protected String color;
    protected int ruedas;
    protected String tipo;

    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
        this.tipo = "Vehículo";
    }

    @Override
    public String toString() {
        return this.tipo + " de color " + this.color + ", " + this.ruedas + " ruedas";
    }

}
