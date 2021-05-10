package at.la.cc.oop;

public class Car {
    // Instanzvariablen / Gedächtnisvariablen
    public String colore;
    public int fuelConsumption;
    public int fuelAmount;
    public String serialNumber;
    private String brand;
    public int amountOfRepetitions;


    //region METHODEN
    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("Ich fahre.");

    }

    public void break1() {
        System.out.println("Ich bremse.");
    }

    public void turboBoost() {
        this.fuelAmount = fuelAmount;
        int minFuelAmount = (fuelAmount / 100) * 10;

        if (fuelAmount > minFuelAmount) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk() {
        this.amountOfRepetitions = amountOfRepetitions;
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuuttt!!");
        }
    }

    public void getRemainingRange(){
        this.amountOfRepetitions = amountOfRepetitions;
        this.fuelAmount = fuelAmount;
        int remainingRange = (fuelAmount / amountOfRepetitions) * 100;
        System.out.println("Reichweite mit aktuellen Füllstand = " + remainingRange + " km");
    }
    //endregion
}
