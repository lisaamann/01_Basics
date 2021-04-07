package at.la.cc.basics;

import java.util.Random;

public class Zufallszahl2 {
    public static void main(String1[] args) {
        //Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int RandomNummer = random.nextInt(100);
        Random random1 = new Random();
        int RandomNummer1 = random1.nextInt(100);

        System.out.println(RandomNummer + " " + "Zufallszahl1");
        System.out.println(RandomNummer1 + " " + "Zufallszahl2");

        //Wenn die erste Zahl kleiner ist als die zweite UND die zweite Zahl kleiner ist als 50, dann gib aus "Zahl 1 ist kleiner als Zahl 2 Mini"
        //Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30 dann gib aus "Eine der beiden ist kleiner als 30"
        //Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist dann gib aus "Eerste Zahl klein, zweite kein 50iger"
        if (RandomNummer < RandomNummer1){
            System.out.println("Zahl 1 ist kleiner als Zahl 2 Mini");
        }if (RandomNummer < 30 || RandomNummer1 < 30){
            System.out.println("Eine der beiden ist kleiner als 30");
        }if (RandomNummer < 50 && RandomNummer1 != 50){
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        };
    }

}
