package Ejercicio104;

import java.util.Random;

/**
 *
 * @author angel
 */
public class Profesor {
    
    private String nombre;
    protected Asignatura listaAsignaturas[];
    protected double horasImpartidas;
    protected boolean dandoClase;
    Random random = new Random();
    
    public Profesor(String name, int numAsignaturas) {
        this.nombre = name;
        this.listaAsignaturas = new Asignatura[numAsignaturas];
        int maxAsignaturas = random.nextInt(numAsignaturas) + 1;
        for (int i = 0; i < maxAsignaturas; i++) {
            int codigo = random.nextInt(100) + 100;
            int horas = random.nextInt(5) + 3;
            Asignatura asignatura = new Asignatura(codigo, horas);
        }
    }
}
