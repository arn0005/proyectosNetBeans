package composicion;

/**
 *
 * @author angel.ruiz
 */
public class Arbol {

    private int edad;
    private String especie;
    Hoja leafs[]; // Solo defino el array, no hago un new porque no se la longitud

    public Arbol(int age, String specie, int numHojas) {
        this.edad = age;
        this.especie = specie;
        this.leafs = new Hoja[numHojas]; // Declaro la longitud del array
        for (int i = 0; i < this.leafs.length; i++) { // Recorro el array y lo relleno con objeto Hoja
            this.leafs[i] = new Hoja();
        }

    }

    @Override
    public String toString() {
        String res = "";
        res += "Edad: " + this.edad + "\n";
        res += "Especie " + this.especie + "\n";
        for (int i = 0; i < this.leafs.length; i++) { // Muestro el toString de todos los objetos Hoja
            res += this.leafs[i].toString();
        }
        return res;
    }
}
