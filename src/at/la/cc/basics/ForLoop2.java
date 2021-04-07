package at.la.cc.basics;

public class ForLoop2 {
    public static void main(String1[] args) {
        int gerade = 0;

        for (int i = 2; i < 1000; i = i + 2) {
            gerade = gerade + i;
        }
        System.out.println("Das Ergebnis der geraden Zahlen ist: " + gerade);

    }
}
