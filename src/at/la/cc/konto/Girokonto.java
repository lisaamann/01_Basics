package at.la.cc.konto;

public class Girokonto extends KontoZumVererben{
    private double Überziehungsrahmen;

    public Girokonto(double kontostand, String kontoinhaber, double Überziehungsrahmen){
        super(kontostand, kontoinhaber);
        this.Überziehungsrahmen = Überziehungsrahmen;
    }

    //region METHODEN

    public double auszahlung(double überziehungsrahmen){
        if ((getKontostand() - überziehungsrahmen)>(überziehungsrahmen * -1)){
            System.out.println("Sie erhalten in Kürze eine Auszahlung über " + überziehungsrahmen + "€");
        }else {
            System.out.println("Der Betrag ist zu hoch und kann nicht bezogen werden.");
        }
        return 0;
    }

    //endregion

    //region GETTER SETTER
    public double getÜberziehungsrahmen() {
        return Überziehungsrahmen;
    }

    public void setÜberziehungsrahmen(double überziehungsrahmen) {
        Überziehungsrahmen = überziehungsrahmen;
    }
    //endregion
}
