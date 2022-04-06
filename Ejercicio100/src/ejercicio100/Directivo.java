/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio100;

/**
 *
 * @author angel.ruiz
 */
public class Directivo extends Empleado {

    public Directivo(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Soy " + getNombre() + ", directivo de la empresa";
    }

}
