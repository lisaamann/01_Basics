package at.la.cc.rechner;

import java.util.Scanner;

public class Rechner {
    public double zahl = 10;
    public char addieren = '+';
    public char subtrahieren = '-';
    public char multiplizieren = '*';
    public char dividieren = '/';
    Scanner scanner = new Scanner(System.in);

    //region CONSTRUCTOR
    public Rechner(int zahl) {
        this.zahl = zahl;
    }
    //endregion

    //region METHODEN
    public double rechnung(){
        this.zahl = zahl;

        return zahl;
    }
    //endregio

    //region GETTER SETTER
    public double getZahl() {
        return zahl;
    }

    public void setZahl(double zahl) {
        this.zahl = zahl;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public char getAddieren() {
        return addieren;
    }

    public void setAddieren(char addieren) {
        this.addieren = addieren;
    }

    public char getSubtrahieren() {
        return subtrahieren;
    }

    public void setSubtrahieren(char subtrahieren) {
        this.subtrahieren = subtrahieren;
    }

    public char getMultiplizieren() {
        return multiplizieren;
    }

    public void setMultiplizieren(char multiplizieren) {
        this.multiplizieren = multiplizieren;
    }

    public char getDividieren() {
        return dividieren;
    }

    public void setDividieren(char dividieren) {
        this.dividieren = dividieren;
    }
    //endregion
}
