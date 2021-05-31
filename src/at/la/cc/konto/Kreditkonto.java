package at.la.cc.konto;

public class Kreditkonto extends KontoZumVererben{
    public Kreditkonto(double kontostand, String kontoinhaber, double zahlung, double überziehungsrahmen) {
        super(kontostand, kontoinhaber, zahlung, überziehungsrahmen);
    }
}
