package Ejercicio112;

public abstract class Viento {

    private String tipoViento;

    public Viento(String tipoViento) {
        if (tipoViento.equalsIgnoreCase("metal")) {
            this.tipoViento = tipoViento;
        } else {
            this.tipoViento = "madera";
        }
    }

}
