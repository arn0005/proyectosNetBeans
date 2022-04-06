/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author angel.ruiz
 */
public class Flecha {

    private int longitud; // Se muestra en centimetros
    private int material; //1-Hierro 2-Piedra 3-Hueso

    public Flecha(int longitud, int material) { // Para crear una flecha he de indicar su longitud y material
        this.longitud = longitud;
        this.material = material;
    }

    public Flecha() { // Si no indico sus propiedades entonces mide 56cm y es de piedra
        this.longitud = 56;
        this.material = 2;
    }

    public void cambiarPunta(int material) { // Metodo setter para cambiar la punta
        this.material = material;
    }

    @Override
    public String toString() {
        String toMaterial = "";
        if (this.material == 1) { // Si el material es 1 entonces es de hierro
            toMaterial = "hierro";
        }
        if (this.material == 2) { // Si el material es 2 entonces es de piedra
            toMaterial = "piedra";
        }
        if (this.material == 3) { // Si el material es 3 entonces es de hueso
            toMaterial = "hueso";
        }
        return "Flecha de " + this.longitud + "ctms con punta de " + this.material;
    }

}
