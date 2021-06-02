package at.la.cc.flaechenrechner;

public class Kreis extends Figure{
    private double Pi = 3.14;
    public String Einheit;
    public double Radius;

    //region CONSTRUCTOR
    public Kreis(String name, String einheit) {
        super(name);
        this.Einheit = einheit;
    }
    //enregion


    //region METHODEN
    public double getAreaCircle(double radius) {
        return (radius * radius) * Pi;
    }
    //endregion

    //region GETTER SETTER
    public String getEinheit() {
        return Einheit;
    }

    public void setEinheit(String einheit) {
        Einheit = einheit;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }
    //endregion
}
