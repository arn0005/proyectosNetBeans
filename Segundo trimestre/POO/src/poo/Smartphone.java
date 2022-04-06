package poo;

/**
 *
 * @author angel.ruiz
 */
public class Smartphone {

    /*Por defecto indico la privacidad privada en todos los atributos
    aunque no se especifica cual nos pide*/
    private double tamaño;
    private String marca;
    private String modelo;
    private int memoriaRAM;
    private double almacenamiento;
    private double peso = 133.3; //El peso de los telefonos sera 133.3g
    private int camara = 12; //La camara tiene 12 megapixeles
    private Boolean encendido = false; //Por defecto el telefono va a estar apagado

    /* De cada smartphone se necesita saber el tamaño, marca, modelo, RAM y el almacenamiento */
    public Smartphone(double tamaño, String marca, String modelo, int memoriaRAM, double almacenamiento) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
    }

    public void encenderSmartphone() {
        if (encendido == true) { // Si ya estaba encendido, nos manda un error por pantalla
            System.out.println("Error: El teléfono ya estaba encendido");
        } else { //En caso contrario, nos lo enciende y manda la informacion del tlf.
            encendido = true;
            System.out.println("Encendiendo... \nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nAlamcenamiento disponible: " + this.almacenamiento);
        }
    }

    public void apagarSmartphone() {
        if (encendido == false) { //Si el telefono ya se encontraba apagado
            System.out.println("Error: El telefono ya estaba apagado"); //Nos da un mensaje de error y no hace nada
        } else { //Sin embargo si estaba encendido, nos lo apaga y nos avisa con un mensaje
            encendido = false;
            System.out.println("Se ha apagado el telefono");
        }
    }
}
