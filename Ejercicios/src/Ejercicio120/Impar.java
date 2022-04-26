package Ejercicio120;

public class Impar {

    int numero;

    public Impar(int numero) throws Exception {
        if (numero % 2 == 0) {
            throw new Exception("El numero no es impar");
        } else {
            this.numero = numero;
        }
    }

    @Override
    public String toString() {
        return "El numero es " + this.numero;
    }
}
