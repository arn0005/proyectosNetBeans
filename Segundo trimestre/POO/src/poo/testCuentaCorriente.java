/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author angel.ruiz
 */
public class testCuentaCorriente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo cuentajaime
        CuentaCorriente cuentaJaime = new CuentaCorriente("Jaime Hormiga", "23567897F");
        //Limite descubierto establecido en -50
        cuentaJaime.setLimiteDescubierto(-50);
        //Ingreso 1000 euros
        cuentaJaime.ingresarDinero(1000);
        //Saco 300€
        cuentaJaime.sacarDinero(300);
        //Muestro informacion en pantalla
        System.out.println(cuentaJaime.toString());
        cuentaJaime.sacarDinero(700); //Saco 700 y otros 200
        cuentaJaime.sacarDinero(200);

        /*Creo cuenta millonaria con 9000€
        //Creo la cuenta millonaria copiando la cuenta de jaime*/
        CuentaCorriente millonaria = new CuentaCorriente(9000);
        //Copio cuentaJaime en la cuenta millonaria
        millonaria.CuentaCopia(cuentaJaime);
        millonaria.sacarDinero(500); //Saco 500€ y muestro informacion de la cuenta
        System.out.println(millonaria.toString());
    }
}
