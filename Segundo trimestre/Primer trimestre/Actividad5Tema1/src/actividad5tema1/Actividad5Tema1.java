/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad5tema1;

import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Actividad5Tema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1: Que pida un tiempo en segundos
        2: Que muestre las horas
        3: Que muestre los minutos
        4: Que muestre los segundos
        */
        int tiempo;
        double segundos;
        double minutos;
        int horas;
        Scanner lectorSegundos = new Scanner(System.in);
        System.out.println("Escriba un tiempo expresado en segundos");
        tiempo = lectorSegundos.nextInt();
        segundos = tiempo % 60;
        minutos = (tiempo / 60) % 60;
        horas = (tiempo /60 /60);
        System.out.println ( tiempo + " segundos que corresponden a " + segundos + " segundos ");
        System.out.println ( minutos + " minutos ");
        System.out.print ( horas + " horas" );
        
    }
}
