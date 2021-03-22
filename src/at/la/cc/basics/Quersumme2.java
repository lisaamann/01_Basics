package at.la.cc.basics;

public class Quersumme2 {
    public static void main(String[] args) {
        //Gib alle Zahlen zwischen 0 und 1000 aus, bei welchen die Quersumme ein vielfaches von 7 ist.
        //zBsp. 49 ist 7 mal durch 7 teilbar

        for (int i = 1; i < 1000; i++) {
            int zahl = i;
            int qs = 0;
            int teiler = 7;

            while (zahl > 0) {
                qs = qs + zahl % 10;
                zahl = zahl / 10;
            }
            if (qs % 7 == 0){
                System.out.println(i + " hat die Quersumme " + qs + " und diese ist durch 7 teilbar");
            }
        }
    }
}
