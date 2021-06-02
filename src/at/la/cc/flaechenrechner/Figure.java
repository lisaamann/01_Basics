package at.la.cc.flaechenrechner;

public class Figure {
    public String name;
    public double area;

    //region CONSTURCTOR
    public Figure(String name) {
        this.name = name;
    }
    //endregion




    //region GETTER SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void getArea(double area){
        this.area = area;
    }
    //endregion
}
