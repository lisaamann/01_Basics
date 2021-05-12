package at.la.cc.remote;

public class Batterie {
    private double level;

    public Batterie() {
        this.level = 3.5;
    }

    public double getLevel() {
        return level;
    }

    public void powerConsumption(double amount){
        this.level -= amount;
    }
}
