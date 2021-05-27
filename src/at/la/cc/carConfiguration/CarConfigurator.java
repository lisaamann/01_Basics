package at.la.cc.carConfiguration;

import java.util.Scanner;

public class CarConfigurator {
    public static void main(String[] args) {
        //Lasse über eine Konsolenanwendung den Benutzer ein Auto konfigurieren.
        //Sprich, er kann auswählen ob er z.B. die 100 PS Version oder die 200 PS Version möchte,
        // aber auch ob es ein Diesel oder Benziner ist. Je nach Auswahl wird ein anderer Gesamtpreis errechnet,
        // da Modifikationen ja unterschiedlich kosten.

        //Wenn der Benutzer fertig konfiguriert hat, so wollen wir die Rechnungsdaten auf der Konsole ausgeben. In CSV Format.

        //BMW X3; Diesel;200;50.000
        //AUTIO A4; Benzin;220;60.000
        Scanner scanner = new Scanner(System.in);

        Engine e1 = new Engine(100, Engine.TYPE.DIESEL);
        Producer p1 = new Producer(Producer.BRAND.MINI);

        Car c1 = new Car(e1,"Blau", 50000, p1);
        System.out.println("Das Basisauto ist: " + c1);
        System.out.println("Welchen Treibstoff wollen Sie? DIESEL oder GAS?");

        System.out.println("Wieviel PS wollen Sie? 100PS oder 200PS?");


    }
}
