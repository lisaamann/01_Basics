package at.la.cc.flaechenrechner;

public class Würfel extends Figure{
    public String Einheit;

    //region CONSTRUCTOR
    public Würfel(String name, String einheit) {
        super(name);
        this.Einheit = einheit;
    }
    //enregion
}
