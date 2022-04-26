package Ejercicio120;

public class principal {

    public static void main(String[] args) throws Exception {
        try {
            System.out.println(new Impar(24));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
