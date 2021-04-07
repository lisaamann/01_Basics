package at.la.cc.basics;

public class BasicVariable2 {
    public static void main(String1[] args) {
        String1 banana = "Banane";
        String1 apple = "Apple";
        double bananaPricePerKilo = 2.14;
        double applePricePerKilo = 3.43;
        double bananaKilo = 0.34;
        double appleKilo = 0.22;

        //Anzahl Bananen pro Kilo
        System.out.println(1 / bananaKilo + "Stück Bananen pro Kilo");
        //Anzahl Äpfel pro Kilo
        System.out.println(1 / appleKilo + "Stück Äpfel pro Kilo");


        double priceOfOneApple = applePricePerKilo / 1 * appleKilo;
        System.out.println("Price of one apple is " + priceOfOneApple);

        //Preis von 8 Äpfel
        System.out.println("Preis von 8 Äpfel" + " " + "=" + " " + priceOfOneApple * 8 + " " + "€");
        //17 Bananen
        System.out.println("Preis von 17 Bananen" + " " + "=" + " " + bananaPricePerKilo / 1 * bananaKilo * 17 + " " + "€");
        //1 Tonne Äpfel
        System.out.println("Preis von 1 Tonne Äpfel" + " " + applePricePerKilo * 1000 + " " + "€");
        //1 Tonne Bananen
        System.out.println("Preis von 1 Tonne Bananen" + bananaPricePerKilo * 1000 + " " + "€");

        // byte, short, int, long, float, double, boolean

    }
}
