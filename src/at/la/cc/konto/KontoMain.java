package at.la.cc.konto;

public class KontoMain {
    public static void main(String[] args) {
        KontoZumVererben konto1 = new KontoZumVererben(3000, "Tom Turbo");
        konto1.einzahlen(1000);
        konto1.auszahlung(500);
        System.out.println(konto1.getKontostand() + "€");

        Sparbuch sparbuch1 = new Sparbuch(50000, "Tina Müller", 0.90);
        sparbuch1.auszahlung(60000);
        System.out.println(sparbuch1.getKontostand() + "€");
        sparbuch1.KontostandMitZinsen();
        System.out.println("Ihr aktuelles Sparbuchgutehaben beträgt: " + sparbuch1.KontostandMitZinsen() + "€");
    }
}
