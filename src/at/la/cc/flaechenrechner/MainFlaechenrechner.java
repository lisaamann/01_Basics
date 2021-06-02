package at.la.cc.flaechenrechner;

import java.util.Scanner;

public class MainFlaechenrechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figure figure1 = new Figure("Figur");
        Kreis kreis1 = new Kreis("KleinerKreis", "cm");

        //Fläche von Kreis berechnen
        System.out.println("Bitte geben Sie den Radius des Kreises ein dessen Fläche Sie berechnen wollen.");
        double userInput = scanner.nextDouble();
        kreis1.setRadius(userInput);
        System.out.println("Bitte geben Sie die Einheit des Radius ein");
        String userInput1 = scanner.next();
        kreis1.setEinheit(userInput1);
        System.out.println("Die Fläche von " + kreis1.getName() + " beträgt " + kreis1.getAreaCircle(userInput) + kreis1.Einheit + "²");
    }
}
