package at.la.cc.basics;

public class LoopAufgabe6 {
    public static void main(String[] args) {
        int anfang = 10;
        int ende = 1;

        while (anfang>ende) {
            for (int i = 10; i >= 1; i--) {
                System.out.print("*");
                anfang--;
            }
            System.out.println("Fertig");
        }

    }
}
