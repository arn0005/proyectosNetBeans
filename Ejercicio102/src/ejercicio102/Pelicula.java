/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio102;

/**
 *
 * @author angel.ruiz
 */
public class Pelicula extends Multimedia {
    
    private String actorPrincipal;
    private String actrizPrincipal;
    
    public Pelicula(String title, String format, double length, String actorP, String actrizP) {
        super(title, format, length);
        this.actorPrincipal = actorP;
        this.actrizPrincipal = actrizP;
    }
    
    public String getActorPrincipal() {
        return actorPrincipal;
    }
    
    public String getActrizPrincipal() {
        return actrizPrincipal;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nActor principal: " + actorPrincipal + "\nActriz principal: " + actrizPrincipal;
    }

    /* public boolean equals(Pelicula otraPelicula) {
        return super.equals(otraPelicula) && (this.actorPrincipal.equals(otraPelicula.actorPrincipal)) && (this.actrizPrincipal.equals(otraPelicula.actrizPrincipal));
    }*/
    public boolean equals(Pelicula otraPelicula) {
        if (super.equals(otraPelicula) && this.actorPrincipal == otraPelicula.actorPrincipal && this.actrizPrincipal == otraPelicula.actrizPrincipal) {
            return true;
        } else {
            return false;
        }
    }
}
