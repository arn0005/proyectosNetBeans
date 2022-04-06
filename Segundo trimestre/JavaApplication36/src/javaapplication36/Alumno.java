/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication36;

/**
 *
 * @author angel.ruiz
 */
public class Alumno {

    //Atributos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String grupo;
    private String DNI;

    //Constructores
    public Alumno(String nombre, String apellido1, String apellido2, String grupo, String DNI) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.grupo = grupo;
        this.DNI = DNI;
    }

    public Alumno(String nombre, String apellido, String grupo, String DNI) {
        this.apellido2 = "";
        this.grupo = "";

    }

}
