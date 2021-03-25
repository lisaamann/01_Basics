package at.la.cc.basics;

public class Methode1 {
    public static void main(String[] args) {
        int zahlEins = 15;
        int zahlZwei = 5;
        double ergebnis = subtraction(zahlEins, zahlZwei);
        System.out.println(ergebnis);
        System.out.println(multi(zahlEins, zahlZwei));
        System.out.println(div(zahlEins, zahlZwei));


    }
    public static double subtraction(double a, double b) {
        double result = a - b;
        return result;
    }
    public static double multi(double a, double b) {
        double result = a * b;
        return result;
    }
    public static double div(double a, double b){
        double result = a / b;
        return result;
    }
}
