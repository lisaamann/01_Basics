package at.la.cc.basics;

import java.util.Scanner;

public class BankomatMethode {
    private static Scanner scanner = new Scanner(System.in);
    private static Object String;
    private static int kontostand = 1000;

    public static void main(String[] args) {
        boolean istFertig = false;

        while (!istFertig) {
            menu();

            int input = scanner.nextInt();

            if (input == 1) {
                einzahlung1();
            } else if (input == 2) {
                auszahlung1();
            } else if (input == 3) {
                System.out.println("Ihr Kontostand beträgt: " + kontostand);
            } else if (input == 4) {
                System.out.println("Vielen Dank und aufwiedersehen.");
                istFertig = true;
            }
        }

    }

    private static void auszahlung1() {
        System.out.println("Wieviel Geld wollen Sie abheben?");
        int auszahlung = scanner.nextInt();
        if (kontostand > auszahlung) {
            System.out.println("Sie erhalten in Kürze " + auszahlung + "€");
        } else if (kontostand < auszahlung) {
            System.out.println("Das Limit ist überschritte, wählen Sie einen anderen Betrag");
        }
    }

    private static void einzahlung1() {
        System.out.println("Bitte wählen Sie den Betrag den Sie einzahlen möchten");
        int einzahlung = scanner.nextInt();
        kontostand = kontostand + einzahlung;
        System.out.println("Ihr neuer Kontostand beträgt: " + kontostand + "€");
        System.out.println("Möchten Sie weitere Einzahlungen vornehmen?");
        int weiterEinzahlung = scanner.nextInt();
        if (weiterEinzahlung == 1) ;
        System.out.println("Bitte wählen Sie den Betrag den Sie einzahlen möchten");
        int einzahlung2 = scanner.nextInt();
        kontostand = kontostand + einzahlung2;
        System.out.println("Ihr neuer Kontostand beträgt: " + kontostand + "€");
        if (weiterEinzahlung == 2) ;
        System.out.println("Vielen Dank, ich leite Sie zurück ins Hauptmenü");
    }

    public static void menu() {
        String[] menu = {"1 = Einzahlen", "2 = Auzahlen", "3 = Kontostand", "4: Beenden"};
        System.out.println("Bitte wählen Sie aus dem Menü");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);

        }
    }
}

