package Ejercicio112;

public class Piano extends Cuerda {

    private String tipoPiano;
    private int numTeclas;

    public Piano(int numCuerdas, String tipoCuerdas, int numTeclas) {
        super(numCuerdas, tipoCuerdas = "percutidas");
        this.numTeclas = numTeclas;
        switch (tipoPiano) {
            case "pared":
                this.tipoPiano = "pared";
                break;
            case "cola":
                this.tipoPiano = "cola";
                break;
            default:
                this.tipoPiano = "electrico";
                break;
        }
    }

    public void afinar() {
        System.out.println("Se han tensado correctamente las " + this.numTeclas + " del piano.");
    }

    @Override
    public String toString() {
        return "Piano de tipo " + this.tipoPiano + " con " + this.numTeclas + " teclas";
    }

}
