package at.la.cc.basics;

import java.util.Random;

public class SwitchStatement {
    public static void main(String1[] args) {
        //Erstelle eine Zufallszahl zwischen 5 und 100
        int min = 5;
        int max = 10;

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1);

        switch (randomNumber) {
            case 10:
                System.out.println("Ten");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 5:
                System.out.println("Fife");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 1:
                System.out.println("One");
                break;
        }
    }
}
