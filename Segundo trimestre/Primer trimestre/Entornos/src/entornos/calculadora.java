/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos;

/**
 *
 * @author angel.ruiz
 */
public class calculadora {

    double num1;
    double num2;

    double suma() {
        double s = num1 + num2;
        return s;
    }

    double resta() {
        double s = num1 - num2;
        return s;
    }

    double multi() {
        double s = num1 * num2;
        return s;
    }

    double div() {
        double s = num1 / num2;
        return s;
    }

    double pot() {
        double s = Math.pow(num1, num2);
        return s;
    }
}
