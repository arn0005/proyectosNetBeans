package Ejercicio105;

public class Bicicleta extends Vehiculo {

    protected String tipoBici;

    public Bicicleta(String tipoBici, String color, int ruedas) {
        super(color, ruedas);
        if (tipoBici.equalsIgnoreCase("Urbana")) {
            this.tipoBici = "urbana";
        } else {
            this.tipoBici = "deportiva";
        }
        this.tipo = "Bicicleta";
    }

    @Override
    public String toString() {
        return super.toString() + ", de tipo " + this.tipoBici;
    }
}
