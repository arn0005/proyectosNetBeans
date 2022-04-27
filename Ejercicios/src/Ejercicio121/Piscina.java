package Ejercicio121;

public class Piscina {

    public final int MAXNIVEL;
    private int nivel;

    public Piscina(int tope) {
        if (tope < 0) {
            tope = 0;
        }
        this.MAXNIVEL = tope;
        this.nivel = 0;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void quitarAgua(int cantidad) throws ExcepcionPiscina {
        if (this.nivel - cantidad < 0) {
            throw new ExcepcionPiscina("La piscina queda por debajo de 0");
        } else {
            this.nivel -= cantidad;
        }
    }

    public void ponerAgua(int cantidad) throws ExcepcionPiscina {
        if (this.nivel + cantidad > MAXNIVEL) {
            throw new ExcepcionPiscina("La piscina sobrepasa el nivel maximo");
        } else {
            this.nivel += cantidad;
        }
    }
}
