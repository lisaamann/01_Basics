package at.la.cc.projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class woerterErraten {
    public static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"Generator", "Publikation", "Spaceballs"};
        String randomWord = (words[new Random().nextInt(words.length)]);

        System.out.println("Herzlich Willkommen beim Wörtererraten. \n" +
                "Errate die fehlenden Buchstaben um das gesuchte Wort zu vervollständigen. \n" +
                "Zum starten gib 1 ein.");

        int play = scanner.nextInt();


        if (play == 1) {
            char[] wordCollection = new char[randomWord.length()];//wandelt den String in Char's um
            for (int i = 0; i < randomWord.length(); i++) {
                wordCollection[i] = randomWord.charAt(i);
            }

            char[] starCollection = new char[randomWord.length()];//wandelt das Wort in Sternchem um
            for (int i = 0; i < randomWord.length(); i++) {
                if (randomWord.charAt(i) == ' ') {
                    starCollection[i] = ' ';
                } else {
                    starCollection[i] = '*';
                }

            }


            while (true) {
                System.out.println(starCollection);//gibt Sternchenwort aus
                System.out.println(randomWord);

                System.out.println("Bitte geben Sie einen Buchstaben ein");

                char userInput = scanner.next().charAt(0);//Usereingabe Buchstabe

                for (int i = 0; i < randomWord.length(); i++) {
                    if (userInput == randomWord.charAt(i)) {
                        starCollection[i] = userInput;
                        break;
                    } else {
                        System.out.println("Buchstabe ist nicht vorhanden.");
                    }

                    if (starCollection.equals(randomWord)) {//ab hier muss ich nochmal schauen warum er nicht aufhört
                        System.out.println("Das erratene Wort ist " + randomWord);
                        break;
                    }
                    break;
                }

            }
        } else {
            System.out.println("Tschüssi");
        }
    }
}

