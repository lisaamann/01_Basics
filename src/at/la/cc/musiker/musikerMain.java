package at.la.cc.musiker;

public class musikerMain {
    public static void main(String[] args) {
        Band b1 = new Band("The Fife-Band");
        Singer s1 = new Singer("Tom", 30, b1);
        Bassist ba1 = new Bassist("Taylor", 29, b1);
        Trumpeter t1 = new Trumpeter("Hans-Jörgi", 28, b1);
        Guitarist g1 = new Guitarist("Timi", 18, b1);
        BackgroundSinger bc1 = new BackgroundSinger("Tina", 40, b1);

        s1.musizieren();
        ba1.musizieren();
        t1.musizieren();
        g1.musizieren();
        bc1.musizieren();
    }
}