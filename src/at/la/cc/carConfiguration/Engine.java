package at.la.cc.carConfiguration;

import java.lang.reflect.Array;

public class Engine {
    public enum TYPE {DIESEL, GAS};
    private Engine.TYPE type;
    private int horsepower;

    //region CONSTRUCTOR
    public Engine(int horsepower, TYPE type) {
        this.horsepower = horsepower;
        this.type = type;
    }
    //endregion

    //region METHODEN
    public int getPricePerTYPE(){
        if (type.equals((TYPE.DIESEL))){
            System.out.println("h");
            return 5000;
        }
        if (type.equals((TYPE.GAS))){
            return 0;
        }return 0;
    }

    //endregion


    //region GETTER SETTER
    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
    //endregion


    @Override
    public String toString() {
        return "Engine{" +
                "type=" + type +
                ", horsepower=" + horsepower +
                '}';
    }
}
