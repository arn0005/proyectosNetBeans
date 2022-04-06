/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruiz_nadal_angel_e1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Ruiz_Nadal_Angel_E1 {

    /*
Scanner numero mayor que 3
crea numeros.txt
lo rellena con numeros entre 2 y 12 uno debajo de otro
mensaje de exito
     */
    public static void main(String[] args) {
        int n1 = 0;
        System.out.println("Escribe un numero entero mayor que 3");
        Scanner lector = new Scanner(System.in); //Scanner para introducir numero
        n1 = lector.nextInt();
        String numeros = "numeros.txt"; //El archivo se llamara numeros.txt
        Random aleatorio = new Random(); //Creo random para rellenar el arhivo
        int rellenar = 0;

        while (n1 <= 3) { //Mientras el numero introducido no sea mayor que 3
            System.out.println("Escribe un numero entero mayor que 3");
            n1 = lector.nextInt(); //Vuelve a pedir numero con un mensaje
        }

        try { //Try para poder añadir los archivos y escribir
            File archivo = new File(numeros); //Entro al archivo
            FileWriter escritor = new FileWriter(numeros); //Creo el escritor
            BufferedWriter bufferEscritor = new BufferedWriter(escritor);
            for (int i = 0; i < n1; i++) { //Recorro el archivo
                rellenar = aleatorio.nextInt(13 - 2) + 2; //Relleno con numeros entre 2 y 12
                String resultado = Integer.toString(rellenar); //Integer to string para poder escribir en el archivo y que sea legible
                bufferEscritor.write(resultado);
                bufferEscritor.newLine(); //Añado un salto de linea
            }

            bufferEscritor.close(); //Cierro los escritores
            escritor.close();

        } catch (IOException e) { //Catch por si hay algun problema
            System.err.println("Se ha producido un error con el fichero");
            System.err.println(e.getMessage());
        }

        System.out.println("fichero numeros.txt generado con exito"); //Mensaje de exito
    }

}
