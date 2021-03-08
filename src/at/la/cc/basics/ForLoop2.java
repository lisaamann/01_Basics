package at.la.cc.basics;

public class ForLoop2 {
    public static void main(String[] args) {



        for (int i = 2; i < 1000 ; i = i + 2) {
            System.out.println("Ergebnis gerade Zahlen" + i);

        };
        for (int i2 = 1; i2 < 1000 ; i2 = i2 + 2) {
            System.out.println("Ergebnis ungerade Zahlen" + i2);

        }
    }
}
