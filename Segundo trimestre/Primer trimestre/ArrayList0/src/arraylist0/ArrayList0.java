/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author angel.ruiz
 */
public class ArrayList0 {

    /*
    1. Crear arraylist de 100 elementos
    2. Cada elemento es aleatorio entre 1/100
    3. Mostrar el mayor elemento
    4. Mostrar el menor elemento
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        int aleatorio;
        int mayor = 0;
        int menor = 101;
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            aleatorio = random.nextInt(100) + 1;
            numeros.add(aleatorio);
        }
        mayor = Collections.max(numeros);
        menor = Collections.min(numeros);
        System.out.println(numeros);
        System.out.println("El numero mayor es " + mayor);
        System.out.println("El numero menor es " + menor);
    }
}
