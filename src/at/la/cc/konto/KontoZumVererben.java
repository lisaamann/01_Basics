package at.la.cc.konto;

public class KontoZumVererben {
    public double Kontostand;
    public String Kontoinhaber;
    public double Zahlung;
    public double Überziehungsrahmen;

    //region CONSTRUCTOR
    public KontoZumVererben(double kontostand, String kontoinhaber, double zahlung, double überziehungsrahmen) {
        Kontostand = kontostand;
        Kontoinhaber = kontoinhaber;
        this.Zahlung = Zahlung;
        this.Überziehungsrahmen = Überziehungsrahmen;
    }
    //endregion

    //region METHODEN
    public void einzahlung() {

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

    public double getZahlung() {
        return Zahlung;
    }

    public void setZahlung(double zahlung) {
        Zahlung = zahlung;
    }
    //endregion
}
