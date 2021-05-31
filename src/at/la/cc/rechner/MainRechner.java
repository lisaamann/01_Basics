package at.la.cc.rechner;

import java.util.Scanner;

public class MainRechner {
    public static void main(String[] args) {
        Rechner rechner1 = new Rechner(10, 5);
        Scanner userInput = new Scanner(System.in);

        System.out.println("Willkommen beim Grundrechnen");
        System.out.println("Bitte geben Sie Ihre erste Zahl ein");
        double userInputRechner = userInput.nextDouble();
        rechner1.setZahl(userInputRechner);
        System.out.println("Bitte geben Sie Ihre zweite Zahl ein");
        double userInput2Rechner = userInput.nextDouble();
        rechner1.setZahl2(userInput2Rechner);
        System.out.println("Bitte geben Sie den Rechenoperator ein");
        String userInputRechner2 = userInput.next();
        if(userInputRechner2.equals("+")){
            System.out.println("Das Ergebnis ist: " + rechner1.addieren(rechner1.getZahl(), rechner1.getZahl2()));
        }
        if (userInputRechner2.equals("-")){
            System.out.println("Das Ergebnis ist: " + rechner1.subtrahieren(rechner1.getZahl(), rechner1.zahl2));
        }
        if (userInputRechner2.equals("/")){
            System.out.println("Das Ergebnis ist: " + rechner1.dividieren(rechner1.zahl, rechner1.zahl2));
        }
        if (userInputRechner2.equals("*")){
            System.out.println("Das Ergebnis ist " + rechner1.multiplizieren(rechner1.zahl, rechner1.zahl2));
        }

    }
}
