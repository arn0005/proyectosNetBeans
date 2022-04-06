/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio100;

/**
 *
 * @author angel.ruiz
 */
public class Operario extends Empleado {

    private int codigoTrabajador;

    public Operario(String name, int codeTrabajador) {
        super(name);
        this.codigoTrabajador = codeTrabajador;
    }

    public int getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(int codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    @Override
    public String toString() {
        return "Soy el operario " + getNombre() + " con el código " + codigoTrabajador;
    }

}
