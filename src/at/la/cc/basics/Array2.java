package at.la.cc.basics;

import java.util.Random;

public class Array2 {
    public static void main(String[] args) {
        //Erstelle ein Array von 50 Zufallszahlen mit Werten zwischen 0 und 100.
        //Gib alle Zahlen in einem For-Loop aus und berechne gleichzeitig die Summe der Zahlen.

        Random random = new Random();
        int RandomNr = random.nextInt(100);
        int[] randomNumber = new int[50];//mit dem array merke ich mir was ich 50 mal ausgegeben habe
        System.out.println(RandomNr);

        for (int i = 0; i < 50; i++) {
            System.out.println(RandomNr);


        }
    }
}
