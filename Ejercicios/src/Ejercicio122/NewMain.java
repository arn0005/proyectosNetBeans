package Ejercicio122;

public class NewMain {

    public static void main(String[] args) throws Exception {
        try {
            Gato g1 = new Gato("Gatito 1", 3);
            g1.setNombre("ga");
            g1.setEdad(-1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
