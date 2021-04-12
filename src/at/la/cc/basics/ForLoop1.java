package at.la.cc.basics;

public class ForLoop1 {
    public static void main(String[] args) {
        //Zähle in einem For-Loop die Zahlen von 1 bis 100 (inklusive) zusammen
        int ergebnis = 0;

        for (int zahl = 1; zahl < 101; zahl++) {

           ergebnis = zahl;
        }
        System.out.println(ergebnis);
    }
}
