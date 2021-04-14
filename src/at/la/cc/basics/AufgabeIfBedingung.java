package at.la.cc.basics;

import java.util.Random;

public class AufgabeIfBedingung {
    public static void main(String[] args) {
        //Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int RandomNummer = random.nextInt(100);

        //gib die Zufallszahl aus
        System.out.println(RandomNummer);

        //Wenn die Zahl kleiner ist als 20, gibt aus "Mini"
        //Wenn die Zahl zwischen 20 und 50 ist gib aus "Medium"
        //Wenn die Zahl größer als 50 ist gib aus "Large"
        if (RandomNummer < 20){
            System.out.println("Mini");
        }if (RandomNummer >= 50){
            System.out.println("Large");
        }if ((RandomNummer >20) && (RandomNummer <50)){
            System.out.println("Medium");

        };




    }
}
