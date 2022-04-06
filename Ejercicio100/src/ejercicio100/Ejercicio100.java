/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio100;

/**
 *
 * @author angel.ruiz
 */
public class Ejercicio100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado E1 = new Empleado("Jaime");
        Directivo D1 = new Directivo("Carmelo");
        Operario OP1 = new Operario("Jose", 34);
        Oficial OF1 = new Oficial("David", 123);
        Tecnico T1 = new Tecnico("Rafa", 986);
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);
    }

}
