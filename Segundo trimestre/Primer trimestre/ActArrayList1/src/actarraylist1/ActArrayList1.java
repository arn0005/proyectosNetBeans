/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actarraylist1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author angel.ruiz
 */
public class ActArrayList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random();
        //Inicio la lista
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            numeros.add(aleatorio.nextInt(10) + 1);
        }
        System.out.println(numeros);
        int[] apariciones = new int[10];
        for (int i = 0; i < apariciones.length; i++) {
            apariciones[i] = 0;
        }
        //por cada numero que esta en numeros se suma 1 en apariciones
        for (int numero : numeros) {
            apariciones[numero - 1]++;
        }
        //En apariciones guardo cuanto ha aparecido cada numero
        int mayor = 0;
        int menor = 11;
        int aparicionesMayor = 0;
        int aparicionesMenor = 101;
        for (int i = 0; i < apariciones.length; i++) {
            if (apariciones[i] > aparicionesMayor) {
                aparicionesMayor = apariciones[i];
                mayor = i + 1;
            }
            if (apariciones[i] < aparicionesMenor) {
                aparicionesMenor = apariciones[i];
                menor = i + 1;
            }
        }
        System.out.println("El mayor es " + mayor + ", aparece " + aparicionesMayor + " veces");
        System.out.println("El menor es " + menor + ", aparece " + aparicionesMenor + " veces");
    }
}
