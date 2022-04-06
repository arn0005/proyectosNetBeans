/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruiz_nadal_angel_e3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Ruiz_Nadal_Angel_E3 {

    /*
    copiar cien.txt a otro que se indique por scanner
se indicara en que archivo se ha copiado
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //añado scanner
        String nombreFichero = "cien.txt"; //Creo los string para los archivos que abrire
        String nombreFichero2 = "";
        String linea = "";

        System.out.println("Se va a copiar el contenido del archivo cien.txt");
        System.out.print("Introduce el nombre del fichero destino: ");
        nombreFichero2 = teclado.next(); //Leo que archivo quiero crear
        try { //Creo el try para empezar a escribir en los archivos sin errores
            File fichero = new File(nombreFichero); //Abro el primer archivo
            FileReader lector = new FileReader(fichero); //Leo el archivo
            BufferedReader bLector = new BufferedReader(lector);

            File ficheroSalida = new File(nombreFichero2); //Abro el segundo archivo especificado
            FileWriter escritor = new FileWriter(ficheroSalida);
            BufferedWriter bufferEscritura = new BufferedWriter(escritor);

            linea = bLector.readLine(); //Leo las lineas
            while (linea != null) { //Mientras no acaben las lineas, sigue leyendo
                String[] campos = linea.split("");
            }
            bufferEscritura.close(); //Cierro los lectores y escritores
            bLector.close();
            lector.close();
        } catch (IOException ex) { //Si hubiese un error con los archivos mandaria el error
            System.err.println("Error en la apertura del archivo");
            System.err.println(ex.getMessage());
        }

    }

}
