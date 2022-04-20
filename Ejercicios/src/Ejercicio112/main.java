package Ejercicio112;

public class main {

    public static void main(String[] args) {
        Nota do1 = new Nota("do", 1);
        Nota do2 = new Nota("do", 2);
        Nota do3 = new Nota("do", 3);
        Nota do4 = new Nota("do", 4);
        Nota do5 = new Nota("do", 5);
        Nota do6 = new Nota("do", 6);
        Nota do7 = new Nota("do", 7);

        Partitura partitura1 = new Partitura("Partitura num1", "Angel");
        partitura1.addNota(do1);
        partitura1.addNota(do2);
        partitura1.addNota(do3);
        partitura1.addNota(do4);
        partitura1.addNota(do5);
        partitura1.addNota(do6);
        partitura1.addNota(do7);

        System.out.println(partitura1.toString());
        
    }

}
