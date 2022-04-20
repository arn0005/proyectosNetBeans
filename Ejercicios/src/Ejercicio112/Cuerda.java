package Ejercicio112;

public abstract class Cuerda {

    private int numCuerdas;
    private String tipoCuerdas;

    public Cuerda(int numCuerdas, String tipoCuerdas) {
        this.numCuerdas = numCuerdas;
        if (tipoCuerdas.equalsIgnoreCase("pulsadas")) {
            this.tipoCuerdas = tipoCuerdas;
        } else {
            this.tipoCuerdas = "percutidas";
        }
    }

}
