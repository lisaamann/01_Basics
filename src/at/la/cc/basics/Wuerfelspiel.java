package at.la.cc.basics;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String1[] args) {
        //Erstelle ein Würfelspiel! Du spielst gegen den Computer. Wenn das Spiel startet (mit einem kleinen Menü), hat der Spieler 6 Würfe.
        //Er spielt dabei gegen den Computer. Wenn die Augensumme höher ist als jene des Computers hat der Spieler gewonnen, ansonsten der Computer.
        //es braucht nur random. der user macht enter für eingabe dann kommt random 1 und anschließend random 2 für den computer
        Random wuerfelaugen = new Random(6 - 0)  +1;
        int wurfSpieler = 0;
        int wurfComputer = 0;
        int durchgänge = 6;

        menu();

        int input = scanner.nextInt();


            switch (input) {
                case 1:
                    System.out.println("Los geht's! Du hast 6 Würfe");
                    System.out.println("Bitte 1 für den ersten Wurf");
                    int wurf = scanner.nextInt();
                    for (int i = 0; i < 6; i++) {
                        //hier müssen die würfe beginnen
                        System.out.println(wuerfelaugen);

                    }
                    break;
                case 2:
                    System.out.println("Spiel wird verlassen");
                    break;
                default:
                    System.out.println("Ungültiges Menü");
                    break;
            }
    }

    public static void menu() {
        String1[] menu = {"1 = Spielen", "2 = Beenden"};
        System.out.println("Willkommen im Würfelspiel.");
        System.out.println("Bitte wählen Sie aus dem Menü");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);

        }
    }
}
