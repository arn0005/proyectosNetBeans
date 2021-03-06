/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author angel.ruiz
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Scanner lectorC = new Scanner(System.in);
        String comando = "";
        double num1;
        double num2;
        boolean operacion = true;
        boolean incorrecto = true;
        while (operacion == true) {
            System.out.print("Introduzca comando: ");
            while (incorrecto == true) {
                comando = lectorC.nextLine();
                if (comando.equals("SUM")
                        || comando.equals("RES")
                        || comando.equals("MUL")
                        || comando.equals("DIV")
                        || comando.equals("POT")
                        || comando.equals("HELP")
                        || comando.equals("R2")
                        || comando.equals("MAY")
                        || comando.equals("MIN")
                        || comando.equals("EXIT")) {
                    incorrecto = false;
                } else {
                    System.out.println("Comando Incorrecto, escribe HELP para mas informacion");
                    System.out.print("Escribe otro comando: ");
                }
            }
            if (comando.equalsIgnoreCase("EXIT")) {
                operacion = false;
            } else if (comando.equalsIgnoreCase("SUM")) {
                System.out.print("Introduce un numero: ");
                num1 = lector.nextDouble();
                System.out.print("Dame otro numero: ");
                num2 = lector.nextDouble();
                double suma = num1 + num2;
                System.out.println("Resultado de la operacion " + num1 + " + " + num2 + " = " + suma);
                System.out.println("-----------------------------------------------------------------");
            } else if (comando.equalsIgnoreCase("RES")) {
                System.out.print("Introduce un numero: ");
                num1 = lector.nextDouble();
                System.out.print("Dame otro numero: ");
                num2 = lector.nextDouble();
                double resta = num1 - num2;
                System.out.println("Resultado de la operacion " + num1 + " - " + num2 + " = " + resta);
                System.out.println("---------------------------------------------------------------");
            }
            if (comando.equalsIgnoreCase("DIV")) {
                System.out.print("Introduce un numero: ");
                num1 = lector.nextDouble();
                System.out.print("Dame otro numero: ");
                num2 = lector.nextDouble();
                double division = num1 / num2;
                System.out.println("Resultado de la operaci??????n " + num1 + " / " + num2 + " = " + division);
                System.out.println("---------------------------------------------------------------");
            } else if (comando.equalsIgnoreCase("MUL")) {
                System.out.print("Introduce un numero: ");
                num1 = lector.nextDouble();
                System.out.print("Dame otro numero: ");
                num2 = lector.nextDouble();
                double multi = num1 * num2;
                System.out.println("Resultado de la operaci??????n " + num1 + " * " + num2 + " = " + multi);
                System.out.println("---------------------------------------------------------------");
            } else if (comando.equalsIgnoreCase("POT")) {
                System.out.print("Introduce un numero: ");
                num1 = lector.nextDouble();
                System.out.print("Dame otro numero: ");
                num2 = lector.nextDouble();
                double pot = Math.pow(num1, num2);
                System.out.println("La operacion que ha solicitado es " + num1 + " ^ " + num2 + " = " + pot);
                System.out.println("---------------------------------------------------------------");
            } else if (comando.equalsIgnoreCase("R2")) {
                System.out.print("Introduce un numero: ");
                num1 = lector.nextDouble();
                double r2 = Math.sqrt(num1);
                System.out.println("La raiz cuadrada de " + num1 + " = " + r2);
                System.out.println("---------------------------------------------------------------");
            }
            if (comando.equalsIgnoreCase("MAY")) {
                System.out.print("Introduce un numero: ");
                num1 = lector.nextDouble();
                System.out.print("Dame otro numero: ");
                num2 = lector.nextDouble();
                if (num1 > num2) {
                    System.out.println("El numero " + num1 + "es mayor que " + num2);
                    System.out.println("---------------------------------------------------------------");
                }
            }
            if (comando.equalsIgnoreCase("MIN")) {
                System.out.print("Introduce un numero: ");
                num1 = lector.nextDouble();
                System.out.print("Dame otro numero: ");
                num2 = lector.nextDouble();
                if (num2 > num1) {
                    System.out.println("El numero " + num1 + "es menor que " + num2);
                    System.out.println("---------------------------------------------------------------");
                }
            } else if (comando.equalsIgnoreCase("HELP")) {
                System.out.println("SUM, RES, DIV, MUL, POT, R2");
                System.out.println("------------------------------");
            }
            incorrecto = true;
        }
    }
}
