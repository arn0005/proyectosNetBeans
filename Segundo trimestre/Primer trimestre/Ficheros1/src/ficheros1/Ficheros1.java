/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Ficheros1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Abro los ficheros

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba nombre de fichero (si no indicada nada aurora.txt): ");
        String queArchivo = sc.nextLine();

        if (queArchivo.equals("")) {
            queArchivo = "aurora.txt";
        }
        File fichero = new File(queArchivo);
        try {
            FileReader lector = new FileReader(fichero);
            BufferedReader lectorBuffered = new BufferedReader(lector);
            String linea = lectorBuffered.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = lectorBuffered.readLine();
            }
            lectorBuffered.close();
            lector.close();
        } catch (IOException ex) {
            System.err.println("Se ha producido un error con el archivo");
            System.err.println(ex.getMessage());
        }
    }
}
