package at.la.cc.konto;

public class Sparbuch extends KontoZumVererben{
    public Sparbuch(double kontostand, String kontoinhaber, double zahlung, double überziehungsrahmen) {
        super(kontostand, kontoinhaber, zahlung, überziehungsrahmen);
    }
}
