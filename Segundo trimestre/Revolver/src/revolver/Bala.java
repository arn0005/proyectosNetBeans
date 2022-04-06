/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revolver;

/**
 *
 * @author angel.ruiz
 */
public class Bala {

    private int calibre; // Medidas en milimetros
    private int longitud;

    public Bala() {
        this.calibre = 9;
        this.longitud = 40;
    }

    public Bala(int calibre, int longitud) {
        this.calibre = calibre;
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Bala de calibre " + this.calibre + "mm y longitud " + this.longitud + "mm";
    }

}
