package at.la.cc.flaechenrechner;

public class Kreis extends Figure{
    private double Pi = 3.14;
    public String Einheit;

    //region CONSTRUCTOR
    public Kreis(String name, String einheit) {
        super(name);
        this.Einheit = einheit;
    }
    //enregion


    //region METHODEN
    public double getAreaCircle(double num1) {
        return (num1 * num1) * Pi;
    }
    //endregion
}
