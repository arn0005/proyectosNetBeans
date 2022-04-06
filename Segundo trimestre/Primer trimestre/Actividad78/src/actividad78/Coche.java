package actividad78;

public class Coche {

    public static final int MAX_GASOLINA = 50;
    public static final int MIN_GASOLINA = 0;

    private String color;
    private double anchura;
    private double altura;
    private int numeroPuertas;
    private int numeroRuedas;
    private boolean encendido;
    private int gasolina;

    public Coche(String color, double anchura, double altura, int numeroPuertas) {
        this.color = color;
        this.anchura = anchura;
        this.altura = altura;
        this.numeroPuertas = numeroPuertas;
        this.numeroRuedas = 4;
        this.encendido = false;
        this.setGasolina(MAX_GASOLINA);
    }

    public void pintar(String nuevoColor) {
        if (!this.encendido) {
            if (this.color.equals(nuevoColor)) {
                System.out.println("El coche ya es de ese color");
            } else {

                System.out.println("Coche pintado de " + nuevoColor);
                this.color = nuevoColor;
            }
        } else 
        {
            System.out.println("Coche encendido, no se puede pintar");
        }
    }

    @Override
    public String toString() {
        String representacion = "Color: " + this.color + "\nAltura: " + this.altura;
        return representacion;
    }
    
    private boolean tieneSuficienteGasolina(int gasolina) {
        return this.gasolina >= gasolina;
    }

    public void arrancar() {
        // Esta el coche apagado?
        if (tieneSuficienteGasolina(5)) {
            if (!this.encendido) {
                this.encendido = true; // Lo arranco
                this.gasolina = this.gasolina - 5; // Consumo 5 unidades de gas
                System.out.println(this.color + ": Coche arrancado");
            } else {
                System.out.println(this.color + ": No se ha podido arrancar. Ya arrancado");
            }
        } else {
            System.out.println(this.color + ": No se ha podido arrancar. Gas insuficiente");
        }

    }

    public void parar() {
        if (this.encendido) {
            this.encendido = false;
            System.out.println(this.color + ": Coche apagado");
        } else {
            System.out.println(this.color + ": No se ha podido apagar. Coche ya apagado");
        }
    }

    public void desplazar() {
        if (this.encendido && tieneSuficienteGasolina(20)) {

            System.out.println(this.color + ": Se ha movido");
            this.gasolina -= 20;

        } else if (!this.encendido) {
            System.out.println(this.color + ": No se ha movido. Esta apagado");
        } else {
            System.out.println(this.color + ": No se ha movido, ve al Petroprix");
        }
    }

    public boolean repostar(int gasolina) {
        if (this.encendido) {
            System.out.println(this.color + "Apague el coche");
            return false;
        }
        if (gasolina < MIN_GASOLINA) {
            System.out.println(this.color + ": Gasolina negativa");
            return false;
        }

        if (gasolina + this.gasolina > MAX_GASOLINA) {
            System.out.println(this.color + ": Tanke Overflow");
            return false;
        }

        this.gasolina += gasolina;
        System.out.println(this.color + ": Repostado.Ahora tiene " + this.gasolina);
        return true;
    }

    public int getGasolina() {
        return this.gasolina;
    }

    private void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }
}
