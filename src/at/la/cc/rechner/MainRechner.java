package at.la.cc.rechner;

import java.util.Scanner;

public class MainRechner {
    public static void main(String[] args) {
        Rechner rechner1 = new Rechner(10, 5);
        Waehrungsrechner waehrungsrechner1 = new Waehrungsrechner("€", 10);
        MWST_Rechner mwst_rechner1 = new MWST_Rechner(10, "CH", "Schweiz");
        GeoRechner geoRechner1 = new GeoRechner();
        ReichweitenRechner reichweitenRechner1 = new ReichweitenRechner(50,7.5);
        Scanner userInput = new Scanner(System.in);

        //region Grundrechnen
        System.out.println("Willkommen beim Grundrechnen");
        System.out.println("Bitte geben Sie Ihre erste Zahl ein");
        double userInputRechner = userInput.nextDouble();
        rechner1.setZahl(userInputRechner);
        System.out.println("Bitte geben Sie Ihre zweite Zahl ein");
        double userInput2Rechner = userInput.nextDouble();
        rechner1.setZahl2(userInput2Rechner);
        System.out.println("Bitte geben Sie den Rechenoperator ein");
        String userInputRechner2 = userInput.next();
        if (userInputRechner2.equals("+")) {
            System.out.println("Das Ergebnis ist: " + rechner1.addieren(rechner1.getZahl(), rechner1.getZahl2()));
        }
        if (userInputRechner2.equals("-")) {
            System.out.println("Das Ergebnis ist: " + rechner1.subtrahieren(rechner1.getZahl(), rechner1.zahl2));
        }
        if (userInputRechner2.equals("/")) {
            System.out.println("Das Ergebnis ist: " + rechner1.dividieren(rechner1.zahl, rechner1.zahl2));
        }
        if (userInputRechner2.equals("*")) {
            System.out.println("Das Ergebnis ist " + rechner1.multiplizieren(rechner1.zahl, rechner1.zahl2));
        }
        //endregion

        //region Währungsrechnen
        System.out.println("Bitte geben Sie den Betrag in Euro ein den Sie umrechnen wollen");
        double userInputWaehrung = userInput.nextDouble();
        waehrungsrechner1.setBetrag(userInputWaehrung);
        System.out.println("Bitte geben Sie die Währung ein in die Sie umrechnen wollen");
        String userInputWaehrung2 = userInput.next();
        waehrungsrechner1.setWaehrung(userInputWaehrung2);
        System.out.println(waehrungsrechner1.Umgerechnet(userInputWaehrung, userInputWaehrung2));
        //endregion

        //region Mehrwertssteuer
        System.out.println("Bitte geben Sie das Länderkürzel ein für das Sie die Mehrwertssteuer wissen wollen.");
        String userInputMehrwertssteuer = userInput.next();
        mwst_rechner1.setLaenderkuerzel(userInputMehrwertssteuer);
        mwst_rechner1.setLandByUserInput();
        System.out.println("Die Mehrwertssteuer in " + mwst_rechner1.getLand() + " beträgt " + mwst_rechner1.getMehrwertssteuer() + "%");
        //endregion

        //region GEO-Rechner
        System.out.println("Sie sind nun beim GEO-Rechner angekommen");
        System.out.println("Bitte wählen Sie ob Sie den Umfang eines Rechtecks(1), eines Quadrates(2) oder eines Kreises(3) berechnen wollen.");
        int userInputGEO = userInput.nextInt();
        if (userInputGEO==1){
            System.out.println("Bitte geben Sie die Länge des Rechteckes ein");
            double userInputLaenge = userInput.nextDouble();
            geoRechner1.setRechtecklänge(userInputLaenge);
            System.out.println("Bitte geben Sie die Breite des Rechtecks ein");
            double userInputBreite = userInput.nextDouble();
            geoRechner1.setRechteckbreite(userInputBreite);
            geoRechner1.getRechteckUmfang(userInputLaenge, userInputBreite);
            System.out.println("Der Umfang des Rechtecks beträgt: " + geoRechner1.getRechteckUmfang(userInputLaenge, userInputBreite));
        }
        if (userInputGEO==2){
            System.out.println("Bitte geben Sie die Seite des Quadrates ein");
            double userInputQuadralaenge = userInput.nextDouble();
            geoRechner1.setQuadratlänge(userInputQuadralaenge);
            System.out.println("Der Umfang des Quadrates beträgt: " + geoRechner1.getQuadratUmfang(userInputQuadralaenge));
        }
        if (userInputGEO==3){
            System.out.println("Bitte geben Sie den Durchmesser des Kreises ein.");
            double userInputKreis = userInput.nextDouble();
            geoRechner1.setKreisdurchmesser(userInputKreis);
            geoRechner1.getKreisUmfang(userInputKreis);
            System.out.println("Der Umfang des Kreise beträgt: " + geoRechner1.getKreisdurchmesser());
        }
        //endregion


        //region Reichweitenrechner
        System.out.println("Bitte geben Sie ein wie viel Tank Sie noch haben");
        double userInputReichweite = userInput.nextDouble();
        reichweitenRechner1.setTankstand(userInputReichweite);
        System.out.println("Sie können noch " + reichweitenRechner1.getNochMoeglicheReichweite() + " Kilometer mit dem aktuellen Tankstand fahren.");
        //endregion

    }
}
