package Ejercicio112;

public class Nota {

    private String valor;
    private int duracion;

    public Nota(String valor, int duracion) {
        switch (valor) {
            case "do":
                this.valor = "do";
                break;
            case "re":
                this.valor = "re";
                break;
            case "mi":
                this.valor = "mi";
                break;
            case "fa":
                this.valor = "fa";
                break;
            case "sol":
                this.valor = "sol";
                break;
            case "la":
                this.valor = "la";
                break;
            case "si":
                this.valor = "si";
                break;
        }
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "[" + this.valor + ", " + this.duracion + "]";
    }

}
