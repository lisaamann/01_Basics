package at.la.cc.flaechenrechner;

public class Quadrat extends Figure{
    public String Einheit;
    public double Seitenlänge;

    //region CONSTRUCTOR
    public Quadrat(String name, String einheit) {
        super(name);
        this.Einheit = einheit;
    }
    //enregion

    public double getAreaCube(double seitenlänge){
        double fläche = seitenlänge*seitenlänge;
        return fläche*6;
    }

    //region GETTER SETTER

    public String getEinheit() {
        return Einheit;
    }

    public void setEinheit(String einheit) {
        Einheit = einheit;
    }

    public double getSeitenlänge() {
        return Seitenlänge;
    }

    public void setSeitenlänge(double seitenlänge) {
        Seitenlänge = seitenlänge;
    }

    //endregion
}
