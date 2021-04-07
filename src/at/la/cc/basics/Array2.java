package at.la.cc.basics;

import java.util.Random;

public class Array2 {
    public static void main(String1[] args) {
        //Erstelle ein Array von 50 Zufallszahlen mit Werten zwischen 0 und 100.
        //Gib alle Zahlen in einem For-Loop aus und berechne gleichzeitig die Summe der Zahlen.

        Random random = new Random();
        int[] randomNumber = new int[50];
        int summe = 0;


        for (int i = 0; i < randomNumber.length; i++) {
            int randomNumber2 = random.nextInt(100);
            randomNumber[i] = randomNumber2;

            summe = summe + randomNumber[i];

        }
        System.out.println(summe);


        }
    }
