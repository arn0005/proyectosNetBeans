
package javaapplication52;

public class Persona {
    protected String nombre;
    protected int edad;
    private boolean sexo; //0-M 1-F

/*
    public Persona(){
        this.nombre = "Paula";
        this.edad = 1;
        this.sexo = true;
    }
*/
    
    public Persona(String name, int age, boolean sex){
        this.nombre = name;
        this.edad = age;
        this.sexo = sex;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Sexo: "+this.sexo);
    }
}

