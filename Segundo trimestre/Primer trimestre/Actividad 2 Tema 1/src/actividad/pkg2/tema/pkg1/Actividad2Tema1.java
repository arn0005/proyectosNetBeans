/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg2.tema.pkg1;

import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Actividad2Tema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1: Que pida al usuario un nombre, DNI y fecha de nacimiento
        2: Que muestre esa información de forma ordenada
        */
        String nombre;
        String DNI;
        String fecha_nacimiento;
        System.out.println("Escriba su nombre: ");
        System.out.println("Escriba su DNI: ");
        System.out.println("Escriba su fecha de nacimiento: ");
        Scanner lector = new Scanner(System.in);
        nombre = lector.nextLine();
        DNI = lector.nextLine();
        fecha_nacimiento = lector.nextLine();
        System.out.println("Nombre:..... " + nombre );
        System.out.println("DNI:..... " + DNI );
        System.out.println("Fecha de nacimiento:..... " + fecha_nacimiento );
        
    }
    
}
