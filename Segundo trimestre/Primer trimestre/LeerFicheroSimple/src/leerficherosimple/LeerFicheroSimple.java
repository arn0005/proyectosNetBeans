/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leerficherosimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroSimple {

    public static void main(String[] args) {
        File fichero = new File("aurora.txt");
        try {

            FileReader lector = new FileReader(fichero);
            BufferedReader lectorBuffered = new BufferedReader(lector);
            String linea = lectorBuffered.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea=lectorBuffered.readLine();
            }
            lectorBuffered.close();
            lector.close();
        } catch (IOException ex) {
            System.err.println("Se ha producido un error al tratar de abrir el archivo especificado");
            System.err.println(ex.getMessage());
        }
        System.out.println("Se ha abierto el fichero");

    }

}
