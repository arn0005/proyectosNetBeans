package Ejercicio105;

import java.util.Scanner;

public class testVehiculos {

    public static void main(String[] args) {
        Vehiculo listaVehiculos[] = new Vehiculo[10];
        Scanner lector = new Scanner(System.in);
        int contador = 0;

        Vehiculo vehiculo1 = new Vehiculo("rojo", 4);
        Vehiculo vehiculo2 = new Vehiculo("verde", 6);

        Coche renault = new Coche(120, 90, "negro", 4);
        Coche mercedes = new Coche(180, 180, "blanco", 4);

        Camioneta citroen = new Camioneta(500, 130, 1000, "Blanco", 4);
        Camioneta peugeot = new Camioneta(450, 150, 1100, "Gris", 4);

        Bicicleta bici1 = new Bicicleta("urbana", "negra", 2);
        Bicicleta bici2 = new Bicicleta("sdadd", "blanca", 2);

        Motocicleta moto1 = new Motocicleta(150, 300, "deportiva", "gris", 2);
        Motocicleta moto2 = new Motocicleta(190, 600, "urbana", "verde", 2);

        listaVehiculos[0] = vehiculo1;
        listaVehiculos[1] = vehiculo2;
        listaVehiculos[2] = renault;
        listaVehiculos[3] = mercedes;
        listaVehiculos[4] = citroen;
        listaVehiculos[5] = peugeot;
        listaVehiculos[6] = bici1;
        listaVehiculos[7] = bici2;
        listaVehiculos[8] = moto1;
        listaVehiculos[9] = moto2;

        for (int i = 0; i < listaVehiculos.length; i++) {
            System.out.println(listaVehiculos[i]);
        }
        System.out.println("\n¿Cuantas ruedas?");
        int cuantasRuedas = lector.nextInt();
        for (int i = 0; i < listaVehiculos.length; i++) {
            if (listaVehiculos[i].ruedas == cuantasRuedas) {
                contador++;
            }
        }
        System.out.println("Se han encontrado " + contador + " vehiculos con " + cuantasRuedas + " ruedas");
    }
}
