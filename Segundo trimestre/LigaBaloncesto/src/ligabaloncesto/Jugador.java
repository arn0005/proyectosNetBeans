package ligabaloncesto;

public class Jugador { //La clase jugador va a tener estos atributos

    private String nombre;
    private String apellido2;
    private int dorsal;
    private posicion posicion;

    //Constructor: Los jugadores tendrán estos atributos
    public Jugador(String nombre, String apellido2, int dorsal, posicion posicion) {
        this.nombre = nombre;
        this.apellido2 = apellido2;
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    //Constructor: Los jugadores sin dorsal tendrán el 0 y sin posicion será null
    public Jugador(String nombre, String apellido2) {
        this.dorsal = 0;
        this.posicion = null;
        this.nombre = nombre;
        this.apellido2 = apellido2;
    }

    //Getter
    public String getNombre() {
        return this.nombre;
    }

    //Setter: si el nombre esta vacio entonces se llamara desconocido
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            this.nombre = "DESCONOCIDO";
        } else {
            this.nombre = nombre;
        }
    }

    //Setter: si el apellido esta vacio entonces se apellida desconocido
    public void setApellido2(String apellido2) {
        if (apellido2 == null || apellido2.isEmpty()) {
            this.apellido2 = "DESCONOCIDO";
        } else {
            this.apellido2 = apellido2;
        }
    }

    //Setter: si el dorsal es menor que 5 y mayor que 100, vale 0
    public void setDorsal(int dorsal) {
        if (this.dorsal < 0 && this.dorsal > 100) {
            dorsal = 0;
        }
        this.dorsal = dorsal;
    }

    public void setPosicion(char posicion) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\n" + "Apellido: " + this.apellido2 + "\n" + "Num. dorsal: " + this.dorsal + "\n" + "Posición: " + this.posicion + "\n";
    }
}
