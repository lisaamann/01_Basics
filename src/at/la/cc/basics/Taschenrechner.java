package at.la.cc.basics;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String1[] args) {
        double zahl1, zahl2, ergebnis;
        String1 operator;
        Scanner scannerVariable = new Scanner(System.in);
        Scanner scannerOperator = new Scanner(System.in);

        System.out.println("Erste Zahl bitte.");
        zahl1 = scannerVariable.nextDouble();

        System.out.println("Zweite Zahl bitte.");
        zahl2 = scannerVariable.nextDouble();
        ergebnis = zahl1 + zahl2;
        System.out.println("Das Ergebnis ist: " + ergebnis);
    }

    ;

}
