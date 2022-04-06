/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revolver;

import java.util.ArrayList;

/**
 *
 * @author angel.ruiz
 */
public class Revolver {

    private String marca;
    private String modelo;
    private ArrayList<Bala> tambor = new ArrayList<Bala>();
    Bala bala1 = new Bala();
    tambor.add(Bala);

    public Revolver(String marca, String modelo, ArrayList tambor) {
        this.marca = marca;
        this.modelo = modelo;
        this.tambor = tambor;
    }

}
