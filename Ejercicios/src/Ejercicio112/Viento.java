package Ejercicio112;

public abstract class Viento {

    private String tipoViento;

    public Viento(String tipoViento) {
        if (tipoViento.equalsIgnoreCase("metal")) {
            this.tipoViento = "metal";
        } else {
            this.tipoViento = "madera";
        }
    }
}
