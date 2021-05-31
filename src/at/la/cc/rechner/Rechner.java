package at.la.cc.rechner;

import java.util.Scanner;

public class Rechner {
    public double zahl = 10;
    public double zahl2 = 5;

    //region CONSTRUCTOR

    public Rechner(double zahl, double zahl2) {
        this.zahl = zahl;
        this.zahl2 = zahl2;
    }
    //endregion

    //region METHODEN

    //endregio

    //region GETTER SETTER

    public double getZahl() {
        return zahl;
    }

    public void setZahl(double zahl) {
        this.zahl = zahl;
    }

    public double getZahl2() {
        return zahl2;
    }

    public void setZahl2(double zahl2) {
        this.zahl2 = zahl2;
    }

    public double addieren(double zahl, double zahl2) {
        double ergebnis = zahl + zahl2;
        return ergebnis;
    }

    public double multiplizieren(double zahl, double zahl2) {
        double ergebnis = zahl * zahl2;
        return ergebnis;
    }

    public double subtrahieren(double zahl, double zahl2){
        double ergebnis = zahl - zahl2;
        return ergebnis;
    }

    public double dividieren(double zahl, double zahl2){
        double ergebnis = zahl / zahl2;
        return ergebnis;
    }
    //endregion
}
