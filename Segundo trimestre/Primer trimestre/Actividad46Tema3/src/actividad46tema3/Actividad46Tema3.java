/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad46tema3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Actividad46Tema3 {

    public static void main(String[] args) {
        int numeroBolas;
        int bolasUsuario;
        int bolasOrdenador;
        Boolean turno;
        System.out.println("Escribe un numero natural positivo para las bolas iniciales");
        Scanner lector = new Scanner(System.in);
        numeroBolas = lector.nextInt();
        Random gen = new Random();
        turno = gen.nextBoolean();
        while (numeroBolas > 0) {

            if (turno) {
                System.out.println("¿Cuantas bolas quieres sacar entre 1 y 3?");
                bolasUsuario = lector.nextInt();
                numeroBolas = numeroBolas - bolasUsuario;
            } else {
                bolasOrdenador = gen.nextInt(3) + 1;
                numeroBolas = numeroBolas - bolasOrdenador;
                System.out.println("La maquina ha sacado " + bolasOrdenador + " bolas");
            }

            turno = !turno;
        }
        if (turno) {
            System.out.println("Has ganado, enhorabuena!");
        } else {
            System.out.println("Gana la máquina :(");
        }
    }
}
