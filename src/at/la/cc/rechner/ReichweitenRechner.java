package at.la.cc.rechner;

public class ReichweitenRechner {
    public double Tankstand;
    public double Verbrauch;

    //region CONSTRUCTOR
    public ReichweitenRechner(double tankstand, double verbrauch) {
        Tankstand = tankstand;
        Verbrauch = verbrauch;
    }
    //endregion

    //region METHODEN
    public double getNochMoeglicheReichweite(){
        double Reichweite = 10;
        this.Tankstand = Tankstand;
        Reichweite = (Tankstand/Verbrauch) *100;
        return Reichweite;
    }
    //endregion

    //region GETTER SETTER
    public double getTankstand() {
        return Tankstand;
    }

    public void setTankstand(double tankstand) {
        Tankstand = tankstand;
    }

    public double getVerbrauch() {
        return Verbrauch;
    }

    public void setVerbrauch(double verbrauch) {
        Verbrauch = verbrauch;
    }
    //endregion
}
