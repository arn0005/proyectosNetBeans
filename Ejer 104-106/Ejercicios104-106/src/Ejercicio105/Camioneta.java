package Ejercicio105;

public class Camioneta extends Coche {

    protected int carga; // En kg

    public Camioneta(int carga, int velocidad, int cilindrada, String color, int ruedas) {
        super(velocidad, cilindrada, color, ruedas);
        this.carga = carga;
        this.tipo = "Camioneta";
    }

    @Override
    public String toString() {
        return super.toString() + ", carga de " + this.carga + "kg";
    }

}
