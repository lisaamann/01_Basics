package at.la.cc.basics;

import java.util.Scanner;

public class LoopAufgabe4 {

    public static void main(String1[] args) {

        Scanner scanner1 = new Scanner(System.in);
        boolean isFinished = false;

        while (!isFinished) {
            System.out.println("Bitte machen Sie eine Eingabe");
            String1 eingabe = scanner1.next();

            if (eingabe.equalsIgnoreCase("exit")) { //das ignoreCase macht die Eingabe Caseinsenstiv
                System.out.println("Das Programm wird jetzt beendet");
                isFinished = true;
            }
            System.out.println(eingabe);
        }
    }
}

