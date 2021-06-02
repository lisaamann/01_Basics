package at.la.cc.flaechenrechner;

public class MainFlaechenrechner {
    public static void main(String[] args) {
        Figure figure1 = new Figure("Figur");
        Kreis kreis1 = new Kreis("KleinerKreis", "cm");

        System.out.println("Die Fläche von " + kreis1.getName() + " beträgt " + kreis1.getAreaCircle(20) + kreis1.Einheit + "²");
    }
}
