package at.la.cc.flaechenrechner;

public class Würfel extends Figure{
    public String Einheit;
    public double Länge;
    public double Breite;

    //region CONSTRUCTOR
    public Würfel(String name, String einheit) {
        super(name);
        this.Einheit = einheit;
    }
    //enregion

    //region METHODE

    @Override
    public double getArea(double zahl1, double zahl2){
        return super.getArea(zahl1, zahl2);
    }
    //endregion

    //region GETTER SETTER
    public String getEinheit() {
        return Einheit;
    }

    public void setEinheit(String einheit) {
        Einheit = einheit;
    }

    public double getLänge() {
        return Länge;
    }

    public void setLänge(double länge) {
        Länge = länge;
    }

    public double getBreite() {
        return Breite;
    }

    public void setBreite(double breite) {
        Breite = breite;
    }

    //endregion
}
