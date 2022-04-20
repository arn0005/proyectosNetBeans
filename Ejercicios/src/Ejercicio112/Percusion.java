package Ejercicio112;

public abstract class Percusion {

    private Boolean usaBaquetas;

    public Percusion(Boolean usaBaquetas) {
        if (usaBaquetas == true) {
            this.usaBaquetas = usaBaquetas;
        } else {
            this.usaBaquetas = false;
        }
    }

}
