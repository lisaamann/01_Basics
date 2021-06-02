package at.la.cc.flaechenrechner;

public class Viereck extends Figure{
    public String Einheit;
    public double Länge1;
    public double Länge2;
    public double Länge3;
    public double Länge4;
    public double Winkel;

    //region CONSTRUCTOR
    public Viereck(String name, String einheit) {
        super(name);
        this.Einheit = einheit;
    }
    //enregion



    //region GETTER SETTER

    //endregion
}
