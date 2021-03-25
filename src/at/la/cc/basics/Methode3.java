package at.la.cc.basics;

import java.util.Random;
import java.util.Scanner;

public class Methode3 {
    public static void main(String[] args) {
        //eine Primzahl ist durch sich selber oder durch eins teilbar. Beispiel 14 ist durch sich selbst und durch 1 teilbar aber auch durch andere Zahlen wie 7.
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eingeben");
        int eingabe = sc.nextInt();
        System.out.println(primzahl(eingabe));

        double eingabe2 = sc.nextDouble();

        System.out.println(teilbarDurchDrei(eingabe2));

        int a = 3;
        int b = 8;
        System.out.println("Zwischenzahl");
        System.out.println(zwischenZahl(a, b));
        int irgendeinenummber = 561265416;
        System.out.println("Die Randomnummer lautet: " + random(irgendeinenummber));

        //Eine Funktion die mir zurückgibt ob eine Zahl eine Primzahl ist oder nicht.
    }
    public static boolean primzahl(int a){
        boolean isPrim = true;
        int teiler = 2;
        double result = a % teiler;
        boolean beenden = true;

        while (beenden){
            if (result == 0){
                System.out.println("Es ist keine Primzahl");
                isPrim = false;
                beenden = false;
            }else if ((teiler * teiler) > a){
                System.out.println("Es ist eine Primzahl");
                isPrim = true;
                beenden = false;
            }
            teiler = teiler + 1;
        }

        return isPrim;
    }

    //Eine Funktion, dir mir zurückgibt ob eine Zahl durch 3 teilbar ist.
    //Module braucht den double weil er ein Komma braucht. Mit int und eingabe 10 ist ergebins 1,0 und Modulo prüft nur nach dem Komma

    public static double teilbarDurchDrei(double a) {
        int teiler = 3;
        double result = a % teiler;

        if (result == 0) {
            System.out.println("ist teilbar");
        } else {
            System.out.println("ist nicht teilbar");
        }
        return result;
    }

    //Eine Funktion, der ich 2 Werte mitgebe. Die Funktion berechnet die Summe aller Zahlen die dazwischen liegen. (also z.B. input ist 3 und 8, das Ergebnis ist dann 3 + 4 + 5 + 6 + 7 + 8)

    public static int zwischenZahl(int a, int b){
        int summe = 0;
        for (int i = a; i <= b; i++) {
            summe = summe + i;

        }return summe;
    }

    //Eine Funktion, die mir eine Zufallszahl zw. 100 und 500 zurückliefert.

    public static int random(int a){
        Random nr = new Random();
        a = nr.nextInt(500-100)+100;
        return a;
    }

}
