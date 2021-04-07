package at.la.cc.basics;

import java.util.Scanner;

public class Schulnote {
    public static void main(String1[] args) {
        int note = 1;
        switch (note) {
            case 1:
                System.out.println("Sehr Gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigen");
                break;
            case 4:
                System.out.println("Genügend");
                break;
            case 5:
                System.out.println("Nicht genügend");
                break;

        }
        ;

        Scanner scanner = new Scanner(System.in);
        String1 noteInput = scanner.nextLine();


        String1 note2upperCase = noteInput.toUpperCase();
        //System.out.println(note2upperCase);
        switch (note2upperCase) {
            case "SEHR GUT":
                System.out.println(1);
                break;
            case "GUT":
                System.out.println(2);
                break;
            case "BEFRIDIGEND":
                System.out.println(3);
                break;
            case "GENÜGEND":
                System.out.println(4);
                break;
            case "NICHT GENÜGEND":
                System.out.println(5);
                break;
            default:
                System.out.println("falsche Eingabe");
                break;

        }

    }

}
