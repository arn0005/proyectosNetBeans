/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.*;

/**
 *
 * @author angel.ruiz
 */
public class Arco {

    private int longitud; // En cm
    private int peso; // En gramos
    private int material; // 1-Madera, 2-Metal, 3-Fibra
    private Flecha[] carcaj; // Creo un array para representar el carcaj
    private int capacidadCarcaj; // Variable para definir la capacidad maxima del carcaj en el constructor
    Random random = new Random(); // Añado el random para la longitud aleatoria

    public Arco(int material, int capacidadCarcaj) {
        this.material = material; // Dependiendo del material se define el peso y longitud
        if (this.material == 1) {
            this.longitud = 900;
            this.peso = 300;

        }
        if (this.material == 2) {
            this.longitud = 750;
            this.peso = 530;

        }
        if (this.material == 3) {
            this.longitud = 1100;
            this.peso = 100;
        }
        this.capacidadCarcaj = capacidadCarcaj;
    }

    public void disparar() { // Creo el metodo necesario para disparar
        Boolean disparo = false; // Con el boolean hago que el disparo solo se haga 1 vez recorriendo el bucle for
        for (int i = 0; i < carcaj.length || disparo == true; i++) { // Recorro el array hasta que se recorra todo el carcaj o se haga un disparo
            if (carcaj[i] != null) { // Si no está vacio se hace un disparo y cambio disparo a true, se detiene el bucle
                System.out.println("Se ha disparado una flecha ");
                carcaj[i] = null; // Vacio la flecha de la posicion del array
                disparo = true;
            }
        }
    }

    public void recargar() { // Creo el metodo para recargar flechas con longitud y material random
        for (int i = 0; i < carcaj.length - 1; i++) {
            int size = random.nextInt(60 - 40) + 20;
            int tipoFlecha = random.nextInt(3 - 1) + 1;
            this.carcaj[i] = new Flecha(size, tipoFlecha);
        }
    }

}
