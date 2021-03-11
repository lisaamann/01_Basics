package at.la.cc.basics;

import java.util.Scanner;

public class Bankomat {
    private static Scanner scanner = new Scanner(System.in);
    private static Object String;
    private static int kontostand = 1000;

    public static void main(String[] args) {
        boolean istFertig = false;

        while (!istFertig) {
            System.out.println("Bitte wählen Sie aus dem Menü");

            int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Bitte wählen Sie den Betrag den Sie einzahlen möchten");
                int einzahlung = scanner.nextInt();
                int neuerKontostand = kontostand + einzahlung;
                System.out.println("Ihr neuer Kontostand beträgt: " + neuerKontostand + "€");
                System.out.println("Möchten Sie weitere Einzahlungen vornehmen?");
                int weiterEinzahlung = scanner.nextInt();
                if (weiterEinzahlung == 1) ;
                System.out.println("Bitte wählen Sie den Betrag den Sie einzahlen möchten");
                int einzahlung2 = scanner.nextInt();
                int neuerKontostand2 = neuerKontostand + einzahlung2;
                System.out.println("Ihr neuer Kontostand beträgt: " + neuerKontostand2 + "€");
                if (weiterEinzahlung == 2) ;
                System.out.println("Vielen Dank, ich leite Sie zurück ins Hauptmenü");
            } else if (input == 2) {
                System.out.println("Wieviel Geld wollen Sie abheben?");
                int auszahlung = scanner.nextInt();
                if (kontostand > auszahlung) {
                    System.out.println("Sie erhalten in Kürze " + auszahlung + "€");
                } else if (kontostand < auszahlung) {
                    System.out.println("Das Limit ist überschritte, wählen Sie einen anderen Betrag");
                }
            } else if (input == 3) {
                System.out.println("Ihr Kontostand beträgt: " + kontostand);
            } else if (input == 4) {
                System.out.println("Vielen Dank und aufwiedersehen.");
                istFertig=true;
            }
        }

    }
}