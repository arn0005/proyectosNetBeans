/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author angel.ruiz
 */
public class CuentaCorriente {

    //Apartado C: saldo y limite no pueden ser modificados fuera de la clase
    private double saldo = 0;
    private double limiteDescubierto = -100;

    public String nombre;

    //El DNI no puede ser consultado fuera de la clase, creare un metodo getter para poder hacerlo
    private String DNI;

    //Banco no puede ser modificado ni mostrado
    private static final String banco = "Sr Hormiga Bank";
    
    //Creo las variables para poder retirar e ingresar dinero
    private double retirarDinero;
    private double ingresarDinero;

    //Apartado A
    //Creo el constructor de cuentas, necesitaremos especificar el nombre y DNI
    public CuentaCorriente(String nombre, String DNI) {
        this.saldo = saldo; //El saldo de la cuenta será el especificado fuera, 0
        this.limiteDescubierto = limiteDescubierto; // El limite del descubierto sera el especificado fuera, -100
        this.nombre = nombre; //El nombre de la cuenta sera el que hemos introducido para crear la cuenta
        this.DNI = DNI; //Lo mismo sucede con el DNI
    }

    //Creo el metodo para sacar dinero de la cuenta y quiero que me devuelva un double
    public double sacarDinero(double retirarDinero) {
        //Si el saldo actual menos la cantidad a retirar es menos que -100
        if (this.saldo - retirarDinero < limiteDescubierto) {
            return 0; //No devuelve nada
        } else { //Si no
            //El saldo actual equivale al saldo menos la cantidad que se quiere retirar
            this.saldo = this.saldo - retirarDinero;
            return this.retirarDinero; //Y devuelve la cantidad retirada
        }
    }

    //Creo el metodo para ingresar dinero y quiero que me devuelva un double
    public double ingresarDinero(double ingresarDinero) {
        if (ingresarDinero <= 0) { //Si la cantidad que quiero ingresar es negativa
            return 0; //Entonces no se ingresa nada
        } else {
            this.saldo = this.saldo + ingresarDinero; //El saldo actual es igual al saldo que queda + la cantidad a ingresar
            return this.ingresarDinero; //Devuelvo la cantidad ingresada
        }
    }

    //Creo el metodo toString para poder mostrar la informacion en el main
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nDNI: " + this.DNI + "\nBanco: " + this.banco + "\nSaldo actual: " + this.saldo + "\nLímite descubierto posible: " + this.limiteDescubierto+"\n============";
    }

    //Apartado B
    //Con este constructor podre crear una cuenta indicando solamente el saldo
    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
        this.limiteDescubierto = 0;
        this.nombre = "SIN DATOS";
        this.DNI = "SIN DATOS";

    }

    //Apartado B
    //Con este constructor podre crear cuentas indicando saldo, limite y DNI
    public CuentaCorriente(double saldo, double limiteDescubierto, String DNI) {
        this.saldo = saldo;
        this.limiteDescubierto = limiteDescubierto;
        this.DNI = DNI;
        this.nombre = "SIN DATOS";
    }

    //Apartado C: creo el getter de saldo para poder consultar la propiedad
    public double getSaldo() {
        return this.saldo;
    }

    //Apartado D: Creo el constructor copia
    public void CuentaCopia(CuentaCorriente copia) {
        this.saldo = copia.saldo;
        this.limiteDescubierto = copia.limiteDescubierto;
        this.DNI = copia.DNI;
        this.nombre = copia.nombre;
    }

    //Apartado E: Establecer limite descubierto de la cuenta
    public void setLimiteDescubierto(double limiteDescubierto) {
        this.limiteDescubierto = limiteDescubierto;
    }

}
