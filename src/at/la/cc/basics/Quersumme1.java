package at.la.cc.basics;

import java.util.Random;

public class Quersumme1 {
    public static void main(String[] args) {
        //Gib alle Zahlen zwischen 0 und 1000 aus, welche eine Quersumme von 15 haben.
        //Beispiel: die Quersumme von 253 ist 2 + 5 + 3 = 10

        int zahl = 1000;//1000
        int quersumme = 15;

       while (zahl > 0){
           zahl = %zahl;
           zahl = zahl / 10;

        }


    }
}
