package Ejercicio112;

public abstract class Percusion {

    private Boolean usaBaquetas;

    public Percusion(Boolean usaBaquetas) {
        if (usaBaquetas) {
            this.usaBaquetas = true;
        } else {
            this.usaBaquetas = false;
        }
    }

}
