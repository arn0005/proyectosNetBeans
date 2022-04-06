/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruiz_nadal_angel_e2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author angel.ruiz
 */
public class Ruiz_Nadal_Angel_E2 {

    /*
Usando numeros.txt, leer el los numeros del archivo
a) muestra mayor y menor
b) calcular la media de todos
     */
    public static void main(String[] args) {
        String numeros = "numeros.txt";
        String linea = "";
        try { //Creo try para leer los archivos sin errores
            File archivo = new File(numeros);
            FileReader lector = new FileReader(archivo);
            BufferedReader bLector = new BufferedReader(lector);

            linea = bLector.readLine();

            while (linea != null) { //Mientras hayan lineas
                

            }

            bLector.close(); //Cierro los lectores
            lector.close();

        } catch (IOException ex) { //Si hubiese un error con los archivos mandaria el error
            System.err.println("Error en la apertura del archivo");
            System.err.println(ex.getMessage());
        }

    }

}
