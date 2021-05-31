package at.la.cc.carConfiguration;

import at.la.cc.basics.SwitchStatement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CarConfigurator {
    public static void main(String[] args) {
        //region ANLEITUNG
        //Lasse über eine Konsolenanwendung den Benutzer ein Auto konfigurieren.
        //Sprich, er kann auswählen ob er z.B. die 100 PS Version oder die 200 PS Version möchte,
        // aber auch ob es ein Diesel oder Benziner ist. Je nach Auswahl wird ein anderer Gesamtpreis errechnet,
        // da Modifikationen ja unterschiedlich kosten.

        //Wenn der Benutzer fertig konfiguriert hat, so wollen wir die Rechnungsdaten auf der Konsole ausgeben. In CSV Format.

        //BMW X3; Diesel;200;50.000
        //AUTIO A4; Benzin;220;60.000
        //endregion
        Scanner scanner = new Scanner(System.in);
        //boolean isPricePerEngineCalculated = false;

        Engine e1 = new Engine(100, Engine.TYPE.DIESEL);
        Engine e2 = new Engine(100, Engine.TYPE.GAS);
        Engine e3 = new Engine(200, Engine.TYPE.DIESEL);
        Engine e4 = new Engine(200, Engine.TYPE.GAS);
        Producer p1 = new Producer(Producer.BRAND.MINI);
        Producer p2 = new Producer(Producer.BRAND.VW);
        Producer p3 = new Producer(Producer.BRAND.SKODA);

        Car c1 = new Car(e2, "Blau", 10000, p1);
        //region INTRO
        System.out.println("Willkommen im Autokonfigurator.");
        System.out.println("Der Preis für das Basisauto beträgt: " + c1.getBasicPrice() + "€");
        System.out.println("Sie können es jetzt nach ihren Wünschen konfigurieren.");
        System.out.println("Der Preis orientiert sich an Ihren Konfigurationen");
        //endregion

        //region Marke wählen
        System.out.println("Welche Automarke möchten Sie?");
        System.out.println("Wählen Sie zwischen 1 für MINI, 2 für VW und 3 für SKODA");
        int userInputProducer = scanner.nextInt();

        switch (userInputProducer) {
            case 1:
                c1.setProducer(p1);
                c1.getPriceOfCar();
                break;
            case 2:
                c1.setProducer(p2);
                c1.getPriceOfCar();
                break;
            case 3:
                c1.setProducer(p3);
                c1.getPriceOfCar();
                break;
        }
        System.out.println("Schön das Sie sich für die Marke " + c1.getProducer() + " entschieden haben.");
        System.out.println("Diese Auswahl gewährt Ihnen als Stammkunde der Marke " + c1.getProducer() + " einen Preisnachlass von " + c1.getProducer().getDiscount() + "%");
        System.out.println("Der aktuelle Preis beträgt: " + c1.getBasicPrice() + "€");
        //endregion

        //region Farbe wählen
        System.out.println(" ");
        System.out.println("Bitte wählen Sie ihre gewünschte Farbe.");
        String userInputColor = scanner.next();
        c1.setColor(userInputColor);
        System.out.println("Sie haben die Farbe " + c1.getColor().toUpperCase() + " für ihren neuen " + c1.getProducer() + " gewählt.");
        System.out.println("Der aktuelle Preis beträgt: " + c1.getBasicPrice() + "€");
        System.out.println(" ");
        //endregion

        //region Engine wählen
        System.out.println("Welche Engine wollen Sie?");
        System.out.println("Für Diesel mit 100PS wählen Sie bitte 1");
        System.out.println("Für Diesel mit 200PS wählen Sie bitte 2");
        System.out.println("Für Gas mit 100PS wählen Sie bitte 3");
        System.out.println("Für Gas mit 200PS wählen Sie bitte 4");

        int userinputEngineTYPE1 = scanner.nextInt();

        switch (userinputEngineTYPE1){
            case 1:
                System.out.println("Diesel mit 100PS");
                c1.setEngine(e1);
                System.out.println("Der Preis beträgt : " + c1.getPricePerCarEngine());
                c1.getEngine().getPricePerEngine();
                break;
            case 2:
                System.out.println("Gas mit 100PS");
                c1.setEngine(e2);
                System.out.println("Der Preis beträgt : " + c1.getPricePerCarEngine());
                c1.getEngine().getPricePerEngine();
                break;
            case 3:
                System.out.println("Diesel mit 200PS");
                c1.setEngine(e3);
                System.out.println("Der Preis beträgt : " + c1.getPricePerCarEngine());
                c1.getEngine().getPricePerEngine();
                break;
            case 4:
                System.out.println("Gas mit 200PS");
                c1.setEngine(e4);
                System.out.println("Der Preis beträgt : " + c1.getPricePerCarEngine());
                c1.getEngine().getPricePerEngine();
                break;
            default:
                System.out.println("Falsche Eingabe.");
        }


        //endregion


        //region CSV File erstellen
        try {
            FileWriter myWriter = new FileWriter("car_configuration.csv");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");//hier muss ich das File generieren
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //endregion


    }


}
