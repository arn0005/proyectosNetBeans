package Ejercicio122;

public class Gato {

    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws ExceptionGato {
        if (nombre.length() < 3) {
            throw new ExceptionGato("El nombre del gato debe tener al menos 3 caracteres");
        } else {
            this.nombre = nombre;
        }
        if (edad < 0) {
            throw new ExceptionGato("No puedes ponerle una edad negativa");
        } else {
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ExceptionGato {
        if (nombre.length() < 3) {
            throw new ExceptionGato("El nombre del gato debe tener al menos 3 caracteres");
        } else {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ExceptionGato {
        if (edad < 0) {
            throw new ExceptionGato("El gato no puede tener edad negativa");
        } else {
            this.edad = edad;
        }
    }

    @Override
    public String toString() {
        return "El gatito " + this.nombre + " tiene " + this.edad + " anios de edad";
    }

}
