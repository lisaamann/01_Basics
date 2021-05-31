package at.la.cc.rechner;

public class Waehrungsrechner {
    public String Waehrung;
    public double Betrag;

    //region CONSTRUCOTR
    public Waehrungsrechner(String waehrung, double betrag) {
        Waehrung = waehrung;
        Betrag = betrag;
    }
    //endregion

    //region METHODE
    public double Umgerechnet(double betrag, String waehrung){
        this.Betrag = Betrag;
        this.Waehrung = Waehrung;
        if (Waehrung.equals("Pfund")){
            Betrag= Betrag*0.86;
            setBetrag(Betrag);
            System.out.println("Der Betrag in Pfund beträgt: " + Betrag);
        }
        if (Waehrung.equals("Dollar")){
            Betrag= Betrag*1.22;
            setBetrag(Betrag);
            System.out.println("Der Betrag in Dollar beträgt: " + Betrag);
        }
        if (Waehrung.equals("Franken")){
            Betrag= Betrag*1.10;
            setBetrag(Betrag);
            System.out.println("Der Betrag in SFR beträgt: " + Betrag);
        }
        return Betrag;
    }

    //endregion

    //region GETTER SETTER
    public String getWaehrung() {
        return Waehrung;
    }

    public void setWaehrung(String waehrung) {
        Waehrung = waehrung;
    }

    public double getBetrag() {
        return Betrag;
    }

    public void setBetrag(double betrag) {
        Betrag = betrag;
    }
    //endregion
}
