package at.la.cc.konto;

public class Sparbuch extends KontoZumVererben{
    private double Zinsen;

    public Sparbuch(double kontostand, String kontoinhaber, double zinsen){
        super(kontostand, kontoinhaber);
        this.Zinsen = zinsen;
    }

    @Override
    public double auszahlung(double betrag){
        if ((getKontostand() - betrag)>0){
            return super.auszahlung(betrag);
        }else {
            System.out.println("Betrag zu hoch. Keine Auszahlung in dieser Höhe möglich.");
            return 0;
        }
    }

    @Override
    public double einzahlen(double betrag){
        return super.einzahlen(betrag);
    }

    public double ZinsBerechnung(){
        return this.Zinsen * super.getKontostand();
    }

    public double KontostandMitZinsen(){
        return getKontostand() + ZinsBerechnung();
    }
}
