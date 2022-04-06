/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio100;

/**
 *
 * @author angel.ruiz
 */
public class Empleado {

    private String nombre;

    public Empleado(String name) {
        this.nombre = name;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Soy el empleado " + nombre;
    }

}
