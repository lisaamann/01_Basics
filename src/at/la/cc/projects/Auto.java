package at.la.cc.projects;

public class Auto {
    private int leistung;
    private String farbe;

    public Auto(int leistung, String farbe) {
        this.leistung = leistung;
        this.farbe = farbe;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}
