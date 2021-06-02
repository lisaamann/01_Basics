package at.la.cc.konto;

public class Kreditkonto extends KontoZumVererben{
    private double Kreditzins;

    public Kreditkonto(double kontostand, String kontoinhaber, double kreditzins){
        super(kontostand, kontoinhaber);
        this.Kreditzins = kreditzins;
    }

    //region METHODEN
    public double Ratenrückzahlung(){
        double Rate = 0;
        return Rate;
    }
    //endregion
}
