/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligabaloncesto;

/**
 *
 * @author angel.ruiz
 */
public class Entrenador extends Persona {

    private String nacionalidad;

    public Entrenador(String nombre, String apellido1, String apellido2, String nacionalidad) {
        super(nombre, apellido1, apellido2);
        setNacionalidad(nacionalidad);
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    

    @Override
    public String toString() {
        return "nombre=" + this.getNombre() + "\n" + "apellido1=" + this.getApellido1() + "\n" + "apellido2=" + this.getApellido2() + "\n" + "nacionalidad=" + getNacionalidad() + "\n";
    }

}
