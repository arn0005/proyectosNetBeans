/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ligabaloncesto;

/**
 *
 * @author angel.ruiz
 */
public class LigaBaloncesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Queremos una liga con clases equipos, jugadores, torneos, partidos y arbitros*/

        //Creo un jugador
        Jugador jugador1 = new Jugador("nombre1", "apellido1", 1, posicion.Alapivot);
        Jugador jugador2 = new Jugador("nombre2", "apellido2", 2, posicion.Alero);
        Jugador jugador3 = new Jugador("nombre3", "apellido3", 3, posicion.Base);
        Jugador jugador4 = new Jugador("", "apellido4", 4, posicion.Pivot);
        Jugador jugador5 = new Jugador("nombre5", "apellido5");

        System.out.println("Jugadores: ");
        System.out.println("-------------");
        System.out.println(jugador1.toString());
        System.out.println(jugador2.toString());
        System.out.println(jugador3.toString());
        System.out.println(jugador4.toString());
        System.out.println(jugador5.toString());

        //Creo entrenadores
        Entrenador entrenador1 = new Entrenador("Angel", "Ruiz", "Nadal", "Española");
        Entrenador entrenador2 = new Entrenador("juan", "gonzalez", "asd", "Portguesa");
        Entrenador entrenador3 = new Entrenador("", "Ruiz", "Nadal", "Española");

        System.out.println("Entrenadores: ");
        System.out.println("-------------");
        System.out.println(entrenador1.toString());
        System.out.println(entrenador2.toString());
        System.out.println(entrenador3.toString());

    }
}
