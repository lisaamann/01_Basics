package at.la.cc.cars;

public class Engine {
    public enum TYPE {DIESEL, GAS};
    private int horsePower;
    private Engine.TYPE type;

    //region CONSTRUCTOR
    public Engine(int horsePower, Engine.TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }
    //endregion

    //region METHODEN
    //amount should be between 0 and 100
    public void drive(int amount) {
        int amountMin = 1;
        int amountMax = 100;
        System.out.println("Der Motor läuft mit: " + amount);

    }
    //endregion

    //region GETTER
    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public TYPE getType() {
        return type;
    }
    //endregion
}
