/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio100;

/**
 *
 * @author angel.ruiz
 */
public class Tecnico extends Operario {

    public Tecnico(String name, int codeTrabajador) {
        super(name, codeTrabajador);
    }

    @Override
    public String toString() {
        return "Soy el técnico " + getNombre() + " con el código " + getCodigoTrabajador();

    }
}
