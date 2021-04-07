package at.la.cc.basics;

public class QuersummeAufgabe1 {
    public static void main(String1[] args) {

        for (int i = 1; i < 1000; i++) {
            int zahl = i;
            int qs = 0;
            while (zahl > 0) {
                qs = qs + zahl % 10;
                zahl = zahl / 10;
            }
            if (qs == 15) {
                System.out.println(i + " = " + qs);
            }
        }
    }
}

