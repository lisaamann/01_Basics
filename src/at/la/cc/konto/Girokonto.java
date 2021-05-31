package at.la.cc.konto;

public class Girokonto extends KontoZumVererben{
    public Girokonto(double kontostand, String kontoinhaber, double zahlung, double überziehungsrahmen) {
        super(kontostand, kontoinhaber, zahlung, überziehungsrahmen);
    }
}
