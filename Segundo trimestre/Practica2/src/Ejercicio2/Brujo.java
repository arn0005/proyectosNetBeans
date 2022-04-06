/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.*;

/**
 *
 * @author angel.ruiz
 */
public class Brujo {

    private String nombre; // Propiedades del brujo
    private int edad;
    private String lugarNacimiento;
    private Señal señal;
    private double magia;
    Random random = new Random(); // Añado el random

    public Brujo(String nombre, String lugarNacimiento, Señal señal) {
        this.nombre = nombre;
        this.lugarNacimiento = lugarNacimiento;
        this.señal = señal;
        this.edad = random.nextInt(55 - 18) + 18; // Edad aleatoria entre 18 y 55 años
        this.magia = random.nextDouble(180 - 90) + 90; // Cantidad entre 90 y 180
    }

    // Metodo para atacar 
    public String conjurar(Brujo brujoAtacante, Brujo brujoVictima) {
        String mensajeAtaque;

        // Si el brujo atacante tiene suficiente magia para conjurar el ataque
        if (brujoAtacante.magia < brujoAtacante.señal.getEnergia()) {
            brujoAtacante.magia -= brujoAtacante.señal.getEnergia();
            mensajeAtaque = this.nombre + " ha lanzado la señal" + brujoAtacante.señal.getNombre() + "...";
            mensajeAtaque += brujoVictima.nombre + " ha recibido " + brujoAtacante.señal.daño + " puntos de daño";
        } else { // Si no tiene suficiente energia
            mensajeAtaque = this.nombre + " no puede lanzar su señal!!!";
        }
        return mensajeAtaque;
    }

    @Override
    public String toString() { // Metodo toString
        return "Este brujo es " + this.nombre + " de " + this.lugarNacimiento + ". Tiene " + this.edad + " años y " + this.magia + " puntos de magia. \nUtiliza la señal: \n" + this.señal.toString() + "\n";
    }

}
