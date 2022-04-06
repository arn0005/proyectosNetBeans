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
public class Señal {

    private String nombre;
    private String tipo; // Quinetica, fuego, viento e hipnotica
    double daño; // Visibilidad por defecto
    private double energia; // Tendra decimales
    private int nivel;
    Random random = new Random();

    public Señal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = 1; // Por defecto la señal empieza por nivel 1
        this.energia = random.nextInt(15 - 5) + 10 * this.nivel / 10; // La energia es el resultado de multiplicar un num entre 5 y 15 por la division del nivel entre 10
        if (tipo.equalsIgnoreCase("fuego") | tipo.equalsIgnoreCase("viento") | tipo.equalsIgnoreCase("quinetica")) { // APARTADO B
            this.tipo = tipo;
        } else {
            this.tipo = "hipnotica";
        }
        if (tipo.equalsIgnoreCase("fuego")) { // Si es tipo fuego
            this.daño = random.nextDouble((100 - 50) + 50) * this.nivel / 100;
        }
        if (tipo.equalsIgnoreCase("viento")) { // Si es tipo viento
            this.daño = random.nextDouble((50 - 25) + 25) * this.nivel / 100;
        }
        if (tipo.equalsIgnoreCase("hiptonica") || tipo.equalsIgnoreCase("quinetica")) { // Si es hipnotica o quinetica el daño es 0
            this.daño = 0;
        }
    }

    public double getEnergia() {
        return energia;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() { // Metodo toString
        return "Señal: " + this.nombre + "\nTipo: " + this.tipo + "\nNivel: " + this.nivel + "\nDaño: " + this.daño + "\nConsume: " + this.energia + " punto/s";
    }

}
