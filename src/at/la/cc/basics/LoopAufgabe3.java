package at.la.cc.basics;

public class LoopAufgabe3 {
    public static void main(String[] args) {
        int ergebnis = 0;
        for (int i = -400; i <501 ; i++) {
            if (i%5 == 0){
                System.out.println(i + " ist durch 5 teilbar.");
            }
        }
    }
}
