package actividad78;

/**
 *
 * @author angel.ruiz
 */
public class Actividad78 {

    public static void main(String[] args) {
        Coche rojo = new Coche("Rojo", 2.5, 2.5, 4);
        Coche negro = new Coche("Negro", 3.5, 3.5, 4);

        rojo.arrancar();
        negro.arrancar();
        rojo.desplazar();
        negro.desplazar();
        negro.desplazar();
        negro.repostar(45);
        rojo.parar();
        negro.repostar(60);
        negro.repostar(-10);
        negro.parar();
        negro.repostar(40);
        negro.arrancar();
        negro.pintar("NEGRO");
        negro.pintar("AMARILLO");
        negro.desplazar();

    }

}
