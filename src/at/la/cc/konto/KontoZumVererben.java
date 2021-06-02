package at.la.cc.konto;

public class KontoZumVererben {
    public double Kontostand;
    public String Kontoinhaber;
    public double Betrag;

    public KontoZumVererben(double kontostand, String kontoinhaber) {
        Kontostand = kontostand;
        Kontoinhaber = kontoinhaber;
    }

    //region METHODEN
    public double einzahlen(double betrag) {
        System.out.println("Einzahlung über " + betrag + "€");
        this.Kontostand += betrag;
        return betrag;
    }

    public double auszahlung(double betrag) {
        System.out.println("Auszahlung über " + betrag + "€");
        this.Kontostand -= betrag;
        return betrag;
    }

    //endregion


    //region GETTER SETTER
    public double getKontostand() {
        return Kontostand;
    }

    public void setKontostand(double kontostand) {
        Kontostand = kontostand;
    }

    public String getKontoinhaber() {
        return Kontoinhaber;
    }

    public void setKontoinhaber(String kontoinhaber) {
        Kontoinhaber = kontoinhaber;
    }

    public double getBetrag() {
        return Betrag;
    }

    public void setZahlung(double Betrag) {
        Betrag = Betrag;
    }
    //endregion
}
