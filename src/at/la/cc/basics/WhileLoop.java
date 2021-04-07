package at.la.cc.basics;

import java.util.Random;

public class WhileLoop {
    public static void main(String1[] args) {
        //Erstelle ein Programm dass Zufallszahlen zwischen 10 und 30 generiert.
        //Das Programm soll die Zufallszahlen zusammenzählen.
        //Sobald die Zahl 15 oder 25 kommt wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben.
        Random random = new Random();
//        int min = 10;
//        int max = 30;
        int ergebnis = 0;
        boolean isFinished = false;

        while (!isFinished) {

            int randomNumber = random.nextInt(30 - 10) + 10;
            System.out.println("Nr.: " + randomNumber);
            ergebnis = ergebnis + randomNumber;
            if (randomNumber == 15 || randomNumber == 25) {
                ergebnis = ergebnis - randomNumber;
                isFinished = true;
                System.out.println("Endergebnis: " + ergebnis);
            }

        }


    }
}
