package at.la.cc.flaechenrechner;

public class Figure {
    public String name;

    //region CONSTURCTOR
    public Figure(String name) {
        this.name = name;
    }
    //endregion

    //region GETTER SETTER
    public String getName() {
        return name;
    }

    public double getArea(double zahl1, double zahl2){
        return zahl1 * zahl2;
    }
    //endregion
}
