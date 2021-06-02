package at.la.cc.flaechenrechner;

import java.util.Scanner;

public class MainFlaechenrechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figure figure1 = new Figure("Figur");
        Kreis kreis1 = new Kreis("KleinerKreis", "cm");
        Würfel würfel1 = new Würfel("Mein Würfel","mm");
        Quadrat quadrat1 = new Quadrat("Mein wundervolles Quadrat", "m");

        //Fläche von Kreis berechnen
        System.out.println("Bitte geben Sie den RADIUS des Kreises ein dessen Fläche Sie berechnen wollen.");
        double userInput = scanner.nextDouble();
        kreis1.setRadius(userInput);
        System.out.println("Bitte geben Sie die EINHEIT des Radius ein");
        String userInput1 = scanner.next();
        kreis1.setEinheit(userInput1);
        System.out.println("Die Fläche von " + kreis1.getName() + " beträgt " + kreis1.getAreaCircle(userInput) + kreis1.Einheit + "²");

        //Fläche vom Würfel berechnen
        System.out.println("Bitte geben Sie die BREITE des Würfels ein:");
        double userInput2 = scanner.nextDouble();
        würfel1.setBreite(userInput2);
        System.out.println("Bitte geben Sie die LÄNGE des Würfels ein:");
        double userInput3 = scanner.nextDouble();
        würfel1.setLänge(userInput3);
        System.out.println("Bitte geben Sie die EINHEIT des Würfels ein");
        String userInput4 = scanner.next();
        würfel1.setEinheit(userInput4);
        würfel1.getArea(userInput2, userInput3);
        System.out.println("Die Fläche von " + würfel1.getName() + " beträgt " + würfel1.getArea(userInput2, userInput3) +würfel1.Einheit + "²");

        //Fläche von Quadrat berechnen
        System.out.println("Bitte geben Sie die SEITENLÄNGE des Quadrates ein:");
        double userInputDieHundertste = scanner.nextDouble();
        quadrat1.setSeitenlänge(userInputDieHundertste);
        System.out.println("Bitte geben Sie die EINHEIT des Quadrates ein:");
        String userInput5 = scanner.next();
        quadrat1.setEinheit(userInput5);
        System.out.println("Die Fläche von " + quadrat1.getName() + " beträgt " + quadrat1.getAreaCube(userInputDieHundertste) + quadrat1.Einheit + "²");

    }
}
