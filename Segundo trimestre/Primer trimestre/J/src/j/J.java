/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author angel.ruiz
 */
public class J {

    /*
    1. Crear 100 elementos con num aleatorio entre 1 y 10
    2. Recorrer arraylist y ver el numero de repeticiones de numeros
    3. Imprimir el mas aparecido y el menos
     */
    public static void main(String[] args) {

        final String coche = "coche";
        final String barco = "barco";
        HashSet<String> conjunto = new HashSet<>();
        boolean addCoche = conjunto.add(coche);
        boolean addBarco = conjunto.add(barco);
        
        //AÑADIR MEDIOS AL CONJUNTO
        conjunto.add(coche);
        conjunto.add(barco);
        
        if (conjunto.add(barco)) {
            System.out.println("Barco añadido");
        } else {
            System.out.println("Barco no añadido");
        }
        if (conjunto.add(coche)) {
            System.out.println("Coche añadido");
        } else {
            System.out.println("Coche no añadido");
        }
        System.out.println("El conjunto contiene " + conjunto.toString());

        Iterator<String> iteradorConjuntos = conjunto.iterator();

        //RECORRER CONJUNTOS
        while (iteradorConjuntos.hasNext()) {
            System.out.println(iteradorConjuntos.next());
        }
        
        //RECORRER DE OTRA FORMA
        for (String medio : conjunto) {
            System.out.println("aaaa " + medio);
        }
        
        //MAPAS
        //CREAR MAPA
        HashMap<String, String> paises = new HashMap<>();
        
        //AÑADIR PAISES AL MAPA (por ejemplo pais u otra cosa)
        paises.put("ES", "España");
        paises.put("PT", "Portugal");
        paises.put("DE", "Alemania");
        paises.put("CN", "China");
        System.out.println("El mapa de paises es " + paises);

        //MOSTRAR PARTE DEL MAPA
        String nombrePais = paises.get("ES");
        System.out.println("Pais es " + nombrePais);

        //BORRAR MAPA
        paises.remove("DE");
        System.out.println("El mapa de paises cambiado es " + paises);

    }

}
