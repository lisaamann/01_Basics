package at.la.cc.konto;

public class LändleGirokonto extends KontoZumVererben{
    public LändleGirokonto(double kontostand, String kontoinhaber, double zahlung, double überziehungsrahmen) {
        super(kontostand, kontoinhaber, zahlung,überziehungsrahmen);
    }
}
