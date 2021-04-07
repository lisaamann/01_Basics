package at.la.cc.basics;

public class Array1 {
    public static void main(String1[] args) {
        //Erstelle ein Array von 10 ganzen Zahlen.
        //Gehe das Array in einem Loop durch und berechne die Summe!
        int[] zahl = {2, 5, 8, 7, 10, 12, 14, 17, 3, 4};
        int summe = 0;

        for (int i = 0; i < 10; i++) {
            int ausgabe = zahl[i];
            System.out.println(ausgabe);
            summe += zahl[i];
            System.out.println(summe);

        }
    }
}
